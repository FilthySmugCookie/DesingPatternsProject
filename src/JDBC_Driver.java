import java.sql.*;

public class JDBC_Driver {
    public static void main(String[] args){
        try{

            Connection connection = DriverManager.getConnection("JDBC URL:jdbc:mysql://localhost:3306/jdbc" , "root","");

            Statement statement = connection.createStatement();
            //                                                  KILL ME BABY ONE MORE TIME
            ResultSet resultSet = statement.executeQuery("select * from reservations");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("Name"));
                System.out.println(resultSet.getString("Duration of stay"));
                System.out.println(resultSet.getString("Type of room"));
                System.out.println(resultSet.getString("Price"));
                System.out.println(resultSet.getString("Free rooms"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
