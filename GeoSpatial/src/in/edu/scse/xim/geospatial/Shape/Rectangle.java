package in.edu.scse.xim.geospatial.Shape;

import in.edu.scse.xim.geospatial.distance.point;

public class Rectangle {
    public static double findRarea(double A1, double B1, double A2, double B2, double A3, double B3, double A4,
            double B4) {
        double length = point.findDistance(A1, B1, A2, B2);
        double breadth = point.findDistance(A1, B1, A4, B4);
        double area = length * breadth;
        return area;
    }
}
