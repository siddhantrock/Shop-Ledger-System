package com.design;

public class Home extends javax.swing.JFrame 
{
    public Home() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        putting_record_btn = new javax.swing.JButton();
        releasing_record_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(Home.MAXIMIZED_BOTH);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        putting_record_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        putting_record_btn.setText("Puting record in ledger account");
        putting_record_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                putting_record_btnActionPerformed(evt);
            }
        });
        getContentPane().add(putting_record_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        releasing_record_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        releasing_record_btn.setText("Releasing record from ledger account");
        releasing_record_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                releasing_record_btnActionPerformed(evt);
            }
        });
        getContentPane().add(releasing_record_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/16067961-Jewelry-earrings-on-light-silk-background-Stock-Vector-jewellery.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1320, 1320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void putting_record_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_putting_record_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                new AddRecord().setVisible(true);
                dispose();
            }
        }).start();
        
    }//GEN-LAST:event_putting_record_btnActionPerformed

    private void releasing_record_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_releasing_record_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                new ReleaseRecord().setVisible(true);
                dispose();
            }
        }).start();
        
    }//GEN-LAST:event_releasing_record_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton putting_record_btn;
    private javax.swing.JButton releasing_record_btn;
    // End of variables declaration//GEN-END:variables
}
