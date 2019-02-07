package thread;

import java.util.Random;
import java.util.function.Consumer;

import static thread.Main.stringBuilder;

class MyThread implements Runnable{

    Node root;
    int counter;
    MyThread(Node root){
        this.root = root;
    }
    @Override
    public void run() {
        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {
                Node node = (Node) o;
                    if (node.used.compareAndSet(false, true)) {
                        System.out.println(Thread.currentThread().getName() + " Захватил ноду " + ((Node) o).data + "\n");
                        try {
                            Thread.sleep(new Random().nextInt(5000));
                            System.out.println(Thread.currentThread().getName() + " Отпустил ноду " + ((Node) o).data + "\n");
                            counter++;
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        stringBuilder.append(Thread.currentThread().getName() + " Захватил ноду " + ((Node) o).data + "\n");
                        stringBuilder.append(Thread.currentThread().getName() + " Отпустил ноду " + ((Node) o).data + "\n");
                    }
            }
        };
        consumer.accept(root);
        root.methoddd(consumer);
    }
}

