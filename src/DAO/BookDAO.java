/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import javax.swing.JTable;
import DTO.Book;
import DTO.DauSach;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class BookDAO {
    public static void Load_Book(JTable jb)
    {
        ArrayList <Book> b = Book.LayThongTinCuonSach();
        Object[] obj = new Object[]{"STT","Mã đầu sách","Mã cuốn sách","Ngôn ngữ","Trạng thái","Tái Bản"};
        DefaultTableModel model = new DefaultTableModel(obj,0);
        jb.setModel(model);
        for (int i = 0; i < b.size(); i++) {
            obj[0] = jb.getRowCount()+1;
            obj[1] = b.get(i).getMaDauSach();
            obj[2] = b.get(i).getMaSach();
            
            obj[3] = b.get(i).getNgonNgu();
            obj[4] = b.get(i).getTaiBan();
            obj[5] = b.get(i).getTrangThai();
            model.addRow(obj);
        }
       
    }
    public static void Load_Book_by_maCS(JTable jb,String str)
    {
        ArrayList <Book> b = Book.LayThongTinCuonSachbyMaCS(str);
        Object[] obj = new Object[]{"STT","Mã đầu sách","Mã cuốn sách", "Ngôn ngữ","Trạng thái","Tái Bản"};
        DefaultTableModel model = new DefaultTableModel(obj,0);
        jb.setModel(model);
        for (int i = 0; i < b.size(); i++) {
            obj[0] = jb.getRowCount()+1;
            obj[1] = b.get(i).getMaDauSach();
            obj[2] = b.get(i).getMaSach();
            obj[3] = b.get(i).getNgonNgu();
            obj[4] = b.get(i).getTaiBan();
            obj[5] = b.get(i).getTrangThai();
            model.addRow(obj);
        }
    }

}
