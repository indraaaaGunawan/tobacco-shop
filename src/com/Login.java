/*
-------------------------------------------------------------------
    NAMA    : M. INDRA GUNAWAN
    NRP     : 152020068
    KELAS   : BB Project Tugas Besar
-------------------------------------------------------------------
 */
package com;
public class Login {
    private  static int ID_Custumer;
    private  static String Nama_Custumer;
    private  static String Alamat;
    private  static String No_Tlp;
    private  static String Email;
    private  static String User;
    private  static String Pass;

    public Login() {
    }
    
    public Login(int ID_Custumer){
        this.ID_Custumer = ID_Custumer;
    }

    public Login(String User, String Pass) {
        this.User = User;
        this.Pass = Pass;
    }
    

    public static int getID_Custumer() {
        return ID_Custumer;
    }

    public static void setID_Custumer(int ID_Custumer) {
        Login.ID_Custumer = ID_Custumer;
    }

    public static String getNama_Custumer() {
        return Nama_Custumer;
    }

    public static void setNama_Custumer(String Nama_Custumer) {
        Login.Nama_Custumer = Nama_Custumer;
    }

    public static String getAlamat() {
        return Alamat;
    }

    public static void setAlamat(String Alamat) {
        Login.Alamat = Alamat;
    }

    public static String getNo_Tlp() {
        return No_Tlp;
    }

    public static void setNo_Tlp(String No_Tlp) {
        Login.No_Tlp = No_Tlp;
    }

    public static String getEmail() {
        return Email;
    }

    public static void setEmail(String Email) {
        Login.Email = Email;
    }

    public static String getUser() {
        return User;
    }

    public static void setUser(String User) {
        Login.User = User;
    }

    public static String getPass() {
        return Pass;
    }

    public static void setPass(String Pass) {
        Login.Pass = Pass;
    }

    @Override
    public String toString() {
        return "Login{" + "ID_Custumer=" + ID_Custumer 
                + ", Nama_Custumer=" + Nama_Custumer 
                + ", Alamat=" + Alamat 
                + ", No_Tlp=" + No_Tlp 
                + ", Email=" + Email 
                + ", User=" + User 
                + ", Pass=" + Pass + '}';
    }  
}
