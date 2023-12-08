package datakaryawan;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControllerKaryawan {
 ArrayList<karyawanbaru> ArrayData;
 DefaultTableModel tablelist;
 
 public ControllerKaryawan(){
     ArrayData = new ArrayList<karyawanbaru>();
 }
 public void InsertData (String nama, String idKaryawan, String kehadiran, String alasan){
     karyawanbaru krywn = new karyawanbaru(nama,idKaryawan,kehadiran,alasan);
     ArrayData.add(krywn);    
 }
public DefaultTableModel showData(){
    String[] kolom = {"Nama", "ID", "Kehadiran", "Alasan"};
    Object[][] objData = new Object [ArrayData.size()][3];
    int i = 0;
    
    for (karyawanbaru n : ArrayData){
        String[] arrData = {n.getNama(), n.getID(),n.getKehadiran() , n.getAlasan()};
        objData[i] = arrData;
        i++;
    }
    tablelist = new DefaultTableModel (objData, kolom){
        public boolean inCellEditTable(int rowIndex, int colIndex){
        return false;   
    }
     
    
};
    return tablelist;
}
}