package SQL;

import java.sql.*;

public class SqlJDBC {
    public static void main(String[] args) {
        String dbUrl="jdbc:mysql://3.237.189.167:3306/syntaxhrm_mysql";
        String userName="syntax_hrm";
        String password="syntaxhrm123";
        try {
            Connection connection= DriverManager.getConnection(dbUrl,userName,password);

            Statement statement=connection.createStatement();
            String query="select * from person";

            ResultSet resultSet=statement.executeQuery(query);
            while (resultSet.next()){
                String firstName=resultSet.getString("firstName");
                String lastName=resultSet.getString("lastName");
                String age=resultSet.getString("age");
                System.out.println(firstName+" "+lastName+" "+age );
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
