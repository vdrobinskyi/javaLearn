package lesson6;

import java.util.function.Consumer;

public class Node<T> {
    Node left;
    Node right;
    T data;

    public Node(T data){
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