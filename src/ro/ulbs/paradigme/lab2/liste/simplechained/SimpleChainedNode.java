package ro.ulbs.paradigme.lab2.liste.simplechained;
import ro.ulbs.paradigme.lab2.liste.api.Node;

public class SimpleChainedNode implements Node {
    private int value;
    private SimpleChainedNode next;

    public SimpleChainedNode(int value, SimpleChainedNode next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public int getValue() {
        return value;
    }
    @Override
    public void setValue(int value) {
        this.value = value;
    }

    public void setNextNode(SimpleChainedNode next) {
        this.next = next;
    }
    public SimpleChainedNode getNextNode() {
        return next;
    }

}
