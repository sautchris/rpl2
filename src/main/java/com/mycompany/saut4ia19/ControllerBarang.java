package com.mycompany.saut4ia19;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
public class ControllerBarang {
    ArrayList<barangbaru> ArrayData;
    DefaultTableModel tablelist;
    
    public ControllerBarang(){
    ArrayData = new ArrayList<barangbaru>();
    }
    public void InsertData(String namabrg, int jmlhbrg, int hrgbrg){
        barangbaru brg = new barangbaru(namabrg, jmlhbrg, hrgbrg);
                ArrayData.add(brg);
    }
    public DefaultTableModel showData(){
        String[] kolom = {"Nama Barang", "Jumlah Barang", "Harga Barang"};
        Object[][] objData = new Object[ArrayData.size()][3];
        int i = 0;
        
        for(barangbaru n : ArrayData){
            String[] arrData = {n.getNama(),String.valueOf(n.getJmlh()), String.valueOf(n.getHrg())};
            objData[i] = arrData;
            i++;
        }
        
        tablelist = new DefaultTableModel(objData, kolom){
            public boolean inCellEditTable(int rowIndex, int colIndex){
                return false;
            }
        };
        return tablelist;
    }

    void DeleteData(int selectedRowIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
