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
        Statement sta;
        ResultSet rst;
        try {
            sta = connection.createStatement();
            sta.executeUpdate("CREATE TABLE Address6(ID INT, City VARCHAR(20))");//"+"City VARCHAR(20))");
           // sta.executeUpdate("INSERT INTO Address6 VALUES (12,'GZB')");
            System.out.println("table craeted successfully");
            sta.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}