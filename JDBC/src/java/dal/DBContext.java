/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;
/**
 *
 * @author FPTSHOP
 */   
public class DBContext {

    protected Connection connection;

    public DBContext() {
        try {
// Edit URL , username, password to authenticate with your MS SQL Server
            String url = "jdbc:sqlserver://localhost:1433;databaseName= Trading2024; encrypt = false";
            String username = "sa";
            String password = "123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public static void main(String[] args) {
        DBContext dBContext = new DBContext();
        try(Connection con= dBContext.connection) {
            if(con!=null)
                System.out.println("Connect success");
            else
                System.out.println("Connect fail");

        } catch (Exception e) {
        }
    }
}

