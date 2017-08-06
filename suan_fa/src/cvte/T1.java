package cvte;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/29 0029.
 */
class Node{
    public int len;
    public Node left;
    public Node right;
    public Node(int len,Node left,Node right){
        this.len=len;
        this.left=left;
        this.right=right;
    }
}
public class T1 {

/** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static int sum=0;

    static int cut(int[] parts) {
        int count=0;

        for(int i=0;i<parts.length;i++)count+=parts[i];

    // 二叉树的树的结构来进行运算的
    //降低树的深度 来降低铜板的成本
    // 问题转化为对一个已排序数组转换成最低深度的二叉树问题

       Node node=getTree(parts,0,parts.length-1);

       // 进行层次遍历 获取所有节点的值 然后去叶子节点的值即可
        zhongBian(node);



        return sum;


    }
    static Node getTree(int []parts,int first,int last){
        if (last < first)
        {
            return null;
        }
        else
        {
            int mid = ( last + first ) / 2;

           Node node=new Node(parts[mid],getTree(parts,first,mid-1),getTree(parts,mid+1,last));

            return node;
        }
    }

    static void zhongBian(Node node){
        if(node==null)return ;

        zhongBian(node.left);
        sum +=node.len;
       // System.out.println("sum"+sum);
        zhongBian(node.right);

    }





    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int pieces = Integer.parseInt(in.nextLine().trim());
        int[] parts = new int[pieces+1];
        int count=0;
        for (int i = 0; i < pieces; i++) {
            parts[i] = Integer.parseInt(in.nextLine().trim());
           count+=parts[i];
        }
       parts[parts.length-1]=count;
        System.out.println(cut(parts));
    }
}