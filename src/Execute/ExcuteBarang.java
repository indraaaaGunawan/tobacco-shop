/*
-------------------------------------------------------------------
    NAMA    : M. INDRA GUNAWAN
    NRP     : 152020068
    KELAS   : BB Project Tugas Besar
-------------------------------------------------------------------
 */
package Execute;
import com.Barang;
import database.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
       

public class ExcuteBarang {
    public List<Barang> getAllBarang(){
        String query = "select * from tbl_barang";
        ConnectionManager conM = new ConnectionManager();
        List<Barang> lstBarang = new ArrayList<Barang>();
        Connection conect = conM.logOn();
        try{
            Statement stm = conect.createStatement();
            ResultSet rset = stm.executeQuery(query);
            while(rset.next()){
                Barang brg = new Barang();
                brg.setID_Barang(rset.getString("ID_Barang"));
                brg.setNama_Barang(rset.getString("Nama_Barang"));
                brg.setJenis_Barang(rset.getString("Jenis_Barang"));
                brg.setHarga_Barang(rset.getInt("Harga_Barang"));
                lstBarang.add(brg);
            }
        }catch(SQLException ex){
            Logger.getLogger(ExcuteBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        conM.logOff();
    return lstBarang;
    }
    //Untuk Menambahkan data atau menginsert data
    public int insertBrg(Barang brg){
        int hasil = 0;
        String query = "Insert into tbl_barang(ID_Barang,Nama_Barang,Jenis_Barang,Harga_Barang)"
                + "value('"+ brg.getID_Barang()+"','"+ 
                brg.getNama_Barang()+"','"+brg.getJenis_Barang()+"',"+brg.getHarga_Barang()+")";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExcuteBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    //Digunakan untuk menghapus data
    public int deleteBrg(String delID_Barang){
        int hasil = 0;
        String query = "delete from tbl_barang where ID_Barang='"+ delID_Barang+"'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExcuteBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    //mengubah data /mengupdate data yang terbaru
    public int updateBrg(Barang newBrg){
        int hasil = 0;
        String query = "update tbl_barang set Nama_Barang='"+newBrg.getNama_Barang()
                +"',Jenis_Barang='"+newBrg.getJenis_Barang()
                +"',Harga_Barang = "+ newBrg.getHarga_Barang()
                +" where ID_Barang = '"+newBrg.getID_Barang()+ "'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExcuteBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    } 
}
