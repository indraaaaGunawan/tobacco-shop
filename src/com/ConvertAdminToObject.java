/*
-------------------------------------------------------------------
    NAMA    : M. INDRA GUNAWAN
    NRP     : 152020068
    KELAS   : BB Project Tugas Besar
-------------------------------------------------------------------
 */
package com;
import Execute.ExecAdmin;
import java.util.ArrayList;
import java.util.List;

public class ConvertAdminToObject {
    public String[][] getAdmin(){
        List<Admin> myAdm = new ArrayList<Admin>();
        ExecAdmin eAdm = new ExecAdmin();
        myAdm = eAdm.getAllAdmin();
        String[][] dataAdmin= new String[myAdm.size()][4];
        int i =0;
        for (Admin adm : myAdm){
            dataAdmin[i][0] = adm.getID_Admin();
            dataAdmin[i][1] = adm.getNama_Admin();
            dataAdmin[i][2] = adm.getUsername();
            dataAdmin[i][3] = adm.getPassword();
            i++;
        } 
    return dataAdmin;
    }
}
