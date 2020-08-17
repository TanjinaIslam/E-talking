package view;

    import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	
	public class MyConnection {

	      public static boolean getConnection(){
	     
	         final String cs = "jdbc:mysql://localhost:3306/java_login_register";
	         final String user = "root";
	         final String pass = "";
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	             try (Connection con = DriverManager.getConnection(cs, user, pass)) {
	                 PreparedStatement ps=con.prepareStatement("INSERT INTO registration (FirstName,LastName,UserName,E-mail,Password,Date,User) VALUES (?,?,?,?,?,?,?)");
	                 ps.setString(1, "Iqra");
	                 ps.setString(2, "Islam");
	                 ps.setString(3, "IqraIslam");
	                 ps.setString(4, "iqra@gmail.com");
	                 ps.setString(5, "1070");
	                 ps.setString(6, "11-08-20");
	                 ps.setString(7, "Student");
	                 ps.execute();
	             }
	             System.out.println("Registered");
	             return true;
	        } 
	        catch (ClassNotFoundException | SQLException ex)
	        {
	            System.out.println(ex);
	             return false;
	        }
	      }
	        public static void main(String args[]) {
	            getConnection();
	        }
	       
	}

