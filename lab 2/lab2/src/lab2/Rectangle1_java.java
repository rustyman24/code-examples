package lab2;

import java.text.DecimalFormat;

public class Rectangle1_java {
    static void main(String[] args) {
        //declare 4 variables to hold length
        //breadth, perimeter and area
        double lenght, breadth, area, perimeter;

        // assign values to length and breadth
        DecimalFormat df = new DecimalFormat("00.00");
        lenght=34.55;
        System.out.println("recangle length ="+df.format(lenght));

        breadth=23.67;
        System.out.println("rectangle breadth =" +df.format(breadth) );

        // calculate store and print out and area
        area=lenght * breadth;
        System.out.println("rectangle area =" + df.format(area));

        // calculate, store and print out perimeter
        perimeter = (lenght + breadth) * 2.0;
        System.out.println("rectangle perimeter ="+ df.format(perimeter));
    }

}


