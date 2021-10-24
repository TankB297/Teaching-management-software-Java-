package My_Database;

public class AddData {

    CreateTable table = new CreateTable();
    ConnectDB conn = new ConnectDB();

    public void add_BaiGiang() {
        table.Create_TableBaiGiang();
        String bg1 = "insert into BaiGiang values('Unit 1: Greeting', 2, 'TACNTT', '2020-09-05', '2020-09-05')";
        String bg2 = "insert into BaiGiang values('Unit 2: Introduction', 2, 'TACNTT', '2020-09-07', '2020-09-07')";
        String bg3 = "insert into BaiGiang values('Unit 3: Activity', 2, 'TACNTT', '2020-09-12', '2020-09-12')";

        conn.doSQL(bg1);
        conn.doSQL(bg2);
        conn.doSQL(bg3);
    }

    public void add_GiaoVien() {
        table.Create_TableGIAOVIEN();
        String cbgv1 = "insert into GIAOVIEN values('gv01', 'Nguyễn Tuấn Anh', '0966505777', 'Bắc Giang', 'TankBee297')";
        String cbgv2 = "insert into GIAOVIEN values('gv02', 'Phí Quang Biển', '0966505888', 'Bắc Giang', 'Danhuynh777')";
        String cbgv3 = "insert into GIAOVIEN values('gv03', 'Phan Ngọc Anh', '0966505222', 'Bắc Giang', 'DoubleD')";
        
        
        conn.doSQL(cbgv1);
        conn.doSQL(cbgv2);
        conn.doSQL(cbgv3);
    }

    public void add_SinhVien() {
        table.Create_TableSinhVien();

        String hs1 = "insert into SINHVIEN values('SV01', 'Nguyễn Tuấn Anh', 'Nam', '2000-09-02', 'Bắc Giang', '0966505646', 'CNTT05', 'TA501', 'CNTT', 'K13')";
        String hs2 = "insert into SINHVIEN values('SV02', 'Hoàng Hương Giang', 'Nữ', '2000-08-29', 'Đồng Nai', '0972163222', 'CNTT06', 'TA501', 'CNTT', 'K13')";
        String hs3 = "insert into SINHVIEN values('SV03', 'Huỳnh Ngọc Danh', 'Nam', '2000-12-22', 'Hà Nội', '0966505777', 'CNTT04', 'TA501', 'CNTT', 'K13')";
        String hs4 = "insert into SINHVIEN values('SV04', 'Nguyễn Văn A', 'Nam', '2000-11-22', 'Yên Bái', '0966505788', 'CNTT03', 'TA502', 'CNTT', 'K13')";
        String hs5 = "insert into SINHVIEN values('SV05', 'Nguyễn Thị B', 'Nữ', '2000-12-21', 'Sài Gòn', '0966505789', 'CNTT02', 'TA502', 'CNTT', 'K13')";
        String hs6 = "insert into SINHVIEN values('SV06', 'Nguyễn Văn C', 'Nam', '2000-10-22', 'Hà Nam', '0966505790', 'CNTT05', 'TA502', 'CNTT', 'K13')";
        String hs7 = "insert into SINHVIEN values('SV07', 'Hoàng Văn A', 'Nam', '2000-09-21', 'Ninh Bình', '0966505791', 'CNTT02', 'TA503', 'CNTT', 'K13')";
        String hs8 = "insert into SINHVIEN values('SV08', 'Huỳnh Thị B', 'Nữ', '2000-01-23', 'Phú Thọ', '0966505792', 'CNTT01', 'TA503', 'CNTT', 'K13')";
        String hs9 = "insert into SINHVIEN values('SV09', 'Hoàng Thị C', 'Nữ', '2000-02-24', 'Bắc Ninh', '0966505793', 'CNTT01', 'TA503', 'CNTT', 'K13')";
        
        conn.doSQL(hs1);
        conn.doSQL(hs2);
        conn.doSQL(hs3);
        conn.doSQL(hs4);
        conn.doSQL(hs5);
        conn.doSQL(hs6);
        conn.doSQL(hs7);
        conn.doSQL(hs8);
        conn.doSQL(hs9);
    }

