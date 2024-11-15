-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 12 Nov 2024 pada 14.49
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_keuangan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_history`
--

CREATE TABLE `tb_history` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `jumlah` double NOT NULL,
  `metode` varchar(50) NOT NULL,
  `tanggal` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `tb_history`
--

INSERT INTO `tb_history` (`id`, `user_id`, `jumlah`, `metode`, `tanggal`) VALUES
(1, 1, 1000000, 'Indomart', '2024-11-12 14:08:25'),
(2, 1, 500000, 'BNI', '2024-11-12 14:38:42'),
(3, 1, 20000, 'Indomart', '2024-11-12 17:45:02'),
(4, 1, 30000, 'BRI', '2024-11-12 17:49:58'),
(5, 1, -30000, 'BCA ke 0987654', '2024-11-12 18:22:02'),
(6, 1, -300000, 'BRI ke 876543', '2024-11-12 18:22:54'),
(7, 1, -20000, 'Mandiri ke 627378', '2024-11-12 18:28:24'),
(8, 1, -60000, 'Mandiri ke 627378', '2024-11-12 18:29:41'),
(9, 2, 1200000, 'BNI', '2024-11-12 18:50:00'),
(10, 2, -1000000, 'BRI', '2024-11-12 18:50:19'),
(11, 2, 1000000, 'Alfamart', '2024-11-12 18:51:03'),
(12, 2, -300000, 'BCA', '2024-11-12 18:51:09');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_user`
--

CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `nomor` int(11) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `saldo` double NOT NULL,
  `batasPengeluaran` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `tb_user`
--

INSERT INTO `tb_user` (`id`, `nama`, `email`, `nomor`, `password`, `saldo`, `batasPengeluaran`) VALUES
(1, 'ana', 'andnkaj', 8766543, 'ana', 1140000, 1000000),
(2, 'Safitri', 'safitri@gmail.com', 8233143, '123', 900000, 1200000);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tb_history`
--
ALTER TABLE `tb_history`
  ADD PRIMARY KEY (`id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indeks untuk tabel `tb_user`
--
ALTER TABLE `tb_user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tb_history`
--
ALTER TABLE `tb_history`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT untuk tabel `tb_user`
--
ALTER TABLE `tb_user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `tb_history`
--
ALTER TABLE `tb_history`
  ADD CONSTRAINT `tb_history_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `tb_user` (`id`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
