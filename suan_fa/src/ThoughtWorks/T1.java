package ThoughtWorks;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/9 0009.
 */
class Place{
    String name;
    int totalPrice=0;
    public Place(String name) {
        this.name = name;
    }

    public int getPrice(String timeStr){

        int time=Integer.parseInt(timeStr);
        if(time<9)return -1;
        else if(time<=12)return 30;
        else if(time<=18)return 50;
        else if(time<=20)return 80;
        else if(time<=22)return 60;

        return -1;
    }

    /*public int */
    public int Wei(){
        this.totalPrice=(int)(this.totalPrice*0.5);
        return this.totalPrice;
    }
    public int WeiWeek(){
        this.totalPrice=(int)(this.totalPrice*0.25);
        return this.totalPrice;
    }

    public int getWeekPrice(String timeStr){

        int time=Integer.parseInt(timeStr);
        if(time<9)return -1;
        else if(time<=12)return 40;
        else if(time<=18)return 50;
        else if(time<=22)return 60;

        return -1;
    }


}
class UserOrder{

    String id;
    String date;
    String time;
    String palce;
    String status;

    public UserOrder(String id, String date, String time,String palce,String status) {
        this.id = id;
        this.time=time;
        this.date = date;
        this.palce = palce;
        this.status=status;
    }
}

public class T1 {

    //List<>
    static List<UserOrder> listA=new LinkedList<UserOrder>();

    static List<UserOrder> listB=new LinkedList<UserOrder>();
    static List<UserOrder> listC=new LinkedList<UserOrder>();
    static List<UserOrder> listD=new LinkedList<UserOrder>();
   static HashMap<String,List<UserOrder>> map=new HashMap<String,List<UserOrder>>();


    static void delect(int i){
        UserOrder userOrder=listA.get(i);

    }
    static Boolean isSame(List<UserOrder> list,UserOrder s){

        for (int i = 0; i <list.size() ; i++) {
            UserOrder userOrder=list.get(i);
            if (userOrder.palce.equals(s.palce)&&
                    userOrder.date.equals(s.date)){
                int start=Integer.parseInt(s.time.split("~")[0].split(":")[0]);
                int end=Integer.parseInt(s.time.split("~")[1].split(":")[0]);

                int start1=Integer.parseInt(userOrder.time.split("~")[0].split(":")[0]);
                int end1=Integer.parseInt(userOrder.time.split("~")[1].split(":")[0]);

                // 判断开始时间即可
                if((start1>=start&&start1<=end)||(start>=start1&&start<=end1)){
                    return true;
                }

            }

        }
        list.add(s);
        return false;
    }

    static  void show(){

        for (String key : map.keySet()) {
            List<UserOrder> list=map.get(key);
            System.out.println("场地"+key+":");
            for (int i = 0; i <list.size() ; i++) {
                String price=null;
                if(list.get(i).status.equals("break"))price="违约金"+list.get(i).palce;
                else price=list.get(i).palce;
                System.out.println(list.get(i).date+" "+list.get(i).time+" "+price);
            }
        }
    }


    static void init(){
        map.put("A",listA);
        map.put("B",listB);
        map.put("C",listC);
        map.put("D",listD);
    }
    public static void main(String[] args) {

        init();

        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String s=in.nextLine();

            String []data=s.split(" ");
            if(data.length>4) {
                String id = data[0];
                String date = data[1];
                String place = data[3];
                UserOrder userOrder=new UserOrder(id, date, data[2],place,"order");
                switch (place){
                    case "A":if(!isSame(listA,userOrder)){listA.add(userOrder);};break;
                    case "B":if(!isSame(listB,userOrder)){listB.add(userOrder);};break;
                    case "C":if(!isSame(listC,userOrder)){listC.add(userOrder);};break;
                    case "D":if(!isSame(listA,userOrder)){listA.add(userOrder);};break;
                }


            }else {
                if(data[4].equals("C")){

                    List<UserOrder> list=map.get(data[3]);

                    for (int i = 0; i <list.size() ; i++) {
                        UserOrder userOrder=list.get(i);
                        if(userOrder.id.equals(data[0])&&userOrder.date.equals(data[1])
                                &&userOrder.time.equals(data[2])&&userOrder.palce.equals(data[3])
                        ){
                            //list.remove(i);
                            userOrder.status="break";
                            break;
                        }
                    }
                }else {
                    System.out.println("error");
                }
            }



        }
    }
}
