package cz.cvut.fel.pjv;

public class Test {
    public static void main(String[] args) {
        TreeImpl tree = new TreeImpl();
        int[] values = {44, 5};
        tree.setTree(values);
        System.out.println(tree);
    }
}
