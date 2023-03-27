package cz.cvut.fel.pjv;


public class TreeImpl implements Tree {
    private NodeImpl Root;

    TreeImpl() {
        this.Root = null;
    }

    private int[] fillArray(int start, int end, int[] array) {
        int[] newArray = new int[end - start + 1];
        for (int i = start, j = 0; i <= end; i++, j++) {
//            System.out.println("Loop" + i);
            newArray[j] = array[i];
        }
        return newArray;
    }

    private void iterateTreeSetting(NodeImpl NodeElement, int[] values) {
        int size = values.length;
        if (size == 0) return;

//        System.out.println(values);

//        int index = getMiddleIndex(size);
        int index = size / 2;
        NodeElement.value = values[index];
//        int test = NodeElement.value;

//        if (size == 1) return;


        int[] rightArr = fillArray((index + 1), (size - 1), values);
        int[] leftArr = fillArray(0, (index - 1), values);

        if (rightArr.length != 0) {
            NodeElement.rightNode = new NodeImpl();
            iterateTreeSetting(NodeElement.rightNode, rightArr);
        }
        if (leftArr.length != 0) {
            NodeElement.leftNode = new NodeImpl();
            iterateTreeSetting(NodeElement.leftNode, leftArr);
        }
    }

    @Override
    public void setTree(int[] values) {
        int size = values.length;
        if (size == 0) return;

        NodeImpl NodeElement = new NodeImpl();
        Root = NodeElement;

//        if (size == 1) return;

        iterateTreeSetting(NodeElement, values);
    }

    @Override
    public Node getRoot() {
        return Root;
    }

    private String stringifyNode(String initial, NodeImpl NodeElement, int deeply) {

        if (NodeElement == null) {
            return initial;
        }

        String deepSpace = "";
        int i = deeply;
        while (i > 0) {
            i--;
            deepSpace += " ";
        }
        initial += String.format("%s- %d\n", deepSpace, NodeElement.value);

        return stringifyNode(initial, NodeElement.leftNode, deeply + 1) + stringifyNode("", NodeElement.rightNode, deeply + 1);
    }

    @Override
    public String toString() {
        String result = "";
        if (Root == null) return result;
        return stringifyNode("", Root, 0);
    }
}
