package shunfeng;

/**
 * Created by Administrator on 2017/9/20 0020.
 */
import java.util.Scanner;

public class T1 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int[] solve(int[] a) {
        // 从后往前推
        // A(n-1)=B(n-1)
        int []b=new int[a.length];
        b[b.length-1]=a[a.length-1];

        for (int i = 2; i <=b.length ; i++) {

            int x=a[b.length-i];
            for (int j = b.length-i+1; j <b.length ; j++) {

                if((b.length-i-j)%2!=0)x+=b[j];
                else x=x-b[j];
            }

            b[b.length-i]=x;
        }

        return b;

    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] res;

        int _a_size = 0;
        _a_size = Integer.parseInt(in.nextLine().trim());
        int[] _a = new int[_a_size];
        int _a_item;
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(in.nextLine().trim());
            _a[_a_i] = _a_item;
        }

        res = solve(_a);
        for(int res_i=0; res_i < res.length; res_i++) {
            System.out.println(String.valueOf(res[res_i]));
        }

    }
}
