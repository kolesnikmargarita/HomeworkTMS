package Homework20.AdditionalTask;

import java.sql.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.function.Predicate;

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
        int choice;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        /*statement.executeUpdate("CREATE TABLE students (" +
                    "id int auto_increment primary key, " +
                    "name varchar(50) not null, " +
                    "programmingLanguage varchar(25), " +
                    "groupNumber varchar(10))");
            statement.executeUpdate("CREATE TABLE cities (" +
                    "id int auto_increment primary key, " +
                    "cityName varchar(50) not null, " +
                    "studentId int)");*/
        try {
            do{
                choice = setInt("Add student - 1\nRemove student- 2\nAdd city - 3\nRemove city - 4\nDisplay - 5\nExit - 6", t -> t > 0 && t <= 6);
                switch (choice) {
                    case 1 -> {
                        HashMap<String, String> studentDate = setDate("Name", "ProgrammingLanguage", "GroupNumber");
                        Student student = new StudentBuilder().setName(studentDate.get("Name"))
                                .setProgrammingLanguage(studentDate.get("ProgrammingLanguage"))
                                .setGroupNumber(studentDate.get("GroupNumber")).build();
                        statement.executeUpdate(student.getSQLAddCommand());
                    }
                    case 2 ->
                            statement.executeUpdate(getSQLRemoveCommand("students", "" + setInt("\nId of removable element: ", t -> t > 0)));
                    case 3 -> {
                        HashMap<String, String> cityDate = setDate("Name");
                        City city = new City(cityDate.get("Name"), setInt("Student id: ", t -> t > 0));
                        statement.executeUpdate(city.getSQLAddCommand());
                    }
                    case 4 ->
                            statement.executeUpdate(getSQLRemoveCommand("cities", "" + setInt("\nId of removable element: ", t -> t > 0)));
                    case 5 -> {
                        ResultSet resultSet = statement.executeQuery("SELECT * FROM students LEFT JOIN cities ON students.id = cities.studentId");
                        while (resultSet.next()) {
                            System.out.println(resultSet.getString(1) + " " +
                                    resultSet.getString(2) + " " +
                                    resultSet.getString(3) + " " +
                                    resultSet.getString(4) + " " +
                                    resultSet.getString(6));
                        }
                    }
                }
            } while(choice != 6);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int setInt(String message, Predicate<Integer> predicate) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        int result;
        while(true) {
            if(scanner.hasNextInt()) {
                result = scanner.nextInt();
                if(predicate.test(result)) {
                    return result;
                }
            }
            scanner.nextLine();
            System.out.println("Error. Try again.");
        }
    }

    public static HashMap<String, String> setDate(String ... dateTitles) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> result = new HashMap<>();
        for(String title : dateTitles){
            System.out.println("\n" + title + ": ");
            result.put(title, scanner.nextLine());
        }
        return  result;
    }

    public static String getSQLRemoveCommand(String tableName, String id) {
        return "DELETE FROM " + tableName + " WHERE id = " + id;
    }
}
