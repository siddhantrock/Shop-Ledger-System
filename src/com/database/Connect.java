package com.database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connect 
{
    private Connection con;
    private Statement st;
    public Connect()
    {
        try 
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://Database2.mdb");
            st = con.createStatement();
        }
        catch (ClassNotFoundException | SQLException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void closeConnection()
    {
        try 
        {
            st.close();
            con.close();
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet[] addRecordToLedger(String month,String year)
    {
        ResultSet rs1 = null,rs2 = null;
        ResultSet rs[] = new ResultSet[2];
        
        try 
        {
            rs1 = st.executeQuery("select * from table1 where (type = 'silver' or type = 'gold' or type = 'both') and date1 like '" + month + "/*/" + year + "' order by date1");
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try 
        {
            rs2 = st.executeQuery("select * from table2 where (type = 'silver' or type = 'gold' or type = 'both') and date1 like '" + month + "/*/" + year + "' order by date1");
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        rs[0] = rs1;
        rs[1] = rs2;
        return rs;
    }
}
