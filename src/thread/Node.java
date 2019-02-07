package thread;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

public class Node {
    Node left;
    Node right;
    float data;
    volatile AtomicBoolean used = new AtomicBoolean(false);

    public Node(float data){
        this.data = data;
    }

    void methoddd(Consumer consumer){
        if(left != null){
            consumer.accept(left);
            left.methoddd(consumer);
        }if(right != null){
            consumer.accept(right);
            right.methoddd(consumer);
        }
    }

}