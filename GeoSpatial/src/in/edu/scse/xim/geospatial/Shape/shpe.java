package in.edu.scse.xim.geospatial.Shape;

import in.edu.scse.xim.geospatial.distance.*;

public class shpe {
    public static double findshape(double a, double b, double c, double d, double e, double f, double g, double h) {
        char shape;
        double area;
        double A1 = a / 57.29577951;
        double B1 = b / 57.29577951;
        double A2 = c / 57.29577951;
        double B2 = d / 57.29577951;
        double A3 = e / 57.29577951;
        double B3 = f / 57.29577951;
        double A4 = g / 57.29577951;
        double B4 = h / 57.29577951;
        String rectangle;
        String sqaure;
        String s;

        double D1 = point.findDistance(A1, B1, A3, B3);
        double D2 = point.findDistance(A2, B2, A4, B4);
        if (D1 == D2) {
            double D3 = point.findDistance(A1, B1, A2, B2);
            double D4 = point.findDistance(A1, B1, A4, B4);

            if (D3 == D4) {

                s = sqaure;
                System.out.println("The entered co-ordinates is in the shape of: " + s);
            } else {
                s = rectangle;
                System.out.println("The entered co-ordinates is in the shape of: " + s);

            }

            if (s == rectangle) {
                area = Rectangle.findRarea(A1, B1, A2, B2, A3, B3, A4, B4);
                System.out.println("The details will be shown within:" + area + "km sqaure");

            } else
                area = Square.findSarea(A1, B1, A2, B2, A3, B3, A4, B4);
            System.out.println("The details will be shown within:" + area + "km sqaure");

        }
        return area;

    }

}
