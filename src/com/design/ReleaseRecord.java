package com.design;

import com.database.Connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ReleaseRecord extends javax.swing.JFrame 
{
    
    private Connect connect;

    public ReleaseRecord() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tuesday_check = new javax.swing.JCheckBox();
        wednesday_check = new javax.swing.JCheckBox();
        thursday_check = new javax.swing.JCheckBox();
        friday_check = new javax.swing.JCheckBox();
        saturday_check = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        days_list = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        submit_btn = new javax.swing.JButton();
        home_btn = new javax.swing.JButton();
        month_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        year_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sunday_check = new javax.swing.JCheckBox();
        monday_check = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(ReleaseRecord.MAXIMIZED_BOTH);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tuesday_check.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        tuesday_check.setText("Tuesday");
        tuesday_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuesday_checkActionPerformed(evt);
            }
        });
        getContentPane().add(tuesday_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, -1, -1));

        wednesday_check.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        wednesday_check.setText("Wednesday");
        getContentPane().add(wednesday_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 220, -1, -1));

        thursday_check.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        thursday_check.setText("Thursday");
        getContentPane().add(thursday_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, -1, -1));

        friday_check.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        friday_check.setText("Friday");
        getContentPane().add(friday_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, -1, -1));

        saturday_check.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        saturday_check.setText("saturday");
        getContentPane().add(saturday_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4.setText("Select perticular off days");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, -1));

        days_list.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        days_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(days_list);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 81, 71));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel1.setText("select month and year");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        submit_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        submit_btn.setText("Submit");
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });
        getContentPane().add(submit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, -1, -1));

        home_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        home_btn.setText("Home");
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });
        getContentPane().add(home_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, -1, -1));

        month_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        getContentPane().add(month_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 30, -1));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2.setText("/");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, -1, -1));

        year_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        getContentPane().add(year_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 50, -1));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3.setText("Select off days");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        sunday_check.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        sunday_check.setText("Sunday");
        getContentPane().add(sunday_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, -1, -1));

        monday_check.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        monday_check.setText("Monday");
        getContentPane().add(monday_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/16067961-Jewelry-earrings-on-light-silk-background-Stock-Vector-jewellery.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tuesday_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuesday_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tuesday_checkActionPerformed

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed

        new Thread(new Runnable()
            {
                public void run()
                {
                    String month,year;
                    ResultSet rs;
                    ArrayList<Integer> days = new ArrayList();
                    ArrayList<Integer> offdays = new ArrayList();

                    month = month_txt.getText();
                    year = year_txt.getText();

                    rs = connect.addDeletedRecordToLedger(month, year);
                    
                    try 
                    {
                        if(rs.next())
                        {
                            
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(ReleaseRecord.this, "No record found");
                        }
                    }
                    catch (SQLException ex) 
                    {
                        JOptionPane.showMessageDialog(ReleaseRecord.this, "Something went wrong please try again later");
                    }

                    if(sunday_check.isSelected())
                    {
                        offdays.add(0);
                    }

                    if(monday_check.isSelected())
                    {
                        offdays.add(1);
                    }

                    if(tuesday_check.isSelected())
                    {
                        offdays.add(2);
                    }

                    if(wednesday_check.isSelected())
                    {
                        offdays.add(3);
                    }

                    if(thursday_check.isSelected())
                    {
                        offdays.add(4);
                    }

                    if(friday_check.isSelected())
                    {
                        offdays.add(5);
                    }

                    if(saturday_check.isSelected())
                    {
                        offdays.add(6);
                    }

                    if(days_list.getSelectedIndex() != -1)
                    {
                        days = new ArrayList(days_list.getSelectedValuesList());
                    }

                    DisplayDeletedRecord dr = new DisplayDeletedRecord();
                    dr.setVisible(true);
                    dr.setResultSet(rs, connect,days,offdays,month,year);
                    dispose();
                }
            }).start();

    }//GEN-LAST:event_submit_btnActionPerformed

    private void home_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_btnActionPerformed

        new Thread(new Runnable()
            {
                public void run()
                {
                    new Home().setVisible(true);
                    connect.closeConnection();
                    dispose();
                }
            }).start();

    }//GEN-LAST:event_home_btnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        new Thread(new Runnable()
        {
            public void run()
            {
                connect = new Connect();
            }
        }).start();
        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(ReleaseRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReleaseRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReleaseRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReleaseRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReleaseRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> days_list;
    private javax.swing.JCheckBox friday_check;
    private javax.swing.JButton home_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox monday_check;
    private javax.swing.JTextField month_txt;
    private javax.swing.JCheckBox saturday_check;
    private javax.swing.JButton submit_btn;
    private javax.swing.JCheckBox sunday_check;
    private javax.swing.JCheckBox thursday_check;
    private javax.swing.JCheckBox tuesday_check;
    private javax.swing.JCheckBox wednesday_check;
    private javax.swing.JTextField year_txt;
    // End of variables declaration//GEN-END:variables
}
