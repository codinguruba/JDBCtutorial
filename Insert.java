package jdbctutorial;

import java.sql.*;
import java.util.Scanner;  //you can use import java.util.*; too



public class Insert {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/football";
        String uname = "root";
        String pwd = "";

        try {
            //Load Driver//
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pwd);
            //writing an sql query to insert name address and club //
            String sql = "INSERT INTO player (name, address, club) "
                    + "VALUES (?,?,?)";
            //Enter your fav footballer name , address and club 
            // Im writing Mbappe here  >_< :p //
            System.out.println("Enter name , address and club");
            Scanner ob = new Scanner(System.in);
            String name = ob.nextLine();
            String address = ob.nextLine();
            String club = ob.nextLine();
            
            // Prepared statement//
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,name);   // this name , address and club is the string i defined earlier//
            pst.setString(2, address);
            pst.setString(3, club);
            pst.executeUpdate(); // Now our table gets updated
            con.close();
            

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
