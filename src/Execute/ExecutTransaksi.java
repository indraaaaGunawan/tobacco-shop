/*
-------------------------------------------------------------------
    NAMA    : M. INDRA GUNAWAN
    NRP     : 152020068
    KELAS   : BB Project Tugas Besar
-------------------------------------------------------------------
 */
package Execute;
import com.Transaksi;
import database.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExecutTransaksi {
     public List<Transaksi> getAllTransaksi(){
        String query = "select * from tbl_transaksi";
        ConnectionManager conM = new ConnectionManager();
        List<Transaksi> lstTransaksi = new ArrayList<Transaksi>();
        Connection conect = conM.logOn();
        try{
            Statement stm = conect.createStatement();
            ResultSet rset = stm.executeQuery(query);
            while(rset.next()){
                Transaksi Tran = new Transaksi();
                Tran.setID_Transaksi(rset.getInt("ID_Transaksi"));
                Tran.setTotal_Barang(rset.getInt("Total_Barang"));
                Tran.setTotal_Harga(rset.getInt("Total_Harga"));
                Tran.setTanggal(rset.getString("Tanggal"));
                Tran.setID_Barang(rset.getString("ID_Barang"));
                Tran.setID_Custumer(rset.getInt("ID_Custumer"));
                
                lstTransaksi.add(Tran);
            }
        }catch(SQLException ex){
            Logger.getLogger(ExecutTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        conM.logOff();
    return lstTransaksi;
    }
    //Untuk Menambahkan data atau menginsert data
    public int insertTrans( Transaksi Tran){
        int hasil = 0;
        String query = "Insert into tbl_transaksi(Total_Barang,Total_Harga,Tanggal,ID_Barang,ID_Custumer)values"
                + "("+ Tran.getTotal_Barang()+","+Tran.getTotal_Harga()
                +",'"+Tran.getTanggal()+"','"+Tran.getID_Barang()+"',"+Tran.getID_Custumer()+")";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecutTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }   
}
