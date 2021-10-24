/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Utility;

import My_Classes.GiaoVien;
import My_Classes.SinhVien;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Administrator
 */
public class SinhVien_Custom extends AbstractTableModel 
{
    //Khai báo xâu chứa tiêu đề của bảng.
    private String name[]={"Mã sinh viên", "Tên sinh viên", "Giới tính", "Ngày sinh", "Quê quán", "SĐT", "Lớp", "Mã lớp TA", "Khoa", "Khóa"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[]={String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class};
    //Tạo một đối tượng arrayList có tên listThiSinh.
    ArrayList<SinhVien> dsSV = new ArrayList<SinhVien>();

    //phương thức khởi tạo cho class có tham số truyền vào.
    public SinhVien_Custom(ArrayList<SinhVien> list)
   {
       this.dsSV = list;
   }
    
    @Override
    public int getRowCount()
    {
        return dsSV.size();
    }
    
    @Override
    public int getColumnCount()
    {
        return name.length;
    }
    //Đưa thông tin của phần tử trong arrayList lên jTable
    public Object getValueAt(int rowIndex,int columnIndex)
    {
        switch(columnIndex)
        {
            
            case 0: return dsSV.get(rowIndex).getMaSV();
            
            case 1: return dsSV.get(rowIndex).getTenSV();
            
            case 2: return dsSV.get(rowIndex).getGioiTinh();
            
            case 3: return dsSV.get(rowIndex).getNgaySinh();
            
            case 4: return dsSV.get(rowIndex).getQueQuan();
            
            case 5: return dsSV.get(rowIndex).getSDT();
                              
            case 6: return dsSV.get(rowIndex).getLop();
            
            case 7: return dsSV.get(rowIndex).getMaLopTA();
            
            case 8: return dsSV.get(rowIndex).getKhoa();
            
            case 9: return dsSV.get(rowIndex).getKhoaHoc();
            
            default :return null;
        }
    }
    @Override
    public Class getColumnClass(int columnIndex)
    {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column)
    {
        return name[column];
    }
}
