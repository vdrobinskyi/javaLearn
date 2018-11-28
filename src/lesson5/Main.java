package lesson5;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
     Tree tree = new Tree();

     Node node = new Node(0);
     node.data = 5;
     tree.root = node;


     Node nodeLeft = new Node(0);
     nodeLeft.data = 2;
     tree.root.left = nodeLeft;


     Node nodeRight = new Node(0);
     nodeRight.data = 6;
     tree.root.right = nodeRight;

     tree.root.right.right = new Node(8);
     tree.root.right.left = new Node(7);

    Consumer consumer = new Consumer() {
        @Override
        public void accept(Object o) {

        }
    };
     tree.traverse(consumer);

    }
}
