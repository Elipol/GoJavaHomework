package com.ilyapolyanskiy.practice.module05.task057;

import com.ilyapolyanskiy.practice.module05.task051_052.Room;
import com.ilyapolyanskiy.practice.module05.task055.CodeDB;
import com.ilyapolyanskiy.practice.module05.task055.HotelDataAccess;
import com.ilyapolyanskiy.practice.module05.task056.Controller;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by ignipolari on 27.03.17.
 */
public class Main {
    public static void main(String[] args) {
        Date d = new Date();
        Controller controller = new Controller();
        HotelDataAccess dataAccess = new HotelDataAccess();
        Room rooms[] = new Room[5];

        for (int i = 0; i < 5; i++) {
            rooms[i] = new Room(2111011, 2000, 3, d, "Miami", "Hilton");
            dataAccess.save(rooms[i]);
        }

        System.out.println(dataAccess.codeDB.hotelSystemMapCode.get(dataAccess.codeDB.roomCodeCalc( 2000, 3, "Miami", "Hilton")).size());
        System.out.println(controller.requestRoom(2000, 3, "Miami", "Hilton").length);
    }
}
