/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.AccountDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author NCT
 */
public class AccountDAO {
    
    private AccountDAO(){}
    
    private static AccountDAO instance;
    
    public static AccountDAO Instance(){
        if(instance==null)
            instance= new AccountDAO(); 
        return AccountDAO.instance;
    }
    
    public String checkLogin(String userName, String passWord){
        return J2SQL.Instance().ExecuteReader("exec checkLogin ? , ?", new Object[]{userName, passWord});
    }

    public AccountDTO getAcc(String user, String pass){       
        String query = "SELECT * FROM NVQuanLy WHERE tenDangNhapQL= ? AND matKhauQL= ?";
        ResultSet rs = J2SQL.Instance().ExecuteQuery(query, new Object[]{user, pass});
        
        AccountDTO acc = new AccountDTO();

        try {
            while(rs.next()){
                acc.setiD(rs.getString(1));
                acc.setUserName(rs.getString(2));
                acc.setPassWord(rs.getString(3));
                acc.setLoaiTK(rs.getString(4));
                acc.setHoTen(rs.getString(5));
                acc.setDiaChi(rs.getString(6));
                acc.setSDT(rs.getString(7));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return acc;
    }
    
    public int updatePassWord(String id, String pass){
        String query = "Update NVQuanLy set matKhauQL = ? where maQL = ?";
        return J2SQL.Instance().ExecuteNonQuery(query, new Object[]{ pass, id});
    }

    public void updateThongTinTK(String id, String ten, String diaChi, String sdt){
        String query = "Update NVQuanLy set hoTen = ?,diaChi=?,SDT=? where maQL =?";
        J2SQL.Instance().ExecuteNonQuery(query, new Object[]{ten, diaChi, sdt, id});
    }
    
    public  List<String> getListUser(){
        return J2SQL.Instance().ExecuteReaderListString("Select tenDangNhapQL from NVQuanLy", null);
    }
    
    public void insertAccount(String user, String pass, String ten, int loai, String dc, String sdt){
        String query = "INSERT INTO NVQuanLy( TenDangNhapQL ,MatKhauQL ,HoTen ,LoaiQL, diaChi, SDT)VALUES(?, ?, ?, ?, ?, ?)";
        J2SQL.Instance().ExecuteNonQuery(query,new Object[]{user,pass,ten,loai,dc,sdt});
    }
}
