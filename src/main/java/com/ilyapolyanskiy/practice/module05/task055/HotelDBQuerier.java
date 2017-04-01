package com.ilyapolyanskiy.practice.module05.task055;

import com.ilyapolyanskiy.practice.module05.task051_052.Room;


import java.sql.*;
import java.sql.Date;
import java.util.*;

/**
 * Created by ignipolari on 30.03.17.
 */

public class HotelDBQuerier {
    private static final String URL1 = "";
    private static final String URL = "jdbc:mysql://localhost:3306/HotelSystemDB?useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "123321123qwa0987890";

    private static final String GETBYVAL = "SELECT * FROM HotelSystemDB.Room WHERE price=? AND persons=? AND cityName=? AND hotelName=?";
    private static final String GETBYID = "SELECT * FROM HotelSystemDB.Room WHERE id=?";
    private static final String INSERT_NEW = "insert into HotelSystemDB.Room (id, price, persons, dateAvailableFrom, cityName, hotelName) values(?, ?, ?, ?, ?, ?);";
    private static final String DELETE = "DELETE FROM HotelSystemDB.Room where id=?";

    private Connection connect = null;
    private PreparedStatement prstatement = null;
    private ResultSet resultSet = null;
    private Statement statement =null;

    public void connectionCheck(){
        try {
            connect = DriverManager.getConnection(URL, USER, PASSWORD);
            if (!connect.isClosed())
                System.out.println("Nice!!!\nConnection established!!!");
            else
                System.err.println("ERROR:Connection is unable!!!");
        }catch (Exception e){e.printStackTrace();}
    }

    protected void dBPut(Room room) throws SQLException {
        try{
            connect = DriverManager.getConnection(URL, USER, PASSWORD);

            prstatement = connect.prepareStatement(INSERT_NEW);

            prstatement.setInt(1, room.getId());
            prstatement.setInt(2, room.getPrice());
            prstatement.setInt(3, room.getPersons());
            prstatement.setDate(4, convertFromJUtilToSQLDate(room.getDateAvailableFrom()));
            prstatement.setString(5, room.getCityName());
            prstatement.setString(6, room.getHotelName());

            prstatement.executeUpdate();

            System.out.println("DATABASE HAVE BEEN UPDATED!!\nAdded:\n" + room);
        }catch (Exception e){e.printStackTrace();}
    }

    protected Room[] dBRead(int price, int persons, String city, String hotel){
        try {
            connect = DriverManager.getConnection(URL, USER, PASSWORD);

            prstatement = connect.prepareStatement(GETBYVAL);

            prstatement.setInt(1, price);
            prstatement.setInt(2, persons);
            prstatement.setString(3, city);
            prstatement.setString(4, hotel);

            resultSet = prstatement.executeQuery();

            resultSet.first();
        }catch (Exception e){e.printStackTrace();}

        return roomAssembler(resultSet);
    }

    protected Room[] dBRead(int id){
        try {
            connect = DriverManager.getConnection(URL, USER, PASSWORD);

            prstatement = connect.prepareStatement(GETBYID);
            prstatement.setInt(1, id);
            resultSet = prstatement.executeQuery();

        }catch (Exception e){e.printStackTrace();}

        return roomAssembler(resultSet);
    }

    protected void dBDelete(int id){
        try{
            connect = DriverManager.getConnection(URL, USER, PASSWORD);

            prstatement = connect.prepareStatement(DELETE);
            prstatement.setInt(1, id);
            prstatement.executeUpdate();
        }catch (Exception e){e.printStackTrace();}
    }

    private Room[] roomAssembler(ResultSet resultSet){
        Room rooms[] = new Room[0];
       try {
           if (resultSet != null) {
               resultSet.last();
               int lnth = resultSet.getRow();
               rooms = new Room[lnth];

               resultSet.first();
               for (int i = 0; i < lnth; i++){
                   rooms[i] = new Room();

                   rooms[i].setId(resultSet.getInt(1));
                   rooms[i].setPrice(resultSet.getInt(2));
                   rooms[i].setPersons(resultSet.getInt(3));
                   rooms[i].setDateAvailableFrom(convertFromSQLToJUtilDate(resultSet.getDate(4)));
                   rooms[i].setCityName(resultSet.getString(5));
                   rooms[i].setHotelName(resultSet.getString(6));

                   resultSet.next();
               }

           } else {
           }
       }catch (Exception e){e.printStackTrace();}
       return rooms;
    }

    private java.sql.Date convertFromJUtilToSQLDate(
            java.util.Date javaDate) {
        java.sql.Date sqlDate = null;
        if (javaDate != null) {
            sqlDate = new Date(javaDate.getTime());
        }
        return sqlDate;
    }

    private java.util.Date convertFromSQLToJUtilDate(
            java.sql.Date sqlDate) {
        java.util.Date javaDate = null;
        if (sqlDate != null) {
            javaDate = new Date(sqlDate.getTime());
        }
        return javaDate;
    }
}
