/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Form;

import My_Classes.GiaoVien;
import My_Classes.TaiKhoan;
import My_Database.AddData;
import My_Database.ConnectDB;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Dashboard_Form2 extends javax.swing.JFrame {
    ConnectDB conn = null; 
    AddData duLieu = new AddData();
    ArrayList<GiaoVien> list = new ArrayList<GiaoVien>();
    ArrayList<TaiKhoan> list1 = new ArrayList<TaiKhoan>();
    String maGV;
    String tenGV;
    /**
     * Creates new form Dashboard_Form
     */
    public Dashboard_Form2(String maGV) 
    {
        initComponents();
        this.maGV = maGV;
        Data();
        for(GiaoVien g:list){
            if(g.getMaGV().equals(maGV)){
                tenGV = g.getTenGV();
            }
        }
        helloGV.setText("Xin chào: " + tenGV);
        this.setLocationRelativeTo(null);
        displayImage();
        displayImage1();
        displayImage2();
        displayImage3();
        displayImage4();
        displayImage5();
        displayImage6();
        displayImage7();
        displayImage9();
        displayImage10();
        displayImage11();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void Data()
    {
        try{
            conn = new ConnectDB();
            duLieu.add_TaiKhoan();
            duLieu.add_GiaoVien(); 

            String sql_tk = "Select * from TaiKhoan";
            String sql_cbgv = "select * from GIAOVIEN";

            list = conn.getData_GiaoVien(sql_cbgv);
            list1 = conn.getData_TaiKhoan(sql_tk);
        }
        catch (Exception e) 
        {
            System.out.println("ĐÂY LÀ LỖI OKE OKE OKE OKE OKE " + e.getMessage());
        }
    }

    public void displayImage()
    {
        //Lấy ảnh từ nguồn:
        ImageIcon imgIco = new ImageIcon(getClass().getResource("/My_Images/Book.png"));
        
        //Điều chỉnh kích thước ảnh fit với JLabel:
        Image image = imgIco.getImage().getScaledInstance(Logo_Manage.getWidth(), Logo_Manage.getHeight(), Image.SCALE_SMOOTH);
        
        //Đặt ảnh vào trong JLabel:
        Logo_Manage.setIcon(new ImageIcon(image));
    }
    
    public void displayImage1()
    {
        //Lấy ảnh từ nguồn:
        ImageIcon imgIco = new ImageIcon(getClass().getResource("/My_Images/Home.png"));
        
        //Điều chỉnh kích thước ảnh fit với JLabel:
        Image image = imgIco.getImage().getScaledInstance(JLabel_Home.getWidth(), JLabel_Home.getHeight(), Image.SCALE_SMOOTH);
        
        //Đặt ảnh vào trong JLabel:
        JLabel_Home.setIcon(new ImageIcon(image));
    }
    
    public void displayImage2()
    {
        //Lấy ảnh từ nguồn:
        ImageIcon imgIco = new ImageIcon(getClass().getResource("/My_Images/Information_Manage.png"));
        
        //Điều chỉnh kích thước ảnh fit với JLabel:
        Image image = imgIco.getImage().getScaledInstance(JLabel_Manage.getWidth(), JLabel_Manage.getHeight(), Image.SCALE_SMOOTH);
        
        //Đặt ảnh vào trong JLabel:
        JLabel_Manage.setIcon(new ImageIcon(image));
    }
    
    public void displayImage3()
    {
        //Lấy ảnh từ nguồn:
        ImageIcon imgIco = new ImageIcon(getClass().getResource("/My_Images/Class_Manage.png"));
        
        //Điều chỉnh kích thước ảnh fit với JLabel:
        Image image = imgIco.getImage().getScaledInstance(JLabel_Class.getWidth(), JLabel_Class.getHeight(), Image.SCALE_SMOOTH);
        
        //Đặt ảnh vào trong JLabel:
        JLabel_Class.setIcon(new ImageIcon(image));
    }
    
    public void displayImage4()
    {
        //Lấy ảnh từ nguồn:
        ImageIcon imgIco = new ImageIcon(getClass().getResource("/My_Images/Exit.png"));
        
        //Điều chỉnh kích thước ảnh fit với JLabel:
        Image image = imgIco.getImage().getScaledInstance(JLabel_Exit.getWidth(), JLabel_Exit.getHeight(), Image.SCALE_SMOOTH);
        
        //Đặt ảnh vào trong JLabel:
        JLabel_Exit.setIcon(new ImageIcon(image));
    }
    
    public void displayImage5()
    {
        //Lấy ảnh từ nguồn:
        ImageIcon imgIco = new ImageIcon(getClass().getResource("/My_Images/GiaoVien.png"));
        
        //Điều chỉnh kích thước ảnh fit với JLabel:
        Image image = imgIco.getImage().getScaledInstance(JLabel_QuanLySinhVien.getWidth(), JLabel_QuanLySinhVien.getHeight(), Image.SCALE_SMOOTH);
        
        //Đặt ảnh vào trong JLabel:
        JLabel_QuanLySinhVien.setIcon(new ImageIcon(image));
    }
    
    public void displayImage6()
    {
        //Lấy ảnh từ nguồn:
        ImageIcon imgIco = new ImageIcon(getClass().getResource("/My_Images/MoLop.png"));
        
        //Điều chỉnh kích thước ảnh fit với JLabel:
        Image image = imgIco.getImage().getScaledInstance(JLabel_QuanLyGiaoVien.getWidth(), JLabel_QuanLyGiaoVien.getHeight(), Image.SCALE_SMOOTH);
        
        //Đặt ảnh vào trong JLabel:
        JLabel_QuanLyGiaoVien.setIcon(new ImageIcon(image));
    }
    
    public void displayImage7()
    {
        //Lấy ảnh từ nguồn:
        ImageIcon imgIco = new ImageIcon(getClass().getResource("/My_Images/LoTrinhMon.png"));
        
        //Điều chỉnh kích thước ảnh fit với JLabel:
        Image image = imgIco.getImage().getScaledInstance(JLabel_QuanLyMon.getWidth(), JLabel_QuanLyMon.getHeight(), Image.SCALE_SMOOTH);
        
        //Đặt ảnh vào trong JLabel:
        JLabel_QuanLyMon.setIcon(new ImageIcon(image));
    }
    
    public void displayImage9()
    {
        //Lấy ảnh từ nguồn:
        ImageIcon imgIco = new ImageIcon(getClass().getResource("/My_Images/KetQua.png"));
        
        //Điều chỉnh kích thước ảnh fit với JLabel:
        Image image = imgIco.getImage().getScaledInstance(JLabel_KetQua.getWidth(), JLabel_KetQua.getHeight(), Image.SCALE_SMOOTH);
        
        //Đặt ảnh vào trong JLabel:
        JLabel_KetQua.setIcon(new ImageIcon(image));
    }
    
    public void displayImage10()
    {
        //Lấy ảnh từ nguồn:
        ImageIcon imgIco = new ImageIcon(getClass().getResource("/My_Images/LichThi.png"));
        
        //Điều chỉnh kích thước ảnh fit với JLabel:
        Image image = imgIco.getImage().getScaledInstance(JLabel_LichThi.getWidth(), JLabel_LichThi.getHeight(), Image.SCALE_SMOOTH);
        
        //Đặt ảnh vào trong JLabel:
        JLabel_LichThi.setIcon(new ImageIcon(image));
    }
    
    public void displayImage11()
    {
        //Lấy ảnh từ nguồn:
        ImageIcon imgIco = new ImageIcon(getClass().getResource("/My_Images/HomePageReal.png"));
        
        //Điều chỉnh kích thước ảnh fit với JLabel:
        Image image = imgIco.getImage().getScaledInstance(JLabel_HomePage.getWidth(), JLabel_HomePage.getHeight(), Image.SCALE_SMOOTH);
        
        //Đặt ảnh vào trong JLabel:
        JLabel_HomePage.setIcon(new ImageIcon(image));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel14 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Logo_Manage = new javax.swing.JLabel();
        helloGV = new javax.swing.JLabel();
        TrangChu = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        JLabel_Home = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ThongTin = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        JLabel_Manage = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Thoat = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        JLabel_Exit = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        GiangDay = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        JLabel_Class = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jp1 = new javax.swing.JPanel();
        JLabel_HomePage = new javax.swing.JLabel();
        jp2 = new javax.swing.JPanel();
        XemThongTinLop_ChangeScreen = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        JLabel_QuanLyGiaoVien = new javax.swing.JLabel();
        QLSV_ChangeScreen = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        JLabel_QuanLySinhVien = new javax.swing.JLabel();
        jp3 = new javax.swing.JPanel();
        XemThongTinMon_ChangeScreen = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        JLabel_QuanLyMon = new javax.swing.JLabel();
        QuanLySoDiem_ChangeScreen = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        JLabel_KetQua = new javax.swing.JLabel();
        QuanLyBaiGiang_ChangeScreen = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        JLabel_LichThi = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 204, 255));

        Logo_Manage.setBackground(new java.awt.Color(102, 204, 255));
        Logo_Manage.setOpaque(true);

        helloGV.setBackground(new java.awt.Color(102, 204, 255));
        helloGV.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        helloGV.setForeground(new java.awt.Color(255, 255, 255));
        helloGV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        helloGV.setText("Giáo viên");
        helloGV.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo_Manage, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(helloGV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(helloGV, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo_Manage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        TrangChu.setBackground(new java.awt.Color(255, 204, 102));
        TrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TrangChuMouseClicked(evt);
            }
        });

        JLabel_Home.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabel_Home, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabel_Home, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Trang chủ");

        javax.swing.GroupLayout TrangChuLayout = new javax.swing.GroupLayout(TrangChu);
        TrangChu.setLayout(TrangChuLayout);
        TrangChuLayout.setHorizontalGroup(
            TrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrangChuLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        TrangChuLayout.setVerticalGroup(
            TrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TrangChuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TrangChuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        ThongTin.setBackground(new java.awt.Color(255, 204, 102));
        ThongTin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThongTinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabel_Manage, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabel_Manage, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Quản lý thông tin");

        javax.swing.GroupLayout ThongTinLayout = new javax.swing.GroupLayout(ThongTin);
        ThongTin.setLayout(ThongTinLayout);
        ThongTinLayout.setHorizontalGroup(
            ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongTinLayout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ThongTinLayout.setVerticalGroup(
            ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThongTinLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThongTinLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Thoat.setBackground(new java.awt.Color(255, 204, 102));
        Thoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThoatMouseClicked(evt);
            }
        });

        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabel_Exit, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabel_Exit, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Đăng xuất");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ThoatLayout = new javax.swing.GroupLayout(Thoat);
        Thoat.setLayout(ThoatLayout);
        ThoatLayout.setHorizontalGroup(
            ThoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThoatLayout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ThoatLayout.setVerticalGroup(
            ThoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThoatLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThoatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        GiangDay.setBackground(new java.awt.Color(255, 204, 102));
        GiangDay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GiangDayMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabel_Class, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabel_Class, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Quản lý giảng dạy");

        javax.swing.GroupLayout GiangDayLayout = new javax.swing.GroupLayout(GiangDay);
        GiangDay.setLayout(GiangDayLayout);
        GiangDayLayout.setHorizontalGroup(
            GiangDayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GiangDayLayout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        GiangDayLayout.setVerticalGroup(
            GiangDayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GiangDayLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GiangDayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Thoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GiangDay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GiangDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Thoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel7.setBackground(new java.awt.Color(255, 204, 255));
        jPanel7.setLayout(new javax.swing.OverlayLayout(jPanel7));

        jp1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jp1Layout = new javax.swing.GroupLayout(jp1);
        jp1.setLayout(jp1Layout);
        jp1Layout.setHorizontalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabel_HomePage, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        jp1Layout.setVerticalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(JLabel_HomePage, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                .addGap(49, 49, 49))
        );

        jPanel7.add(jp1);

        jp2.setBackground(new java.awt.Color(255, 204, 102));

        XemThongTinLop_ChangeScreen.setBackground(new java.awt.Color(153, 255, 255));
        XemThongTinLop_ChangeScreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XemThongTinLop_ChangeScreenMouseClicked(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(102, 204, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Xem thông tin lớp");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout XemThongTinLop_ChangeScreenLayout = new javax.swing.GroupLayout(XemThongTinLop_ChangeScreen);
        XemThongTinLop_ChangeScreen.setLayout(XemThongTinLop_ChangeScreenLayout);
        XemThongTinLop_ChangeScreenLayout.setHorizontalGroup(
            XemThongTinLop_ChangeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(XemThongTinLop_ChangeScreenLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(JLabel_QuanLyGiaoVien, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        XemThongTinLop_ChangeScreenLayout.setVerticalGroup(
            XemThongTinLop_ChangeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XemThongTinLop_ChangeScreenLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLabel_QuanLyGiaoVien, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        QLSV_ChangeScreen.setBackground(new java.awt.Color(153, 255, 255));
        QLSV_ChangeScreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QLSV_ChangeScreenMouseClicked(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(102, 204, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Quản lý sinh viên");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout QLSV_ChangeScreenLayout = new javax.swing.GroupLayout(QLSV_ChangeScreen);
        QLSV_ChangeScreen.setLayout(QLSV_ChangeScreenLayout);
        QLSV_ChangeScreenLayout.setHorizontalGroup(
            QLSV_ChangeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(QLSV_ChangeScreenLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(JLabel_QuanLySinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        QLSV_ChangeScreenLayout.setVerticalGroup(
            QLSV_ChangeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QLSV_ChangeScreenLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLabel_QuanLySinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jp2Layout = new javax.swing.GroupLayout(jp2);
        jp2.setLayout(jp2Layout);
        jp2Layout.setHorizontalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(XemThongTinLop_ChangeScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QLSV_ChangeScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jp2Layout.setVerticalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QLSV_ChangeScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(XemThongTinLop_ChangeScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(336, Short.MAX_VALUE))
        );

        jPanel7.add(jp2);

        jp3.setBackground(new java.awt.Color(255, 204, 102));

        XemThongTinMon_ChangeScreen.setBackground(new java.awt.Color(153, 255, 255));
        XemThongTinMon_ChangeScreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XemThongTinMon_ChangeScreenMouseClicked(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(51, 204, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Xem thông tin môn ");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout XemThongTinMon_ChangeScreenLayout = new javax.swing.GroupLayout(XemThongTinMon_ChangeScreen);
        XemThongTinMon_ChangeScreen.setLayout(XemThongTinMon_ChangeScreenLayout);
        XemThongTinMon_ChangeScreenLayout.setHorizontalGroup(
            XemThongTinMon_ChangeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, XemThongTinMon_ChangeScreenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLabel_QuanLyMon, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        XemThongTinMon_ChangeScreenLayout.setVerticalGroup(
            XemThongTinMon_ChangeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XemThongTinMon_ChangeScreenLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLabel_QuanLyMon, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        QuanLySoDiem_ChangeScreen.setBackground(new java.awt.Color(153, 255, 255));
        QuanLySoDiem_ChangeScreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuanLySoDiem_ChangeScreenMouseClicked(evt);
            }
        });

        jPanel16.setBackground(new java.awt.Color(51, 204, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Quản lý sổ điểm");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout QuanLySoDiem_ChangeScreenLayout = new javax.swing.GroupLayout(QuanLySoDiem_ChangeScreen);
        QuanLySoDiem_ChangeScreen.setLayout(QuanLySoDiem_ChangeScreenLayout);
        QuanLySoDiem_ChangeScreenLayout.setHorizontalGroup(
            QuanLySoDiem_ChangeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(QuanLySoDiem_ChangeScreenLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(JLabel_KetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        QuanLySoDiem_ChangeScreenLayout.setVerticalGroup(
            QuanLySoDiem_ChangeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuanLySoDiem_ChangeScreenLayout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLabel_KetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        QuanLyBaiGiang_ChangeScreen.setBackground(new java.awt.Color(153, 255, 255));
        QuanLyBaiGiang_ChangeScreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuanLyBaiGiang_ChangeScreenMouseClicked(evt);
            }
        });

        jPanel17.setBackground(new java.awt.Color(51, 204, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Quản lý bài giảng");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout QuanLyBaiGiang_ChangeScreenLayout = new javax.swing.GroupLayout(QuanLyBaiGiang_ChangeScreen);
        QuanLyBaiGiang_ChangeScreen.setLayout(QuanLyBaiGiang_ChangeScreenLayout);
        QuanLyBaiGiang_ChangeScreenLayout.setHorizontalGroup(
            QuanLyBaiGiang_ChangeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(QuanLyBaiGiang_ChangeScreenLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(JLabel_LichThi, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        QuanLyBaiGiang_ChangeScreenLayout.setVerticalGroup(
            QuanLyBaiGiang_ChangeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuanLyBaiGiang_ChangeScreenLayout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLabel_LichThi, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jp3Layout = new javax.swing.GroupLayout(jp3);
        jp3.setLayout(jp3Layout);
        jp3Layout.setHorizontalGroup(
            jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(QuanLySoDiem_ChangeScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(XemThongTinMon_ChangeScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(QuanLyBaiGiang_ChangeScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jp3Layout.setVerticalGroup(
            jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(XemThongTinMon_ChangeScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(QuanLySoDiem_ChangeScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(QuanLyBaiGiang_ChangeScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jPanel7.add(jp3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrangChuMouseClicked
        // TODO add your handling code here:
        jp1.setVisible(true);
        jp2.setVisible(false);
        jp3.setVisible(false);
        TrangChu.setBackground(Color.white);
        ThongTin.setBackground(new Color(255,204,102));
        GiangDay.setBackground(new Color(255,204,102));
        Thoat.setBackground(new Color(255,204,102));
    }//GEN-LAST:event_TrangChuMouseClicked

    private void ThongTinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThongTinMouseClicked
        // TODO add your handling code here:
        jp1.setVisible(false);
        jp2.setVisible(true);
        jp3.setVisible(false);
        TrangChu.setBackground(new Color(255,204,102));
        ThongTin.setBackground(Color.white);
        GiangDay.setBackground(new Color(255,204,102));
        Thoat.setBackground(new Color(255,204,102));
    }//GEN-LAST:event_ThongTinMouseClicked

    private void GiangDayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GiangDayMouseClicked
        // TODO add your handling code here:
        jp1.setVisible(false);
        jp2.setVisible(false);
        jp3.setVisible(true);
        GiangDay.setBackground(Color.white);
        TrangChu.setBackground(new Color(255,204,102));
        ThongTin.setBackground(new Color(255,204,102));
        Thoat.setBackground(new Color(255,204,102));
    }//GEN-LAST:event_GiangDayMouseClicked

    private void ThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThoatMouseClicked
        // TODO add your handling code here:
        Thoat.setBackground(Color.white);
        GiangDay.setBackground(new Color(255,204,102));
        TrangChu.setBackground(new Color(255,204,102));
        ThongTin.setBackground(new Color(255,204,102));
        int ret = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn đăng xuất?");
        if(ret==JOptionPane.YES_OPTION)
        {
            this.dispose();
            Login_Form lg1 = new Login_Form();
            lg1.setVisible(true);
        } 
    }//GEN-LAST:event_ThoatMouseClicked

    private void XemThongTinLop_ChangeScreenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XemThongTinLop_ChangeScreenMouseClicked
        // TODO add your handling code here:
        XemThongTinLop_ChangeScreen.setBackground(Color.white);
        QLSV_ChangeScreen.setBackground(new Color(153,255,255));
        QuanLyLopTA1 QL = new QuanLyLopTA1(maGV);
        QL.setVisible(true);
    }//GEN-LAST:event_XemThongTinLop_ChangeScreenMouseClicked

    private void QLSV_ChangeScreenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QLSV_ChangeScreenMouseClicked
        // TODO add your handling code here:
        QLSV_ChangeScreen.setBackground(Color.white);
        XemThongTinLop_ChangeScreen.setBackground(new Color(153,255,255));
        QuanLySinhVien1 QL = new QuanLySinhVien1(maGV);
        QL.setVisible(true);
    }//GEN-LAST:event_QLSV_ChangeScreenMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void QuanLyBaiGiang_ChangeScreenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuanLyBaiGiang_ChangeScreenMouseClicked
        // TODO add your handling code here:
       QuanLyBaiGiang_ChangeScreen.setBackground(Color.white);
       XemThongTinMon_ChangeScreen.setBackground(new Color(153,255,255));
       QuanLySoDiem_ChangeScreen.setBackground(new Color(153,255,255));
       QuanLyBaiGiang QL = new QuanLyBaiGiang();
       QL.setVisible(true);
    }//GEN-LAST:event_QuanLyBaiGiang_ChangeScreenMouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseClicked

    private void QuanLySoDiem_ChangeScreenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuanLySoDiem_ChangeScreenMouseClicked
        // TODO add your handling code here:
       QuanLyBaiGiang_ChangeScreen.setBackground(new Color(153,255,255));
       XemThongTinMon_ChangeScreen.setBackground(new Color(153,255,255));
       QuanLySoDiem_ChangeScreen.setBackground(Color.white);
       QuanLySoDiem1 QL = new QuanLySoDiem1(maGV);
       QL.setVisible(true);
    }//GEN-LAST:event_QuanLySoDiem_ChangeScreenMouseClicked

    private void XemThongTinMon_ChangeScreenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XemThongTinMon_ChangeScreenMouseClicked
        // TODO add your handling code here:
        QuanLyBaiGiang_ChangeScreen.setBackground(new Color(153,255,255));
        XemThongTinMon_ChangeScreen.setBackground(Color.white);
        QuanLySoDiem_ChangeScreen.setBackground(new Color(153,255,255));
        QuanLyMonTA1 QL = new QuanLyMonTA1();
        QL.setVisible(true);
    }//GEN-LAST:event_XemThongTinMon_ChangeScreenMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        Thoat.setBackground(Color.white);
        GiangDay.setBackground(new Color(255,204,102));
        TrangChu.setBackground(new Color(255,204,102));
        ThongTin.setBackground(new Color(255,204,102));
        int ret = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn đăng xuất?");
        if(ret==JOptionPane.YES_OPTION)
        {
            this.dispose();
            Login_Form lg1 = new Login_Form();
            lg1.setVisible(true);
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jPanel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseClicked
        // TODO add your handling code here:
        Thoat.setBackground(Color.white);
        GiangDay.setBackground(new Color(255,204,102));
        TrangChu.setBackground(new Color(255,204,102));
        ThongTin.setBackground(new Color(255,204,102));
        int ret = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn đăng xuất?");
        if(ret==JOptionPane.YES_OPTION)
        {
            this.dispose();
            Login_Form lg1 = new Login_Form();
            lg1.setVisible(true);
        }
    }//GEN-LAST:event_jPanel13MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        //java.awt.EventQueue.invokeLater(new Runnable() {
        //    public void run() {
        //        new Dashboard_Form2().setVisible(true);
        //    }
        //});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GiangDay;
    private javax.swing.JLabel JLabel_Class;
    private javax.swing.JLabel JLabel_Exit;
    private javax.swing.JLabel JLabel_Home;
    private javax.swing.JLabel JLabel_HomePage;
    private javax.swing.JLabel JLabel_KetQua;
    private javax.swing.JLabel JLabel_LichThi;
    private javax.swing.JLabel JLabel_Manage;
    private javax.swing.JLabel JLabel_QuanLyGiaoVien;
    private javax.swing.JLabel JLabel_QuanLyMon;
    private javax.swing.JLabel JLabel_QuanLySinhVien;
    private javax.swing.JLabel Logo_Manage;
    private javax.swing.JPanel QLSV_ChangeScreen;
    private javax.swing.JPanel QuanLyBaiGiang_ChangeScreen;
    private javax.swing.JPanel QuanLySoDiem_ChangeScreen;
    private javax.swing.JPanel Thoat;
    private javax.swing.JPanel ThongTin;
    private javax.swing.JPanel TrangChu;
    private javax.swing.JPanel XemThongTinLop_ChangeScreen;
    private javax.swing.JPanel XemThongTinMon_ChangeScreen;
    private javax.swing.JLabel helloGV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jp1;
    private javax.swing.JPanel jp2;
    private javax.swing.JPanel jp3;
    // End of variables declaration//GEN-END:variables
}
