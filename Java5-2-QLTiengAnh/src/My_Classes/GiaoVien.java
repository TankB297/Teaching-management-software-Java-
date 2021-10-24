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
public class GiaoVien 
{
    private String MaGV;
    private String TenGV;
    private String SDT;
    private String DiaChi;
    private String TenTK;

    public GiaoVien(String MaGV, String TenGV, String SDT, String DiaChi, String TenTK) {
        this.MaGV = MaGV;
        this.TenGV = TenGV;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
        this.TenTK = TenTK;
    }

    public GiaoVien(String MaGV) {
        this.MaGV = MaGV;
    }

    public GiaoVien() {
    }

    public String getMaGV() {
        return MaGV;
    }

    public void setMaGV(String MaGV) {
        this.MaGV = MaGV;
    }

    public String getTenGV() {
        return TenGV;
    }

    public void setTenGV(String TenGV) {
        this.TenGV = TenGV;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getTenTK() {
        return TenTK;
    }

    public void setTenTK(String TenTK) {
        this.TenTK = TenTK;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.MaGV);
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
        final GiaoVien other = (GiaoVien) obj;
        if (!Objects.equals(this.MaGV, other.MaGV)) {
            return false;
        }
        return true;
    }

    public void getMaGV(String MaGV) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
