package dajiang;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/7 0007.
 */
class Car{
    public int power;
    public int run;
    public int place;
    public Car(int power,int place,int run){
        this.place=place;
        this.power=power;
        this.run=run;
    }
}
public class T3 {
    public static void main(String[] args) {

            Scanner in=new Scanner(System.in);
            while(in.hasNext()){
                int len=in.nextInt();
                Car a=new Car(in.nextInt(),in.nextInt(),in.nextInt());
                Car b=new Car(in.nextInt(),in.nextInt(),in.nextInt());
                System.out.println(a.run);

                while(a.power >0 && b.power>0){
                    if(Math.abs(a.place-b.place)>2){
                        a.place+=a.run;
                        a.power-=1;

                        b.place+=b.run;
                        b.power-=1;
                    }else if(Math.abs(a.place-b.place)==1){
                        a.power-=1;
                        b.power-=1;

                        a.run=-a.run;
                        b.run=-b.run;
                    }else if(Math.abs(a.place-b.place)==0){

                    }

                }

            }
    }
}
