package keuanganapk;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.*;
import java.awt.DisplayMode;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.sql.ResultSet;
import java.text.DecimalFormat;


public class Apk extends javax.swing.JFrame {
    private User currentUser;
    
    public Apk(User user) {
        this.currentUser = user;
        initComponents();
        DisplayModeUser();
        JumlahDana.setText("Rp " + currentUser.getSaldo());
        jTFbatasPengeluaran.setText(String.valueOf(currentUser.getBatasPengeluaran()));
    }
        
    public Apk() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        NomorPengguna = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        NamaPengguna = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        GmailPengguna = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        NoRekening = new javax.swing.JTextField();
        JumlahTransfer = new javax.swing.JTextField();
        CdmMetodePembayaran = new javax.swing.JComboBox<>();
        BtmTransfer = new javax.swing.JButton();
        BtmReset = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        JumlahDana = new javax.swing.JTextField();
        IsiSaldo = new javax.swing.JTextField();
        CbmMetodePembayaran = new javax.swing.JComboBox<>();
        BtmIsiDana = new javax.swing.JButton();
        BtmResetSaldo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTFbatasPengeluaran = new javax.swing.JTextField();
        BtmEdit = new javax.swing.JButton();
        BtmLogout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableKeuangan = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(249, 227, 249));

        jTabbedPane2.setBackground(new java.awt.Color(100, 6, 92));
        jTabbedPane2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane2.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Bodoni Bd BT", 3, 36)); // NOI18N
        jLabel8.setText("=Selamat Datang!=");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        NomorPengguna.setFont(new java.awt.Font("Bodoni Bd BT", 3, 24)); // NOI18N
        NomorPengguna.setForeground(new java.awt.Color(255, 255, 255));
        NomorPengguna.setText("(nomor pengguna)");
        jPanel8.add(NomorPengguna, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, 400, -1));

        jLabel10.setFont(new java.awt.Font("Bodoni Bd BT", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nomor Telphone:");
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, -1, -1));

        jLabel11.setFont(new java.awt.Font("Bodoni Bd BT", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Pengguna:");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        NamaPengguna.setFont(new java.awt.Font("Bodoni Bd BT", 3, 24)); // NOI18N
        NamaPengguna.setForeground(new java.awt.Color(255, 255, 255));
        NamaPengguna.setText("(nama pengguna)");
        jPanel8.add(NamaPengguna, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 400, -1));

        jLabel12.setFont(new java.awt.Font("Bodoni Bd BT", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Gmail:");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        GmailPengguna.setFont(new java.awt.Font("Bodoni Bd BT", 3, 24)); // NOI18N
        GmailPengguna.setForeground(new java.awt.Color(255, 255, 255));
        GmailPengguna.setText("(gmail pengguna)");
        jPanel8.add(GmailPengguna, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 400, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/keuanganapk/output-onlinepngtools (2).png"))); // NOI18N
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Home", jPanel2);

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Bodoni Bd BT", 3, 36)); // NOI18N
        jLabel13.setText("== Pembayaran ==");
        jPanel10.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jLabel19.setFont(new java.awt.Font("Bodoni Bd BT", 3, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("No. Rekening:");
        jPanel10.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, -1));

        jLabel20.setFont(new java.awt.Font("Bodoni Bd BT", 3, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Jumlah Transfer:");
        jPanel10.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jLabel21.setFont(new java.awt.Font("Bodoni Bd BT", 3, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Metode Pembayaran:");
        jPanel10.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));
        jPanel10.add(NoRekening, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 400, 30));
        jPanel10.add(JumlahTransfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 400, 30));

        CdmMetodePembayaran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Metode --", "BRI", "BCA", "Mandiri" }));
        jPanel10.add(CdmMetodePembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 400, 30));

        BtmTransfer.setBackground(new java.awt.Color(232, 181, 225));
        BtmTransfer.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BtmTransfer.setText("Bayar");
        BtmTransfer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtmTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmTransferActionPerformed(evt);
            }
        });
        jPanel10.add(BtmTransfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 570, 130, 40));

        BtmReset.setBackground(new java.awt.Color(232, 181, 225));
        BtmReset.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BtmReset.setText("Reset");
        BtmReset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtmReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmResetActionPerformed(evt);
            }
        });
        jPanel10.add(BtmReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 130, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/keuanganapk/output-onlinepngtools (2).png"))); // NOI18N
        jPanel10.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Transfer", jPanel4);

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Bodoni Bd BT", 3, 36)); // NOI18N
        jLabel15.setText("== Dana ==");
        jPanel11.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        jLabel16.setFont(new java.awt.Font("Bodoni Bd BT", 3, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Metode Pembayaran:");
        jPanel11.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, -1));

        jLabel17.setFont(new java.awt.Font("Bodoni Bd BT", 3, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Jumlah Saldo:");
        jPanel11.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        jLabel18.setFont(new java.awt.Font("Bodoni Bd BT", 3, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Isi Saldo:");
        jPanel11.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        JumlahDana.setFont(new java.awt.Font("Bodoni Bd BT", 1, 18)); // NOI18N
        JumlahDana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumlahDanaActionPerformed(evt);
            }
        });
        jPanel11.add(JumlahDana, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 410, 30));
        jPanel11.add(IsiSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 410, 30));

        CbmMetodePembayaran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Metode--", "Indomart", "Alfamart", "BNI", "BRI" }));
        jPanel11.add(CbmMetodePembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 410, 30));

        BtmIsiDana.setBackground(new java.awt.Color(232, 181, 225));
        BtmIsiDana.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BtmIsiDana.setText("Isi Dana");
        BtmIsiDana.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtmIsiDana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmIsiDanaActionPerformed(evt);
            }
        });
        jPanel11.add(BtmIsiDana, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, 130, 40));

        BtmResetSaldo.setBackground(new java.awt.Color(232, 181, 225));
        BtmResetSaldo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BtmResetSaldo.setText("Reset");
        BtmResetSaldo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtmResetSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmResetSaldoActionPerformed(evt);
            }
        });
        jPanel11.add(BtmResetSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 130, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/keuanganapk/output-onlinepngtools (2).png"))); // NOI18N
        jPanel11.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Isi Dana", jPanel5);

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Bodoni Bd BT", 3, 36)); // NOI18N
        jLabel9.setText("== Keuangan ==");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jLabel14.setFont(new java.awt.Font("Bodoni Bd BT", 3, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Batas Pengeluaran (Setiap Bulan):");
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        jLabel22.setFont(new java.awt.Font("Bodoni Bd BT", 3, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Riwayat Keuangan:");
        jPanel9.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        jTFbatasPengeluaran.setFont(new java.awt.Font("Bodoni Bd BT", 1, 18)); // NOI18N
        jPanel9.add(jTFbatasPengeluaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 410, 30));

        BtmEdit.setBackground(new java.awt.Color(232, 181, 225));
        BtmEdit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BtmEdit.setText("Edit");
        BtmEdit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtmEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmEditActionPerformed(evt);
            }
        });
        jPanel9.add(BtmEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 80, -1));

        BtmLogout.setBackground(new java.awt.Color(232, 181, 225));
        BtmLogout.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BtmLogout.setText("Logout");
        BtmLogout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtmLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmLogoutActionPerformed(evt);
            }
        });
        jPanel9.add(BtmLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 620, 180, 40));

        jTableKeuangan.setBackground(new java.awt.Color(255, 204, 204));
        jTableKeuangan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 204, 204), null, new java.awt.Color(153, 0, 102)));
        jTableKeuangan.setFont(new java.awt.Font("Bodoni Bd BT", 0, 14)); // NOI18N
        jTableKeuangan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "Jumlah", "Metode", "Tanggal"
            }
        ));
        jTableKeuangan.setSelectionBackground(new java.awt.Color(255, 153, 204));
        jScrollPane1.setViewportView(jTableKeuangan);

        jPanel9.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 410, 280));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/keuanganapk/output-onlinepngtools (2).png"))); // NOI18N
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Keuangan", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtmEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmEditActionPerformed
        String batasStr = jTFbatasPengeluaran.getText();

            try {
                double batasPengeluaran = Double.parseDouble(batasStr);
                currentUser.setBatasPengeluaran(batasPengeluaran);

                try (Connection conn = Koneksi.getConnection()) {
                    String updateQuery = "UPDATE tb_user SET batasPengeluaran = ? WHERE id = ?";
                    PreparedStatement stmt = conn.prepareStatement(updateQuery);
                    stmt.setDouble(1, batasPengeluaran);
                    stmt.setInt(2, currentUser.getId());
                    stmt.executeUpdate();

                    JOptionPane.showMessageDialog(this, "Batas pengeluaran berhasil diperbarui.");
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Batas pengeluaran tidak valid.", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_BtmEditActionPerformed

    private void JumlahDanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumlahDanaActionPerformed
        
    }//GEN-LAST:event_JumlahDanaActionPerformed

    private void BtmIsiDanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmIsiDanaActionPerformed
        String jumlahStr = IsiSaldo.getText();
        String metode = (String) CbmMetodePembayaran.getSelectedItem();

        if (jumlahStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Harap masukkan jumlah pengisian.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double jumlah;
        try {
            jumlah = Double.parseDouble(jumlahStr);
            if (jumlah <= 0) {
                JOptionPane.showMessageDialog(this, "Jumlah harus lebih besar dari 0.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Jumlah tidak valid.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (Connection conn = Koneksi.getConnection()) {
            // Update saldo pengguna di database
            String updateSaldoQuery = "UPDATE tb_user SET saldo = saldo + ? WHERE id = ?";
            PreparedStatement updateSaldoStmt = conn.prepareStatement(updateSaldoQuery);
            updateSaldoStmt.setDouble(1, jumlah);
            updateSaldoStmt.setInt(2, currentUser.getId());
            updateSaldoStmt.executeUpdate();

            // Tambahkan riwayat pengisian dana ke tabel history
            String insertHistoryQuery = "INSERT INTO tb_history (user_id, jumlah, metode, tanggal) VALUES (?, ?, ?, NOW())";
            PreparedStatement insertHistoryStmt = conn.prepareStatement(insertHistoryQuery);
            insertHistoryStmt.setInt(1, currentUser.getId());
            insertHistoryStmt.setDouble(2, jumlah);
            insertHistoryStmt.setString(3, metode);
            insertHistoryStmt.executeUpdate();

            // Update saldo di objek currentUser
            currentUser.setSaldo(currentUser.getSaldo() + jumlah);

            // Tampilkan saldo terbaru di antarmuka
            JumlahDana.setText("Rp " + currentUser.getSaldo());
            loadHistoryTable();

            JOptionPane.showMessageDialog(this, "Pengisian dana berhasil!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtmIsiDanaActionPerformed

    private void BtmTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmTransferActionPerformed
        String jumlahStr = JumlahTransfer.getText();
        String metode = (String) CdmMetodePembayaran.getSelectedItem();
        String noRekening = NoRekening.getText();

        if (jumlahStr.isEmpty() || noRekening.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lengkapi semua kolom.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double jumlahTransfer;
        try {
            jumlahTransfer = Double.parseDouble(jumlahStr);
            if (jumlahTransfer <= 0) {
                JOptionPane.showMessageDialog(this, "Jumlah harus lebih dari 0.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Jumlah tidak valid.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Cek apakah jumlah transfer melebihi batas pengeluaran
        if (jumlahTransfer > currentUser.getBatasPengeluaran()) {
            JOptionPane.showMessageDialog(this, "Jumlah transfer melebihi batas pengeluaran maksimal Rp " + currentUser.getBatasPengeluaran(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (Connection conn = Koneksi.getConnection()) {
            // Update saldo di database
            String updateSaldoQuery = "UPDATE tb_user SET saldo = saldo - ? WHERE id = ?";
            PreparedStatement updateSaldoStmt = conn.prepareStatement(updateSaldoQuery);
            updateSaldoStmt.setDouble(1, jumlahTransfer);
            updateSaldoStmt.setInt(2, currentUser.getId());
            updateSaldoStmt.executeUpdate();

            // Tambahkan ke tabel history
            String insertHistoryQuery = "INSERT INTO tb_history (user_id, jumlah, metode, tanggal) VALUES (?, ?, ?, NOW())";
            PreparedStatement insertHistoryStmt = conn.prepareStatement(insertHistoryQuery);
            insertHistoryStmt.setInt(1, currentUser.getId());
            insertHistoryStmt.setDouble(2, -jumlahTransfer);
            insertHistoryStmt.setString(3, metode);
            insertHistoryStmt.executeUpdate();

            // Perbarui saldo di currentUser
            currentUser.setSaldo(currentUser.getSaldo() - jumlahTransfer);
            JumlahDana.setText("Rp " + currentUser.getSaldo());

            // Muat ulang tabel history
            loadHistoryTable();

            JOptionPane.showMessageDialog(this, "Transfer berhasil!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtmTransferActionPerformed

    private void BtmResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmResetActionPerformed
        JumlahTransfer.setText("");         
        CdmMetodePembayaran.setSelectedIndex(0);
        NoRekening.setText("");         
    }//GEN-LAST:event_BtmResetActionPerformed

    private void BtmResetSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmResetSaldoActionPerformed
        IsiSaldo.setText("");                 
        CbmMetodePembayaran.setSelectedIndex(0); 
    }//GEN-LAST:event_BtmResetSaldoActionPerformed

    private void BtmLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmLogoutActionPerformed
        this.dispose();
        Login loginForm = new Login();
        loginForm.setVisible(true);
    }//GEN-LAST:event_BtmLogoutActionPerformed
    //Tab Pertama
    private void DisplayModeUser() {
        if (currentUser != null) {
            //Label untuk menampilkan data pengguna
            NamaPengguna.setText(currentUser.getNama());
            GmailPengguna.setText(currentUser.getEmail());
            NomorPengguna.setText(" " +currentUser.getNomor());
        }
    }
    
    //Tab Kedua
    private void loadHistoryTable() {
    try (Connection conn = Koneksi.getConnection()) {
        // Urutkan data berdasarkan tanggal secara menurun (DESC) untuk menampilkan data terbaru di atas
        String query = "SELECT jumlah, metode, tanggal FROM tb_history WHERE user_id = ? ORDER BY tanggal DESC";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, currentUser.getId());

        ResultSet rs = stmt.executeQuery();

        DefaultTableModel model = (DefaultTableModel) jTableKeuangan.getModel();
        model.setRowCount(0); 
        
        int no = 1;
        while (rs.next()) {
            double jumlah = rs.getDouble("jumlah");
            String metode = rs.getString("metode");
            Date tanggal = rs.getDate("tanggal");

            // Tambahkan data ke tabel
            model.addRow(new Object[]{no++, jumlah, metode, tanggal});
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Apk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtmEdit;
    private javax.swing.JButton BtmIsiDana;
    private javax.swing.JButton BtmLogout;
    private javax.swing.JButton BtmReset;
    private javax.swing.JButton BtmResetSaldo;
    private javax.swing.JButton BtmTransfer;
    private javax.swing.JComboBox<String> CbmMetodePembayaran;
    private javax.swing.JComboBox<String> CdmMetodePembayaran;
    private javax.swing.JLabel GmailPengguna;
    private javax.swing.JTextField IsiSaldo;
    private javax.swing.JTextField JumlahDana;
    private javax.swing.JTextField JumlahTransfer;
    private javax.swing.JLabel NamaPengguna;
    private javax.swing.JTextField NoRekening;
    private javax.swing.JLabel NomorPengguna;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFbatasPengeluaran;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTableKeuangan;
    // End of variables declaration//GEN-END:variables
}
