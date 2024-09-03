package Application.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Gestionnaire_De_Connection {

    private Connection connection;
    public static int personnel_connecte;//= -1;
    public static String etudiant_connecte;//= "H1897";
    public static String prof_connecte;//= "P1";

    public static String nom_connecte;//= "null";

    public Connection getConnection() {

       

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/system_scolarite?characterEncoding=utf8&useSSL=false&useUnicode=true&user=root&password=wagawaga");

          
        } catch (Exception e) {
            e.printStackTrace();
        }


        return connection;
    }


}
