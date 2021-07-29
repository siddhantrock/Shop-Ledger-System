package com.design;

import com.commodity.Thing;
import com.database.Connect;
import com.itextpdf.kernel.colors.DeviceCmyk;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class DisplayRecord extends javax.swing.JFrame 
{
    private ResultSet rs[],rs1,rs2;
    private Connect connect;
    private ArrayList<Integer> days;
    private ArrayList<Integer> offdays;
    private boolean rs1_flag;
    private boolean rs2_flag;
    private int id,row=-1;
    private String month,year;
    private String table;
    private List <Thing> al = new ArrayList();
    
    public DisplayRecord() 
    {
        initComponents();
    }
    
    public void setResultSet(ResultSet rs[], Connect connect, ArrayList days, ArrayList offdays,String month, String year)
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
        this.month = month;
        this.year = year;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        delete_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        data_report_btn = new javax.swing.JButton();
        full_data_report_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        home_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(DisplayRecord.MAXIMIZED_BOTH);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "F_name", "Address", "Thing", "Rupess", "Date", "Table"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setAutoscrolls(false);
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(255, 0, 0));
        jTable1.setRowHeight(28);
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 0));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(180);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(180);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(180);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(180);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(200);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1280, 361));

        delete_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        delete_btn.setText("Delete");
        delete_btn.setEnabled(false);
        getContentPane().add(delete_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, -1, -1));

        update_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        update_btn.setText("Update");
        update_btn.setEnabled(false);
        getContentPane().add(update_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, -1, -1));

        data_report_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        data_report_btn.setText("Data report");
        data_report_btn.setEnabled(false);
        data_report_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_report_btnActionPerformed(evt);
            }
        });
        getContentPane().add(data_report_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, -1, -1));

        full_data_report_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        full_data_report_btn.setText("Full data Report");
        full_data_report_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                full_data_report_btnActionPerformed(evt);
            }
        });
        getContentPane().add(full_data_report_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, -1, -1));

        back_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        getContentPane().add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 510, -1, -1));

        home_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        home_btn.setText("Home");
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });
        getContentPane().add(home_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 510, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/16067961-Jewelry-earrings-on-light-silk-background-Stock-Vector-jewellery.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        new Thread(new Runnable()
        {
            public void run()
            {
                int spent_id = -1;
                boolean off_days_match = false;
                boolean days_match = false;
                boolean spent_match = false;
                Set<Integer> spent_set = new HashSet();
                
                try 
                {
                    do
                    {
                        if(rs1_flag == true)
                        {    
                            rs1_flag = false;
                            
                            if(!offdays.isEmpty())
                            {
                                for (Integer offday : offdays) 
                                {
                                    if(new Date(rs1.getString("date1")).getDay() == offday)
                                    {
                                        off_days_match = true;
                                        break;
                                    }
                                }
                            }
                            
                            if(off_days_match == false && !days.isEmpty())
                            {
                                for (Integer day : days) 
                                {
                                    if(new Date(rs1.getString("date1")).getDate() == day)
                                    {
                                        days_match = true;
                                        break;
                                    }
                                }
                            }
                            
                            if(off_days_match == false && days_match == false)
                            {
                                Thing thing = new Thing(rs1.getInt("id"),rs1.getString("name1"),rs1.getString("f_name"),rs1.getString("address")
                                ,rs1.getString("city"),rs1.getInt("zip"),rs1.getString("thing"),rs1.getString("type"),rs1.getInt("n_gold"),rs1.getInt("n_silver")
                                ,rs1.getInt("n_total"),rs1.getInt("interest"),rs1.getString("phone_no"),rs1.getString("date1"),rs1.getInt("g_gold")
                                ,rs1.getInt("g_silver"),rs1.getInt("rupess"),rs1.getInt("invest"),rs1.getString("date2"),rs1.getString("description"),"table1");
                                al.add(thing);
                            
                                if(!spent_set.isEmpty())
                                {
                                    for(Integer i : spent_set)
                                    {
                                        if(i == new Date(rs1.getString("date1")).getDate())
                                        {
                                            spent_match = true;
                                        }
                                    }
                                }
                                if(spent_match == false)
                                {
                                    if(new Date(rs1.getString("date1")).getDay() == 0 || new Date(rs1.getString("date1")).getDay() == 4)
                                    {
                                        Thing spent_thing = new Thing(spent_id,"ghar kharch","*****","*****","*****",242301,"ghar kharch","",0,0,0,0
                                        ,"",rs1.getString("date1"),0,0,100,0,"","","*****");
                                        spent_id--;
                                        al.add(spent_thing);
                                    }
                                    else
                                    {
                                        Thing spent_thing = new Thing(spent_id,"ghar kharch","*****","*****","*****",242301,"ghar kharch","",0,0,0,0
                                        ,"",rs1.getString("date1"),0,0,50,0,"","","*****");
                                        spent_id--;
                                        al.add(spent_thing);
                                    }
                                }

                                
                                spent_set.add(new Date(rs1.getString("date1")).getDate());
                                spent_match = false;
                            }
                            
                            off_days_match = false;
                            days_match = false;
                            
                            if(rs1.next())
                            {
                                rs1_flag = true;
                            }
                        }
                        
                        if(rs2_flag == true)
                        {
                            rs2_flag = false;
                            
                            if(!offdays.isEmpty())
                            {
                                for (Integer offday : offdays) 
                                {
                                    if(new Date(rs2.getString("date1")).getDay() == offday)
                                    {
                                        off_days_match = true;
                                        break;
                                    }
                                }
                            }
                            
                            if(off_days_match == false && !days.isEmpty())
                            {
                                for (Integer day : days) 
                                {
                                    if(new Date(rs2.getString("date1")).getDate() == day)
                                    {
                                        days_match = true;
                                        break;
                                    }
                                }
                            }
                                
                            if(off_days_match == false && days_match == false)
                            {
                                Thing thing1 = new Thing(rs2.getInt("id"),rs2.getString("name1"),rs2.getString("f_name"),rs2.getString("address")
                                ,rs2.getString("city"),rs2.getInt("zip"),rs2.getString("thing"),rs2.getString("type"),rs2.getInt("n_gold"),rs2.getInt("n_silver")
                                ,rs2.getInt("n_total"),rs2.getInt("interest"),rs2.getString("phone_no"),rs2.getString("date1"),rs2.getInt("g_gold")
                                ,rs2.getInt("g_silver"),rs2.getInt("rupess"),rs2.getInt("invest"),rs2.getString("date2"),rs2.getString("description")
                                ,rs2.getInt("rupess2"),rs2.getString("date3"),"table2");
                                al.add(thing1);
                                
                                if(!spent_set.isEmpty())
                                {
                                    for(Integer i : spent_set)
                                    {
                                        if(i == new Date(rs2.getString("date1")).getDate())
                                        {
                                            spent_match = true;
                                        }
                                    }
                                }
                                if(spent_match == false)
                                {
                                    if(new Date(rs1.getString("date1")).getDay() == 0 || new Date(rs1.getString("date1")).getDay() == 4)
                                    {
                                        Thing spent_thing = new Thing(spent_id,"ghar kharch","*****","*****","*****",242301,"ghar kharch","",0,0,0,0
                                        ,"",rs2.getString("date1"),0,0,100,0,"","","*****");
                                        spent_id--;
                                        al.add(spent_thing);
                                    }
                                    else
                                    {
                                        Thing spent_thing = new Thing(spent_id,"ghar kharch","*****","*****","*****",242301,"ghar kharch","",0,0,0,0
                                        ,"",rs2.getString("date1"),0,0,50,0,"","","*****");
                                        spent_id--;
                                        al.add(spent_thing);
                                    }
                                }
                                
                                spent_set.add(new Date(rs2.getString("date1")).getDate());
                                spent_match = false;
                                
                            }
                            
                            off_days_match = false;
                            days_match = false;    
                            
                            if(rs2.next())
                            {
                                rs2_flag = true;
                            }
                        }
                    }while(rs1_flag == true || rs2_flag == true);
                    
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                Collections.sort(al);
                
                Object[] obj = new Object[8];
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
                    obj[7] = al.get(i).getTable();
                    
                    model1.addRow(obj);
                }
                
                obj[0] = "";
                obj[1] = "";
                obj[2] = "";
                obj[3] = "";
                obj[4] = "";
                obj[5] = "";
                obj[6] = "";
                obj[7] = "";
                
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
                obj[7] = "";
                
                model1.addRow(obj);
                
                ListSelectionModel model = jTable1.getSelectionModel();
                model.addListSelectionListener(new ListSelectionListener()
                {
                    @Override
                    public void valueChanged(ListSelectionEvent e) 
                    {
                        if(! model.isSelectionEmpty())
                        {        
                            if(model1.getValueAt(model.getMinSelectionIndex(),0) == "")
                            {
                                jTable1.setSelectionMode(0);
                                return;
                            }
                            
                            delete_btn.setEnabled(true);
                            update_btn.setEnabled(true);
                            data_report_btn.setEnabled(true);
                            
                            id = Integer.parseInt(model1.getValueAt(model.getMinSelectionIndex(),0)+"");
                            row = model.getMinSelectionIndex();
                            table = model1.getValueAt(model.getMinSelectionIndex(),7)+"";
                            
                        }
                        else
                        {
                            delete_btn.setEnabled(false);
                            update_btn.setEnabled(false);
                            data_report_btn.setEnabled(false);
                        }
                    }
                    
                });
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

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                new AddRecord().setVisible(true);
                connect.closeConnection();
                dispose();
            }
        }).start();
        
    }//GEN-LAST:event_back_btnActionPerformed

    private void data_report_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_report_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                ResultSet rs = null;
                
                try 
                {
                    rs = connect.getThing(id,table);
                    if(rs.next())
                    {
                        
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(DisplayRecord.this, "Record not found");
                        return;
                    }
                }
                catch (SQLException ex) 
                {
                    JOptionPane.showMessageDialog(DisplayRecord.this, "Something went wrong please try again later");
                    return;
                }
                
                PdfWriter writer = null;
                
                try 
                {
                  writer = new PdfWriter("data report.pdf");
                }
                catch (FileNotFoundException ex) 
                {
                   //Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);
                }
        
                PdfDocument pdfDoc=new PdfDocument(writer);
        
                Document document = new Document(pdfDoc);
                
                float cloumn[]={500f,500f};
                Table table1=new Table(cloumn);
                
                Cell id_c = new Cell();
                id_c.add(new Paragraph("ID").setBold());
                id_c.setBorder(Border.NO_BORDER);
                id_c.setTextAlignment(TextAlignment.CENTER);
                id_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(id_c);
                
                Cell id_c1 = new Cell();
                try {
                    id_c1.add(new Paragraph(rs.getInt("id")+""));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                id_c1.setBorder(Border.NO_BORDER);
                id_c1.setTextAlignment(TextAlignment.CENTER);
                id_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(id_c1);
                
                Cell name_c = new Cell();
                name_c.add(new Paragraph("Name").setBold());
                name_c.setBorder(Border.NO_BORDER);
                name_c.setTextAlignment(TextAlignment.CENTER);
                name_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(name_c);
                
                Cell name_c1 = new Cell();
                try {
                    name_c1.add(new Paragraph(rs.getString("name1")));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                name_c1.setBorder(Border.NO_BORDER);
                name_c1.setTextAlignment(TextAlignment.CENTER);
                name_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(name_c1);
                
                Cell f_name_c = new Cell();
                f_name_c.add(new Paragraph("Fathers's name").setBold());
                f_name_c.setBorder(Border.NO_BORDER);
                f_name_c.setTextAlignment(TextAlignment.CENTER);
                f_name_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(f_name_c);
                
                Cell f_name_c1 = new Cell();
                try {
                    f_name_c1.add(new Paragraph(rs.getString("f_name")));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                f_name_c1.setBorder(Border.NO_BORDER);
                f_name_c1.setTextAlignment(TextAlignment.CENTER);
                f_name_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(f_name_c1);
                
                Cell address_c = new Cell();
                address_c.add(new Paragraph("Address").setBold());
                address_c.setBorder(Border.NO_BORDER);
                address_c.setTextAlignment(TextAlignment.CENTER);
                address_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(address_c);
                
                Cell address_c1 = new Cell();
                try {
                    address_c1.add(new Paragraph(rs.getString("address")));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                address_c1.setBorder(Border.NO_BORDER);
                address_c1.setTextAlignment(TextAlignment.CENTER);
                address_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(address_c1);
                
                Cell city_c = new Cell();
                city_c.add(new Paragraph("City").setBold());
                city_c.setBorder(Border.NO_BORDER);
                city_c.setTextAlignment(TextAlignment.CENTER);
                city_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(city_c);
                
                Cell city_c1 = new Cell();
                try {
                    city_c1.add(new Paragraph(rs.getString("city")));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                city_c1.setBorder(Border.NO_BORDER);
                city_c1.setTextAlignment(TextAlignment.CENTER);
                city_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(city_c1);
                
                Cell zip_c = new Cell();
                zip_c.add(new Paragraph("Zip code").setBold());
                zip_c.setBorder(Border.NO_BORDER);
                zip_c.setTextAlignment(TextAlignment.CENTER);
                zip_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(zip_c);
                
                Cell zip_c1 = new Cell();
                try {
                    zip_c1.add(new Paragraph(rs.getString("zip")));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                zip_c1.setBorder(Border.NO_BORDER);
                zip_c1.setTextAlignment(TextAlignment.CENTER);
                zip_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(zip_c1);
                
                Cell thing_c = new Cell();
                thing_c.add(new Paragraph("Thing").setBold());
                thing_c.setBorder(Border.NO_BORDER);
                thing_c.setTextAlignment(TextAlignment.CENTER);
                thing_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(thing_c);
                
                Cell thing_c1 = new Cell();
                try {
                    thing_c1.add(new Paragraph(rs.getString("thing")));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                thing_c1.setBorder(Border.NO_BORDER);
                thing_c1.setTextAlignment(TextAlignment.CENTER);
                thing_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(thing_c1);
                
                Cell type_c = new Cell();
                type_c.add(new Paragraph("Type").setBold());
                type_c.setBorder(Border.NO_BORDER);
                type_c.setTextAlignment(TextAlignment.CENTER);
                type_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(type_c);
                
                Cell type_c1 = new Cell();
                try {
                    type_c1.add(new Paragraph(rs.getString("type")));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                type_c1.setBorder(Border.NO_BORDER);
                type_c1.setTextAlignment(TextAlignment.CENTER);
                type_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(type_c1);
                
                Cell n_gold_c = new Cell();
                n_gold_c.add(new Paragraph("Number of gold").setBold());
                n_gold_c.setBorder(Border.NO_BORDER);
                n_gold_c.setTextAlignment(TextAlignment.CENTER);
                n_gold_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(n_gold_c);
                
                Cell n_gold_c1 = new Cell();
                try {
                    n_gold_c1.add(new Paragraph(rs.getInt("n_gold") + ""));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                n_gold_c1.setBorder(Border.NO_BORDER);
                n_gold_c1.setTextAlignment(TextAlignment.CENTER);
                n_gold_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(n_gold_c1);
                
                Cell n_silver_c = new Cell();
                n_silver_c.add(new Paragraph("Number of silver").setBold());
                n_silver_c.setBorder(Border.NO_BORDER);
                n_silver_c.setTextAlignment(TextAlignment.CENTER);
                n_silver_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(n_silver_c);
                
                Cell n_silver_c1 = new Cell();
                try {
                    n_silver_c1.add(new Paragraph(rs.getInt("n_silver")+""));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                n_silver_c1.setBorder(Border.NO_BORDER);
                n_silver_c1.setTextAlignment(TextAlignment.CENTER);
                n_silver_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(n_silver_c1);
                
                Cell n_total_c = new Cell();
                n_total_c.add(new Paragraph("Number of total").setBold());
                n_total_c.setBorder(Border.NO_BORDER);
                n_total_c.setTextAlignment(TextAlignment.CENTER);
                n_total_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(n_total_c);
                
                Cell n_total_c1 = new Cell();
                try {
                    n_total_c1.add(new Paragraph(rs.getInt("n_total")+""));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                n_total_c1.setBorder(Border.NO_BORDER);
                n_total_c1.setTextAlignment(TextAlignment.CENTER);
                n_total_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(n_total_c1);
                
                Cell interest_c = new Cell();
                interest_c.add(new Paragraph("Interest").setBold());
                interest_c.setBorder(Border.NO_BORDER);
                interest_c.setTextAlignment(TextAlignment.CENTER);
                interest_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(interest_c);
                
                Cell interest_c1 = new Cell();
                try {
                    interest_c1.add(new Paragraph(rs.getFloat("interest")+""));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                interest_c1.setBorder(Border.NO_BORDER);
                interest_c1.setTextAlignment(TextAlignment.CENTER);
                interest_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(interest_c1);
                
                Cell phone_c = new Cell();
                phone_c.add(new Paragraph("Phone number").setBold());
                phone_c.setBorder(Border.NO_BORDER);
                phone_c.setTextAlignment(TextAlignment.CENTER);
                phone_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(phone_c);
                
                Cell phone_c1 = new Cell();
                try {
                    phone_c1.add(new Paragraph(rs.getFloat("phone_no")+""));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                phone_c1.setBorder(Border.NO_BORDER);
                phone_c1.setTextAlignment(TextAlignment.CENTER);
                phone_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(phone_c1);
                
                Cell thing_date_c = new Cell();
                thing_date_c.add(new Paragraph("Date").setBold());
                thing_date_c.setBorder(Border.NO_BORDER);
                thing_date_c.setTextAlignment(TextAlignment.CENTER);
                thing_date_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(thing_date_c);
                
                Cell thing_date_c1 = new Cell();
                try {
                    thing_date_c1.add(new Paragraph(rs.getString("date1")));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                thing_date_c1.setBorder(Border.NO_BORDER);
                thing_date_c1.setTextAlignment(TextAlignment.CENTER);
                thing_date_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(thing_date_c1);
                
                Cell g_gold_c = new Cell();
                g_gold_c.add(new Paragraph("Gross weight of gold").setBold());
                g_gold_c.setBorder(Border.NO_BORDER);
                g_gold_c.setTextAlignment(TextAlignment.CENTER);
                g_gold_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(g_gold_c);
                
                Cell g_gold_c1 = new Cell();
                try {
                    g_gold_c1.add(new Paragraph(rs.getFloat("g_gold")+""));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                g_gold_c1.setBorder(Border.NO_BORDER);
                g_gold_c1.setTextAlignment(TextAlignment.CENTER);
                g_gold_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(g_gold_c1);
                
                Cell g_silver_c = new Cell();
                g_silver_c.add(new Paragraph("Gross weight of silver").setBold());
                g_silver_c.setBorder(Border.NO_BORDER);
                g_silver_c.setTextAlignment(TextAlignment.CENTER);
                g_silver_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(g_silver_c);
                
                Cell g_silver_c1 = new Cell();
                try {
                    g_silver_c1.add(new Paragraph(rs.getFloat("g_silver")+""));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                g_silver_c1.setBorder(Border.NO_BORDER);
                g_silver_c1.setTextAlignment(TextAlignment.CENTER);
                g_silver_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(g_silver_c1);
                
                Cell rupess_c = new Cell();
                rupess_c.add(new Paragraph("Rupess").setBold());
                rupess_c.setBorder(Border.NO_BORDER);
                rupess_c.setTextAlignment(TextAlignment.CENTER);
                rupess_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(rupess_c);
                
                Cell rupess_c1 = new Cell();
                try {
                    rupess_c1.add(new Paragraph(rs.getInt("rupess")+""));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                rupess_c1.setBorder(Border.NO_BORDER);
                rupess_c1.setTextAlignment(TextAlignment.CENTER);
                rupess_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(rupess_c1);
                
                Cell invest_c = new Cell();
                invest_c.add(new Paragraph("Invest").setBold());
                invest_c.setBorder(Border.NO_BORDER);
                invest_c.setTextAlignment(TextAlignment.CENTER);
                invest_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(invest_c);
                
                Cell invest_c1 = new Cell();
                try {
                    invest_c1.add(new Paragraph(rs.getFloat("invest")+""));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                invest_c1.setBorder(Border.NO_BORDER);
                invest_c1.setTextAlignment(TextAlignment.CENTER);
                invest_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(invest_c1);
                
                Cell thing_date2_c = new Cell();
                thing_date2_c.add(new Paragraph("Investment date").setBold());
                thing_date2_c.setBorder(Border.NO_BORDER);
                thing_date2_c.setTextAlignment(TextAlignment.CENTER);
                thing_date2_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(thing_date2_c);
                
                Cell thing_date2_c1 = new Cell();
                try {
                    if(rs.getString("date2") == null)
                    {
                        thing_date2_c1.add(new Paragraph(""));
                    }
                    else
                    {
                        thing_date2_c1.add(new Paragraph(rs.getString("date2")));
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                thing_date2_c1.setBorder(Border.NO_BORDER);
                thing_date2_c1.setTextAlignment(TextAlignment.CENTER);
                thing_date2_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(thing_date2_c1);
                
                Cell description_c = new Cell();
                description_c.add(new Paragraph("Description").setBold());
                description_c.setBorder(Border.NO_BORDER);
                description_c.setTextAlignment(TextAlignment.CENTER);
                description_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(description_c);
                
                Cell description_c1 = new Cell();
                try {
                    if(rs.getString("description")  == null)
                    {
                        description_c1.add(new Paragraph(""));
                    }
                    else
                    {
                        description_c1.add(new Paragraph(rs.getString("description")));
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                description_c1.setBorder(Border.NO_BORDER);
                description_c1.setTextAlignment(TextAlignment.CENTER);
                description_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(description_c1);
                
                document.add(table1);
                document.close();
                
                try 
                {
                    Desktop.getDesktop().open(new File("data report.pdf"));
                }
                catch (IOException ex) 
                {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                        
            }
        }).start();
        
    }//GEN-LAST:event_data_report_btnActionPerformed

    private void full_data_report_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_full_data_report_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                File f1 = new File(year+"/Add record");
                f1.mkdirs();
                
                String file_name = year+"/Add record/"+month+".pdf";
                
                PdfWriter writer = null;
                
                try 
                {
                  writer = new PdfWriter(file_name);
                }
                catch (FileNotFoundException ex) 
                {
                   //Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);
                }
        
                PdfDocument pdfDoc=new PdfDocument(writer);
        
                Document document = new Document(pdfDoc);
                int date=0;
                
                for(int i=0;i<al.size();i++)
                {
                    if(new Date(al.get(i).getDate1()).getDate() == date || date == 0)
                    {
                        document.add(new Paragraph("--------------------------------------------------------------------------------------------------------------------------------"));
                    }
                    else
                    {
                        document.add(new Paragraph("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"));
                    }
                    
                    if(al.get(i).getId() <= 0)
                    {
                        document.add(new Paragraph(al.get(i).getRupess() + "/   GHAR KHARCH"));
                        document.add(new Paragraph(al.get(id).getDate1()));
                        continue;
                    }
                    
                    document.add(new Paragraph(al.get(i).getRupess() + "/   " + al.get(i).getName() + " S/O " + al.get(i).getF_name() + " , " + al.get(i).getAddress()));
                    document.add(new Paragraph(al.get(i).getThing()));
                    
                    if(al.get(i).getG_gold() > 0)
                    {
                        document.add(new Paragraph("Gold Weight = " + al.get(i).getG_gold()));
                    }
                    
                    if(al.get(i).getG_silver()> 0)
                    {
                        document.add(new Paragraph("Silver Weight = " + al.get(i).getG_silver()));
                    }
                    document.add(new Paragraph("Date = " + al.get(i).getDate1()));
                    
                    
                    date = new Date(al.get(i).getDate1()).getDate();
                }
                
                document.close();
                
                try 
                {
                    Desktop.getDesktop().open(new File(file_name));
                }
                catch (IOException ex) 
                {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
        
    }//GEN-LAST:event_full_data_report_btnActionPerformed

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
    private javax.swing.JButton back_btn;
    private javax.swing.JButton data_report_btn;
    private javax.swing.JButton delete_btn;
    private javax.swing.JButton full_data_report_btn;
    private javax.swing.JButton home_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}
