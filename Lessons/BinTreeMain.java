

package Lessons;

import java.util.Random;

public class BinTreeMain {

    public static void main(String[] args) {
        BinTree<Integer> tree = new BinTree<>();

        for (int i = 0; i < 10; i++) {
            int r = new Random().nextInt(20);
            tree.add(r);
            System.out.print(r + " ");
        }
            System.out.println();
            tree.print();
        }
    }


