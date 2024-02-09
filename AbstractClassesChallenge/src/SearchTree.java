public class SearchTree implements NodeList {
    private ListItem root = null;

    public SearchTree(ListItem root) {
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
            if(comparison < 0) {
                if (currentItem.next() == null) {
                    currentItem.setNext(newItem);
                    return true;
                } else {
                    currentItem = currentItem.next();
                }
            } else if(comparison > 0) {
                if (currentItem.previous() == null) {
                    currentItem.setPrevious(newItem);
                    return true;
                } else {
                    currentItem = currentItem.previous();
                }
            } else {
                System.out.println(newItem.getValue() + " is already present, not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while (currentItem != null) {
            int comparison = (currentItem.compareTo(item));
            if(comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if(comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                performRemoval(currentItem,parentItem);
                return true;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }

    private void performRemoval(ListItem currentItem, ListItem parentItem) {
        if(currentItem.previous() == null && currentItem.next() == null) {
            if(parentItem.compareTo(currentItem) > 0) {
                parentItem.setPrevious(null);
            } else {
                parentItem.setNext(null);
            }
        } else if(currentItem.previous() == null) {
            if(parentItem.compareTo(currentItem) > 0) {
                parentItem.setPrevious(currentItem.next());
            } else {
                parentItem.setNext(currentItem.next());
            }
        } else if(currentItem.next() == null) {
            if(parentItem.compareTo(currentItem) > 0) {
                parentItem.setPrevious(currentItem.previous());
            } else {
                parentItem.setNext(currentItem.previous());
            }
        } else {
            parentItem = currentItem;
            ListItem successor = currentItem.next();
            while (successor.previous() != null) {
                parentItem = successor;
                successor = successor.previous();
            }
            currentItem.setValue(successor.getValue());
            performRemoval(successor,parentItem);
        }
    }
}
