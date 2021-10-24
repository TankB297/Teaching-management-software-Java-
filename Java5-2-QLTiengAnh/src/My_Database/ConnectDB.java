package My_Database;

import My_Classes.BaiGiang;
import My_Classes.GiaoVien;
import My_Classes.LopTA;
import My_Classes.MonTA;
import My_Classes.SinhVien;
import My_Classes.SoDiem;
import My_Classes.TaiKhoan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ConnectDB {

    Statement stm = null;
    ResultSet rs = null;
    Connection cnn = null;

    String uRl = "jdbc:derby://localhost:1527/Nhom2_Java5_K13";
    String userName = "TankBee";
    String pas = "123";

    public ConnectDB() {
        try {
            //org.apache.derby.jdbc.ClientDriver
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            cnn = DriverManager.getConnection(uRl, userName, pas);
            System.out.println("Ket noi thanh cong");
        } catch (Exception ex) {
            System.out.println("Ket noi that bai " + cnn + ex.toString());
        }
    }

    protected Statement getStatement() throws Exception {
        if (this.stm == null || this.stm.isClosed()) {
            this.stm = this.cnn.createStatement();
        }
        return this.stm;
    }

    public void updateData(String sql) throws Exception {
        try {
            getStatement().executeUpdate(sql);
        } catch (Exception e) {

        }
    }

    public ResultSet executeSql(String sql) {
        try {
            stm = cnn.createStatement();
            rs = stm.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            System.out.println(" khong thuc hien dc cau lẹnh sql\n" + sql);
            return rs;
        }

    }

    public void doSQL(String sql) {
        try {
            stm = cnn.createStatement();
            stm.execute(sql);
            System.out.println("Thực thi thành công");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println(" khong thuc hien dc cau lẹnh sql\n" + sql);
        }

    }

    public ArrayList getData_GiaoVien(String sql) {
        ArrayList<GiaoVien> l = new ArrayList<GiaoVien>();
        try 
        {
            stm = (Statement) cnn.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) 
            {
                GiaoVien gv = new GiaoVien(rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4),rs.getString(5));
                l.add(gv); 
            }
        } catch (Exception ex) {
            System.out.println("loi getData " + ex.toString());
            return null;
        }
        return l;
    }

    public ArrayList getData_SinhVien(String sql) {
        ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
        try {
            stm = (Statement) cnn.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                SinhVien sv = new SinhVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
                ds.add(sv);
            }
        } catch (Exception ex) {
            System.out.println("loi getData " + ex.toString());
            return null;
        }
        return ds;
    }

    public ArrayList getData_TaiKhoan(String sql) {
        ArrayList<TaiKhoan> svi = new ArrayList<TaiKhoan>();
        try {
            stm = (Statement) cnn.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                TaiKhoan tk = new TaiKhoan(rs.getString(1), rs.getString(2), rs.getString(3));
                svi.add(tk);
            }
        } catch (Exception ex) {
            System.out.println("loi getData" + ex.toString());
            return null;
        }
        return svi;
    }

    public ArrayList getData_BaiGiang(String sql) {
        ArrayList<BaiGiang> kt = new ArrayList<BaiGiang>();
        try {
            stm = (Statement) cnn.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                BaiGiang sv = new BaiGiang(rs.getString(1), rs.getInt(2), rs.getString(3),rs.getString(4),rs.getString(5));
                kt.add(sv);
            }
        } catch (Exception ex) {
            System.out.println("loi getData " + ex.toString());
            return null;
        }
        return kt;
    }

    public ArrayList getData_LopTA(String sql) {
        ArrayList<LopTA> kl = new ArrayList<LopTA>();
        try {
            stm = (Statement) cnn.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                LopTA sv = new LopTA(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4),rs.getString(5));
                kl.add(sv);
            }
        } catch (Exception ex) {
            System.out.println("loi getData " + ex.toString());
            return null;
        }
        return kl;
    }

    public ArrayList getData_MonTA(String sql) {
        ArrayList<MonTA> gd = new ArrayList<MonTA>();
        try {
            stm = (Statement) cnn.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                MonTA sv = new MonTA(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                gd.add(sv);
            }
        } catch (Exception ex) {
            System.out.println("loi getData " + ex.toString());
            return null;
        }
        return gd;
    }
    
    public ArrayList getData_SoDiem(String sql) {
        ArrayList<SoDiem> gd = new ArrayList<SoDiem>();
        try {
            stm = (Statement) cnn.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                SoDiem sv = new SoDiem(rs.getString(1), rs.getString(2), rs.getFloat(3), rs.getFloat(4), rs.getFloat(5), rs.getFloat(6), rs.getFloat(7), rs.getFloat(8), rs.getFloat(9), rs.getInt(10), rs.getInt(11));
                gd.add(sv);
            }
        } catch (Exception ex) {
            System.out.println("loi getData " + ex.toString());
            return null;
        }
        return gd;
    }
}
