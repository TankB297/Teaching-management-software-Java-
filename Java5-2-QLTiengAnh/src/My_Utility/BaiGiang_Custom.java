/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Utility;

import My_Classes.BaiGiang;
import My_Classes.TaiKhoan;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Administrator
 */
public class BaiGiang_Custom extends AbstractTableModel 
{
    //Khai báo xâu chứa tiêu đề của bảng.
    private String name[]={"Tên bài giảng", "Số tiết", "Mã môn", "Kế hoạch giảng dạy", "Thực hiện"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[]={String.class, int.class, String.class, String.class, String.class};
    //Tạo một đối tượng arrayList có tên listThiSinh.
    ArrayList<BaiGiang> dsBG = new ArrayList<BaiGiang>();

    //phương thức khởi tạo cho class có tham số truyền vào.
    public BaiGiang_Custom(ArrayList<BaiGiang> arr_BaiGiang)
   {
       this.dsBG = arr_BaiGiang;
   }
    
    @Override
    public int getRowCount()
    {
        return dsBG.size();
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
            
            case 0: return dsBG.get(rowIndex).getTenBaiGiang();
            
            case 1: return dsBG.get(rowIndex).getSoTiet();
            
            case 2: return dsBG.get(rowIndex).getMaMon();
            
            case 3: return dsBG.get(rowIndex).getKeHoachGiangDay();
            
            case 4: return dsBG.get(rowIndex).getThucHien();
            
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
