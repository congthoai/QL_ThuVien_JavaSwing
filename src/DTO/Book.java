/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.ArrayList;
import DAO.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Admin
 */
public class Book { 
    private String MaDauSach;
    private String MaSach;
    private String NgonNgu;
    private String TaiBan;
    private String TrangThai;
 
    public Book(String MaDauSach,String MaSach, String NgonNgu, String TrangThai, String TaiBan) {
        this.MaDauSach = MaDauSach;
        this.MaSach = MaSach;
        this.NgonNgu = NgonNgu;
        this.TaiBan = TaiBan;
        this.TrangThai = TrangThai;
        
    }
    public Book(String MaDauSach, String NgonNgu, String TrangThai,String TaiBan) {
        this.MaDauSach = MaDauSach;
        this.NgonNgu = NgonNgu;
        
        this.TrangThai = TrangThai;
        this.TaiBan = TaiBan;
        
    }
    public String getMaDauSach() {
        return MaDauSach;
    }

    public void setMaDauSach(String MaDauSach) {
        this.MaDauSach = MaDauSach;
    }
    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public String getNgonNgu() {
        return NgonNgu;
    }

    public void setNgonNgu(String NgonNgu) {
        this.NgonNgu = NgonNgu;
    }

    public String getTaiBan() {
        return TaiBan;
    }

    public void setTaiBan(String TaiBan) {
        this.TaiBan = TaiBan;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }
    public static ArrayList <Book> LayThongTinCuonSach()
    {
        Book book;
        ArrayList <Book> s = new ArrayList<>();
        String query = "SELECT * FROM CuonSach";
        ResultSet rs = J2SQL.Instance().ExecuteQuery(query, null);
        try {
            while(rs.next())
            {
                book = new Book(rs.getString("maDS"),rs.getString("maCS"),rs.getString("ngonNgu"),rs.getString("taiBan"),rs.getString("trangthai"));
                s.add(book);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
        
    }
    public static ArrayList <Book> LayThongTinCuonSachbyMaCS(String str)
    {
        Book book;
        ArrayList <Book> s = new ArrayList<>();
        String query = "EXEC SearchCS ? ";
        ResultSet rs = J2SQL.Instance().ExecuteQuery(query, new Object[]{str});
        try {
            while(rs.next())
            {
                book = new Book(rs.getString("maDS"),rs.getString("maCS"),rs.getString("ngonNgu"),rs.getString("taiBan"),rs.getString("trangthai"));
                s.add(book);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
        
    }
    public static void ThemCuonSach(Book b, String SoLuong)
    {
        
        String query = "EXEC ThemCuonSach ?,?,?,?,?";
        J2SQL.Instance().ExecuteNonQuery(query,new Object []{b.MaDauSach,b.NgonNgu,b.TrangThai,b.TaiBan,SoLuong});
        
    }
    public static List<String> getListNgonNgu()
    {
        String query = "SELECT ngonNgu FROM CuonSach";
        return J2SQL.Instance().ExecuteReaderListString(query, null);
    }
    public static List<String> getListTrangThai()
    {
        String query = "SELECT trangThai FROM CuonSach";
        return J2SQL.Instance().ExecuteReaderListString(query, null);
    }
    public static List<String> getNextID_CS()
    {
        String query = "EXEC getNextID_CS";
        return J2SQL.Instance().ExecuteReaderListString(query, null);
    }
    public static List<String> getID_CS(DauSach b)
    {
        String query = "SELECT maCS FROM CuonSach cs, DauSach ds WHERE ds.maDS = cs.maDS and ds.maDS = ?";
        return J2SQL.Instance().ExecuteReaderListString(query, new Object[]{b.getMaDS()});
    }
    public static void UpdateCuonSach(Book b)
    {
        String query = "EXEC UpdateCuonSach ?,?,?,?,?";
        J2SQL.Instance().ExecuteNonQuery(query, new Object []{b.MaDauSach,b.MaSach,b.NgonNgu,b.TrangThai,b.TaiBan});
    }
}
