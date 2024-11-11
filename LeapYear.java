import java.util.Scanner;

public class LeapYear {
    public static void main(String[]args){
        Scanner keyboard=new Scanner(System.in);
        int year;
        System.out.println("please enter the year");
        year=keyboard.nextInt();
        if((year%4==0 && year%100!=0)||(year%400==0)){
            System.out.println("this is a leap year");
        }
        else {
            System.out.println("it is not a leap year");
        }
    }
}
