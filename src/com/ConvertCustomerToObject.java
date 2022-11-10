/*
-------------------------------------------------------------------
    NAMA    : M. INDRA GUNAWAN
    NRP     : 152020068
    KELAS   : BB Project Tugas Besar
-------------------------------------------------------------------
 */
package com;
import Execute.ExecutCustomer;
import java.util.ArrayList;
import java.util.List;

public class ConvertCustomerToObject {
    public String[][] getCustomer(){
        List<Customer> myCstm = new ArrayList<Customer>();
        ExecutCustomer eCstm = new ExecutCustomer();
        myCstm = eCstm.getAllCustomer();
        String[][] dataCustomer = new String[myCstm.size()][7];
        int i =0;
        for (Customer Cstm : myCstm){
            dataCustomer[i][0] = ""+Cstm.getID_Custumer();
            dataCustomer[i][1] = Cstm.getNama_Custumer();
            dataCustomer[i][2] = Cstm.getAlamat();
            dataCustomer[i][3] = Cstm.getNo_Tlp();
            dataCustomer[i][4] = Cstm.getEmail();
            dataCustomer[i][5] = Cstm.getUsername();
            dataCustomer[i][6] = Cstm.getPassword();
            i++;
        } 
    return dataCustomer;
    }
}
