/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Utility;

import My_Classes.SoDiem;
import My_Classes.TaiKhoan;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Administrator
 */
public class SoDiem_Custom extends AbstractTableModel 
{
    //Khai báo xâu chứa tiêu đề của bảng.
    private String name[]={"Mã SV", "Mã lớp TA", "Điểm bài KT1", "Điểm bài KT2", "Điểm bài KT nói", "Điểm TB", "Điểm thi nói", "Điểm thi viết", "Điểm thi", "Số tiết nghỉ", "Tổng số tiết"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[]={String.class, String.class, Float.class, Float.class, Float.class, Float.class, Float.class, Float.class, Float.class, int.class, int.class};
    //Tạo một đối tượng arrayList có tên listThiSinh.
    ArrayList<SoDiem> dsSD = new ArrayList<SoDiem>();

    //phương thức khởi tạo cho class có tham số truyền vào.
    public SoDiem_Custom(ArrayList<SoDiem> arr_SoDiem)
   {
       this.dsSD = arr_SoDiem;
   }
    
    @Override
    public int getRowCount()
    {
        return dsSD.size();
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
            
            case 0: return dsSD.get(rowIndex).getMaSV();
            
            case 1: return dsSD.get(rowIndex).getMaLopTA();
            
            case 2: return dsSD.get(rowIndex).getDiemBaiKT1();
            
            case 3: return dsSD.get(rowIndex).getDiemBaiKT2();
            
            case 4: return dsSD.get(rowIndex).getDiemBaiKTNoi();
            
            case 5: return dsSD.get(rowIndex).getDiemTB();
            
            case 6: return dsSD.get(rowIndex).getDiemBaiNoiCuoiKi();
            
            case 7: return dsSD.get(rowIndex).getDiemBaiVietCuoiKi();
            
            case 8: return dsSD.get(rowIndex).getDiemBaiCuoiKi();
            
            case 9: return dsSD.get(rowIndex).getSoTietNghi();
            
            case 10: return dsSD.get(rowIndex).getTongSoTiet();
            
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
