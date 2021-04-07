/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import DAO.J2SQL;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NhaXuatBan {
    private String MaCS, TenNXB, DiaChi, SDT;

    public String getMaCS() {
        return MaCS;
    }

    public void setMaCS(String MaCS) {
        this.MaCS = MaCS;
    }

    public String getTenNXB() {
        return TenNXB;
    }

    public void setTenNXB(String TenNXB) {
        this.TenNXB = TenNXB;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public NhaXuatBan(String MaCS, String TenNXB, String DiaChi, String SDT) {
        this.MaCS = MaCS;
        this.TenNXB = TenNXB;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
    }
    public static List<String> getListNXB()
    {
        String query = "SELECT tenNXB FROM NhaXuatBan";
        return J2SQL.Instance().ExecuteReaderListString(query, null);
    }
}
