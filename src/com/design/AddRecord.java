package com.design;

import com.database.Connect;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AddRecord extends javax.swing.JFrame 
{
    private Connect connect;

    public AddRecord() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        submit_btn = new javax.swing.JButton();
        home_btn = new javax.swing.JButton();
        month_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        year_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sunday_check = new javax.swing.JCheckBox();
        monday_check = new javax.swing.JCheckBox();
        tuesday_check = new javax.swing.JCheckBox();
        wednesday_check = new javax.swing.JCheckBox();
        thursday_check = new javax.swing.JCheckBox();
        friday_check = new javax.swing.JCheckBox();
        saturday_check = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        days_list = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(AddRecord.MAXIMIZED_BOTH);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("select month and year");

        submit_btn.setText("Submit");
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });

        home_btn.setText("Home");
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });

        jLabel2.setText("/");

        jLabel3.setText("Select off days");

        sunday_check.setText("Sunday");

        monday_check.setText("Monday");

        tuesday_check.setText("Tuesday");
        tuesday_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuesday_checkActionPerformed(evt);
            }
        });

        wednesday_check.setText("Wednesday");

        thursday_check.setText("Thursday");

        friday_check.setText("Friday");

        saturday_check.setText("saturday");

        jLabel4.setText("Select perticular off days");

        days_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(days_list);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(115, 115, 115))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(150, 150, 150)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(102, 102, 102))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(submit_btn)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(home_btn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(month_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(year_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sunday_check)
                        .addGap(18, 18, 18)
                        .addComponent(monday_check)
                        .addGap(18, 18, 18)
                        .addComponent(tuesday_check)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wednesday_check))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(thursday_check)
                        .addGap(18, 18, 18)
                        .addComponent(friday_check)
                        .addGap(18, 18, 18)
                        .addComponent(saturday_check))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(month_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(year_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sunday_check)
                    .addComponent(monday_check)
                    .addComponent(tuesday_check)
                    .addComponent(wednesday_check))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thursday_check)
                    .addComponent(friday_check)
                    .addComponent(saturday_check))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit_btn)
                    .addComponent(home_btn))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        new Thread(new Runnable()
        {
            public void run()
            {
                connect = new Connect();
            }
        }).start();
        
    }//GEN-LAST:event_formWindowOpened

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

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                String month,year;
                ResultSet rs[];
                ArrayList<Integer> days = new ArrayList();
                ArrayList<Integer> offdays = new ArrayList();
                
                month = month_txt.getText();
                year = year_txt.getText();
                
                rs = connect.addRecordToLedger(month, year);
                
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
                
                DisplayRecord dr = new DisplayRecord();
                dr.setVisible(true);
                dr.setResultSet(rs, connect,days,offdays,month,year);
                dispose();
            }
        }).start();
        
    }//GEN-LAST:event_submit_btnActionPerformed

    private void tuesday_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuesday_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tuesday_checkActionPerformed

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
            java.util.logging.Logger.getLogger(AddRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddRecord().setVisible(true);
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
