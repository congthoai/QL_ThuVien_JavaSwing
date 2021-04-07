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
public class MuonSachDTO {
    
    private String maCS;
    private String maDS;
    private String tenCS;
    private String ngonNgu;
    private String taiBan;
    private String trangThai;

    public MuonSachDTO() {
    }

    public MuonSachDTO(String maCS, String tenCS, String ngonNgu, String taiBan, String trangThai) {
        this.maCS = maCS;
        this.tenCS = tenCS;
        this.ngonNgu = ngonNgu;
        this.taiBan = taiBan;
        this.trangThai = trangThai;
    }
    
    

    public String getMaCS() {
        return maCS;
    }

    public void setMaCS(String maCS) {
        this.maCS = maCS;
    }

    public String getMaDS() {
        return maDS;
    }

    public void setMaDS(String maDS) {
        this.maDS = maDS;
    }

    public String getTenCS() {
        return tenCS;
    }

    public void setTenCS(String tenCS) {
        this.tenCS = tenCS;
    }

    public String getNgonNgu() {
        return ngonNgu;
    }

    public void setNgonNgu(String ngonNgu) {
        this.ngonNgu = ngonNgu;
    }

    public String getTaiBan() {
        return taiBan;
    }

    public void setTaiBan(String taiBan) {
        this.taiBan = taiBan;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
