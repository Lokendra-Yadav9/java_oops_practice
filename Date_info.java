import java.util.Scanner;
import java.util.Calendar;
public class Date_info {
    void FindDay(int month,int Day,int year){
        Calendar c1=Calendar.getInstance();
        System.out.println(c1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int day= sc.nextInt();
        int month= sc.nextInt();
        int year= sc.nextInt();
        Date_info d1=new Date_info();
        d1.FindDay(month,day,year);
    }
}
