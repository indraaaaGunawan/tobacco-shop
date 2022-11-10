/*
-------------------------------------------------------------------
    NAMA    : M. INDRA GUNAWAN
    NRP     : 152020068
    KELAS   : BB Project Tugas Besar
-------------------------------------------------------------------
 */
package com;
public class Transaksi {
   private int ID_Transaksi;
   private int Total_Barang;
   private int Total_Harga;
   private String Tanggal;
   private String ID_Barang;
   private int ID_Custumer;

    public Transaksi() {
    }

    public Transaksi(int ID_Transaksi) {
        this.ID_Transaksi = ID_Transaksi;
    }

    public Transaksi(int Total_Barang, int Total_Harga, String Tanggal, String ID_Barang, int ID_Custumer) {
        this.Total_Barang = Total_Barang;
        this.Total_Harga = Total_Harga;
        this.Tanggal = Tanggal;
        this.ID_Barang = ID_Barang;
        this.ID_Custumer = ID_Custumer;
    }

    public int getID_Transaksi() {
        return ID_Transaksi;
    }

    public void setID_Transaksi(int ID_Transaksi) {
        this.ID_Transaksi = ID_Transaksi;
    }

    public int getTotal_Barang() {
        return Total_Barang;
    }

    public void setTotal_Barang(int Total_Barang) {
        this.Total_Barang = Total_Barang;
    }

    public int getTotal_Harga() {
        return Total_Harga;
    }

    public void setTotal_Harga(int Total_Harga) {
        this.Total_Harga = Total_Harga;
    }

    public String getTanggal() {
        return Tanggal;
    }

    public void setTanggal(String Tanggal) {
        this.Tanggal = Tanggal;
    }

    public String getID_Barang() {
        return ID_Barang;
    }

    public void setID_Barang(String ID_Barang) {
        this.ID_Barang = ID_Barang;
    }

    public int getID_Custumer() {
        return ID_Custumer;
    }

    public void setID_Custumer(int ID_Custumer) {
        this.ID_Custumer = ID_Custumer;
    }

    @Override
    public String toString() {
        return "Transaksi{" + "ID_Transaksi=" + ID_Transaksi 
                + ", Total_Barang=" + Total_Barang 
                + ", Total_Harga=" + Total_Harga
                + ", Tanggal=" + Tanggal 
                + ", ID_Barang=" + ID_Barang 
                + ", ID_Custumer=" + ID_Custumer + '}';
    } 
}
