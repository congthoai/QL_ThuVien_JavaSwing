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
public class TraSachDTO {
    
    private String maPM;
    private String maCS;
    private String tenCS;
    private String ngayMuon;
    private String ngayHetHan;
    private String trangThai;
    
    public TraSachDTO(){}

    public TraSachDTO(String maPM, String maCS, String tenCS, String ngayMuon, String ngayHetHan, String trangThai) {
        this.maPM = maPM;
        this.maCS = maCS;
        this.tenCS = tenCS;
        this.ngayMuon = ngayMuon;
        this.ngayHetHan = ngayHetHan;
        this.trangThai = trangThai;
    }

    public String getMaPM() {
        return maPM;
    }

    public String getMaCS() {
        return maCS;
    }

    public String getTenCS() {
        return tenCS;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setMaPM(String maPM) {
        this.maPM = maPM;
    }

    public void setMaCS(String maCS) {
        this.maCS = maCS;
    }

    public void setTenCS(String tenCS) {
        this.tenCS = tenCS;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public void setNgayHetHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
    
    
    
}
