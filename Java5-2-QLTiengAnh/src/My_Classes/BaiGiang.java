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
public class BaiGiang 
{
    private String TenBaiGiang;
    private int SoTiet;
    private String MaMon;
    private String KeHoachGiangDay;
    private String ThucHien;

    public BaiGiang(String TenBaiGiang, int SoTiet, String MaMon, String KeHoachGiangDay, String ThucHien) {
        this.TenBaiGiang = TenBaiGiang;
        this.SoTiet = SoTiet;
        this.MaMon = MaMon;
        this.KeHoachGiangDay = KeHoachGiangDay;
        this.ThucHien = ThucHien;
    }

    public BaiGiang(String TenBaiGiang) {
        this.TenBaiGiang = TenBaiGiang;
    }

    public BaiGiang() {
    }

    public String getTenBaiGiang() {
        return TenBaiGiang;
    }

    public void setTenBaiGiang(String TenBaiGiang) {
        this.TenBaiGiang = TenBaiGiang;
    }

    public int getSoTiet() {
        return SoTiet;
    }

    public void setSoTiet(int SoTiet) {
        this.SoTiet = SoTiet;
    }

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String MaMon) {
        this.MaMon = MaMon;
    }

    public String getKeHoachGiangDay() {
        return KeHoachGiangDay;
    }

    public void setKeHoachGiangDay(String KeHoachGiangDay) {
        this.KeHoachGiangDay = KeHoachGiangDay;
    }

    public String getThucHien() {
        return ThucHien;
    }

    public void setThucHien(String ThucHien) {
        this.ThucHien = ThucHien;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.TenBaiGiang);
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
        final BaiGiang other = (BaiGiang) obj;
        if (!Objects.equals(this.TenBaiGiang, other.TenBaiGiang)) {
            return false;
        }
        return true;
    }
}
