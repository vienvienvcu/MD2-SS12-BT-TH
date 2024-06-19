package TH2;

public class Node {
    public int Key;
    public Node next;
    public Node(){

    }

    public Node(int key){
        this.Key = key;
        this.next = null;
    }
    public Node(int key, Node next) {
        Key = key;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node [Key=" + Key + ", next=" + next + "]";
    }

}
