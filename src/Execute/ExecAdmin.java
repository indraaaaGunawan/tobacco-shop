/*
-------------------------------------------------------------------
    NAMA    : M. INDRA GUNAWAN
    NRP     : 152020068
    KELAS   : BB Project Tugas Besar
-------------------------------------------------------------------
 */
package Execute;
import com.Admin;
import database.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExecAdmin {
    public List<Admin> getAllAdmin(){
        String query = "select * from tbl_admin";
        ConnectionManager conM = new ConnectionManager();
        List<Admin> lstAdmin = new ArrayList<Admin>();
        Connection conect = conM.logOn();
        try{
            Statement stm = conect.createStatement();
            ResultSet rset = stm.executeQuery(query);
            while(rset.next()){
                Admin adm = new Admin();
                adm.setID_Admin(rset.getString("ID_Admin"));
                adm.setNama_Admin(rset.getString("Nama_Admin"));
                adm.setUsername(rset.getString("Username"));
                adm.setPassword(rset.getString("password"));
                lstAdmin.add(adm);
            }
        }catch(SQLException ex){
            Logger.getLogger(ExecAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        conM.logOff();
    return lstAdmin;
    }
    
    //Untuk Menambahkan data atau menginsert data
    public int insertAdm(Admin adm){
        int hasil = 0;
        String query = "Insert into tbl_admin(ID_Admin,Nama_Admin,Username,Password)values"+ "('"+ adm.getID_Admin()+"','"
                + adm.getNama_Admin()+"','"+adm.getUsername()+"','"+adm.getPassword()+"')";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    //Digunakan untuk menghapus data
    public int deleteAdmin(String delID_Admin){
        int hasil = 0;
        String query = "delete from tbl_admin where ID_Admin='"+ delID_Admin+"'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    //Digunakan untuk mengedit Data/mengupdate data yang terbaru
    public int updateAdm(Admin newAdm){
        int hasil = 0;
        String query = "update tbl_admin set Nama_Admin='"+newAdm.getNama_Admin()
                +"',Username='"+newAdm.getUsername()
                +"',Password='"+ newAdm.getPassword()
                +"'where ID_Admin ='"+newAdm.getID_Admin()+ "'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }   
}
