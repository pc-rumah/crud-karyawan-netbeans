/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author rokin
 */
public class Koneksi {
    Connection koneksi;
    
   public static Connection Koneksi() {
       try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/db_karyawan", "root", "");
           
           return koneksi;
       }
       catch(Exception e) {
           JOptionPane.showMessageDialog(null, e);
           
           return null;
       }
   }
}
