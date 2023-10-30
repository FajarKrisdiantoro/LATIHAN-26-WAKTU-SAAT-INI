/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectpbogit26;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/**
 *
 * @author LENOVO
 */
public class PROJECTpboGIT26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Date tanggalSekarang = new Date();
        SimpleDateFormat formatTanggal = new SimpleDateFormat("EEEE, dd MMMM yyyy, HH:mm", new Locale("id"));
        String informasi = formatTanggal.format(tanggalSekarang);
        System.out.println("hari ini adalah hari : "+informasi);
    }
    
}
