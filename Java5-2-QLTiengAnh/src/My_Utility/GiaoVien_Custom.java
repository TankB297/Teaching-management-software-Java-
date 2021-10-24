/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Utility;

import My_Classes.GiaoVien;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Administrator
 */
public class GiaoVien_Custom extends AbstractTableModel
{
    //Khai báo xâu chứa tiêu đề của bảng.
    private String name[]={"Mã giáo viên", "Tên giáo viên", "Số điện thoại", "Địa chỉ", "Tên tài khoản"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[]={String.class, String.class, String.class, String.class, String.class};
    //Tạo một đối tượng arrayList có tên listThiSinh.
    ArrayList<GiaoVien> dsGV = new ArrayList<GiaoVien>();

    //phương thức khởi tạo cho class có tham số truyền vào.
    public GiaoVien_Custom(ArrayList<GiaoVien> list)
   {
       this.dsGV = list;
   }
    
    @Override
    public int getRowCount()
    {
        return dsGV.size();
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
            
            case 0: return dsGV.get(rowIndex).getMaGV();
            
            case 1: return dsGV.get(rowIndex).getTenGV();
            
            case 2: return dsGV.get(rowIndex).getSDT();
            
            case 3: return dsGV.get(rowIndex).getDiaChi();
            
            case 4: return dsGV.get(rowIndex).getTenTK();
            
            default: return null;
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
