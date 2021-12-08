package in.edu.scse.xim.geospatial.test;

import in.edu.scse.xim.geospatial.distance.*;
import java.util.*;

public class distance {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the co-ordinates of the First location: ");
                System.out.println("Enter the Latitude: ");
                double x;
                Scanner scanned_value = new Scanner(
                                System.in);
                x = scanned_value.nextDouble();
                System.out.println("Enter the Longitude: ");

                double y;
                Scanner scanned_value2 = new Scanner(
                                System.in);
                y = scanned_value.nextDouble();
                System.out.println("Enter the co-ordinates of the Second location: ");
                double a;
                Scanner scanned_value3 = new Scanner(
                                System.in);
                a = scanned_value.nextDouble();
                double b;
                Scanner scanned_value4 = new Scanner(
                                System.in);
                b = scanned_value4.nextDouble();
                double output = point.findDistance(x, y, a, b);

                System.out.println(output + "K.M");
                scanned_value.close();
                scanned_value2.close();
                scanned_value3.close();
                scanned_value4.close();
                sc.close();
        }
}
