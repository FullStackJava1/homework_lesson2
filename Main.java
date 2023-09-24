import java.sql.PseudoColumnUsage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sacn = new Scanner(System.in);
/*
    //EX 2
         //length and with of room
        double length=10.5;
        double width=12;
        double cal_area=length*width;
        double rec_perim=2*(width+length);

        //EX=3
        //formula for calc area of a circle area =diameter *diameter *pi(π)3.14
        //calc volume valume=area*depth

        System.out.println("Enter diameter pot ");
        double diameter=sacn.nextInt();
        System.out.println("Enter depth pot ");
        double depth=sacn.nextInt();
        double area=3.14*diameter*diameter;
        System.out.println("field of cycle: "+area);
        double volume=area*depth;
        System.out.println("volume of cycle: "+volume);

 */
        //
        //EX 4
    /*
        int lengthMoves=sacn.nextInt();
        int hour;
        int minute;
        hour=lengthMoves/60;
        minute=lengthMoves%60;
        System.out.println("h: "+hour+ " :"+minute);

     */
        //
 /*
        //EX=5 & 6
        System.out.println("Enter number with 4 digits");
        int number = sacn.nextInt();
        System.out.println("right: " + number % 10);
        System.out.println("second right: " + (number / 10) % 10);

  */

    // EX 7
        System.out.println("Enter Number with three digits");
        int tripNumber= sacn.nextInt();
        System.out.println("the thoused Digits is :"+tripNumber/100);
       //  EX 8-9
        System.out.println("Enter Number 10-99 ");
        int twoDNumber= sacn.nextInt();
        System.out.println("the sum of Digits is :"+((10*(twoDNumber%10))+twoDNumber/10));

    }
}