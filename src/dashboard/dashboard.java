/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dashboard;

/**
 *
 * @author Faujixx
 */
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        srp = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        sgudang = new javax.swing.JButton();
        skaryawan = new javax.swing.JButton();
        qcheck = new javax.swing.JButton();
        bdashboard = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        brp = new javax.swing.JButton();
        tbrang = new javax.swing.JButton();
        tkaryawan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1440, 1024));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        srp.setText("Seluruh Riwayat Produksi");
        srp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                srpMouseClicked(evt);
            }
        });

        jLabel8.setText("Master Data");

        sgudang.setText("Stok Gudang");
        sgudang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sgudangMouseClicked(evt);
            }
        });

        skaryawan.setText("Seluruh Karyawan");
        skaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                skaryawanMouseClicked(evt);
            }
        });

        qcheck.setText("Quality Check");
        qcheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qcheckMouseClicked(evt);
            }
        });

        bdashboard.setText("Dashboard");
        bdashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bdashboardMouseClicked(evt);
            }
        });
        bdashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdashboardActionPerformed(evt);
            }
        });

        jLabel9.setText("Edit / Update Data");

        brp.setText("Buat Rencana Produksi");
        brp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brpMouseClicked(evt);
            }
        });

        tbrang.setText("Tambah Barang");

        tkaryawan.setText("Tambah Karyawan");
        tkaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tkaryawanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tkaryawan)
                    .addComponent(jLabel8)
                    .addComponent(srp)
                    .addComponent(sgudang)
                    .addComponent(skaryawan)
                    .addComponent(qcheck)
                    .addComponent(bdashboard)
                    .addComponent(jLabel9)
                    .addComponent(brp)
                    .addComponent(tbrang))
                .addContainerGap(587, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(bdashboard)
                .addGap(12, 12, 12)
                .addComponent(jLabel9)
                .addGap(12, 12, 12)
                .addComponent(brp)
                .addGap(12, 12, 12)
                .addComponent(tbrang)
                .addGap(12, 12, 12)
                .addComponent(tkaryawan)
                .addGap(12, 12, 12)
                .addComponent(jLabel8)
                .addGap(12, 12, 12)
                .addComponent(srp)
                .addGap(12, 12, 12)
                .addComponent(sgudang)
                .addGap(12, 12, 12)
                .addComponent(skaryawan)
                .addGap(12, 12, 12)
                .addComponent(qcheck)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        setExtendedState(dashboard.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowActivated

    private void srpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srpMouseClicked
        // TODO add your handling code here:
        SeluruhRiwayatProduksi.SeluruhRiwayatProduksi a = new SeluruhRiwayatProduksi.SeluruhRiwayatProduksi();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_srpMouseClicked

    private void sgudangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sgudangMouseClicked
        // TODO add your handling code here:
        StokGudang.StokGudang a = new StokGudang.StokGudang();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_sgudangMouseClicked

    private void skaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_skaryawanMouseClicked
        // TODO add your handling code here:
        DataSeluruhKaryawan.DataSeluruhKaryawan a = new DataSeluruhKaryawan.DataSeluruhKaryawan();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_skaryawanMouseClicked

    private void qcheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qcheckMouseClicked
        // TODO add your handling code here:
        QualityCheck.QualityCheck a = new QualityCheck.QualityCheck();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_qcheckMouseClicked

    private void bdashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdashboardMouseClicked
        // TODO add your handling code here:
     
    }//GEN-LAST:event_bdashboardMouseClicked

    private void bdashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdashboardActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_bdashboardActionPerformed

    private void brpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brpMouseClicked
        // TODO add your handling code here:
        TambahRencanaProduksi.TambahRencanaProduksi a = new TambahRencanaProduksi.TambahRencanaProduksi();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_brpMouseClicked

    private void tkaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tkaryawanMouseClicked
        // TODO add your handling code here:
        TambahKaryawan.TambahKaryawan a = new TambahKaryawan.TambahKaryawan();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_tkaryawanMouseClicked

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bdashboard;
    private javax.swing.JButton brp;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton qcheck;
    private javax.swing.JButton sgudang;
    private javax.swing.JButton skaryawan;
    private javax.swing.JButton srp;
    private javax.swing.JButton tbrang;
    private javax.swing.JButton tkaryawan;
    // End of variables declaration//GEN-END:variables
}
