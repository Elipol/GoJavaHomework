package com.ilyapolyanskiy.practice.module05.task055;

import com.ilyapolyanskiy.practice.module05.task051_052.Room;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ignipolari on 26.03.17.
 */
public class CodeDB {
    public HashMap<Integer, ArrayList<Room>> hotelSystemMapCode = new HashMap<Integer, ArrayList<Room>>();
    protected HashMap<Long, Room> hotelSystemMapId = new HashMap<Long, Room>();

    protected void saveToDB(Room room) {
        hotelSystemMapCode.put(roomCodeCalc(room), roomListAddition(room, true));
        hotelSystemMapId.put(room.getId(), room);
    }

    public void deleteFromDB(Room room) {
        hotelSystemMapCode.put(roomCodeCalc(room), roomListAddition(room, false));
        hotelSystemMapId.remove(room.getId());
    }


    public int intSumOfChars(String string){
        char[] charArr = string.toCharArray();
        int summ = 0;

        for (int i = 0; i < charArr.length; i++)
            summ += (int)charArr[i];
        return summ;
    }

    public int roomCodeCalc(Room room){
        int roomCode = 31 * (room.getPersons() + room.getPrice() + intSumOfChars(room.getCityName()) + intSumOfChars(room.getHotelName()));
        return roomCode;
    }

    public int roomCodeCalc(int price, int persons, String city, String hotel) {
        int roomCode = 31 * (persons + price + intSumOfChars(city) + intSumOfChars(hotel));
        return roomCode;
    }

    protected ArrayList<Room> roomListAddition(Room room, boolean oper){
        ArrayList<Room> roomsList = new ArrayList<Room>();
        if(!(hotelSystemMapCode.get(roomCodeCalc(room)) == null) && !hotelSystemMapCode.get(roomCodeCalc(room)).isEmpty())
            roomsList.addAll(hotelSystemMapCode.get(roomCodeCalc(room)));

        if (oper)
            roomsList.add(room);

        else if (!roomsList.isEmpty())
            for (int i = 0; i < roomsList.size(); i++)
                if(roomsList.get(i).getId() == room.getId())
                    roomsList.remove(i);

        return roomsList;
    }

}