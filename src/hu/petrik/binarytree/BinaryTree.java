package hu.petrik.binarytree;

public class BinaryTree<T extends Comparable<T>> {
    private BinaryTreeItem<T> head;

    public BinaryTree() {
        this.head = null;
    }

    public void insert(T value) {
        if (this.head == null) {
            this.head = new BinaryTreeItem<>(value);
        } else {
            head.insert(value);
        }
    }

    @Override
    public String toString() {
        if (this.head == null){
            return "";
        }
        return head.toString();
    }

    private class BinaryTreeItem<T extends Comparable<T>> {
        private T value;
        private BinaryTreeItem<T> left;
        private BinaryTreeItem<T> right;

        public BinaryTreeItem(T value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public BinaryTreeItem<T> getLeft() {
            return left;
        }

        public void setLeft(BinaryTreeItem<T> left) {
            this.left = left;
        }

        public BinaryTreeItem<T> getRight() {
            return right;
        }

        public void setRight(BinaryTreeItem<T> right) {
            this.right = right;
        }

        public void insert(T value) {
            if (value.compareTo(this.value) < 0) {
                if (this.left == null) {
                    this.left = new BinaryTreeItem<>(value);
                } else {
                    this.left.insert(value);
                }
            } else {
                if (this.right == null) {
                    this.right = new BinaryTreeItem<>(value);
                } else {
                    this.right.insert(value);
                }
            }
        }

        @Override
        public String toString() {
            String line = "";
            if (this.left != null) {
                line += this.left + ", ";
            }
            line += value;
            if (this.right != null) {
               line += ", " + this.right;
            }
            return line.trim();
        }
    }
}