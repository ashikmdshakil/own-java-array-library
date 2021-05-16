public class Mian {
    public static void main(String[] args) {
        var list = new MyLinkedList();
        list.addLast(100);
        list.addLast(200);
        list.addLast(300);
        list.removeAt(1);
        list.print();
    }
}
