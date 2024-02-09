public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    currentItem.setPrevious(newItem);
                    newItem.setNext(currentItem);
                } else {
                    currentItem.setPrevious(newItem);
                    newItem.setNext(currentItem);
                    this.root = newItem;
                }
                return true;
            } else {
                System.out.println(newItem.getValue() + " is already present, not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (this.root == null) {
            System.out.println("List empty.");
            return false;
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(item));
            if (comparison < 0) {
                currentItem = currentItem.next();
            } else if (comparison > 0) {
                System.out.println("Item not in list.");
                return false;
            } else {
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                    this.root.setPrevious(null);
                    currentItem.setNext(null);
                } else if (currentItem.next() == null) {
                    currentItem.previous().setNext(null);
                    currentItem.setPrevious(null);
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    currentItem.next().setPrevious(currentItem.previous());
                    currentItem.setNext(null);
                    currentItem.setPrevious(null);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("List empty.");
            return;
        }
        while (root != null) {
            System.out.println(root.getValue());
            root = root.next();
        }
    }
}
