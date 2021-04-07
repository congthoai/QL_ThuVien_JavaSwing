/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import DAO.J2SQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Admin
 */
public class DauSach {
    private String maDS, tenDS, tacgia ;
    private String TheLoai;
    private String NXB;
    private String SoLuong;

    public DauSach(String maDS, String tenDS, String tacgia, String TheLoai, String NXB, String SoLuong) {
        this.maDS = maDS;
        this.tenDS = tenDS;
        this.tacgia = tacgia;
        this.TheLoai = TheLoai;
        this.NXB = NXB;
        this.SoLuong = SoLuong;
    }
    
    public String getMaDS() {
        return maDS;
    }

    public void setMaDS(String maDS) {
        this.maDS = maDS;
    }

    public String getTenDS() {
        return tenDS;
    }

    public void setTenDS(String tenDS) {
        this.tenDS = tenDS;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getTheLoai() {
        return TheLoai;
    }

    
    public String getNXB() {
        return NXB;
    }

    
    public String getSoLuong() {
        return SoLuong;
    }

   
   public static ArrayList <DauSach> LayThongtinSach()
   {
       DauSach dausach;
        ArrayList <DauSach> ds = new ArrayList<>();
        String query = "SELECT * FROM DauSach "; 
        ResultSet rs = J2SQL.Instance().ExecuteQuery(query,null);
        try {
            while(rs.next())
            {
                dausach = new DauSach(rs.getString("maDS"),rs.getString("tenDS"),rs.getString("tacgia"),rs.getString("TheLoai"),rs.getString("NXB"),rs.getString("SoLuong"));
                ds.add(dausach);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DauSach.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ds;
   }
   public static String LaytenDS(String a)
   {
       String query = "EXEC ChuyenMaDS ? ";
       return J2SQL.Instance().ExecuteReader(query, new Object[]{a});
   }
   public static void ThemDauSach(DauSach s)
   {
        
        String query = "EXEC ThemDauSach ?,?,?,?,?";    
        J2SQL.Instance().ExecuteNonQuery(query, new Object[]{s.maDS,s.tenDS,s.tacgia,s.TheLoai,s.NXB});
       
   }
   public static boolean UpdateDauSach(DauSach s)
   {
       String query = "EXEC UpdateDauSach ?,?,?,?,? ";
       J2SQL.Instance().ExecuteNonQuery(query, new Object[]{s.maDS,s.tenDS,s.tacgia,s.TheLoai,s.NXB});
       return true;
   }
   public static boolean XoaDauSach(DauSach s)
   {
       List <String> listcs = Book.getID_CS(s);
       if (listcs.isEmpty())
       {   
         String query = "DELETE FROM DauSach WHERE maDS = ?";
        J2SQL.Instance().ExecuteNonQuery(query, new Object[]{s.maDS});
        return true;
       }
       else 
       return false;
//       String temp = J2SQL.Instance().ExecuteReader("EXEC XoaDS ? ", new Object[]{s.maDS});
//       if(temp != null)
//       {
//           J2SQL.Instance().ExecuteNonQuery("DELETE * FROM DauSach WHERE maDS = ? ", new Object[]{s.maDS});
//           return true;
//       }
//           
//        return false;   
   }
   public static int KtXoaDauSach(DauSach s)
   {
       List <String> listcs = Book.getID_CS(s);
       if(listcs.isEmpty())
           return 0;
       else return 1;
   }
   public static List<String> getNextID_DS()
   {
       String query ="EXEC getNextID_DS";
       return J2SQL.Instance().ExecuteReaderListString(query, null);
   }
}
