/*
-------------------------------------------------------------------
    NAMA    : M. INDRA GUNAWAN
    NRP     : 152020068
    KELAS   : BB Project Tugas Besar
-------------------------------------------------------------------
 */
package com;
import Execute.ExecutTransaksi;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class ConvertTransaksiToObject {
    public String[][] getTransaksi(){
        List<Transaksi> myTrans = new ArrayList<Transaksi>();
        ExecutTransaksi eTrans = new ExecutTransaksi();
        myTrans = eTrans.getAllTransaksi();
        String[][] dataTransaksi = new String[myTrans.size()][6];
        int i =0;
        for (Transaksi trns : myTrans){
            dataTransaksi[i][0] = ""+trns.getID_Transaksi();
            dataTransaksi[i][1] = ""+trns.getTotal_Barang();
            dataTransaksi[i][2] = ""+trns.getTotal_Harga();
            dataTransaksi[i][3] = trns.getTanggal();
            dataTransaksi[i][4] = trns.getID_Barang();
            dataTransaksi[i][5] = ""+trns.getID_Custumer();
            i++;
        } 
    return dataTransaksi;
    }
}
