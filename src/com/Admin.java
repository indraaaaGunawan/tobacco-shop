/*
-------------------------------------------------------------------
    NAMA    : M. INDRA GUNAWAN
    NRP     : 152020068
    KELAS   : BB Project Tugas Besar
-------------------------------------------------------------------
 */
package com;
public class Admin {
    private  String ID_Admin;
    private  String Nama_Admin;
    private  String Username;
    private  String Password;
    public Admin() {
    }

    public Admin(String ID_Admin) {
        this.ID_Admin = ID_Admin;
    }

    public Admin(String ID_Admin, String Nama_Admin, String Username, String Password) {
        this.ID_Admin = ID_Admin;
        this.Nama_Admin = Nama_Admin;
        this.Username = Username;
        this.Password = Password;
    }

    public Admin(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }
    

    public String getID_Admin() {
        return ID_Admin;
    }

    public void setID_Admin(String ID_Admin) {
        this.ID_Admin = ID_Admin;
    }

    public String getNama_Admin() {
        return Nama_Admin;
    }

    public void setNama_Admin(String Nama_Admin) {
        this.Nama_Admin = Nama_Admin;
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
        return "Admin{" + "ID_Admin=" + ID_Admin 
                + ", Nama_Admin=" + Nama_Admin 
                + ", Username=" + Username 
                + ", Password=" + Password + '}';
    }   
}
