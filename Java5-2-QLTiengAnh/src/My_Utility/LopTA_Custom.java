/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Utility;

import My_Classes.LopTA;
import My_Classes.SinhVien;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Administrator
 */
public class LopTA_Custom extends AbstractTableModel 
{
    //Khai báo xâu chứa tiêu đề của bảng.
    private String name[]={"Mã lớp TA", "Tên lớp TA", "Mã môn", "Mã GV", "Năm học"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[]={String.class, String.class, String.class, String.class, String.class};
    //Tạo một đối tượng arrayList có tên listThiSinh.
    ArrayList<LopTA> dsTA = new ArrayList<LopTA>();

    //phương thức khởi tạo cho class có tham số truyền vào.
    public LopTA_Custom(ArrayList<LopTA> list)
   {
       this.dsTA = list;
   }
    
    @Override
    public int getRowCount()
    {
        return dsTA.size();
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
            
            case 0: return dsTA.get(rowIndex).getMaLopTA();
            
            case 1: return dsTA.get(rowIndex).getTenLopTA();
            
            case 2: return dsTA.get(rowIndex).getMaMon();
            
            case 3: return dsTA.get(rowIndex).getMaGV();
            
            case 4: return dsTA.get(rowIndex).getNamHoc();
            
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
