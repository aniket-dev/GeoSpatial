package in.edu.scse.xim.geospatial.shape;

import in.edu.scse.xim.geospatial.distance.*;

public class shape {
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

        double D1 = point.findDistance(A1, B1, A3, B3);
        double D2 = point.findDistance(A2, B2, A4, B4);
        if (D1 == D2) {
            double D3 = point.findDistance(A1, B1, A1, B2);
            double D4 = point.findDistance(A1, B1, A4, B4);
            char rectangle;
            char sqaure;
            if (D3 == D4) {

                shape = sqaure;
            } else
                shape = rectangle;
            if (shape == rectangle) {
                area = findRarea(A1, B1, A2, B2, A3, B3, A4, B4);

            } else
                area = findSarea(A1, B1, A2, B2, A3, B3, A4, B4);
        }

    }
}
