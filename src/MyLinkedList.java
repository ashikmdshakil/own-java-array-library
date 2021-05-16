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
    public int findIndex(int value){
        var node = this.head;
        int i = 0;
        int count = -1;
        while(node != null){
            if(node.getValue() == value){
                count = i ;
                break;
            }
            i++;
            node = node.getNextNode();
        }
        return count;
    }

    public void addAt(int index, int number){
        if(index == 0){
            addFirst(number);
        }else{
            index = index - 1;
        }
        var node = this.head;
        int i = 0;
        while(node != null){
            if(i == index){
                var newNode = new Node(number);
                var nextNode = node.getNextNode();
                node.setNextNode(newNode);
                newNode.setNextNode(nextNode);
                break;
            }
            i++;
            node = node.getNextNode();
        }
    }
    public void removeFirst(){
        this.head = this.head.getNextNode();
    }

    public void removeLast(){
        var node = this.head;
        while(node != null){
            if(node.getNextNode() == this.tail){
                node.setNextNode(null);
                this.tail = null;
                this.tail = node;
            }
            node = node.getNextNode();
        }
    }

    public void removeAt(int index){
        if(index == 0){
            removeFirst();
        }
        else {
            index = index - 1;
            var node = this.head;
            int i = 0;
            while (node != null) {
                if (index == i) {
                    node.setNextNode(node.getNextNode().getNextNode());
                    break;
                }
                i++;
                node = node.getNextNode();
            }
        }
    }

    public boolean contains(int value){
        var node = this.head;
        boolean contains = false;
        while(node != null){
            if(node.getValue() == value) {
                contains = true;
                break;
            }
            node = node.getNextNode();
        }
        return contains;
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
