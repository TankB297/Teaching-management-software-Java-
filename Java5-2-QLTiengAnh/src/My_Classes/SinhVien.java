/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Classes;

import java.util.Objects;

/**
 *
 * @author Administrator
 */
public class SinhVien 
{
    private String MaSV;
    private String TenSV;
    private String GioiTinh;
    private String NgaySinh;
    private String QueQuan;
    private String SDT;
    private String Lop;
    private String MaLopTA;
    private String Khoa;
    private String KhoaHoc;

    public SinhVien(String MaSV, String TenSV, String GioiTinh, String NgaySinh, String QueQuan, String SDT, String Lop, String MaLopTA, String Khoa, String KhoaHoc) {
        this.MaSV = MaSV;
        this.TenSV = TenSV;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.QueQuan = QueQuan;
        this.SDT = SDT;
        this.Lop = Lop;
        this.MaLopTA = MaLopTA;
        this.Khoa = Khoa;
        this.KhoaHoc = KhoaHoc;
    }

    public SinhVien(String MaSV) {
        this.MaSV = MaSV;
    }

    public SinhVien() {
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getTenSV() {
        return TenSV;
    }

    public void setTenSV(String TenSV) {
        this.TenSV = TenSV;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public String getMaLopTA() {
        return MaLopTA;
    }

    public void setMaLopTA(String MaLopTA) {
        this.MaLopTA = MaLopTA;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String MaKhoa) {
        this.Khoa = Khoa;
    }

    public String getKhoaHoc() {
        return KhoaHoc;
    }

    public void setKhoaHoc(String KhoaHoc) {
        this.KhoaHoc = KhoaHoc;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.MaSV);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SinhVien other = (SinhVien) obj;
        if (!Objects.equals(this.MaSV, other.MaSV)) {
            return false;
        }
        return true;
    }
}
