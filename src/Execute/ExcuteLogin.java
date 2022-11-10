/*
-------------------------------------------------------------------
    NAMA    : M. INDRA GUNAWAN
    NRP     : 152020068
    KELAS   : BB Project Tugas Besar
-------------------------------------------------------------------
 */
package Execute;
import com.Admin;
import com.Login;
import database.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.logging.Level;
import java.util.logging.Logger;
   
public class ExcuteLogin {
    //Controller untuk login dari sisi User
    public int getAllLogin(Login Lgn){
        ConnectionManager conM = new ConnectionManager();
        int hasil = 0;
        Connection conect = conM.logOn();
        try{
            String query = "SELECT * FROM tbl_custumer WHERE  Username='"+Lgn.getUser()+"' AND Password='"+Lgn.getPass()+"'";
            Statement stm = conect.createStatement();
            ResultSet rset = stm.executeQuery(query);
            while(rset.next()){
                    Lgn.setID_Custumer(rset.getInt("ID_Custumer"));
                    Lgn.setNama_Custumer(rset.getString("Nama_Custumer"));
                    Lgn.setAlamat(rset.getString("Alamat"));
                    Lgn.setEmail(rset.getString("Email"));
                    Lgn.setNo_Tlp(rset.getString("No_Tlp"));
                    Lgn.setUser(rset.getString("Username"));
                    Lgn.setPass(rset.getString("Password"));
                    hasil = 1;
            }
        }catch(SQLException ex){
            Logger.getLogger(ExcuteLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        conM.logOff();
    return hasil;
    }
    //Controller untuk login dari sisi Admin
    public int getAdmin(Admin adm){
        ConnectionManager conM = new ConnectionManager();
        int hasil = 0;
        Connection conect = conM.logOn();
        try{
            String query = "SELECT * FROM tbl_admin WHERE  Username='"+adm.getUsername()+"' AND Password='"+adm.getPassword()+"'";
            Statement stm = conect.createStatement();
            ResultSet rset = stm.executeQuery(query);
            while(rset.next()){
                    adm.setID_Admin(rset.getString("ID_Admin"));
                    adm.setNama_Admin(rset.getString("Nama_Admin"));
                    adm.setUsername(rset.getString("Username"));
                    adm.setPassword(rset.getString("Password"));
                    hasil = 1;
            }
        }catch(SQLException ex){
            Logger.getLogger(ExcuteLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        conM.logOff();
    return hasil;
    }
}
