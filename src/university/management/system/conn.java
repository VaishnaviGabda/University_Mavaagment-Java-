
package university.management.system;
import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            String url="jdbc:mysql://localhost:3306/ums";
		String uname="root";
		String pass="system";
		//load the drivers
		Class.forName("com.mysql.jdbc.Driver");
		 c = DriverManager.getConnection(url,uname,pass);
                 s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
