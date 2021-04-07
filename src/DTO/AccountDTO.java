/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author NCT
 */
public class AccountDTO {
    
    private String iD;
    private String userName;
    private String passWord;
    private String loaiTK;
    private String hoTen;
    private String diaChi;
    private String SDT;

    public AccountDTO() {
    }

    public AccountDTO(String iD, String userName, String passWord, String loaiTK, String hoTen, String diaChi, String SDT) {
        this.iD = iD;
        this.userName = userName;
        this.passWord = passWord;
        this.loaiTK = loaiTK;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.SDT = SDT;
    }

    public String getiD() {
        return iD;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getLoaiTK() {
        return loaiTK;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setLoaiTK(String loaiTK) {
        this.loaiTK = loaiTK;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
    
    
}
