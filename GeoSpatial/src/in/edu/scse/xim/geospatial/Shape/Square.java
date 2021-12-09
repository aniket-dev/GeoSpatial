package in.edu.scse.xim.geospatial.Shape;

import in.edu.scse.xim.geospatial.distance.point;

public class Square {
    public static double findSarea(double A1, double B1, double A2, double B2, double A3, double B3, double A4, double B4) {
        double side = point.findDistance(A1, B1, A2, B2);
        double area = side * side;
        return area;

    }

}
