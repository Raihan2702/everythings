import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ModelPraktikum {
    //mengkoneksikan ke database. model berisi query2
    public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    public static final String DB_URL = "jdbc:mysql://localhost/praktikum"; //nama database
    public static final  String USER = "root";
    public static final String PASS = "";

    Connection koneksi;
    Statement statement; //untuk penggunaan query

    public ModelPraktikum(){
        try {
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Koneksi Berhasil");
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
    }
}
