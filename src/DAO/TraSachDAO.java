
package DAO;

import DTO.TraSachDTO;
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
public class TraSachDAO {
    
    private TraSachDAO(){}
    
    private static TraSachDAO instance;
    
    public static TraSachDAO Instance(){
        if(instance==null)
            instance= new TraSachDAO(); 
        return TraSachDAO.instance;
    }
    
    public List<TraSachDTO> getTableTraSach(String maDG){
        
        ArrayList<TraSachDTO> list = new ArrayList<>();
        ResultSet rs = J2SQL.Instance().ExecuteQuery("exec getTableTraSach ?", new Object[]{maDG});
        
        try {
            while (rs.next()){
                TraSachDTO item = new TraSachDTO();
                item.setMaPM(rs.getString(1));
                item.setMaCS(rs.getString(2));
                item.setTenCS(rs.getString(3));
                item.setNgayMuon(rs.getString(4));
                item.setNgayHetHan(rs.getString(5));
                item.setTrangThai(rs.getString(6));
                
                list.add(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TraSachDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return list;
    }
    
    public void TraSach(String maDG, String maCS){
        String query = "update QuaTrinh_Muon set ngayTra = GETDATE() where maDG= ? and maCS = ? and ngayTra is null";
        J2SQL.Instance().ExecuteNonQuery(query, new Object[]{maDG, maCS});
    }
    
    
     public String getSoLanGiaHan(String maCS){
        String query = "select soLanGiaHan from QuaTrinh_Muon where ngayTra is null and maCS = ?";
        return J2SQL.Instance().ExecuteReader(query, new Object[]{maCS});
    }
     
     public String isQuaHan(String maDG, String maCS){
         return J2SQL.Instance().ExecuteReader("Exec isQuaHan ? , ?", new Object[]{maDG, maCS});
     }
     
     public void giaHan(String maDG, String maCS){
         J2SQL.Instance().ExecuteNonQuery("Exec giaHan ? , ?", new Object[]{maDG, maCS});
     }
    
     public String getSLGiaHan(String maDG, String maCS){
         String query = "Select soLanGiaHan from QuaTrinh_Muon where ngayTra is null and maDG=? and maCS=?";
         return J2SQL.Instance().ExecuteReader(query, new Object[]{maDG, maCS});
     }
    
     public void baoMatSach(String maDG, String maCS){
    
         J2SQL.Instance().ExecuteNonQuery("update QuaTrinh_Muon set  ngayTra=getdate() where ngayTra is null and maCS='"+maCS+"'"+" and maDG='"+maDG+"'", null);
             J2SQL.Instance().ExecuteNonQuery("update CuonSach set trangThai=N'Đã mất' where maCS='"+maCS+"'",null);
         J2SQL.Instance().ExecuteNonQuery("update DocGia set tichDiem-=20 where maDG='"+maDG+"'", null);
     }
     
}
