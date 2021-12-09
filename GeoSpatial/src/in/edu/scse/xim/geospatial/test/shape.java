package in.edu.scse.xim.geospatial.test;

import in.edu.scse.xim.geospatial.Shape.*;

import java.util.*;

public class shape {

    public static void main(String[] args) {
        System.out.println("Enter the co-ordinates of the locations that you want the information within:");
        double a, b, c, d, e, f, g, h;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        Scanner sc2 = new Scanner(System.in);
        b = sc2.nextDouble();
        Scanner sc3 = new Scanner(System.in);
        c = sc3.nextDouble();
        Scanner sc4 = new Scanner(System.in);
        d = sc4.nextDouble();
        Scanner sc5 = new Scanner(System.in);
        e = sc5.nextDouble();
        Scanner sc6 = new Scanner(System.in);
        f = sc6.nextDouble();
        Scanner sc7 = new Scanner(System.in);
        g = sc7.nextDouble();
        Scanner sc8 = new Scanner(System.in);
        h = sc8.nextDouble();
        double s = shpe.findshape(a, b, c, d, e, f, g, h);
        System.out.println(s);
        sc.close();
        sc2.close();
        sc3.close();
        sc4.close();
        sc5.close();
        sc6.close();
        sc7.close();
        sc8.close();

    }
}
