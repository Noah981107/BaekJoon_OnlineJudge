import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_1991 {

    static class Node {
        char data;
        Node left, right;

        public Node(char data) {
            this.data = data;
        }
    }

    static class Tree {
        Node root;

        public void insertNode(char data, char leftData, char rightData) {
            if (root == null) {
                root = new Node(data);

                if (leftData != '.')
                    root.left = new Node(leftData);

                if (rightData != '.')
                    root.right = new Node(rightData);
            }
            else
                findNodeLocation(root, data, leftData, rightData);
        }

        public void findNodeLocation(Node root, char data, char leftData, char rightData) {
            if (root == null)
                return;
            else if (root.data == data) {
                if (leftData != '.')
                    root.left = new Node(leftData);
                if (rightData != '.')
                    root.right = new Node(rightData);
            }
            else {
                findNodeLocation(root.left, data, leftData, rightData);
                findNodeLocation(root.right, data, leftData, rightData);
            }
        }

        public void preOrder(Node root) {
            sb.append(root.data);

            if (root.left != null)
                preOrder(root.left);
            if (root.right != null)
                preOrder(root.right);
        }

        public void inOrder(Node root) {
            if (root.left != null)
                inOrder(root.left);
            sb.append(root.data);
            if (root.right != null)
                inOrder(root.right);
        }

        public void postOrder(Node root) {
            if (root.left != null)
                postOrder(root.left);
            if (root.right != null)
                postOrder(root.right);
            sb.append(root.data);
        }
    }

    static int N;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        Tree tree = new Tree();
        while(N --> 0) {
            String[] input = br.readLine().split(" ");
            char data = input[0].charAt(0);
            char leftData = input[1].charAt(0);
            char rightData = input[2].charAt(0);

            tree.insertNode(data, leftData, rightData);
        }

        tree.preOrder(tree.root);
        sb.append("\n");
        tree.inOrder(tree.root);
        sb.append("\n");
        tree.postOrder(tree.root);
        System.out.println(sb);
    }
}