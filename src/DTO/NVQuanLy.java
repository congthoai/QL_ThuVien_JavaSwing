/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    /*
VD: Bat buoc nguoi dung phai dang nhap khi click vao 1 chuc nang o mainmenu
                    *********
    
        private void btSachMousePressed(java.awt.event.MouseEvent evt) {                                    
        if ( !jfLogin.NV.Is_User() ){ 
            jfLogin l = new jfLogin();
            l.setVisible(true);
            l.setLocationRelativeTo(null);
            this.dispose();
        }else{
            QLSach2 s = new QLSach2();
            s.setVisible(true);
            s.setLocationRelativeTo(null);
            this.dispose();
        }
    }  
                  *********
                    CSDL
-- Tao bang NhanVienQL bao gom quantrivien + thu thu
CREATE TABLE NVQuanLy(
   MaQL INT IDENTITY(1,1) NOT NULL,
   TenDangNhapQL VARCHAR (20) NOT NULL,
   MatKhauQL VARCHAR (20) NOT NULL,
   HoTen  VARCHAR (20) NOT NULL,
   LoaiQL INT NOT NULL,   -- 1= quan tri vien, 2 = thu thu
   PRIMARY KEY (MaQL)
);

-- insertdata
INSERT INTO [dbo].[NVQuanLy] ([TenDangNhapQL], [MatKhauQL],[HoTen], [LoaiQL] ) VALUES ('admin', '123456','Tran Huu Phuoc', 1);
INSERT INTO [dbo].[NVQuanLy] ([TenDangNhapQL], [MatKhauQL],[HoTen], [LoaiQL] ) VALUES ('phuoctran', '12345678','Phuoc Huu Tran', 2);
INSERT INTO [dbo].[NVQuanLy] ([TenDangNhapQL], [MatKhauQL],[HoTen], [LoaiQL] ) VALUES ('tranphuoc', '12345678','Huu phuoc Tran', 2);

    */




package DTO;
import DAO.J2SQL;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HaJiWon
 */
public class NVQuanLy {
     private int MaQL, LoaiQL;
     private String TenDangNhapQL, MatKhauQL, HoTen;

     public NVQuanLy(){
     MaQL = 0;
     LoaiQL = 0;
     TenDangNhapQL = "khach";
     MatKhauQL = "";
     HoTen = "khach";
     }
     
     public int getLoaiQL(){
        return LoaiQL;
     }
     
     public boolean Is_User(){
         if(MaQL > 0)
         {
             System.out.println("Is_User() == TRUE ");
             return true;
         }
         else
             System.out.println("Is_User() == FALSE ");
             return  false;
     }
     
     public void Login(String iTenDangNhapQL, String iMatKhauQL){
         TenDangNhapQL = iTenDangNhapQL;
         MatKhauQL = iMatKhauQL;
     }     
     
     public boolean Login_Success() throws SQLException {
        String query = "SELECT * FROM NVQuanLy WHERE [TenDangNhapQL] = '"+TenDangNhapQL+"' AND [MatKhauQL] = '"+MatKhauQL+"'"; 
        ResultSet rs = J2SQL.Instance().ExecuteQuery(query,null);
          rs.next();
        try {
             MaQL = rs.getInt("MaQL");
             LoaiQL =rs.getInt("LoaiQL");
             TenDangNhapQL = rs.getString("TenDangNhapQL");
             MatKhauQL = rs.getString("MatKhauQL");
             HoTen = rs.getString("HoTen");
             System.out.println("Hi ! "+ rs.getString("TenDangNhapQL"));
             return true;
        } catch (Exception e) {
             System.out.println("chia buon, ko co !");
             return false;
        } 
    }
     
}



