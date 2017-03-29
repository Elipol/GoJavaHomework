package com.ilyapolyanskiy.practice.module05.task053_054;

import com.ilyapolyanskiy.practice.module05.task051_052.Room;

/**
 * Created by ignipolari on 26.03.17.
 */
public interface API {
    public Room[] findRooms(int price, int persons, String city, String hotel);
}
