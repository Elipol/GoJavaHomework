package com.ilyapolyanskiy.practice.module05.task055;

import com.ilyapolyanskiy.practice.module05.task051_052.Room;

import java.sql.SQLException;

/**
 * Created by ignipolari on 26.03.17.
 */
public class HotelDataAccess extends DAO{
    HotelDBQuerier rass = new HotelDBQuerier();
    @Override
    protected void save(Room room) throws SQLException {rass.dBPut(room);}

    @Override
    protected void delete(Room room) {rass.dBDelete(room.getId());}

    @Override
    protected void update(Room room) throws SQLException {rass.dBDelete(room.getId()); rass.dBPut(room);}

    @Override
    public Room findById(int id) {return rass.dBRead(id)[0];}

    public Room[] FindByValues(int price, int persons, String city, String hotel) {
        return rass.dBRead(price, persons, city, hotel);
    }
}
