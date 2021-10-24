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
public class TaiKhoan 
{
    private String TenTK;
    private String MK;
    private String ChucVu;

    public TaiKhoan(String TenTK, String MK, String ChucVu) {
        this.TenTK = TenTK;
        this.MK = MK;
        this.ChucVu = ChucVu;
    }

    public TaiKhoan(String TenTK) {
        this.TenTK = TenTK;
    }

    public TaiKhoan() {
    }

    public String getTenTK() {
        return TenTK;
    }

    public void setTenTK(String TenTK) {
        this.TenTK = TenTK;
    }

    public String getMK() {
        return MK;
    }

    public void setMK(String MK) {
        this.MK = MK;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.TenTK);
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
        final TaiKhoan other = (TaiKhoan) obj;
        if (!Objects.equals(this.TenTK, other.TenTK)) {
            return false;
        }
        return true;
    }
}
