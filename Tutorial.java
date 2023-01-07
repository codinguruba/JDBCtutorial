package jdbctutorial;

import java.sql.*;

public class Tutorial {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/football";
        String uname = "root";
        String pwd = "";
        
        
        try {
            //Load Driver//
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pwd);
            Statement st = con.createStatement();
            //print those name whose club is United//
            String sql = "select name from player where club='PSG'";
            ResultSet rs = st.executeQuery(sql);
            
            
            while(rs.next()){
                System.out.println(rs.getString("name"));
            }
            //connection close//
            con.close();
            
            
            
        } 
        catch (Exception ex) {
            System.out.println(ex);
        }
        
        
        
    }
}
