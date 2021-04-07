/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NCT
 */
public class J2SQL {
      private static J2SQL instance;
    
    public static J2SQL Instance(){
        if(instance==null)
            instance= new J2SQL(); 
        return J2SQL.instance;
    }

            
    private String uRL = "jdbc:sqlserver://localhost:1433;databaseName=QL_ThuVien";
    private String user = "sa";
    private String pass = "123";
    
    // Database Connection
    Connection conn = null;
    PreparedStatement ps = null;
    
   /*   Insert  - Delete  -  Update  SQL     */
   public int ExecuteNonQuery(String sql, Object[] parameter)
   {
       int rowUpdated = 0;
       
       Open();
        try {
           ps = conn.prepareStatement(sql);
            if(parameter!=null){
                for(int i=0; i < parameter.length;i++)
                    ps.setObject(i+1, parameter[i]);
            }
            
            rowUpdated = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(J2SQL.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Loi excutequery_update");
        }
 
       return rowUpdated;
   }
   
   
      public ResultSet ExecuteQuery(String sql, Object[] parameter)
   {
       ResultSet rs = null;
       
        try {
           ps = conn.prepareStatement(sql);
            if(parameter!=null){
                for(int i=0; i < parameter.length;i++)
                    ps.setObject(i+1, parameter[i]);
            }
            
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            //Logger.getLogger(J2SQL.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Loi excutequery_resultSet");
        }
       
       return rs;
   }
      
       public String ExecuteReader(String sql, Object[] parameter)
    {   
        String kq = null;
        try {
            List<String> list = J2SQL.instance.ExecuteReaderListString(sql, parameter);
            if(!list.isEmpty())
                kq = list.get(0);
        } catch (Exception e) {
            System.out.println("Query_ExecuteReader_Error");
        }

        return kq;     
    }
   
     /*    Thuc thi cau lenh SQL  Return 1 danh sach cot dau tien cua table     */
      public List<String> ExecuteReaderListString(String sql, Object[] parameter)
   {
       List<String> list = new ArrayList<>();
       
       //Open();
        try {
           ps = conn.prepareStatement(sql);
            if(parameter!=null){
                for(int i=0; i < parameter.length;i++)
                    ps.setObject(i+1, parameter[i]);
            }           
            ResultSet rs;
           rs = ps.executeQuery();
                   
            while(rs.next()){
                list.add(rs.getString(1));
                }
            
        } catch (SQLException ex) {            
            System.out.println("Loi excutequery_resultSet");
        }
         
       return list;
   }
   
   /*  goi  Constructor  va mo ket noi den sql  */ 
    private J2SQL(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            this.Open();
        } catch (Exception e) {
           
        }

    }
    
    private void Open(){
        try {
       
            if( conn==null){
                conn =  DriverManager.getConnection(uRL, user, pass);               
                System.out.println("Open .....OK");
            }
        } catch (Exception e) {
            System.out.println("Open....False");
        }
    }
    
    
    private void Close(){
        try {
            if( conn != null )
            {  conn.close(); 
                System.out.println("Close....OK");
            }
        } catch (Exception e) {
            System.out.println("Dong ket noi khong duoc");
        }
    }

     public Connection getConn(){
        return conn;
    }
   
    
}
