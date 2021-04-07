/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.MuonSachDTO;
import com.sun.org.apache.xerces.internal.xs.ItemPSVI;
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
public class MuonSachDAO {
    
    private MuonSachDAO(){}
    
    private static MuonSachDAO instance;
    
    public static MuonSachDAO Instance(){
        if(instance==null)
            instance= new MuonSachDAO(); 
        return MuonSachDAO.instance;
    }
    
    public String getTenDG(String maDG ) throws SQLException{
        String query = "select hoTen from DocGia where maDG='"+ maDG+ "'";
        return J2SQL.Instance().ExecuteReader(query, null); 
    }
    
    public String getSLSachDangMuon(String maDG){
        String query = "select count(*) from QuaTrinh_Muon where maDG=? and ngayTra is null";
        return J2SQL.Instance().ExecuteReader(query, new Object[]{maDG});
    }
    
    public String getSLSachQuaHan(String maDG){
        String query = "select count(*) from QuaTrinh_Muon where maDG=? and ngayTra is null and ngayHetHan < getDate()";
        return J2SQL.Instance().ExecuteReader(query, new Object[]{maDG});
    }
    
    public String getNgaySinh(String maDG){
        String query = "select ngaySinh  from DocGia where maDG='"+ maDG+ "'";
        return J2SQL.Instance().ExecuteReader(query, null); 
    }
    
    public String getTichDiem(String maDG){
        String query = "select tichDiem from DocGia where maDG='"+ maDG+ "'";
        return J2SQL.Instance().ExecuteReader(query, null); 
    }
    
     public String getDiaChi(String maDG){
        String query = "select diaChi from DocGia where maDG='"+ maDG+ "'";
        return J2SQL.Instance().ExecuteReader(query, null); 
    }
    
    public String getLoaiDG(String maDG){
        String query = "select loaiDG from DocGia where maDG='"+ maDG+ "'";
        return J2SQL.Instance().ExecuteReader(query, null); 
    }
    
     public String getGioiTinh(String maDG){
        String query = "select gioiTinh from DocGia where maDG='"+ maDG+ "'";
        return J2SQL.Instance().ExecuteReader(query, null); 
    }
     
     public String getTrangThai(String maCS){
         String query = "select trangThai from CuonSach where maCS='"+ maCS+ "'";
         return J2SQL.Instance().ExecuteReader(query, null);
     }
    
    public List<String> getListMaDG(){
        return J2SQL.Instance().ExecuteReaderListString("select maDG from DocGia", null);
    }
    
    public List<MuonSachDTO> getTableTimMuonSach(String tenSach) {
        ArrayList<MuonSachDTO> list = new ArrayList<>();
        ResultSet rs = J2SQL.Instance().ExecuteQuery("exec getTableMuonSach ?", new Object[]{tenSach});
        try {
            while(rs.next()){
                MuonSachDTO item = new MuonSachDTO();
                item.setMaCS(rs.getString(1));
                item.setTenCS(rs.getString(2));
                item.setNgonNgu(rs.getString(3));
                item.setTaiBan(rs.getString(4));
                item.setTrangThai(rs.getString(5));
                
                list.add(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MuonSachDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
    
    public MuonSachDTO getThongTinCSMuon(String maCS){
        String query = "select maCS, tenDS,ngonNgu, taiBan, trangThai from CuonSach cs join DauSach ds on cs.maDS=ds.maDS where maCS=?";
        MuonSachDTO item = new MuonSachDTO();
        ResultSet rs = J2SQL.Instance().ExecuteQuery(query, new Object[]{maCS});
        
        try {
            while(rs.next()){
                item.setMaCS(rs.getString(1));
                item.setTenCS(rs.getString(2));
                item.setNgonNgu(rs.getString(3));
                item.setTaiBan(rs.getString(4));
                item.setTrangThai(rs.getString(5));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MuonSachDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return item;       
    }
    
    public int getSoSachMuonToiDa(String maDG){
        String query = "select soSachMuonToiDa from LoaiDocGia where maLoaiDG=(select loaiDG from DocGia where maDG =?)";
        return Integer.parseInt(J2SQL.Instance().ExecuteReader(query,new Object[]{maDG}));
    }
    
    public void insertMuonSach(String maDG, String maCS){
        String query = "insert into QuaTrinh_Muon (maDG, maCS) values (?, ?)";
        J2SQL.Instance().ExecuteNonQuery(query, new Object[]{maDG, maCS});
    }
    
//     public static void main(String[] args) throws SQLException {
//         String rs =  MuonSachDAO.Instance().getTenDG("dg0000");
//         System.out.println(rs);
//     }
    
    
}
