/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.DocGiaDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows 10 TIMT
 */
public class DocGiaDAO {
    private DocGiaDAO(){}
    
    private static DocGiaDAO instance;
    
    public static DocGiaDAO Instance(){
        if(instance==null)
            instance= new DocGiaDAO(); 
        return DocGiaDAO.instance;
    }
   
    public List<DocGiaDTO> getTableDocGia(){
        ArrayList<DocGiaDTO> list = new ArrayList<>();
        String query = "select maDG,hoTen,tenLoaiDG,gioiTinh,ngaySinh, soDT,diaChi,tichDiem from DocGia dg join LoaiDocGia l on dg.loaiDG = l.maLoaiDG";
        ResultSet rs = J2SQL.Instance().ExecuteQuery( query, null);
        
        try {
            while(rs.next()){
                DocGiaDTO dg = new DocGiaDTO();
                dg.setMaDG(rs.getString(1));
                dg.setHoTen(rs.getString(2));
                dg.setLoaiDG(rs.getString(3));
                dg.setGioiTinh(rs.getString(4));
                dg.setNgaySinh(rs.getString(5));
                dg.setsDT(rs.getInt(6));
                dg.setDiaChi(rs.getString(7));
                dg.setTichDiem(rs.getString(8));
                list.add(dg);
            }
        } catch (SQLException e) {
            System.out.println("Loi getTableDG");
        }
        return list;
    }
        public void InsertDG(String maDG, String hoTen, String gioiTinh,String ngaySinh,String soDT,String diaChi)
        {
            String query = "Insert into DocGia( maDG,hoTen,gioiTinh,ngaySinh, soDT,diaChi) values (?,?,?,?,?,?)";
            maDG = J2SQL.Instance().ExecuteReader("exec getNextID_DG", null);
            J2SQL.Instance().ExecuteNonQuery(query, new Object[]{maDG,hoTen,gioiTinh,ngaySinh,soDT,diaChi});
        }
       public String MaDGtieptheo()
       {
          return J2SQL.Instance().ExecuteReader("exec getNextID_DG", null);
          
       }
       public void UpdateDG(String maDG, String hoTen, String gioiTinh,String ngaySinh,String soDT,String diaChi)
       {
           String query="update DocGia set hoTen=?,gioiTinh=?,ngaySinh=?,soDT=?,diaChi=? where maDG=?";
           J2SQL.Instance().ExecuteNonQuery(query, new Object[]{hoTen,gioiTinh,ngaySinh,soDT,diaChi, maDG});
       }
   
       public String checkXoaDG(String id){
           String query = "SELECT * FROM QuaTrinh_Muon WHERE maDG=? AND ngayTra IS NULL ";
           return J2SQL.Instance().ExecuteReader(query, new Object[]{id});
       }
       
       public void xoaDG(String id){
           J2SQL.Instance().ExecuteNonQuery("EXEC xoaDG ?", new Object[]{id});
       }
}