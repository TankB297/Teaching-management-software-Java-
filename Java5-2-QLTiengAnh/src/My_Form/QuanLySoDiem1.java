/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Form;

import My_Database.AddData;
import My_Database.ConnectDB;
import My_Classes.GiaoVien;
import My_Classes.LopTA;
import My_Classes.MonTA;
import My_Classes.SinhVien;
import My_Classes.SoDiem;
import My_Utility.LopTA_Custom;
import My_Utility.SoDiem_Custom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class QuanLySoDiem1 extends javax.swing.JFrame {

    /**
     * Creates new form QuanLySoDiem
     */
    String MaGV;
    
    String MaSV;
    String MaLopTA;
    Float DiemBaiKT1;
    Float DiemBaiKT2;
    Float DiemBaiKTNoi;
    Float DiemTB;
    Float DiemBaiNoiCuoiKi;
    Float DiemBaiVietCuoiKi;
    Float DiemBaiCuoiKi;
    int SoTietNghi;
    int TongSoTiet;
    
    int selectedRow = 0;
    ConnectDB conn = null; 
    AddData duLieu = new AddData(); 
    ArrayList<LopTA> arr_LopTA = new ArrayList<LopTA>();
    ArrayList<SinhVien> arr_SinhVien = new ArrayList<SinhVien>();
    ArrayList<SoDiem> arr_SoDiem = new ArrayList<SoDiem>();
    
    public QuanLySoDiem1(String maGV) {
        initComponents();
        this.MaGV = maGV;
        conn = new ConnectDB();
        duLieu.add_LopTA();
        duLieu.add_SinhVien();
        duLieu.add_SoDiem();
        Data();
        LoadComboMaLopTA();
        LoadComboMaSV();
        XoaTrang();
        dsSoDiem_Table.setModel(new SoDiem_Custom(arr_SoDiem));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(1);
    }
    
    public void Data()
    {
        try{
        
        
        //String sql = "Select * from LopTA";
        //String sql1 = "Select * from SinhVien";
        //String sql2 = "Select * from SoDiem";
         
        
        //if (conn.getData_LopTA(sql) != null && conn.getData_SinhVien(sql1) != null && conn.getData_SoDiem(sql2) != null) {
        //    arr_LopTA = conn.getData_LopTA(sql);
        //    arr_SinhVien = conn.getData_SinhVien(sql1);
        //    arr_SoDiem = conn.getData_SoDiem(sql2);
        //}
        ArrayList<SoDiem> allSD = new ArrayList<SoDiem>();
        String sql = "Select * from SoDiem";
        allSD = conn.getData_SoDiem(sql);
        
        String sql1 = "Select * from LopTA WHERE MAGV = '" + MaGV + "'";
        arr_LopTA = conn.getData_LopTA(sql1);
        
        for(SoDiem s:allSD){
            if(arr_LopTA.contains(new LopTA(s.getMaLopTA())))
            {
                arr_SoDiem.add(s);
            }
        }
        
        ArrayList<SinhVien> allSV = new ArrayList<SinhVien>();
        String sql2 = "Select * from SinhVien";
        allSV = conn.getData_SinhVien(sql2);
        for(SinhVien sv:allSV){
            if(arr_LopTA.contains(new LopTA(sv.getMaLopTA()))){
                arr_SinhVien.add(sv);
            }
        }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void LoadComboMaLopTA()
    {
        for (int i = 0; i < arr_LopTA.size(); i++) {
            MaLopTA_ComboBox.addItem(arr_LopTA.get(i).getMaLopTA());
        }
    }
    
    public void LoadComboMaSV()
    {
        for (int i = 0; i < arr_SinhVien.size(); i++) {
            MaSV_ComboBox.addItem(arr_SinhVien.get(i).getMaSV());
        }
    }
    
    public void LoadTable()
    {
        dsSoDiem_Table.setModel(new SoDiem_Custom(arr_SoDiem));
    }
    
    public void XoaTrang()
    {
        txt_DiemKT1.setText("");
        txt_DiemKT2.setText("");
        txt_DiemKTNoi.setText("");
        txt_DiemTB.setText("");
        txt_ThiNoi.setText("");
        txt_ThiViet.setText("");
        txt_DiemThi.setText("");
        txt_SoTietNghi.setText("");
        txt_TongSoTiet.setText("");
        txt_DiemKT1.requestFocus();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_TongSoTiet = new javax.swing.JTextField();
        txt_DiemKT1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_DiemKT2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_ThiNoi = new javax.swing.JTextField();
        txt_DiemKTNoi = new javax.swing.JTextField();
        txt_DiemTB = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_ThiViet = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_SoTietNghi = new javax.swing.JTextField();
        txt_DiemThi = new javax.swing.JTextField();
        MaLopTA_ComboBox = new javax.swing.JComboBox<>();
        MaSV_ComboBox = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dsSoDiem_Table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản lý sổ điểm");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1066, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Mã SV:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Mã lớp TA:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Điểm KT2:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Điểm KT1:");

        txt_TongSoTiet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt_DiemKT1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Điểm TB:");

        txt_DiemKT2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Điểm KT nói:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Điểm thi:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Thi nói:");

        txt_ThiNoi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt_DiemKTNoi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt_DiemTB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Thi viết:");

        txt_ThiViet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Tổng số tiết:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Số tiết nghỉ:");

        txt_SoTietNghi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt_DiemThi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        MaLopTA_ComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MaLopTA_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn mã lớp TA" }));

        MaSV_ComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MaSV_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn mã SV" }));

        dsSoDiem_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        dsSoDiem_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dsSoDiem_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dsSoDiem_Table);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Sắp xếp");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Thoát");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Tải lại bảng");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("Sửa");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(153, 255, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("Xóa trắng");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(153, 255, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setText("Thêm");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(153, 255, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setText("Tìm kiếm");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(131, 131, 131)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(140, 140, 140)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(MaSV_ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_DiemKT2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_DiemKT1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(MaLopTA_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_DiemKTNoi, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_ThiViet, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_DiemTB, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_ThiNoi, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_TongSoTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_SoTietNghi, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_DiemThi, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DiemKTNoi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DiemThi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaSV_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DiemTB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_SoTietNghi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaLopTA_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DiemKT1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ThiNoi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TongSoTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DiemKT2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ThiViet, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int ret = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn thoát?");
        if(ret==JOptionPane.YES_OPTION)
        {
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        LoadTable();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        XoaTrang();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String MaSV = MaSV_ComboBox.getSelectedItem().toString();
        String MaLopTA = MaLopTA_ComboBox.getSelectedItem().toString();
        Float DiemBaiKT1 = Float.parseFloat(txt_DiemKT1.getText());
        Float DiemBaiKT2 = Float.parseFloat(txt_DiemKT2.getText());
        Float DiemBaiKTNoi = Float.parseFloat(txt_DiemKTNoi.getText());
        Float DiemTB = Float.parseFloat(txt_DiemTB.getText());
        Float DiemBaiNoiCuoiKi = Float.parseFloat(txt_ThiNoi.getText());
        Float DiemBaiVietCuoiKi = Float.parseFloat(txt_ThiViet.getText());
        Float DiemBaiCuoiKi = Float.parseFloat(txt_DiemThi.getText());
        int SoTietNghi = Integer.parseInt(txt_SoTietNghi.getText());
        int TongSoTiet = Integer.parseInt(txt_TongSoTiet.getText());
        
        String SoDiem = "insert into SoDiem values('" + MaSV + "', '" + MaLopTA + "', " + DiemBaiKT1 + ", " + DiemBaiKT2 + ", " + DiemBaiKTNoi + ", " + DiemTB + ", " + DiemBaiNoiCuoiKi + ", " + DiemBaiVietCuoiKi + ", " + DiemBaiCuoiKi + ", " + SoTietNghi + ", " + TongSoTiet + ")";
            conn.doSQL(SoDiem);
        arr_SoDiem.clear();
        try {
        this.Data();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }       
        LoadTable();
        XoaTrang();
        JOptionPane.showMessageDialog(this, "Thêm thành công thông tin sổ điểm!");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String MaSV = MaSV_ComboBox.getSelectedItem().toString();
        String MaLopTA = MaLopTA_ComboBox.getSelectedItem().toString();
        Float DiemBaiKT1 = Float.parseFloat(txt_DiemKT1.getText());
        Float DiemBaiKT2 = Float.parseFloat(txt_DiemKT2.getText());
        Float DiemBaiKTNoi = Float.parseFloat(txt_DiemKTNoi.getText());
        Float DiemTB = Float.parseFloat(txt_DiemTB.getText());
        Float DiemBaiNoiCuoiKi = Float.parseFloat(txt_ThiNoi.getText());
        Float DiemBaiVietCuoiKi = Float.parseFloat(txt_ThiViet.getText());
        Float DiemBaiCuoiKi = Float.parseFloat(txt_DiemThi.getText());
        int SoTietNghi = Integer.parseInt(txt_SoTietNghi.getText());
        int TongSoTiet = Integer.parseInt(txt_TongSoTiet.getText());
          
        String lop1 = "update SoDiem set MaSV = '" + MaSV + "', MaLopTA = '" + MaLopTA + "', DiemBaiKT1 = " + DiemBaiKT1 + ", DiemBaiKT2 = " + DiemBaiKT2 + ", DiemBaiKTBaiNoi = " + DiemBaiKTNoi + ", DiemTB = " + DiemTB + ", DiemBaiNoiCuoiKi = " + DiemBaiNoiCuoiKi + ", DiemBaiVietCuoiKi = " + DiemBaiVietCuoiKi + ", DiemBaiCuoiKi = " + DiemBaiCuoiKi + ", SoTietNghi = " + SoTietNghi + ", TongSoTiet = " + TongSoTiet + ""
                + "where MaSV = '" + MaSV + "'";
            conn.doSQL(lop1);
            arr_SoDiem.clear();
        this.Data();
            LoadTable();
            XoaTrang();
            JOptionPane.showMessageDialog(this, "Sửa thành công thông tin sổ điểm!");
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void dsSoDiem_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dsSoDiem_TableMouseClicked
        // TODO add your handling code here:
        selectedRow = dsSoDiem_Table.getSelectedRow();
        SoDiem as = arr_SoDiem.get(selectedRow);
          txt_DiemKT1.setText(as.getDiemBaiKT1() + "");
          txt_DiemKT2.setText(as.getDiemBaiKT2() + "");
          txt_DiemKTNoi.setText(as.getDiemBaiKTNoi() + "");
          txt_DiemTB.setText(as.getDiemTB() + "");
          txt_ThiNoi.setText(as.getDiemBaiNoiCuoiKi() + "");
          txt_ThiViet.setText(as.getDiemBaiVietCuoiKi() + "");
          txt_DiemThi.setText(as.getDiemBaiCuoiKi() + "");
          txt_SoTietNghi.setText(as.getSoTietNghi() + "");
          txt_TongSoTiet.setText(as.getTongSoTiet() + "");
          MaLopTA_ComboBox.setSelectedItem(as.getMaLopTA().toString());
          MaSV_ComboBox.setSelectedItem(as.getMaSV().toString());
          selectedRow = 0;
    }//GEN-LAST:event_dsSoDiem_TableMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int dlr = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn xóa không?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (dlr == JOptionPane.YES_OPTION) {
            selectedRow = dsSoDiem_Table.getSelectedRow();
            if (selectedRow > -1) {
                String MaSV = arr_SoDiem.get(selectedRow).getMaSV();
                String sql = "delete from SoDiem where MaSV = '" + MaSV + "'";
                conn.doSQL(sql);

                arr_SoDiem.clear();
                this.Data();
        LoadTable();
        XoaTrang();
     
        JOptionPane.showMessageDialog(this, "Xóa thành công thông tin sổ điểm!");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Comparator<SoDiem> c = new Comparator<SoDiem>() {
            @Override
            public int compare(SoDiem o1, SoDiem o2) {
                return Float.compare(o1.getDiemBaiCuoiKi(), o2.getDiemBaiCuoiKi());
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            };
            Collections.sort(arr_SoDiem, c);
            LoadTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        ArrayList<SoDiem> tk = new ArrayList<SoDiem>();
        tk.clear();
        for (int i = 0; i < arr_SoDiem.size(); i++) 
        {
            if (MaSV_ComboBox.getSelectedItem().toString().equals(arr_SoDiem.get(i).getMaSV())) 
            {
                tk.add(arr_SoDiem.get(i));
            }
        dsSoDiem_Table.setModel(new SoDiem_Custom(tk));
    }//GEN-LAST:event_jButton8ActionPerformed
    }
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
            java.util.logging.Logger.getLogger(QuanLySoDiem1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLySoDiem1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLySoDiem1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLySoDiem1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        //java.awt.EventQueue.invokeLater(new Runnable() {
        //    public void run() {
        //        new QuanLySoDiem1().setVisible(true);
        //    }
        //});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> MaLopTA_ComboBox;
    private javax.swing.JComboBox<String> MaSV_ComboBox;
    private javax.swing.JTable dsSoDiem_Table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_DiemKT1;
    private javax.swing.JTextField txt_DiemKT2;
    private javax.swing.JTextField txt_DiemKTNoi;
    private javax.swing.JTextField txt_DiemTB;
    private javax.swing.JTextField txt_DiemThi;
    private javax.swing.JTextField txt_SoTietNghi;
    private javax.swing.JTextField txt_ThiNoi;
    private javax.swing.JTextField txt_ThiViet;
    private javax.swing.JTextField txt_TongSoTiet;
    // End of variables declaration//GEN-END:variables
}
