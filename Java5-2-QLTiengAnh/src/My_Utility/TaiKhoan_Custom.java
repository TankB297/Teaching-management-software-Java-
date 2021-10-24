/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Utility;

import My_Classes.SinhVien;
import My_Classes.TaiKhoan;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Administrator
 */
public class TaiKhoan_Custom extends AbstractTableModel
{
    //Khai báo xâu chứa tiêu đề của bảng.
    private String name[]={"Tên tài khoản", "Mật khẩu", "Chức vụ"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[]={String.class, String.class, String.class};
    //Tạo một đối tượng arrayList có tên listThiSinh.
    ArrayList<TaiKhoan> dsTK = new ArrayList<TaiKhoan>();

    //phương thức khởi tạo cho class có tham số truyền vào.
    public TaiKhoan_Custom(ArrayList<TaiKhoan> arr_TaiKhoan)
   {
       this.dsTK = arr_TaiKhoan;
   }
    
    @Override
    public int getRowCount()
    {
        return dsTK.size();
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
            
            case 0: return dsTK.get(rowIndex).getTenTK();
            
            case 1: return dsTK.get(rowIndex).getMK();
            
            case 2: return dsTK.get(rowIndex).getChucVu();
            
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
