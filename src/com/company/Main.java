package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws SQLException {
        ArrayList<Employee> employees = new ArrayList<>();
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/my", "root", "");
        PreparedStatement statement = connection.prepareStatement("SELECT * from s where age > ? ");
        statement.setInt(1,24);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            employees.add(new Employee(resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getInt(4),
                    resultSet.getDouble(5)));
        }
        Collections.sort(employees);
        System.out.println(employees);
    }
}
