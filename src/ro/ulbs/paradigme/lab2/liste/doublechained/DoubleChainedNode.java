package ro.ulbs.paradigme.lab2.liste.doublechained;
import ro.ulbs.paradigme.lab2.liste.api.Node;


public class DoubleChainedNode implements Node {
    private int value;
    private DoubleChainedNode next;
    private DoubleChainedNode prev;

    public DoubleChainedNode(int value, DoubleChainedNode next, DoubleChainedNode prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    @Override
    public int getValue() {
        return value;
    }
    @Override
    public void setValue(int value) {
        this.value = value;
    }

    public void setNextNode(DoubleChainedNode next) {
        this.next = next;
    }
    public DoubleChainedNode getNextNode() {
        return next;
    }

    public void setPrevNode(DoubleChainedNode prev) {
        this.prev = prev;
    }
    public DoubleChainedNode getPrevNode() {
        return prev;
    }
}
