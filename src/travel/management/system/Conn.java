package travel.management.system;
import java.sql.*;
public class Conn {
    Connection C;
    Statement S;
     public Conn() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            C = DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem","root","Mysql");
            S = C.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
