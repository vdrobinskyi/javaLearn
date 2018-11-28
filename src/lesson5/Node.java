package lesson5;

import java.util.function.Consumer;

public class Node {
    Node left;
    Node right;
    int data;

    public Node(int data){
        this.data = data;
    }

    void methoddd(Consumer consumer){
        if(left != null){
            System.out.println(left.data);
            left.methoddd(consumer);
        }if(right != null){
            System.out.println(right.data);
            right.methoddd(consumer);
        }
    }

}
