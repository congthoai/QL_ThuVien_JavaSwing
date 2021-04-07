/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ql_thuvien;

import GUI.jfLogin;


/**
 *
 * @author NCT
 */
public class QL_ThuVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//      int r =  J2SQL.Instance().ExecuteNonQuery("Insert into LoaiDocGia values(?,?,?)", new Object[]{4,"Loai dg 4", 4});
//        System.out.println(" R:  "+ r);
        jfLogin l = new  jfLogin();
        l.setVisible(true);
      
    }
    
}
