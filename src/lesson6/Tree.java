package lesson6;

import java.util.function.Consumer;

public class Tree {

    Node root;

    public void traverse(Consumer consumer) {
        System.out.println(root.data);
        root.methoddd(consumer);



//           if (root != null){
//               consumer.accept(root.data);
//               if (root.left != null && root.right!=null) {
//                   consumer.accept(root.left.data);
//                   consumer.accept(root.right.data);
//
//
//
//
//                   root = root.left;
//                   traverse(consumer);
//               } else if (root.left == null) {
//
//                   root = root.right;
//                   consumer.accept(root.right.data);
//               } else {
//                   root = root.left;
//                   consumer.accept(root.left.data);
//
//               }
//           }

    }
}
