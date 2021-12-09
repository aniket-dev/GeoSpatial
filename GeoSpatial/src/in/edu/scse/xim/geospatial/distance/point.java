package in.edu.scse.xim.geospatial.distance;

public class point {
    public static double findDistance(double x, double y, double a, double b) {
        double L1 = x / 57.29577951; // converting the given values to radians
        double Y1 = y / 57.29577951;
        double L2 = a / 57.29577951;
        double Y2 = b / 57.29577951;
        System.out.println("The given latitude and longitude are: " + L1 + " " + Y1);
        System.out.println("The given latitude and longitude are: " + L2 + " " + Y2);
        double Latitude = L2 - L1;
        double Longitude = Y2 - Y1;
        double D = Math.pow(Math.sin(Latitude / 2), 2)
                + Math.cos(L1) * Math.cos(L2) * Math.pow(Math.sin(Longitude / 2), 2);
        double c = 2 * Math.asin(Math.sqrt(D));
        double r = 6371;
        return (c * r);
    }
}
