public class LL {
    private ListNode head;

    public LL() {

    }

    public LL(ListNode head) {
        this.head = head;
    }

    public void printList() {
        ListItem i = head;
        if (i == null) {
            System.out.println("List is empty");
        } else {
            while (i != null) {
                System.out.print(i.getData() + "  ");
                i = i.getNext();
            }
            System.out.println();
        }
    }

    public void add(int data) {
            if(head == null) {
                head = new ListNode(data);
            } else {
                ListNode n = new ListNode(data);
                ListNode i = head;
                while (i.getNext() != null && i.getData() < n.getData()) {
                    i = i.getNext();
                }
                if (i.getNext() == null && i.getData() < n.getData()) {
                    i.setNext(n);
                    n.setPrevious(i);
                } else {
                    n.setNext(i);
                    n.setPrevious(i.getPrevious());
                    i.setPrevious(n);
                    if (i == head) {
                        head = n;
                    } else {
                        i = n.getPrevious();
                        i.setNext(n);
                    }
                }
            }
    }
}
