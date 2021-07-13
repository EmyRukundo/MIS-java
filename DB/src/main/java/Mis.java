import java.sql.*;

class Mis {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mis","root", "");
            System.out.println("Database is connected !");
            Statement statement = conn.createStatement();
//            ResultSet resultSet = statement.executeQuery("select * from mis");
            String sql = "INSERT INTO mis VALUES('geeks','pass','geeks@gmail.com')";
            String slqUpdate = "UPDATE mis SET name='nerd' WHERE Email='geeks@gmail.com'";
            int resultSet = statement.executeUpdate(slqUpdate);

//            while(resultSet.next()){
//                System.out.println(resultSet.getString("name"));
//            }

            conn.close();
        }
        catch(Exception e) {
            System.out.print("Do not connect to DB - Error:"+e);
        }
    }
}