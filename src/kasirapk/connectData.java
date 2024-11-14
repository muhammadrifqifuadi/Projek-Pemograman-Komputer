package kasirapk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectData {
    private static final String URL = "jdbc:mysql://localhost:3306/db_kasir";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
        public static Connection getConnection() {
            Connection connection = null;
            try {
                // Mendaftarkan driver JDBC agar bisa terkoneksi
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Membuat koneksi
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Koneksi ke database berhasil!");
            } catch (ClassNotFoundException e) {
                System.out.println("Driver MySQL JDBC tidak ditemukan");
                e.printStackTrace();
            } catch (SQLException e) {
                System.out.println("Koneksi ke database gagal!");
                e.printStackTrace();
            }
            return connection;
        }
    
}
