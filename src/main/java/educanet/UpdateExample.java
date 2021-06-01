package educanet;

import java.sql.*;
import java.util.Scanner;

public class UpdateExample {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/luxor", "root", "");

        PreparedStatement preparedStatement = connection
                .prepareStatement("UPDATE luxor.book\n" +
                        "SET price = (price - 1)\n" +
                        "WHERE price % 2 = 0");

        preparedStatement.executeUpdate();
        connection.close();
    }
}
