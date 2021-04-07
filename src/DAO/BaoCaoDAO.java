/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.BaoCaoDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NCT
 */
public class BaoCaoDAO {
    
    private BaoCaoDAO(){}
    
    private static BaoCaoDAO instance;
    
    public static BaoCaoDAO Instance(){
        if(instance==null)
            instance= new BaoCaoDAO(); 
        return BaoCaoDAO.instance;
    }
    
    public List<BaoCaoDTO> getTableBaoCao(int loaiTK, int loaiTG, String tuNgay, String denNgay, int thang, int nam){
        
        ArrayList<BaoCaoDTO> list = new ArrayList<>();
        ResultSet rs = J2SQL.Instance().ExecuteQuery("EXEC getTableThongKe ?,?,?,?,?,?", new Object[]{loaiTK,loaiTG,tuNgay,denNgay,thang,nam});
        //ResultSet rs = J2SQL.Instance().ExecuteQuery("EXEC dbo.getTableThongKe 1,1,'','',12,2018",null);
        
        if(loaiTK==0){
            try {
            while (rs.next()){
                BaoCaoDTO item = new BaoCaoDTO();
                item.setMaDS(rs.getString(1));
                item.setTenDS(rs.getString(2));
                item.setSlMuonDS(rs.getString(3));                
                list.add(item);
            }
            } catch (SQLException ex) {
                System.out.println("erro_getTableBaoCao_DAO");
            }       
        }
        else{
            try {
            while (rs.next()){
                BaoCaoDTO item = new BaoCaoDTO();
                item.setMaDG(rs.getString(1));
                item.setTenDG(rs.getString(2));
                item.setSlMuonDG(rs.getString(3));                
                list.add(item);
            }
            } catch (SQLException ex) {
                System.out.println("erro_getTableBaoCao_DAO");
            }       
        }
                   
        return list;
    }
    
    public Connection getConn(){
        return J2SQL.Instance().getConn();
    }
    
}
