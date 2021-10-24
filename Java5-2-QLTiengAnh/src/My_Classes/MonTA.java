/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Classes;

import My_Database.AddData;
import My_Database.ConnectDB;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Administrator
 */
public class MonTA 
{
    private String MaMon;
    private String TenMon;
    private String NgayBatDau;
    private String NgayKetThuc;
    private String LichThi;
    
    public MonTA(String MaMon, String TenMon, String NgayBatDau, String NgayKetThuc, String LichThi) {
        this.MaMon = MaMon;
        this.TenMon = TenMon;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
        this.LichThi = LichThi;
    }

    public MonTA(String MaMon) {
        this.MaMon = MaMon;
    }

    public MonTA() {
    }

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String MaMon) {
        this.MaMon = MaMon;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }

    public String getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(String NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public String getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(String NgayKetThuc) {
        this.NgayKetThuc = NgayKetThuc;
    }

    public String getLichThi() {
        return LichThi;
    }

    public void setLichThi(String LichThi) {
        this.LichThi = LichThi;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.MaMon);
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
        final MonTA other = (MonTA) obj;
        if (!Objects.equals(this.MaMon, other.MaMon)) {
            return false;
        }
        return true;
    }
}
