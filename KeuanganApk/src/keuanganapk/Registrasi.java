package keuanganapk;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Registrasi extends javax.swing.JFrame {

    public Registrasi() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtmDaftar = new javax.swing.JButton();
        BtmBatalDaftar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        EmailRegistrasi = new javax.swing.JTextField();
        PasswordRegistrasi = new javax.swing.JPasswordField();
        NameRegistrasi = new javax.swing.JTextField();
        NomorRegistrasi = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtmDaftar.setBackground(new java.awt.Color(232, 181, 225));
        BtmDaftar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BtmDaftar.setText("Daftar");
        BtmDaftar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtmDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmDaftarActionPerformed(evt);
            }
        });
        jPanel1.add(BtmDaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 620, 100, 30));

        BtmBatalDaftar.setBackground(new java.awt.Color(232, 181, 225));
        BtmBatalDaftar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BtmBatalDaftar.setText("Kembali");
        BtmBatalDaftar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtmBatalDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmBatalDaftarActionPerformed(evt);
            }
        });
        jPanel1.add(BtmBatalDaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 620, 100, 30));

        jLabel9.setFont(new java.awt.Font("Bodoni Bd BT", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Password:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        jLabel10.setFont(new java.awt.Font("Bodoni Bd BT", 3, 18)); // NOI18N
        jLabel10.setText("Isi Data Diri Anda Sebenar-benarnya!");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));
        jPanel1.add(EmailRegistrasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 420, 30));
        jPanel1.add(PasswordRegistrasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 420, 30));
        jPanel1.add(NameRegistrasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 420, 30));
        jPanel1.add(NomorRegistrasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 420, 30));

        jLabel11.setFont(new java.awt.Font("Bodoni Bd BT", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, -1, -1));

        jLabel12.setFont(new java.awt.Font("Bodoni Bd BT", 3, 24)); // NOI18N
        jLabel12.setText("Mendaftarkan Akun");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jLabel13.setFont(new java.awt.Font("Bodoni Bd BT", 3, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Username:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        jLabel14.setFont(new java.awt.Font("Bodoni Bd BT", 3, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Nomor Telp:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/keuanganapk/output-onlinepngtools (2).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtmBatalDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmBatalDaftarActionPerformed
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtmBatalDaftarActionPerformed

    private void BtmDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmDaftarActionPerformed
        String username = NameRegistrasi.getText(); 
        String password = new String(PasswordRegistrasi.getPassword()); 
        String email = EmailRegistrasi.getText(); 
        String nomor = NomorRegistrasi.getText(); 

        if (username.isEmpty() || password.isEmpty() || email.isEmpty() || nomor.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Harap isi semua kolom!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (Connection conn = Koneksi.getConnection()) {
            String checkQuery = "SELECT * FROM tb_user WHERE nama = ?";
            PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
            checkStmt.setString(1, username);
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Username sudah ada. Gunakan username lain.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // Jika username belum ada, masukkan data baru ke database
                String insertQuery = "INSERT INTO tb_user (nama, password, email, nomor) VALUES (?, ?, ?, ?)";
                PreparedStatement insertStmt = conn.prepareStatement(insertQuery);
                insertStmt.setString(1, username);
                insertStmt.setString(2, password);
                insertStmt.setString(3, email);
                insertStmt.setString(4, nomor);

                int rowsInserted = insertStmt.executeUpdate();
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Registrasi berhasil!");
                    NameRegistrasi.setText("");
                    PasswordRegistrasi.setText("");
                    EmailRegistrasi.setText("");
                    NomorRegistrasi.setText("");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtmDaftarActionPerformed

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
            java.util.logging.Logger.getLogger(Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtmBatalDaftar;
    private javax.swing.JButton BtmDaftar;
    private javax.swing.JTextField EmailRegistrasi;
    private javax.swing.JTextField NameRegistrasi;
    private javax.swing.JTextField NomorRegistrasi;
    private javax.swing.JPasswordField PasswordRegistrasi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
