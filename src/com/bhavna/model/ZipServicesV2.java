package com.bhavna.model;

import java.util.ArrayList;
import java.util.List;

public class ZipServicesV2 extends ZipServicesV1 {
    List<Address> list = new ArrayList<>();

    public void searchAddress(long code) {
        Address data1 = new Address("India", "Maharashtra", "Pune", 200011);
        Address data2 = new Address("India", "Uttarpradesh", "Ghaziabad", 200014);
        Address data3 = new Address("India", "Bihar", "Patna", 200012);
        Address data4 = new Address("India", "Assam", "Guhati", 200013);
        Address data5 = new Address("India", "Himachal Pradesh", "Baddi", 210302);
        Address data6 = new Address("India", "Punjab", "Mohali", 201303);
        Address data7 = new Address("India", "Rajasthan", "Jaisalmer", 201304);
        Address data8 = new Address("UK", "London", "WestMinster", 101304);
        Address data9 = new Address("UK", "London", "Buckingham", 101305);
        Address data10 = new Address("USA", "California", "Sacramento", 101306);
        Address data11 = new Address("USA", "Texas", "Austin", 101307);


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
        for (Address address : list) {
            if (address.getZipCode() == code)
                System.out.println(address);
        }
        System.out.println("No records");
    }

    public void allRecord(String records) {
        for (Address record : list)
            if (records.equals("yes")) {

                System.out.println(record);
            }
        System.out.println("Sorry");
    }

}
