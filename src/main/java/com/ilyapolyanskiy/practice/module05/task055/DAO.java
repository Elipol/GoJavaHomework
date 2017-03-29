package com.ilyapolyanskiy.practice.module05.task055;

import com.ilyapolyanskiy.practice.module05.task051_052.Room;

/**
 * Created by ignipolari on 26.03.17.
 */
public interface DAO {
    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
    Object[] FindByCode(Room room);
}
