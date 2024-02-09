public class ListNode extends ListItem {
    public ListNode(int data) {
        super(data);
    }

    public ListNode(int data, ListNode previous, ListNode next) {
        super(data, previous, next);
    }

    @Override
    public ListNode getPrevious() {
        return (ListNode) super.getPrevious();
    }

    @Override
    public ListNode getNext() {
        return (ListNode) super.getNext();
    }
}
