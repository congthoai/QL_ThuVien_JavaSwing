/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Date;

/**
 *
 * @author Windows 10 TIMT
 */
public class DocGiaDTO {
    private String maDG;
    private String loaiDG;
    private String gioiTinh;
    private String hoTen;
    private String ngaySinh;
    private String diaChi;
    private int sDT;
    private String tichDiem;

    public DocGiaDTO() {
    }

    public DocGiaDTO(String maDG, String loaiDG, String gioiTinh, String hoTen, String ngaySinh, String diaChi, int sDT, String tichDiem) {
        this.maDG = maDG;
        this.loaiDG = loaiDG;
        this.gioiTinh = gioiTinh;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.sDT = sDT;
        this.tichDiem = tichDiem;
    }

    public String getMaDG() {
        return maDG;
    }

    public String getLoaiDG() {
        return loaiDG;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getsDT() {
        return sDT;
    }

    public String getTichDiem() {
        return tichDiem;
    }

    public void setMaDG(String maDG) {
        this.maDG = maDG;
    }

    public void setLoaiDG(String loaiDG) {
        this.loaiDG = loaiDG;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setsDT(int sDT) {
        this.sDT = sDT;
    }

    public void setTichDiem(String tichDiem) {
        this.tichDiem = tichDiem;
    }

    

   


}
