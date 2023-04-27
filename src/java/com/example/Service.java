/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author ROSHAAN
 */

import java.sql.*;
import java.util.*;

public class Service {
    public void createContact(String name,String pno,String memory){
        
 
        
         try{        
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PhoneApp?useSSL=false&allowPublicKeyRetrieval=true","root","roshaan@2002");

                Statement stm = con.createStatement();
                stm.executeUpdate("insert into "+memory+" values ('"+name+"','"+pno+"') ");
                
                con.close();
            }
            catch(Exception e){
                 System.out.println(e.getMessage());
            }
        
    }
    
    public String getAllContacts(String memory){
         try{
         
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PhoneApp?useSSL=false&allowPublicKeyRetrieval=true","root","roshaan@2002");

                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery("select * from "+memory);
                StringBuilder res = new StringBuilder();
        
                while(rs.next()){
                 
                     res.append("<tr>");
                     res.append("<td>");
                     res.append(rs.getString("name"));
                     res.append("</td>");
                     res.append("<td>");
                     res.append(rs.getString("pno"));
                     res.append("</td>");
                     res.append("<td>");
                     res.append(memory);
                     res.append("</td>");
                     res.append("</tr>");
                 
                }
         
                con.close();
                String data = res.toString();
                return data;
            
            }
            catch(Exception e){
                 System.out.println(e.getMessage());
            }
         
         return "";
     
    }
    
    public String searchContact(String name,String memory){
        
        try{
         
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PhoneApp?useSSL=false&allowPublicKeyRetrieval=true","root","roshaan@2002");

                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery("select * from "+memory+" where name='"+name+"'");
                StringBuilder res = new StringBuilder();
        
                while(rs.next()){
                 
                     res.append("<tr>");
                     res.append("<td>");
                     res.append(rs.getString("name"));
                     res.append("</td>");
                     res.append("<td>");
                     res.append(rs.getString("pno"));
                     res.append("</td>");
                     res.append("</tr>");
                 
                }
         
                con.close();
                String data = res.toString();
                return data;
            
            }
            catch(Exception e){
                 System.out.println(e.getMessage());
            }
         
        
        return "";
    }
    
       public void updateContact(String name,String newname,String newphone,String memory){
        
        try{
         
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PhoneApp?useSSL=false&allowPublicKeyRetrieval=true","root","roshaan@2002");

                Statement stm = con.createStatement();
                stm.executeUpdate("update "+memory+" set name='"+newname+"' , pno='"+newphone+"'where name='"+name+"'");
                con.close();
               
            
            }
            catch(Exception e){
                 System.out.println(e.getMessage());
            }
    }
       
       
     public void deleteContact(String name,String memory){
        
        try{
         
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PhoneApp?useSSL=false&allowPublicKeyRetrieval=true","root","roshaan@2002");

                Statement stm = con.createStatement();
                stm.executeUpdate("delete from "+memory+" where name='"+name+"'");
                con.close();
            }
            catch(Exception e){
                 System.out.println(e.getMessage());
            }
         
        
      
    }
    public void deleteAll(String memory){
        
        try{
         
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PhoneApp?useSSL=false&allowPublicKeyRetrieval=true","root","roshaan@2002");

                Statement stm = con.createStatement();
                stm.executeUpdate("delete from "+memory);
                con.close();
            }
            catch(Exception e){
                 System.out.println(e.getMessage());
            }
    }
    
           
    public void copyAll(String fromMemory,String toMemory){
        
        try{
         
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PhoneApp?useSSL=false&allowPublicKeyRetrieval=true","root","roshaan@2002");

                Statement stm = con.createStatement();
                stm.executeUpdate("insert into "+toMemory+" (name,pno) select name,pno from "+fromMemory);
                con.close();
            }
            catch(Exception e){
                 System.out.println(e.getMessage());
            }
    }
    
    public void copyContact(String name,String fromMemory,String toMemory){
        
        try{
         
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PhoneApp?useSSL=false&allowPublicKeyRetrieval=true","root","roshaan@2002");

                Statement stm = con.createStatement();
                stm.executeUpdate("insert into "+toMemory+" (name,pno) select name,pno from "+fromMemory+" where name = '"+name+"'");
                con.close();
            }
            catch(Exception e){
                 System.out.println(e.getMessage());
            }
    }
    
    public void moveContact(String name,String fromMemory,String toMemory){
        
        try{
         
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PhoneApp?useSSL=false&allowPublicKeyRetrieval=true","root","roshaan@2002");

                Statement stm = con.createStatement();
                stm.executeUpdate("insert into "+toMemory+" (name,pno) select name,pno from "+fromMemory+" where name = '"+name+"'");
                con.close();
            }
            catch(Exception e){
                 System.out.println(e.getMessage());
            }
    }
    
    public void moveAll(String fromMemory,String toMemory){
        
        try{
         
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PhoneApp?useSSL=false&allowPublicKeyRetrieval=true","root","roshaan@2002");

                Statement stm = con.createStatement();
                stm.executeUpdate("insert into "+toMemory+" (name,pno) select name,pno from "+fromMemory);
                con.close();
            }
            catch(Exception e){
                 System.out.println(e.getMessage());
            }
    }
}
