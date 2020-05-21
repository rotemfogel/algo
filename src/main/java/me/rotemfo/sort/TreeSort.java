package me.rotemfo.sort;

public class TreeSort {
    private static class Tree {
        class Node {
            private final int value;
            private Node left, right;

            public Node(int item) {
                this.value = item;
                this.left = this.right = null;
            }
        }

        private Node root;

        Tree(int[] arr) {
            this.root = new Node(arr[0]);
            for (int num : arr) {
                insert(root, num);
            }
        }

        private Node insert(Node node, int value) {
            if (node == null) {
                return new Node(value);
            }
            if (value < node.value) {
                node.left = insert(node.left, value);
                node.right = insert(node.right, value);
            }
            return node;
        }

        private void traverse(Node root, int[] arr, int i) {
            if (root.left != null)
                traverse(root.left, arr, i);
            arr[i] = root.value;
            i += 1;
            if (root.right != null)
                traverse(root.right, arr, i);
        }

        public int[] sort(int len) {
            int[] arr = new int[len];
            traverse(root, arr, 0);
            return arr;
        }
    }

    public static int[] sort(final int[] arr) {
        Tree tree = new Tree(arr);
        return tree.sort(arr.length - 1);
    }
}
