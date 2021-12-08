package in.edu.scse.xim.geospatial.test;

import in.edu.scse.xim.geospatial.distance.*;

import in.edu.scse.xim.geospatial.shape.*;
import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

public class shape {

    public static void main(String[] args) {
        System.out.println("Enter the co-ordinates of the locations that you want the information within:");
        double a, b, c, d, e, f, g, h;
        Scanner scanned_value = new Scanner(System.in);
        a = scanned_value.nextDouble();
        Scanner scanned_value2 = new Scanner(System.in);
        b = scanned_value.nextDouble();
        Scanner scanned_value3 = new Scanner(System.in);
        c = scanned_value.nextDouble();
        Scanner scanned_value4 = new Scanner(System.in);
        d = scanned_value.nextDouble();
        Scanner scanned_value5 = new Scanner(System.in);
        e = scanned_value.nextDouble();
        Scanner scanned_value6 = new Scanner(System.in);
        f = scanned_value.nextDouble();
        Scanner scanned_value7 = new Scanner(System.in);
        g = scanned_value.nextDouble();
        Scanner scanned_value8 = new Scanner(System.in);
        h = scanned_value.nextDouble();
        double s = shape.findshape(a, b, c, d, e, f, g, h);
        System.out.println("The entered co-ordinates is in the shape of: " + s);

    }
}
