public class BSTNode extends ListItem {
    public BSTNode(int data) {
        super(data);
    }
    public BSTNode getRight() {
        return (BSTNode) getNext();
    }
    public BSTNode getLeft() {
        return (BSTNode) getPrevious();
    }
    public void setRight(BSTNode node) {
        setNext(node);
    }
    public void setLeft(BSTNode node) {
        setPrevious(node);
    }

}
