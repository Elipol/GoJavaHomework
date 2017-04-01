package com.ilyapolyanskiy.practice.module05.task055;

import com.ilyapolyanskiy.practice.module05.task051_052.Room;

import java.sql.SQLException;

/**
 * Created by ignipolari on 26.03.17.
 */
abstract class DAO {
    protected void save(Room room) throws SQLException{};
    protected void delete(Room room){};
    protected void update(Room room) throws SQLException{};
    Room findById(int id){return null;};
}
