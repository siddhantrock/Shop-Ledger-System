package com.commodity;

import java.util.Date;

public class Thing implements Comparable<Object>
{
    private int id;
    private String name;
    private String f_name;
    private String address;
    private String city;
    private int zip;
    private String thing;
    private String type;
    private int n_gold;
    private int n_silver;
    private int n_total;
    private int interest;
    private String phone_no;
    private String date1;
    private int g_gold;
    private int g_silver;
    private int rupess;
    private int invest;
    private String date2;
    private String description;
    private int rupess2;
    private String date3;
    
    private String table;
    public static boolean check;

    public Thing(int id, String name, String f_name, String address, String city, int zip, String thing, String type, int n_gold, int n_silver, int n_total, int interest, String phone_no, String date1, int g_gold, int g_silver, int rupess, int invest, String date2, String description, int rupess2, String date3, String table) {
        this.id = id;
        this.name = name;
        this.f_name = f_name;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.thing = thing;
        this.type = type;
        this.n_gold = n_gold;
        this.n_silver = n_silver;
        this.n_total = n_total;
        this.interest = interest;
        this.phone_no = phone_no;
        this.date1 = date1;
        this.g_gold = g_gold;
        this.g_silver = g_silver;
        this.rupess = rupess;
        this.invest = invest;
        this.date2 = date2;
        this.description = description;
        this.rupess2 = rupess2;
        this.date3 = date3;
        this.table = table;
    }

    public Thing(int id, String name, String f_name, String address, String city, int zip, String thing, String type, int n_gold, int n_silver, int n_total, int interest, String phone_no, String date1, int g_gold, int g_silver, int rupess, int invest, String date2, String description, String table) {
        this.id = id;
        this.name = name;
        this.f_name = f_name;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.thing = thing;
        this.type = type;
        this.n_gold = n_gold;
        this.n_silver = n_silver;
        this.n_total = n_total;
        this.interest = interest;
        this.phone_no = phone_no;
        this.date1 = date1;
        this.g_gold = g_gold;
        this.g_silver = g_silver;
        this.rupess = rupess;
        this.invest = invest;
        this.date2 = date2;
        this.description = description;
        this.table = table;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getThing() {
        return thing;
    }

    public void setThing(String thing) {
        this.thing = thing;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getN_gold() {
        return n_gold;
    }

    public void setN_gold(int n_gold) {
        this.n_gold = n_gold;
    }

    public int getN_silver() {
        return n_silver;
    }

    public void setN_silver(int n_silver) {
        this.n_silver = n_silver;
    }

    public int getN_total() {
        return n_total;
    }

    public void setN_total(int n_total) {
        this.n_total = n_total;
    }

    public int getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public int getG_gold() {
        return g_gold;
    }

    public void setG_gold(int g_gold) {
        this.g_gold = g_gold;
    }

    public int getG_silver() {
        return g_silver;
    }

    public void setG_silver(int g_silver) {
        this.g_silver = g_silver;
    }

    public int getRupess() {
        return rupess;
    }

    public void setRupess(int rupess) {
        this.rupess = rupess;
    }

    public int getInvest() {
        return invest;
    }

    public void setInvest(int invest) {
        this.invest = invest;
    }

    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRupess2() {
        return rupess2;
    }

    public void setRupess2(int rupess2) {
        this.rupess2 = rupess2;
    }

    public String getDate3() {
        return date3;
    }

    public void setDate3(String date3) {
        this.date3 = date3;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }
    
    

    @Override
    public int compareTo(Object o) 
    {
        Thing t = (Thing)o;
        if(check == false)
        {
            return new Date(date1).compareTo(new Date(t.getDate1()));
        }
        else
        {
            return new Date(date3).compareTo(new Date(t.getDate3()));
        }
    }
    
    public static String[] dateDifference(String date , float rate , int rupess, String release_date)
    {
        int total_days_difference = 0 , days , months = 0 , years = 0 , start_month , start_year;
        float interest=0,si;
        String date_difference_string = "";
        String data[] = new String[2];
        
        total_days_difference = (int)((new Date(release_date).getTime() - new Date(date).getTime())/(1000*60*60*24)) + 1;
        
        start_month = new Date(date).getMonth() + 1;
        start_year = new Date(date).getYear() + 1900;
        
        while(total_days_difference >= 28)
        {
            if((start_month == 1 || start_month == 3 || start_month == 5 || start_month == 7 || start_month == 8 || start_month == 10 || start_month == 12) && total_days_difference >=31)
            {
                months++;
                total_days_difference -= 31;
            }
            else if((start_month == 4 || start_month == 6 || start_month == 9 || start_month == 11) && total_days_difference >= 30)
            {
                months++;
                total_days_difference -= 30;
            }
            else if(start_month == 2)
            {
                if(start_year % 400 == 0)
                {
                    months++;
                    total_days_difference -= 29;
                }
                else if(start_month % 100 == 0)
                {
                    months++;
                    total_days_difference -= 29;
                }
                else if(start_month % 4 == 0)
                {
                    months++;
                    total_days_difference -= 29;
                }
                else
                {
                    months++;
                    total_days_difference -= 28;
                }
            }
            else
            {
                break;
            }
            
            start_month++;
            
            if(start_month == 13)
            {
                start_month = 1;
                start_year++;
            }
        }
        
        days = Math.abs(total_days_difference);
        
        if(months == 0 && days != 0)
        {
            months = 1;
            days = 0;
        }
        
        if(months % 12 == 0 &&  days != 0)
        {
            months++;
            days = 0;
        }
        
        if(months <=12)
        {
            si = (rupess * months * rate)/100;
            interest = Math.round(si);
            date_difference_string = months + " month";
        
        
            if(days != 0)
            {
                si = (((rupess * 1 * rate)/100)/30)*days;
                interest = Math.round(interest + si);
            }
        
            if(months !=0 && days != 0)
            {
                date_difference_string = months + " Month " + days + "day";
            }
        }
        else if(months >12)
        {
            int temp = months;
            int year_month = 0;
            int year_temp = 0;
            
            while(temp > 0)
            {
                if(temp > 12)
                {
                    temp = temp/12;
                    years = temp;
                    year_temp = temp;
                    
                }
                else
                {
                    year_month = months - years*12;
                    //temp--;
                    temp = 0;
                }
            }
            date_difference_string = years + " year";
            interest = 0;
            
            while(year_temp > 0)
            {
                si = (rupess * rate * 12)/100;
                rupess = rupess + Math.round(si);
                interest = Math.round(interest + si);
                year_temp--;
            }
            
            if(year_month != 0)
            {
                si = (rupess * rate * year_month)/100;
                interest = Math.round(interest + si);
                date_difference_string = years + " year " + year_month + "month";
            }
            
            if(days != 0)
            {
                si = (((rupess * rate * 1)/100)/30)*days;
                interest = Math.round(interest + si);
                date_difference_string = years + " year " + year_month + "month " + days + "day";
            }
        }
        
        data[0] = date_difference_string;
        data[1] = (int)interest + "";
        
        return data;
    }
}
