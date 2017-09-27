package youzhan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/23 0023.
 */
public class T1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.nextLine();

            String []time=s.split(" ");
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy MM dd");
            Date date= null;
            try {
                date = simpleDateFormat.parse(s);
            } catch (ParseException e) {
                e.printStackTrace();
            }
           // System.out.println(date.toString());
            Calendar cal=Calendar.getInstance();
            cal.set(Integer.parseInt(time[0]),Integer.parseInt(time[1]),Integer.parseInt(time[2]));
            System.out.println(cal.getFirstDayOfWeek());


        }
    }
}
