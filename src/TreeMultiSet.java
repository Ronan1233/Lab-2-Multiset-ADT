public class TreeMultiSet extends MultiSet {

    Tree a_tree;

    public TreeMultiSet() {
        this.a_tree = new Tree();
    }
    @Override
    void add(Integer item) {
        a_tree.insert(item);
    }
    void remove(Integer item) {
        a_tree.delete_item(item);
    }
    boolean contains(Integer item) {
        return a_tree.__contains__(item);
    }
    boolean is_empty() {
        return a_tree.is_empty();
    }
    int count(Integer item) {
        return a_tree.count(item);
    }
    int size() {
        return a_tree._average_helper()[1];
    }
}
