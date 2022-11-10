/*
-------------------------------------------------
    NAMA    : M. INDRA GUNAWAN
    NRP     : 152020068
    KELAS   : BB Project Tugas Besar
-------------------------------------------------
 */
package Execute;
import com.Customer;
import database.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
    
public class ExecutCustomer {
    public List<Customer> getAllCustomer(){
        String query = "select * from tbl_custumer";
        ConnectionManager conM = new ConnectionManager();
        List<Customer> lstCustomer = new ArrayList<Customer>();
        Connection conect = conM.logOn();
        try{
            Statement stm = conect.createStatement();
            ResultSet rset = stm.executeQuery(query);
            while(rset.next()){
                Customer Cus = new Customer();
                Cus.setID_Custumer(rset.getInt("ID_Custumer"));
                Cus.setNama_Custumer(rset.getString("Nama_Custumer"));
                Cus.setAlamat(rset.getString("Alamat"));
                Cus.setNo_Tlp(rset.getString("No_Tlp"));
                Cus.setEmail(rset.getString("Email"));
                Cus.setUsername(rset.getString("Username"));
                Cus.setPassword(rset.getString("Password"));
                
                lstCustomer.add(Cus);
            }
        }catch(SQLException ex){
            Logger.getLogger(ExecutCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        conM.logOff();
    return lstCustomer;
    }
    
    //Untuk Menambahkan data atau menginsert data
    public int insertCustmr(Customer Cstm){
        int hasil = 0;
        String query = "Insert into tbl_custumer(Nama_Custumer,Alamat, No_Tlp, Email ,Username,Password)values"+ 
                "('"+ Cstm.getNama_Custumer()+
                "','"+ Cstm.getAlamat()+"','"+Cstm.getNo_Tlp()+"','"+Cstm.getEmail()+
                "','"+Cstm.getUsername()+"','"+Cstm.getPassword()+"')";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecutCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
     //Digunakan untuk menghapus data
    public int deleteCustomer(String delID_cus){
        int hasil = 0;
        String query = "delete from tbl_custumer where ID_Custumer="+ delID_cus+"";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecutCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    //Digunakan untuk mengedit Data/mengupdate data yang terbaru
    public int updateCstmr(int id_cus, String Nama_Cus,String alamat, String noTlp, String email, String Username, String Password ){
        int hasil = 0;
        String query = "Update tbl_custumer SET Nama_Custumer='"+Nama_Cus+"',Alamat='" +alamat+
                "',No_Tlp='"+noTlp+"', Email='"+email+"', Username='"+Username+
                "', Password='"+Password+"' WHERE ID_Custumer="+id_cus+"";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecutCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
    return hasil;
    }   
}
