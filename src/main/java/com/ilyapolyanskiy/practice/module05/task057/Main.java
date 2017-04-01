package com.ilyapolyanskiy.practice.module05.task057;

import com.ilyapolyanskiy.practice.module05.task051_052.Room;
import com.ilyapolyanskiy.practice.module05.task053_054.API;
import com.ilyapolyanskiy.practice.module05.task053_054.GoogleAPI;
import com.ilyapolyanskiy.practice.module05.task053_054.TripAdvisorAPI;
import com.ilyapolyanskiy.practice.module05.task055.DataBaseManegeAPI;
import com.ilyapolyanskiy.practice.module05.task055.HotelDBQuerier;
import com.ilyapolyanskiy.practice.module05.task056.Controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

/**
 * Created by ignipolari on 30.03.17.
 *
 *  Greetings!!
 * There is a program represent Hotel room service with MySQL DBS and SEO APIs.
 * Update and Read threads are hidden from each other.
 * (DataBaseManageAPI contains protected DB update methods and Search APIs are only for read).
 * Don't forget to change URL value in HotelDBQuerier
 * BEST REGARDS!!!
 *
 * P.S
 * There is no much comments. Sorry about that and wish you lack in parsing, U rely need it.
 *
 * P.P.S.
 * DB Server is on my local host so it's just can be turned off.
 */

public class Main {
    public static void main(String[] args) throws SQLException {
        Room room[] = new Room[15];

        API api1 = new GoogleAPI();
        API api2 = new TripAdvisorAPI();
        DataBaseManegeAPI dbms = new DataBaseManegeAPI();

        dbms.checkConection();

        for (int i = 0; i < 5; i++) {
            room[i] = new Room(2000, 3, new Date(), "Miami", "Hilton");
           // dbms.save(room[i]);

            room[i + 5] = new Room(2200, 3, new Date(), "Miami", "Hilton");
           // dbms.save(room[i + 5]);

            room[i + 10] = new Room(2400, 4, new Date(), "San Francisco", "Hilton");
         //   dbms.save(room[i + 10]);
        }

        room[0].setPrice(2300);
        dbms.update(room[0]);

        Controller controller = new Controller();

        System.out.println("\n\n\nLook what I found for U:\n");
        for (Room r : controller.requestRoom(2300, 3, "Miami", "Hilton"))
            System.out.println(r + "\n");

        if (controller.check(api1, api2))
            System.out.println("APIs throw valid result!");

        dbms.delete(room[0]);

    }
}
