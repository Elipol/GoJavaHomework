package com.ilyapolyanskiy.practice.module05.task053_054;

import com.ilyapolyanskiy.practice.module05.task051_052.Room;
import com.ilyapolyanskiy.practice.module05.task055.HotelDataAccess;

/**
 * Created by ignipolari on 28.03.17.
 */
public class TripAdvisorAPI implements API{
    private HotelDataAccess hda = new HotelDataAccess();

    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return hda.FindByValues(price, persons, city, hotel);
    }
}
