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
public class SoDiem 
{
    private String MaSV;
    private String MaLopTA;
    private Float DiemBaiKT1;
    private Float DiemBaiKT2;
    private Float DiemBaiKTNoi;
    private Float DiemTB;
    private Float DiemBaiNoiCuoiKi;
    private Float DiemBaiVietCuoiKi;
    private Float DiemBaiCuoiKi;
    private int SoTietNghi;
    private int TongSoTiet;

    public SoDiem(String MaSV, String MaLopTA, Float DiemBaiKT1, Float DiemBaiKT2, Float DiemBaiKTNoi, Float DiemTB, Float DiemBaiNoiCuoiKi, Float DiemBaiVietCuoiKi, Float DiemBaiCuoiKi, int SoTietNghi, int TongSoTiet) {
        this.MaSV = MaSV;
        this.MaLopTA = MaLopTA;
        this.DiemBaiKT1 = DiemBaiKT1;
        this.DiemBaiKT2 = DiemBaiKT2;
        this.DiemBaiKTNoi = DiemBaiKTNoi;
        this.DiemTB = DiemTB;
        this.DiemBaiNoiCuoiKi = DiemBaiNoiCuoiKi;
        this.DiemBaiVietCuoiKi = DiemBaiVietCuoiKi;
        this.DiemBaiCuoiKi = DiemBaiCuoiKi;
        this.SoTietNghi = SoTietNghi;
        this.TongSoTiet = TongSoTiet;
    }

    public SoDiem(String MaSV, String MaLopTA) {
        this.MaSV = MaSV;
        this.MaLopTA = MaLopTA;
    }

    public SoDiem() {
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getMaLopTA() {
        return MaLopTA;
    }

    public void setMaLopTA(String MaLopTA) {
        this.MaLopTA = MaLopTA;
    }

    public Float getDiemBaiKT1() {
        return DiemBaiKT1;
    }

    public void setDiemBaiKT1(Float DiemBaiKT1) {
        this.DiemBaiKT1 = DiemBaiKT1;
    }

    public Float getDiemBaiKT2() {
        return DiemBaiKT2;
    }

    public void setDiemBaiKT2(Float DiemBaiKT2) {
        this.DiemBaiKT2 = DiemBaiKT2;
    }

    public Float getDiemBaiKTNoi() {
        return DiemBaiKTNoi;
    }

    public void setDiemBaiKTNoi(Float DiemBaiKTNoi) {
        this.DiemBaiKTNoi = DiemBaiKTNoi;
    }

    public Float getDiemTB() {
        return DiemTB;
    }

    public void setDiemTB(Float DiemTB) {
        this.DiemTB = DiemTB;
    }

    public Float getDiemBaiNoiCuoiKi() {
        return DiemBaiNoiCuoiKi;
    }

    public void setDiemBaiNoiCuoiKi(Float DiemBaiNoiCuoiKi) {
        this.DiemBaiNoiCuoiKi = DiemBaiNoiCuoiKi;
    }

    public Float getDiemBaiVietCuoiKi() {
        return DiemBaiVietCuoiKi;
    }

    public void setDiemBaiVietCuoiKi(Float DiemBaiVietCuoiKi) {
        this.DiemBaiVietCuoiKi = DiemBaiVietCuoiKi;
    }

    public Float getDiemBaiCuoiKi() {
        return DiemBaiCuoiKi;
    }

    public void setDiemBaiCuoiKi(Float DiemBaiCuoiKi) {
        this.DiemBaiCuoiKi = DiemBaiCuoiKi;
    }

    public int getSoTietNghi() {
        return SoTietNghi;
    }

    public void setSoTietNghi(int SoTietNghi) {
        this.SoTietNghi = SoTietNghi;
    }

    public int getTongSoTiet() {
        return TongSoTiet;
    }

    public void setTongSoTiet(int TongSoTiet) {
        this.TongSoTiet = TongSoTiet;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.MaSV);
        hash = 71 * hash + Objects.hashCode(this.MaLopTA);
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
        final SoDiem other = (SoDiem) obj;
        if (!Objects.equals(this.MaSV, other.MaSV)) {
            return false;
        }
        if (!Objects.equals(this.MaLopTA, other.MaLopTA)) {
            return false;
        }
        return true;
    }
}
