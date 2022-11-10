/*
-------------------------------------------------------------------
    NAMA    : M. INDRA GUNAWAN
    NRP     : 152020068
    KELAS   : BB Project Tugas Besar
-------------------------------------------------------------------
 */
package com;
public class Barang {
    private String ID_Barang;
    private String Nama_Barang;
    private String Jenis_Barang;
    private int Harga_Barang;

    public Barang() {
    }

    public Barang(String ID_Barang) {
        this.ID_Barang = ID_Barang;
    }

    public Barang(String ID_Barang, String Nama_Barang, String Jenis_Barang, int Harga_Barang) {
        this.ID_Barang = ID_Barang;
        this.Nama_Barang = Nama_Barang;
        this.Jenis_Barang = Jenis_Barang;
        this.Harga_Barang = Harga_Barang;
    }

    public String getID_Barang() {
        return ID_Barang;
    }

    public void setID_Barang(String ID_Barang) {
        this.ID_Barang = ID_Barang;
    }

    public String getNama_Barang() {
        return Nama_Barang;
    }

    public void setNama_Barang(String Nama_Barang) {
        this.Nama_Barang = Nama_Barang;
    }

    public String getJenis_Barang() {
        return Jenis_Barang;
    }

    public void setJenis_Barang(String Jenis_Barang) {
        this.Jenis_Barang = Jenis_Barang;
    }

    public int getHarga_Barang() {
        return Harga_Barang;
    }

    public void setHarga_Barang(int Harga_Barang) {
        this.Harga_Barang = Harga_Barang;
    }

    @Override
    public String toString() {
        return "Barang{" + "ID_Barang=" + ID_Barang 
                + ", Nama_Barang=" + Nama_Barang 
                + ", Jenis_Barang=" + Jenis_Barang 
                + ", Harga_Barang=" + Harga_Barang + '}';
    }   
}
