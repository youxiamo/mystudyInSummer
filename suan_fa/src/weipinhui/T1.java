package weipinhui;

/**
 * Created by Administrator on 2017/9/16 0016.
 */

class Wo{
    private int c;
    Wo(int c){
        this.c=c;
    }
    public void getTT(){
        Wo wo=new Wo(33);
        System.out.println(wo.c);
    }
}

public class T1 {
    private int ccc;

    public static void main(String[] args) {
        T1 tt=new T1(33);
        System.out.println(tt.ccc);

        Wo wo=new Wo(20);

    }
    T1(int a){
        this.ccc=a;
    }
}
