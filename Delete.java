package jdbctutorial;


import java.sql.*;

public class Delete {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/football";
        String uname = "root";
        String pwd = "";
        
        
        try {
            //Load Driver//
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pwd);
            Statement st = con.createStatement();
            String sql = "Delete  from player where club='Chelsea'";
            st.execute(sql);
            con.close();
            
            
            
        } 
        catch (Exception ex) {
            System.out.println(ex);
        }
        
        
        
    }
}
