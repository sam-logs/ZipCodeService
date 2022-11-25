import com.bhavna.services.ZipServicesV2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        ZipServicesV2 obj = new ZipServicesV2();
        try{
        System.out.println("Enter the zip code");
        long code = sc.nextLong();
        obj.searchAddress(code);
        }
        catch (Exception e) {
            System.out.println("Enter Only Numeric Value!!!");
        }

            System.out.println("*******Display All the Records***********");
            String records = sc.next();
            obj.allRecord(records);

    }
}