package com.ilyapolyanskiy.practice.module05.task055;

import com.ilyapolyanskiy.practice.module05.task051_052.Room;

import java.sql.SQLException;

/**
 * Created by ignipolari on 31.03.17.
 */
public class DataBaseManegeAPI extends HotelDataAccess{
    @Override
    public void delete(Room room) {
        super.delete(room);
    }

    @Override
    public void save(Room room) throws SQLException {
        super.save(room);
    }

    @Override
    public void update(Room room) throws SQLException {
        super.update(room);
    }

    public void checkConection(){
        super.rass.connectionCheck();
    }
}
