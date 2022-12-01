package hu.petrik.binarytree;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        int itemNum = 69;
        int min = 1;
        int max = 420;
        System.out.println(binaryTree);
        for (int i = 0; i < itemNum; i++) {
           int value = (int)(Math.random() * (max - min + 1) + min);
           binaryTree.insert(value);
        }
        System.out.println(binaryTree);
    }
}
