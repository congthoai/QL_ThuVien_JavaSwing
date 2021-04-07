/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.DauSach;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Admin
 */
public class DauSachDAO {
   public static void LoadDauSach(JTable jb){  
      ArrayList<DauSach> ds = DauSach.LayThongtinSach() ;
      Object[] obj = new Object[]{"STT","Mã đầu sách", "Tên đầu sách", "Thể loại", "Nhà xuất bản", "Tác giả", "Số lượng"};
      DefaultTableModel tb = new DefaultTableModel(obj,0);
      jb.setModel(tb);
       for (int i = 0; i < ds.size(); i++) {
           obj[0] = jb.getRowCount()+1;
           obj[1] = ds.get(i).getMaDS();
           obj[2]= ds.get(i).getTenDS();
           obj[3]= ds.get(i).getTheLoai();
           obj[4]= ds.get(i).getNXB();
           obj[5]= ds.get(i).getTacgia();
           obj[6]= ds.get(i).getSoLuong();
           tb.addRow(obj);
       }
    }
   public static void ThemDauSach(DauSach s)   
   {
       DauSach.ThemDauSach(s);
   }

    public static ArrayList<String> LoadDauSach() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   public static List<String> getListTenDS(){
       String query = "Select tenDS from DauSach";
       return J2SQL.Instance().ExecuteReaderListString(query, null);
   }
   public static List<String> getListTheLoai(){
       String query = "SELECT tenTheLoai FROM TheLoaiSach";
       return J2SQL.Instance().ExecuteReaderListString(query, null);
   }
   
}
