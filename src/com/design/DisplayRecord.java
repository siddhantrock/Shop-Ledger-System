package com.design;

import com.commodity.Thing;
import com.database.Connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DisplayRecord extends javax.swing.JFrame 
{
    private ResultSet rs[],rs1,rs2;
    private Connect connect;
    private ArrayList days;
    private ArrayList offdays;
    private boolean rs1_flag;
    private boolean rs2_flag;
    
    public DisplayRecord() 
    {
        initComponents();
    }
    
    public void setResultSet(ResultSet rs[], Connect connect, ArrayList days, ArrayList offdays)
    {
        this.rs = rs;
        rs1 = rs[0];
        rs2 = rs[1];
        
        try 
        {
            if(rs1.next())
            {
                rs1_flag = true;
            }
            if(rs2.next())
            {
                rs2_flag = true;
            }
            if(rs1_flag == false && rs2_flag == false)
            {
                JOptionPane.showMessageDialog(this, "No record found");
                connect.closeConnection();
                dispose();
            }
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.connect = connect;
        this.days = days;
        this.offdays = offdays;
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
                List <Thing> al = new ArrayList();
                try 
                {
                    do
                    {
                        if(rs1_flag == true)
                        {    
                            rs1_flag = false;
                                
                            Thing thing = new Thing(rs1.getInt("id"),rs1.getString("name1"),rs1.getString("f_name"),rs1.getString("address")
                            ,rs1.getString("city"),rs1.getInt("zip"),rs1.getString("thing"),rs1.getString("type"),rs1.getInt("n_gold"),rs1.getInt("n_silver")
                            ,rs1.getInt("n_total"),rs1.getInt("interest"),rs1.getString("phone_no"),rs1.getString("date1"),rs1.getInt("n_gold")
                            ,rs1.getInt("n_silver"),rs1.getInt("rupess"),rs1.getInt("invest"),rs1.getString("date2"),rs1.getString("description"));
                            al.add(thing);

                            if(rs1.next())
                            {
                                rs1_flag = true;
                            }
                        }
                        
                        if(rs2_flag == true)
                        {
                            rs2_flag = false;
                                
                            Thing thing1 = new Thing(rs2.getInt("id"),rs2.getString("name1"),rs2.getString("f_name"),rs2.getString("address")
                            ,rs2.getString("city"),rs2.getInt("zip"),rs2.getString("thing"),rs2.getString("type"),rs2.getInt("n_gold"),rs2.getInt("n_silver")
                            ,rs2.getInt("n_total"),rs2.getInt("interest"),rs2.getString("phone_no"),rs2.getString("date1"),rs2.getInt("n_gold")
                            ,rs2.getInt("n_silver"),rs2.getInt("rupess"),rs2.getInt("invest"),rs2.getString("date2"),rs2.getString("description")
                            ,rs2.getInt("rupess2"),rs2.getString("date3"));
                            al.add(thing1);
                                
                            if(rs2.next())
                            {
                                rs2_flag = true;
                            }
                        }
 
                        if(rs1_flag == false && rs2_flag == false)
                        {
                            break;
                        }
                        
                    }while(true);
                    
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                Collections.sort(al);
                
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
                
                obj[0] = "";
                obj[1] = "";
                obj[2] = "";
                obj[3] = "";
                obj[4] = "";
                obj[5] = "";
                obj[6] = "";
                
                model1.addRow(obj);
                model1.addRow(obj);
                model1.addRow(obj);
                
                obj[0] = "";
                obj[1] = "";
                obj[2] = "Total";
                obj[3] = al.size();
                obj[4] = "";
                obj[5] = "";
                obj[6] = "";
                
                model1.addRow(obj);
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
