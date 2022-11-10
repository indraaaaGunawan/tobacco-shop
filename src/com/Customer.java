/*
--------------------------------------------------
    NAMA    : M. INDRA GUNAWAN
    NRP     : 152020068
    KELAS   : BB Project Tugas Besar
--------------------------------------------------
 */
package com;
public class Customer {
    private int ID_Custumer;
    private String Nama_Custumer;
    private String Alamat;
    private String No_Tlp;
    private String Email;
    private String Username;
    private String Password;
 
    public Customer() {
    }
    public Customer(int ID_Custumer) {
        this.ID_Custumer = ID_Custumer;
    }
    public Customer(String Nama_Custumer, String Alamat, String No_Tlp, String Email, String Username, String Password) {
        this.Nama_Custumer = Nama_Custumer;
        this.Alamat = Alamat;
        this.No_Tlp = No_Tlp;
        this.Email = Email;
        this.Username = Username;
        this.Password = Password;
    }
    public Customer(int ID_Custumer, String Nama_Custumer, String Alamat, String No_Tlp, String Email, String Username, String Password) {
        this.ID_Custumer = ID_Custumer;
        this.Nama_Custumer = Nama_Custumer;
        this.Alamat = Alamat;
        this.No_Tlp = No_Tlp;
        this.Email = Email;
        this.Username = Username;
        this.Password = Password;
    }
    public int getID_Custumer() {
        return ID_Custumer;
    }
    public void setID_Custumer(int ID_Custumer) {
        this.ID_Custumer = ID_Custumer;
    }
    public String getNama_Custumer() {
        return Nama_Custumer;
    }
    public void setNama_Custumer(String Nama_Custumer) {
        this.Nama_Custumer = Nama_Custumer;
    }
    public String getAlamat() {
        return Alamat;
    }
    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    public String getNo_Tlp() {
        return No_Tlp;
    }
    public void setNo_Tlp(String No_Tlp) {
        this.No_Tlp = No_Tlp;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
    public String getUsername() {
        return Username;
    }
    public void setUsername(String Username) {
        this.Username = Username;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String Password) {
        this.Password = Password;
    }
    @Override
    public String toString() {
        return "Customer{" + "ID_Custumer=" + ID_Custumer 
                + ", Nama_Custumer=" + Nama_Custumer 
                + ", Alamat=" + Alamat 
                + ", No_Tlp=" + No_Tlp 
                + ", Email=" + Email 
                + ", Username=" + Username 
                + ", Password=" + Password + '}';
    }  
}
