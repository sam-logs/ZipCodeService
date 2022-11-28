package com.bhavna.services;

import com.bhavna.model.Area;
import com.bhavna.services.ZipServicesV1;

import java.util.ArrayList;
import java.util.List;

public class ZipServicesV2 extends ZipServicesV1 {
    List<Area> list = new ArrayList<>();

    public void searchAddress(long code) {
        Area data1 = new Area("India", "Maharashtra", "Pune", 200011);
        Area data2 = new Area("India", "Uttarpradesh", "Ghaziabad", 200014);
        Area data3 = new Area("India", "Bihar", "Patna", 200012);
        Area data4 = new Area("India", "Assam", "Guhati", 200013);
        Area data5 = new Area("India", "Himachal Pradesh", "Baddi", 210302);
        Area data6 = new Area("India", "Punjab", "Mohali", 201303);
        Area data7 = new Area("India", "Rajasthan", "Jaisalmer", 201304);
        Area data8 = new Area("UK", "London", "WestMinster", 101304);
        Area data9 = new Area("UK", "London", "Buckingham", 101305);
        Area data10 = new Area("USA", "California", "Sacramento", 101306);
        Area data11 = new Area("USA", "Texas", "Austin", 101307);


        list.add(data1);
        list.add(data2);
        list.add(data3);
        list.add(data4);
        list.add(data5);
        list.add(data6);
        list.add(data7);
        list.add(data8);
        list.add(data9);
        list.add(data10);
        list.add(data11);

        boolean flag = false;
        for (Area address : list) {

            if (address.getZipCode() == code) {
                System.out.println(address);
                flag = false;
                break;
            }
            if (address.getZipCode() != code) {
                flag = true;
            }
        }

            if (flag == true){
                System.out.println("No records Found");
            }


    }

    public void allRecord(String records) {
        for (Area record : list) {
            if (records.equals("yes"))

                System.out.println(record);


        }


    }

}
