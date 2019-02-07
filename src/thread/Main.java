package thread;


import java.io.FileWriter;
import java.io.IOException;

public class Main {
    static StringBuilder stringBuilder;
    public static void main(String[] args) {
        Tree tree = new Tree();

        Node node = new Node(0);
        node.data = 1;
        tree.root = node;


        Node nodeLeft = new Node(0);
        nodeLeft.data = 2;
        tree.root.left = nodeLeft;


        Node nodeRight = new Node(0);
        nodeRight.data = 7;
        tree.root.right = nodeRight;

        tree.root.left.right = new Node((float) 2.1);
        tree.root.left.left = new Node((float) 3);
        tree.root.left.left.right = new Node((float) 3.1);
        tree.root.left.left.left = new Node(4);
        tree.root.left.left.left.right = new Node((float) 4.1);
        tree.root.left.left.left.left = new Node(5);


        for (int i = 0; i < 4; i++) {
            MyThread myThread = new MyThread(tree.root);
            Thread thread = new Thread(myThread);
            thread.start();
        }

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try
        {
            FileWriter fileWriter = new FileWriter("Thread.txt", false);
            fileWriter.write(String.valueOf(stringBuilder));
            fileWriter.flush();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }



    }
}


