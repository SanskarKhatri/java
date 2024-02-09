public abstract class ListItem {
    private int data;
    private ListItem previous;
    private ListItem next;

    public ListItem(int data) {
        this(data, null, null);
    }

    public ListItem(int data, ListItem previous, ListItem next) {
        this.data = data;
        this.previous = previous;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListItem getPrevious() {
        return previous;
    }

    public void setPrevious(ListItem previous) {
        this.previous = previous;
    }

    public ListItem getNext() {
        return next;
    }

    public void setNext(ListItem next) {
        this.next = next;
    }

    public int compareTo(ListItem node) {
        return data - node.getData();
    }

}
