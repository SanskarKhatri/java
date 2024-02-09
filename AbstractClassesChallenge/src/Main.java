public class Main {
    public static void main(String[] args) {
//        MyLinkedList list = new MyLinkedList(null);
//        list.traverse(list.getRoot());
//
//        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
//
//        String[] data = stringData.split(" ");
//        for (String s : data) {
//            Node n = new Node(s);
//            list.addItem(n);
//        }
//
//        list.traverse(list.getRoot());
//        System.out.println();
//
//        list.removeItem(new Node("Melbourn"));
//        list.traverse(list.getRoot());
        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        String[] data = stringData.split(" ");
        for (String s : data) {
            Node n = new Node(s);
            tree.addItem(n);
        }

        tree.traverse(tree.getRoot());
        System.out.println();

        tree.removeItem(new Node("Sydney"));
        tree.traverse(tree.getRoot());
    }
}