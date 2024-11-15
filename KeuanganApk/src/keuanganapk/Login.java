package keuanganapk;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    private User currentUser;

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtmRegistrasi = new javax.swing.JButton();
        BtmMasuk1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        PasswordLogin = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtmRegistrasi.setBackground(new java.awt.Color(232, 181, 225));
        BtmRegistrasi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BtmRegistrasi.setText("Registrasi");
        BtmRegistrasi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtmRegistrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmRegistrasiActionPerformed(evt);
            }
        });

        BtmMasuk1.setBackground(new java.awt.Color(232, 181, 225));
        BtmMasuk1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BtmMasuk1.setText("Login");
        BtmMasuk1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtmMasuk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmMasuk1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Bodoni Bd BT", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Password:");

        jLabel10.setFont(new java.awt.Font("Bodoni Bd BT", 3, 18)); // NOI18N
        jLabel10.setText("Ayo Kelola Uang Anda Bersama-sama.");

        jLabel11.setFont(new java.awt.Font("Bodoni Bd BT", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Username:");

        jLabel12.setFont(new java.awt.Font("Bodoni Bd BT", 3, 24)); // NOI18N
        jLabel12.setText("Selamat Datang!");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/keuanganapk/output-onlinepngtools (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel12))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel10))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel11))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel9))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(PasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(BtmMasuk1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(BtmRegistrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel12)
                .addGap(1, 1, 1)
                .addComponent(jLabel10)
                .addGap(177, 177, 177)
                .addComponent(jLabel11)
                .addGap(91, 91, 91)
                .addComponent(jLabel9)
                .addGap(11, 11, 11)
                .addComponent(PasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtmMasuk1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtmRegistrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1)
        );

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

    private void BtmRegistrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmRegistrasiActionPerformed
        Registrasi registrasi = new Registrasi(); //incase
        registrasi.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtmRegistrasiActionPerformed

    private void BtmMasuk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmMasuk1ActionPerformed
        String username = UserName.getText(); 
        String password = new String(PasswordLogin.getPassword());

        try (Connection conn = Koneksi.getConnection()) {
            String query = "SELECT * FROM tb_user WHERE nama = ? AND password = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                currentUser = new User(
                    rs.getInt("id"),
                    rs.getString("nama"),
                    rs.getString("email"),
                    rs.getInt("nomor"),
                    rs.getString("password"),
                    rs.getDouble("saldo"),
                    rs.getDouble("batasPengeluaran")
                );

                JOptionPane.showMessageDialog(this, "Login berhasil!");

                // Pindah ke antarmuka `Apk` dan tampilkan data pengguna
                Apk mainApp = new Apk(currentUser);
                mainApp.setVisible(true);

                // Sembunyikan antarmuka login saat ini
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Username atau password salah!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_BtmMasuk1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtmMasuk1;
    private javax.swing.JButton BtmRegistrasi;
    private javax.swing.JPasswordField PasswordLogin;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
