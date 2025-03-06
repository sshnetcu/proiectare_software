package ro.ulbs.paradigme.lab2.liste.simplechained;

public class SimpleChainedList {
    private SimpleChainedNode head;

    public void addValue(int value) {
        if (head == null) {
            head = new SimpleChainedNode(value, null);
            return;
        }
        SimpleChainedNode temp = head;
        while (temp.getNextNode() != null) temp = temp.getNextNode();
        temp.setNextNode(new SimpleChainedNode(value, null));
    }

    public SimpleChainedNode getNodeByValue(int value) {
        SimpleChainedNode temp = head;
        while (temp != null) {
            if (temp.getValue() == value) return temp;
            temp = temp.getNextNode();
        }
        return null;
    }

    public void removeNodeByValue(int value) {
        if (head == null) return;
        if (head.getValue() == value) {
            head = head.getNextNode();
            return;
        }
        SimpleChainedNode temp = head;
        while (temp.getNextNode() != null && temp.getNextNode().getValue() != value) {
            temp = temp.getNextNode();
        }
        if (temp.getNextNode() != null) {
            temp.setNextNode(temp.getNextNode().getNextNode());
        }
    }

    public void listNodes() {
        SimpleChainedNode temp = head;
        while (temp != null) {
            System.out.print(temp.getValue() + " ");
            temp = temp.getNextNode();
        }
        System.out.println();
    }
}
