package Homework20.MainTask;

import java.sql.*;

public class Main {

    public static final String NAME_USER = "root";
    public static final String PASSWORD = "HelloSQL2023!#";
    public static final String URL = "jdbc:mysql://localhost:3306/mysql";
    public static Connection connection;
    public static Statement statement;

    static {
        try {
            connection = DriverManager.getConnection(URL, NAME_USER, PASSWORD);
            statement = connection.createStatement();
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            /*statement.executeUpdate("CREATE TABLE students (" +
                    "id int auto_increment primary key, " +
                    "name varchar(50) not null, " +
                    "programmingLanguage varchar(25), " +
                    "groupNumber varchar(10))");*/
            /*statement.executeUpdate("INSERT INTO students (name, programmingLanguage, groupNumber) value ('Mariya', 'Java', 'C69'), " +
                    "('Alexandr', 'Java', 'C69'), " +
                    "('Ivan', 'Java', 'C69'), " +
                    "('Marina', 'Java', 'C69'), " +
                    "('Mikola', 'Java', 'C69'), " +
                    "('Elena', 'Java', 'C69'), " +
                    "('Kate', 'Java', 'C69'), " +
                    "('Margarita', 'Java', 'C69')");
            statement.executeUpdate("INSERT INTO students (name) value ('Mariya'), " +
                    "('Alexandr'), " +
                    "('Ivan'), " +
                    "('Marina'), " +
                    "('Mikola'), " +
                    "('Elena'), " +
                    "('Kate'), " +
                    "('Margarita')");*/
            ResultSet resultSet = statement.executeQuery("SELECT * FROM students");
            while(resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " +
                        resultSet.getString(2) + " " +
                        resultSet.getString(3) + " " +
                        resultSet.getString(4));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
