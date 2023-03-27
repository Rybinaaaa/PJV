package cz.cvut.fel.pjv;

public class NodeImpl implements Node {
    public NodeImpl leftNode, rightNode;
    public int value;

    public NodeImpl() {
        this(null, null, -1);
    }

    public NodeImpl(int value) {
        this(null, null, value);
    }

    public NodeImpl(NodeImpl leftNode, NodeImpl rightNode, int value) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.value = value;
    }

    @Override
    public Node getLeft() {
        return leftNode;
    }

    @Override
    public Node getRight() {
        return rightNode;
    }

    @Override
    public int getValue() {
        return value;
    }
}
