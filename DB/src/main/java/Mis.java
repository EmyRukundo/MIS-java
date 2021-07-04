import java.sql.*;

class Mis {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mis","root", "");
            System.out.print("Database is connected !");
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from mis");
            while(resultSet.next()){
                System.out.println(resultSet.getString("name"));
            }

            conn.close();
        }
        catch(Exception e) {
            System.out.print("Do not connect to DB - Error:"+e);
        }
    }
}