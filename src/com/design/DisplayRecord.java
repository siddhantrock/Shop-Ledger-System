package com.design;

import com.commodity.Thing;
import com.database.Connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class DisplayRecord extends javax.swing.JFrame 
{
    private ResultSet rs[],rs1,rs2;
    private Connect connect;
    
    public DisplayRecord() 
    {
        initComponents();
    }
    
    public void setResultSet(ResultSet rs[], Connect connect)
    {
        this.rs = rs;
        rs1 = rs[0];
        rs2 = rs[1];
        this.connect = connect;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(DisplayRecord.MAXIMIZED_BOTH);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "F_name", "Address", "Thing", "Rupess", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(339, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        new Thread(new Runnable()
        {
            public void run()
            {
                ArrayList <Thing> al = new ArrayList();
                
                try 
                {
                    do
                    {
                        Thing thing = new Thing(rs1.getInt("id"),rs1.getString("name1"),rs1.getString("f_name"),rs1.getString("address")
                        ,rs1.getString("city"),rs1.getInt("zip"),rs1.getString("thing"),rs1.getString("type"),rs1.getInt("n_gold"),rs1.getInt("n_silver")
                        ,rs1.getInt("n_total"),rs1.getInt("interest"),rs1.getString("phone_no"),rs1.getString("date1"),rs1.getInt("n_gold")
                        ,rs1.getInt("n_silver"),rs1.getInt("rupess"),rs1.getInt("invest"),rs1.getString("date2"),rs1.getString("description"));
                        al.add(thing);
                    }while(rs1.next());
                    
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                Object[] obj = new Object[7];
                DefaultTableModel model1 = (DefaultTableModel)jTable1.getModel();
                
                for(int i=0;i<al.size();i++)
                {
                    obj[0] = al.get(i).getId();
                    obj[1] = al.get(i).getName();
                    obj[2] = al.get(i).getF_name();
                    obj[3] = al.get(i).getAddress();
                    obj[4] = al.get(i).getThing();
                    obj[5] = al.get(i).getRupess();
                    obj[6] = al.get(i).getDate1();
                    
                    model1.addRow(obj);
                }
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
            java.util.logging.Logger.getLogger(DisplayRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
