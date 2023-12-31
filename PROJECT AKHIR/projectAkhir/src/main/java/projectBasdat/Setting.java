/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectBasdat;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Setting extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form Setting
     */
    public Setting() {
        initComponents();
        conn = Koneksi.connectRb();
        populateCB();
        passwordTxt.setEnabled(false);
        savePassBtn.setEnabled(false);
        usernameCb.setSelectedIndex(-1);
    }

    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    private void populateCB() {
        try {
            String sqlQuery = "SELECT * FROM login";
            PreparedStatement pst = conn.prepareStatement(sqlQuery);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                usernameCb.addItem(rs.getString(1));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        navAuditor = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        navInfoKlien = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        navHasilAudit = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        navLaporanKeuangan = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        navAfiliator = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        navFile = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        navKelolaAkun = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usernameCb = new javax.swing.JComboBox<>();
        savePassBtn = new javax.swing.JButton();
        deleteAccountBtn = new javax.swing.JButton();
        passwordTxt = new javax.swing.JTextField();
        changePassBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1429, 750));

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        navAuditor.setBackground(new java.awt.Color(0, 51, 102));
        navAuditor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navAuditorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navAuditorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navAuditorMouseExited(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Tabel Auditor");

        javax.swing.GroupLayout navAuditorLayout = new javax.swing.GroupLayout(navAuditor);
        navAuditor.setLayout(navAuditorLayout);
        navAuditorLayout.setHorizontalGroup(
            navAuditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navAuditorLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        navAuditorLayout.setVerticalGroup(
            navAuditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navAuditorLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addContainerGap())
        );

        navInfoKlien.setBackground(new java.awt.Color(0, 51, 102));
        navInfoKlien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navInfoKlienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navInfoKlienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navInfoKlienMouseExited(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Informasi Klien");

        javax.swing.GroupLayout navInfoKlienLayout = new javax.swing.GroupLayout(navInfoKlien);
        navInfoKlien.setLayout(navInfoKlienLayout);
        navInfoKlienLayout.setHorizontalGroup(
            navInfoKlienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(navInfoKlienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(navInfoKlienLayout.createSequentialGroup()
                    .addGap(0, 32, Short.MAX_VALUE)
                    .addComponent(jLabel17)
                    .addGap(0, 36, Short.MAX_VALUE)))
        );
        navInfoKlienLayout.setVerticalGroup(
            navInfoKlienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(navInfoKlienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(navInfoKlienLayout.createSequentialGroup()
                    .addGap(0, 11, Short.MAX_VALUE)
                    .addComponent(jLabel17)
                    .addGap(0, 11, Short.MAX_VALUE)))
        );

        navHasilAudit.setBackground(new java.awt.Color(0, 51, 102));
        navHasilAudit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navHasilAuditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navHasilAuditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navHasilAuditMouseExited(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Laporan Hasil Audit");

        javax.swing.GroupLayout navHasilAuditLayout = new javax.swing.GroupLayout(navHasilAudit);
        navHasilAudit.setLayout(navHasilAuditLayout);
        navHasilAuditLayout.setHorizontalGroup(
            navHasilAuditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navHasilAuditLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(23, 23, 23))
        );
        navHasilAuditLayout.setVerticalGroup(
            navHasilAuditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navHasilAuditLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        navLaporanKeuangan.setBackground(new java.awt.Color(0, 51, 102));
        navLaporanKeuangan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navLaporanKeuanganMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navLaporanKeuanganMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navLaporanKeuanganMouseExited(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Laporan Keuangan ");

        javax.swing.GroupLayout navLaporanKeuanganLayout = new javax.swing.GroupLayout(navLaporanKeuangan);
        navLaporanKeuangan.setLayout(navLaporanKeuanganLayout);
        navLaporanKeuanganLayout.setHorizontalGroup(
            navLaporanKeuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navLaporanKeuanganLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(18, 18, 18))
        );
        navLaporanKeuanganLayout.setVerticalGroup(
            navLaporanKeuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navLaporanKeuanganLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addContainerGap())
        );

        navAfiliator.setBackground(new java.awt.Color(0, 51, 102));
        navAfiliator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navAfiliatorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navAfiliatorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navAfiliatorMouseExited(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Afiliator");

        javax.swing.GroupLayout navAfiliatorLayout = new javax.swing.GroupLayout(navAfiliator);
        navAfiliator.setLayout(navAfiliatorLayout);
        navAfiliatorLayout.setHorizontalGroup(
            navAfiliatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navAfiliatorLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        navAfiliatorLayout.setVerticalGroup(
            navAfiliatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navAfiliatorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addContainerGap())
        );

        navFile.setBackground(new java.awt.Color(0, 51, 102));
        navFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navFileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navFileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navFileMouseExited(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("File ");

        javax.swing.GroupLayout navFileLayout = new javax.swing.GroupLayout(navFile);
        navFile.setLayout(navFileLayout);
        navFileLayout.setHorizontalGroup(
            navFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navFileLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        navFileLayout.setVerticalGroup(
            navFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navFileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Poppins", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("AM");

        navKelolaAkun.setBackground(new java.awt.Color(0, 102, 153));
        navKelolaAkun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navKelolaAkunMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navKelolaAkunMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navKelolaAkunMouseExited(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Account");

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\KULIAH\\SEMESTER 3\\PROJECT AKHIR\\projectAkhir\\cog-solid-24-3.png")); // NOI18N

        javax.swing.GroupLayout navKelolaAkunLayout = new javax.swing.GroupLayout(navKelolaAkun);
        navKelolaAkun.setLayout(navKelolaAkunLayout);
        navKelolaAkunLayout.setHorizontalGroup(
            navKelolaAkunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navKelolaAkunLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        navKelolaAkunLayout.setVerticalGroup(
            navKelolaAkunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navKelolaAkunLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(navKelolaAkunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel23))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navAuditor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(navInfoKlien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(navHasilAudit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(navLaporanKeuangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(navAfiliator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(navFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(navKelolaAkun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(navInfoKlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(navAuditor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(navHasilAudit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(navLaporanKeuangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(navAfiliator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(navFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(navKelolaAkun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jLabel18.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel18.setText("ACCOUNT SETTING");

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel3.setText("Username");

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel5.setText("Password");

        usernameCb.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        usernameCb.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                usernameCbPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        savePassBtn.setBackground(new java.awt.Color(0, 51, 102));
        savePassBtn.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        savePassBtn.setForeground(new java.awt.Color(255, 255, 255));
        savePassBtn.setText("Save");
        savePassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePassBtnActionPerformed(evt);
            }
        });

        deleteAccountBtn.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        deleteAccountBtn.setForeground(new java.awt.Color(255, 55, 55));
        deleteAccountBtn.setText("Delete Account");
        deleteAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAccountBtnActionPerformed(evt);
            }
        });

        passwordTxt.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        changePassBtn.setBackground(new java.awt.Color(0, 102, 153));
        changePassBtn.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        changePassBtn.setForeground(new java.awt.Color(255, 255, 255));
        changePassBtn.setText("Change Password");
        changePassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
                        .addComponent(jLabel18)
                        .addGap(273, 273, 273))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(changePassBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(savePassBtn)
                                .addGap(18, 18, 18)
                                .addComponent(deleteAccountBtn))
                            .addComponent(usernameCb, 0, 323, Short.MAX_VALUE)
                            .addComponent(passwordTxt))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameCb, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savePassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changePassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void navAuditorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navAuditorMouseClicked
        // TODO add your handling code here:
        FormAuditor fa = new FormAuditor();
        close();

        fa.show();
    }//GEN-LAST:event_navAuditorMouseClicked

    private void navAuditorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navAuditorMouseEntered
        // TODO add your handling code here:
        navAuditor.setCursor(new Cursor(Cursor.HAND_CURSOR));
        navAuditor.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_navAuditorMouseEntered

    private void navAuditorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navAuditorMouseExited
        // TODO add your handling code here:
        navAuditor.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        navAuditor.setBackground(new Color(0, 51, 102));
    }//GEN-LAST:event_navAuditorMouseExited

    private void navInfoKlienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navInfoKlienMouseClicked
        // TODO add your handling code here:
        InformasiKlien ik = new InformasiKlien();
        close();

        ik.show();
    }//GEN-LAST:event_navInfoKlienMouseClicked

    private void navInfoKlienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navInfoKlienMouseEntered
        // TODO add your handling code here:
        navInfoKlien.setCursor(new Cursor(Cursor.HAND_CURSOR));
        navInfoKlien.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_navInfoKlienMouseEntered

    private void navInfoKlienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navInfoKlienMouseExited
        // TODO add your handling code here:
        navInfoKlien.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        navInfoKlien.setBackground(new Color(0, 51, 102));
    }//GEN-LAST:event_navInfoKlienMouseExited

    private void navHasilAuditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navHasilAuditMouseClicked
        // TODO add your handling code here:
        LaporanHasilAudit lha = new LaporanHasilAudit();
        close();

        lha.show();
    }//GEN-LAST:event_navHasilAuditMouseClicked

    private void navHasilAuditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navHasilAuditMouseEntered
        // TODO add your handling code here:
        navHasilAudit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        navHasilAudit.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_navHasilAuditMouseEntered

    private void navHasilAuditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navHasilAuditMouseExited
        // TODO add your handling code here:
        navHasilAudit.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        navHasilAudit.setBackground(new Color(0, 51, 102));
    }//GEN-LAST:event_navHasilAuditMouseExited

    private void navLaporanKeuanganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navLaporanKeuanganMouseClicked
        // TODO add your handling code here:
        LaporanKeuangan lk = new LaporanKeuangan();
        close();

        lk.show();
    }//GEN-LAST:event_navLaporanKeuanganMouseClicked

    private void navLaporanKeuanganMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navLaporanKeuanganMouseEntered
        // TODO add your handling code here:
        navLaporanKeuangan.setCursor(new Cursor(Cursor.HAND_CURSOR));
        navLaporanKeuangan.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_navLaporanKeuanganMouseEntered

    private void navLaporanKeuanganMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navLaporanKeuanganMouseExited
        // TODO add your handling code here:
        navLaporanKeuangan.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        navLaporanKeuangan.setBackground(new Color(0, 51, 102));
    }//GEN-LAST:event_navLaporanKeuanganMouseExited

    private void navAfiliatorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navAfiliatorMouseClicked
        // TODO add your handling code here:
        Afiliator af = new Afiliator();
        close();

        af.show();
    }//GEN-LAST:event_navAfiliatorMouseClicked

    private void navAfiliatorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navAfiliatorMouseEntered
        // TODO add your handling code here:
        navAfiliator.setCursor(new Cursor(Cursor.HAND_CURSOR));
        navAfiliator.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_navAfiliatorMouseEntered

    private void navAfiliatorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navAfiliatorMouseExited
        // TODO add your handling code here:
        navAfiliator.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        navAfiliator.setBackground(new Color(0, 51, 102));
    }//GEN-LAST:event_navAfiliatorMouseExited

    private void navFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navFileMouseClicked
        // TODO add your handling code here:
        File file = new File();
        close();

        file.show();
    }//GEN-LAST:event_navFileMouseClicked

    private void navFileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navFileMouseEntered
        // TODO add your handling code here:
        navFile.setCursor(new Cursor(Cursor.HAND_CURSOR));
        navFile.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_navFileMouseEntered

    private void navFileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navFileMouseExited
        // TODO add your handling code here:
        navFile.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        navFile.setBackground(new Color(0, 51, 102));
    }//GEN-LAST:event_navFileMouseExited

    private void navKelolaAkunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navKelolaAkunMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_navKelolaAkunMouseClicked

    private void navKelolaAkunMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navKelolaAkunMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_navKelolaAkunMouseEntered

    private void navKelolaAkunMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navKelolaAkunMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_navKelolaAkunMouseExited

    private void savePassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePassBtnActionPerformed
        // TODO add your handling code here:
        String selectedUsername = (String) usernameCb.getSelectedItem();
        String pass = passwordTxt.getText();

        String sqlQuery = "UPDATE login SET password=? WHERE username=?";
        try {
            pst = conn.prepareStatement(sqlQuery);
            pst.setString(1, pass);
            pst.setString(2, selectedUsername);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Password Successfully Updated");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_savePassBtnActionPerformed

    private void deleteAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAccountBtnActionPerformed
        // TODO add your handling code here:
        String selectedUsername = (String) usernameCb.getSelectedItem();
        String sqlQuery = "DELETE FROM login WHERE username=" + "'" + selectedUsername + "'";

        try {
            pst = conn.prepareStatement(sqlQuery);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Username Successfully Removed");

            DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) usernameCb.getModel();
            model.removeElement(selectedUsername);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_deleteAccountBtnActionPerformed

    private void usernameCbPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_usernameCbPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        String selectedUsername = (String) usernameCb.getSelectedItem();

        try {
            String sqlQuery = "SELECT * FROM login WHERE username=" + "'" + selectedUsername + "'";
            PreparedStatement pst = conn.prepareStatement(sqlQuery);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String pass = rs.getString(2);
                passwordTxt.setText(pass);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_usernameCbPopupMenuWillBecomeInvisible

    private void changePassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePassBtnActionPerformed
        // TODO add your handling code here:
        passwordTxt.setEnabled(true);
        savePassBtn.setEnabled(true);
    }//GEN-LAST:event_changePassBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Setting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changePassBtn;
    private javax.swing.JButton deleteAccountBtn;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel navAfiliator;
    private javax.swing.JPanel navAuditor;
    private javax.swing.JPanel navFile;
    private javax.swing.JPanel navHasilAudit;
    private javax.swing.JPanel navInfoKlien;
    private javax.swing.JPanel navKelolaAkun;
    private javax.swing.JPanel navLaporanKeuangan;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JButton savePassBtn;
    private javax.swing.JComboBox<String> usernameCb;
    // End of variables declaration//GEN-END:variables
}
