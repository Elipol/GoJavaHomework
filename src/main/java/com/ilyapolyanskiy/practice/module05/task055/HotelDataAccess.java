package com.ilyapolyanskiy.practice.module05.task055;

import com.ilyapolyanskiy.practice.module05.task051_052.Room;

import java.util.ArrayList;

/**
 * Created by ignipolari on 26.03.17.
 */
public class HotelDataAccess implements DAO{
    public CodeDB codeDB = new CodeDB();

    public Room save(Room room) {
        codeDB.saveToDB(room);
        System.out.println("Room is successfully saved to DB\n");
        return room;
    }

    public boolean delete(Room room) {
        codeDB.deleteFromDB(room);
        System.out.println("Room is successfully removed\n");
        return true;
    }

    public Room update(Room room) {
        delete(room);
        save(room);

        System.out.println("Room status is updated\n");
        return room;
    }

    public Room findById(long id) {
        return codeDB.hotelSystemMapId.get(id);
    }

    public Room[] FindByCode(Room room) {
        int length = codeDB.hotelSystemMapCode.get(codeDB.roomCodeCalc(room)).size();
        Room[] rooms = new Room[length];
        for (int i = 0; i < length; i++)
            rooms[i] = new Room();

        return codeDB.hotelSystemMapCode.get(codeDB.roomCodeCalc(room)).toArray(rooms);
    }

    public Room[] FindByCode(int price, int persons, String city, String hotel) {
        ArrayList<Room> arrlist = new ArrayList<Room>();

        if(!(codeDB.hotelSystemMapCode.get(codeDB.roomCodeCalc(price, persons, city, hotel)) == null))
            arrlist.addAll(codeDB.hotelSystemMapCode.get(codeDB.roomCodeCalc(price, persons, city, hotel)));

        Room[] rooms = new Room[arrlist.size()];
        for (int i = 0; i < arrlist.size(); i++)
            rooms[i] = new Room();

        rooms = arrlist.toArray(rooms);
        return rooms;
    }


}
