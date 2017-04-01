package com.ilyapolyanskiy.practice.module05.task056;

import com.ilyapolyanskiy.practice.module05.task051_052.Room;
import com.ilyapolyanskiy.practice.module05.task053_054.API;
import com.ilyapolyanskiy.practice.module05.task053_054.BookingComAPI;
import com.ilyapolyanskiy.practice.module05.task053_054.GoogleAPI;
import com.ilyapolyanskiy.practice.module05.task053_054.TripAdvisorAPI;
import com.ilyapolyanskiy.practice.module05.task055.HotelDataAccess;

/**
 * Created by ignipolari on 28.03.17.
 */
public class Controller {
    public API apis[] = new API[3];{
        apis[0] = new GoogleAPI();
        apis[1] = new BookingComAPI();
        apis[2] = new TripAdvisorAPI();
    }

    public API api1 = new GoogleAPI();
    public Room[] requestRoom(int price, int persons, String city, String hotel){
        return apis[0].findRooms(price, persons, city, hotel);
    }

    public boolean check(API api1, API api2){
        boolean eq = true;
        for (int i = 0;  i < largestApi(api1, api2); i++)
            if (!api1.findRooms(2000, 3, "Miami", "Hilton")[i].equals(api2.findRooms(2000, 3, "Miami", "Hilton")[i]))
                eq = false;
        return eq;
    }

    private int largestApi(API api1, API api2){
        int pi1lnth = api1.findRooms(2000, 3, "Miami", "Hilton").length, pi2lnth = api2.findRooms(2000, 3, "Miami", "Hilton").length;
        if (pi1lnth > pi2lnth)
            return pi1lnth;
        else
            return pi2lnth;
    }

}
