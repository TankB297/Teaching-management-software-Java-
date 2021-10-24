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
public class LopTA 
{
    private String MaLopTA;
    private String TenLopTA;
    private String MaMon;
    private String MaGV;
    private String NamHoc;

    public LopTA(String MaLopTA, String TenLopTA, String MaMon, String MaGV, String NamHoc) {
        this.MaLopTA = MaLopTA;
        this.TenLopTA = TenLopTA;
        this.MaMon = MaMon;
        this.MaGV = MaGV;
        this.NamHoc = NamHoc;
    }

    public LopTA(String MaLopTA) {
        this.MaLopTA = MaLopTA;
    }

    public LopTA() {
    }

    public String getMaLopTA() {
        return MaLopTA;
    }

    public void setMaLopTA(String MaLopTA) {
        this.MaLopTA = MaLopTA;
    }

    public String getTenLopTA() {
        return TenLopTA;
    }

    public void setTenLopTA(String TenLopTA) {
        this.TenLopTA = TenLopTA;
    }

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String MaMon) {
        this.MaMon = MaMon;
    }

    public String getMaGV() {
        return MaGV;
    }

    public void setMaGV(String MaGV) {
        this.MaGV = MaGV;
    }

    public String getNamHoc() {
        return NamHoc;
    }

    public void setNamHoc(String NamHoc) {
        this.NamHoc = NamHoc;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.MaLopTA);
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
        final LopTA other = (LopTA) obj;
        if (!Objects.equals(this.MaLopTA, other.MaLopTA)) {
            return false;
        }
        return true;
    }

    public void getMaGV(String MaGV) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
