/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Database;

public class CreateTable 
{

    ConnectDB conn = new ConnectDB();

    public void Create_TableBaiGiang() {
        String sql = "Create table BaiGiang(TenBaiGiang varchar(50) PRIMARY KEY, SoTiet INT,"
                + "MaMon VARCHAR(50), FOREIGN KEY (MaMon) REFERENCES MonTA(MaMon), KeHoachGiangDay DATE, ThucHien DATE)";
        conn.doSQL(sql);
    }
    
    public void Create_TableSoDiem() {
        String sql = "Create table SoDiem(MaSV varchar(50), FOREIGN KEY (MaSV) REFERENCES SinhVien(MaSV),"
                + "MaLopTA VARCHAR(50), FOREIGN KEY (MaLopTA) REFERENCES LopTA(MaLopTA), PRIMARY KEY (MaSV, MaLopTA), DiemBaiKT1 FLOAT, DiemBaiKT2 FLOAT, DiemBaiKTBaiNoi FLOAT, DiemTB FLOAT, DiemBaiNoiCuoiKi FLOAT, DiemBaiVietCuoiKi FLOAT, DiemBaiCuoiKi FLOAT, SoTietNghi INT, TongSoTiet INT)";
        conn.doSQL(sql);
    }

    public void Create_TableTaiKhoan() {
        String sql = "Create table TaiKhoan(TenTK varchar(50) PRIMARY KEY, MK varchar(50),"
                + "ChucVu varchar(50))";
        conn.doSQL(sql);
    }

    public void Create_TableMonTA() {
        String sql = "Create table MonTA(MaMon varchar(50) PRIMARY KEY, TenMon varchar(50),"
                + "NgayBatDau DATE, NgayKetThuc DATE, LichThi DATE)";
        conn.doSQL(sql);
    }

    public void Create_TableLopTA() {
        String sql = "Create table LopTA(MaLopTA varchar(50) PRIMARY KEY, " + 
                "TenLopTA varchar(50), MaMon varchar(50), MaGV varchar(50), FOREIGN KEY (MaMon) REFERENCES MonTA(MaMon), FOREIGN KEY (MaGV) REFERENCES GIAOVIEN(MaGV)," + 
                "NamHoc varchar(10))";
        conn.doSQL(sql);
    }

    public void Create_TableGIAOVIEN(){
        String sql = "Create table GIAOVIEN(MaGV varchar(50) primary key, TenGV varchar(50),"
                + "SDT varchar(15), DiaChi varchar(50), TenTK varchar(50), FOREIGN KEY (TenTK) REFERENCES TaiKhoan(TenTK))";
        conn.doSQL(sql);
    }
    
    public void Create_TableSinhVien() {
        String sql = "Create table SINHVIEN(MaSV varchar(50) primary key, TenSV varchar(50), GioiTinh varchar(10), "
                + "NgaySinh Date, QueQuan varchar(50), SDT varchar(15), Lop varchar(50), MaLopTA varchar(50), FOREIGN KEY (MaLopTA) REFERENCES LopTA(MaLopTA), Khoa varchar(50), KhoaHoc varchar(50))";
        conn.doSQL(sql);
    }
}