    public void add_LopTA() {
        table.Create_TableLopTA();
        String kt = "insert into LopTA values('TA501','Tiếng Anh CNTT 5','TACNTT','gv01','2021')";
        String kt2 = "insert into LopTA values('TA502','Tiếng Anh CNTT 5','TACNTT','gv02','2021')";
        String kt3 = "insert into LopTA values('TA503','Tiếng Anh CNTT 5','TACNTT','gv03','2021')";
        
        conn.doSQL(kt);
        conn.doSQL(kt2);
        conn.doSQL(kt3);
    }

    public void add_MonTA() {
        table.Create_TableMonTA();
        String kl = "insert into MonTA values('TACNTT','Tiếng Anh CNTT 5','2020-09-05','2020-12-05','2020-12-10')";
        String k2 = "insert into MonTA values('TAQTKD','Tiếng Anh QTKD 5','2020-09-05','2020-12-03','2020-12-07')";
        String k3 = "insert into MonTA values('TACK','Tiếng Anh CK 5','2020-09-05','2020-12-04','2020-12-08')";
        
        conn.doSQL(k3);
        conn.doSQL(k2);
        conn.doSQL(kl);
    }

    public void add_TaiKhoan() {
        table.Create_TableTaiKhoan();
        String td = "insert into TaiKhoan values('TankBee297', '297000', 'Giáo viên')";
        String td1 = "insert into TaiKhoan values('Danhuynh777', '1234567', 'Giáo viên')";
        String td2 = "insert into TaiKhoan values('DoubleD', '123456', 'Giáo viên')";
        String td3 = "insert into TaiKhoan values('Dannehihi', '290800', 'Quản lý')";
        
        conn.doSQL(td3);
        conn.doSQL(td2);
        conn.doSQL(td1);
        conn.doSQL(td);
    }
    
    public void add_SoDiem() {
        table.Create_TableSoDiem();
        String td = "insert into SoDiem values('SV01', 'TA501', 7.5, 8.5, 7, 7.9, 2.0, 4.0, 6.0, 6, 40)";
        String td1 = "insert into SoDiem values('SV02', 'TA501', 7.5, 8.5, 7, 7.9, 2.0, 4.5, 6.5, 4, 40)";
        String td2 = "insert into SoDiem values('SV03', 'TA501', 7.5, 8.5, 7, 7.9, 2.0, 5.0, 7.0, 0, 40)";
        String td3 = "insert into SoDiem values('SV04', 'TA502', 7.5, 8.5, 7, 6.9, 2.0, 5.0, 7.0, 1, 40)";
        String td4 = "insert into SoDiem values('SV05', 'TA502', 7.5, 8.5, 7, 7.9, 2.0, 5.0, 7.0, 2, 40)";
        String td5 = "insert into SoDiem values('SV06', 'TA502', 7.5, 8.5, 7, 8.9, 2.0, 5.0, 7.0, 5, 40)";
        String td6 = "insert into SoDiem values('SV07', 'TA503', 7.5, 8.5, 7, 6.9, 2.0, 5.0, 7.0, 5, 40)";
        String td7 = "insert into SoDiem values('SV08', 'TA503', 7.5, 8.5, 7, 8.9, 2.0, 5.0, 7.0, 2, 40)";
        String td8 = "insert into SoDiem values('SV09', 'TA503', 7.5, 8.5, 7, 5.9, 2.0, 5.0, 7.0, 0, 40)";
        
        
        conn.doSQL(td);
        conn.doSQL(td1);
        conn.doSQL(td2);
        conn.doSQL(td3);
        conn.doSQL(td4);
        conn.doSQL(td5);
        conn.doSQL(td6);
        conn.doSQL(td7);
        conn.doSQL(td8);
    }
}
