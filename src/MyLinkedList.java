public class MyLinkedList {
    private Node head;
    private Node tail;

    public void addFirst(int number){
        var newNode = new Node(number);
        if(isEmpty()){
            this.head = this.tail = newNode;
        }
        else{
            newNode.setNextNode(this.head);
            this.head = newNode;
        }
    }
    public void addLast(int number){
        var newNode = new Node(number);
        if(isEmpty()){
            this.head = this.tail = newNode;
        }
        else{
            this.tail.setNextNode(newNode);
            this.tail = newNode;
        }
    }

    public void print(){
        Node node = this.head;
        while(node != null){
            System.out.println(node.getValue());
            node = node.getNextNode();
        }
    }


    private boolean isEmpty(){
        boolean status = false;
        if(this.head == null){
            status = true;
        }
        else{
            status = false;
        }
        return status;
    }
}
