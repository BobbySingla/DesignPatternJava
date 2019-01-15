package creationaldesignpattern.singletonpattern;

import java.sql.*;

public class SingletonPatternHome {
    public static void main(String[] args) {
//        SingletonPatternEasy instance = SingletonPatternEasy.getInstance();
//        System.out.println(instance);
//        SingletonPatternEasy instance1 = SingletonPatternEasy.getInstance();
//        System.out.println(instance1);
//        if(instance==instance1){
//            System.out.println("Both instances are same ");
//        }
//        SingletonPatternLazy instance3 = SingletonPatternLazy.getInstance();
//        System.out.println(instance3);
//        SingletonPatternLazy instance4 = SingletonPatternLazy.getInstance();
//        System.out.println(instance4);
//        if (instance3 == instance4) {
//            System.out.println("Both instances are same ");
//        }
        SingletonPatternLazy instance2 = SingletonPatternLazy.getInstance();
        long starttime = System.currentTimeMillis();
        Connection connection = instance2.getConnection();
        long endtime = System.currentTimeMillis();
        System.out.println("Time taken to connect to database : " + (endtime - starttime) + " millisecoonds ");
        Statement sta = null;
        ResultSet rst = null;
        try {
            sta = connection.createStatement();
            //sta.executeUpdate("CREATE TABLE Address(ID INTEGER , City VARCHAR(20))");//"+"City VARCHAR(20))");
            int sql = sta.executeUpdate("INSERT INTO Address VALUES " + "(1,'GZB')");
            int sql1 = sta.executeUpdate("INSERT INTO Address VALUES " + "(2,'UP')");
            int sql2 = sta.executeUpdate("INSERT INTO Address VALUES " + "(3,'Noida')");
            // System.out.println("table created successfully");
            String sql4 = "SELECT * FROM Address";
            ResultSet rs = sta.executeQuery(sql4);
            while (rs.next()) {
                int id = rs.getInt("ID");
                String city = rs.getString("City");
                System.out.print("ID: " + id);
                System.out.print(", City: " + city);
                System.out.println();
            }
            sta.close();

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }
}