package qunar;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/26 0026.
 */
class Node{

    public String key;
    public String value;

    public Node(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
public class T3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Node> list=new ArrayList<Node>();
        while(in.hasNext()){

            /*
            *
          3 10
          get a
put a b
put x y
put d kkk
put zzz lll
get a
get x
put jia shen
          */


            String []s=in.nextLine().split(" ");
            int m =Integer.parseInt(s[0]);
            int n=Integer.parseInt(s[1]);
            for (int i = 0; i <n ; i++) {

                String []opera=in.nextLine().split(" ");
                if(opera[0].equals("put")){
                    // 添加算法 模仿栈的形式  list 头部是最久没有访问的 list 尾部是最新的

                    boolean flag=true;
                    for (int j = 0; j <list.size() ; j++) {
                        if (list.get(j).key.equals(opera[1])) {
                            Node node=list.get(j);
                            list.remove(j);
                            list.add(node);
                            flag=false;
                            break;
                        }
                    }

                    if(flag) {
                        if (list.size()<m){

                            list.add(new Node(opera[1],opera[2]));
                        }
                        else {
                            list.remove(0);
                            list.add(new Node(opera[1],opera[2]));
                        }
                    }


                }else if(opera[0].equals("get")){
                    boolean flag=true;
                    for (int j = 0; j <list.size() ; j++) {
                        if(list.get(j).key.equals(opera[1])){
                            System.out.println(list.get(j).value);

                            Node node=list.get(j);
                            list.remove(j);
                            list.add(node);

                            flag=false;
                            break;
                        }
                    }
                    if(flag) System.out.println("null");
                }


            }


        }
    }
}
