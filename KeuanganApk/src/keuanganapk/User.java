package keuanganapk;

public class User {
    private int id;
    private String nama;
    private String email;
    private int nomor;
    private String password;
    private double saldo;
    private double batasPengeluaran;

    public User(int id, String nama, String email, int nomor, String password, double saldo,double batasPengeluaran) {
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.nomor = nomor;
        this.password = password;
        this.saldo = saldo;
        this.batasPengeluaran = batasPengeluaran;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public int getNomor() {
        return nomor;
    }

    public String getPassword() {
        return password;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getBatasPengeluaran() {
        return batasPengeluaran;
    }

    public void setBatasPengeluaran(double batasPengeluaran) {
        this.batasPengeluaran = batasPengeluaran;
    }
    
}
