/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Utility;

import My_Classes.MonTA;
import My_Classes.SinhVien;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Administrator
 */
public class MonTA_Custom extends AbstractTableModel
{
    //Khai báo xâu chứa tiêu đề của bảng.
    private String name[]={"Mã môn", "Tên môn", "Ngày bắt đầu", "Ngày kết thúc", "Lịch thi"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[]={String.class, String.class, String.class, String.class, String.class};
    //Tạo một đối tượng arrayList có tên listThiSinh.
    ArrayList<MonTA> dsMonTA = new ArrayList<MonTA>();

    //phương thức khởi tạo cho class có tham số truyền vào.
    public MonTA_Custom(ArrayList<MonTA> list)
   {
       this.dsMonTA = list;
   }
    
    @Override
    public int getRowCount()
    {
        return dsMonTA.size();
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
            
            case 0: return dsMonTA.get(rowIndex).getMaMon();
            
            case 1: return dsMonTA.get(rowIndex).getTenMon();
            
            case 2: return dsMonTA.get(rowIndex).getNgayBatDau();
            
            case 3: return dsMonTA.get(rowIndex).getNgayKetThuc();
            
            case 4: return dsMonTA.get(rowIndex).getLichThi();
            
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
