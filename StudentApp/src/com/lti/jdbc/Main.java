package com.lti.jdbc;

import java.sql.*;

public class Main {
public static void main(String[] args) {

        Connection con = null;
        Statement statement = null;
        ResultSet rs = null;
        PreparedStatement ps=null;

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sys as sysdba","Harshal@1998");

            System.out.println("Connection is successful");
            statement=con.createStatement();
            rs=statement.executeQuery("select * from emp");
            
            while(rs.next()) {
            	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
            	
            }
            /*
            ps=con.prepareStatement("update student set name =? where stuid=?");
            ps.setString(1,"Akash");
            ps.setInt(2,101);
            int result = ps.executeUpdate();
            System.out.println(result+" rows updated");
       */
           


        }



        catch(SQLException | ClassNotFoundException e){
            System.out.println(e);

        }

        finally {
            try {
                //statement.close();
                //rs.close();
                con.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
}}
 