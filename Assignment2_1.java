package Assignments.Assignment2_solutions;

import java.util.*;
import java.text.*;

public class Assignment2_1{
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date(dd/mm/yyy): ");
        String dateStr = sc.nextLine();
        System.out.println("Enter time(hr:min:sec): ");
        String dateTime = sc.nextLine();
        System.out.println("Enter meridiem(AM/PM): ");
        String meridiem = sc.nextLine();
        Date date = null;
        Date time = null;
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2= new SimpleDateFormat("kk:mm:ss");
        date = sdf1.parse(dateStr);
        time = sdf2.parse(dateTime);
        System.out.println(date.getDate()+"/"+(date.getMonth()+1)+"/"+(date.getYear()+1900));
        System.out.println((date.getMonth()+1)+"/"+date.getDate()+"/"+(date.getYear()+1900));
        System.out.println((date.getYear()+1900)+"/"+(date.getMonth()+1)+"/"+date.getDate());
        System.out.println();
        System.out.println(time.getHours()+":"+time.getMinutes()+":"+time.getSeconds());
        System.out.println(time.getHours()+":"+time.getMinutes()+":"+time.getSeconds()+" "+meridiem);
        System.out.println(time.getHours()+":"+time.getMinutes());
        System.out.println();
        System.out.println(date.getDate()+"/"+(date.getMonth()+1)+"/"+(date.getYear()+1900)+" "+time.getHours()+":"+time.getMinutes()+":"+time.getSeconds());
        System.out.println((date.getMonth()+1)+"/"+date.getDate()+"/"+(date.getYear()+1900)+" "+time.getHours()+":"+time.getMinutes()+":"+time.getSeconds()+" "+meridiem);
        System.out.println((date.getYear()+1900)+"/"+(date.getMonth()+1)+"/"+date.getDate()+" "+time.getHours()+":"+time.getMinutes());
    }
}