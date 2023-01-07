// Get all records//


import java.sql.*;

public class Tutorial1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/football";
        String uname = "root";
        String pwd = "";
        
        
        try {
            //Load Driver//
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pwd);
            Statement st = con.createStatement();
            String sql = "select * from player ";
            ResultSet rs = st.executeQuery(sql);
            
            
            while(rs.next()){
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("address"));
                System.out.println(rs.getString("club"));
            }
            //connection close//
            con.close();
            
            
            
        } 
        catch (Exception ex) {
            System.out.println(ex);
        }
        
        
        
    }
}
