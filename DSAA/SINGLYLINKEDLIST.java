public class SINGLYLINKEDLIST {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode  = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        size++;
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=tail=newNode;
            return;
        }
        size++;
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        if(head == null){
            System.out.print("List is empty(!)");
            return;
        }
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public void add(int idx,int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
         if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        Node prev = head;
        for(int  i = 0; i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }
    private int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int index = helper(head.next, key);
        return index == -1 ? -1 : index + 1;
    }
    public void reverse(){
        Node prev = null;
        Node curr = tail =head ;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
    }

    public void deleteNthFromEnd(int n){
        // calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if(n == sz){
            head = head.next;
            return;
        }
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while(i<iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    public static void main(String[] args) {
        SINGLYLINKEDLIST list = new SINGLYLINKEDLIST();
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        list.addLast(5);
        list.add(2,3);
        // list.print();
    //    System.out.println(list.size);
    //    list.removeFirst();
    //    list.print();
    //        System.out.println(list.size);
    //        list.removeLast();
    //        list.print();
    //                   System.out.println(list.size);
//   System.out.println(list.itrSearch(4));
//     System.out.println(list.recSearch(4));
    // list.reverse();
    list.print();
    list.deleteNthFromEnd(2);
list.print();
    }
}
