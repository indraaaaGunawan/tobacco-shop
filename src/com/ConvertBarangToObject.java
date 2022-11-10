/*
-------------------------------------------------------------------
    NAMA    : M. INDRA GUNAWAN
    NRP     : 152020068
    KELAS   : BB Project Tugas Besar
-------------------------------------------------------------------
 */
package com;
import Execute.ExcuteBarang;
import java.util.ArrayList;
import java.util.List;

public class ConvertBarangToObject {
    public String[][] getBarang(){
        List<Barang> myBrg = new ArrayList<Barang>();
        ExcuteBarang eBrg = new ExcuteBarang();
        myBrg = eBrg.getAllBarang();
        String[][] databarang = new String[myBrg.size()][4];
        int i =0;
        for (Barang brg : myBrg){
            databarang[i][0] = brg.getID_Barang();
            databarang[i][1] = brg.getNama_Barang();
            databarang[i][2] = brg.getJenis_Barang();
            databarang[i][3] = ""+brg.getHarga_Barang();
            i++;
        } 
    return databarang;
    }
}
