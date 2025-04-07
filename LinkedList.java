public class LinkedList {
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
        // step1= create new node
        Node newNode = new Node(data);
        // step2 - newNode next = head
        newNode.next = head;
        // step3

        head = newNode;

    }
    public void addLast(int data){

        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("ll is empty");
            return;

        }
        Node temp = head;
        while(temp !=null){
            System.out.println(temp.data+"->");
            temp = temp.next;

        }
        System.out.println();
    }
    public void add(int idx, int data){
        if(idx ==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i =0;
        while(i< idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }
    public int itrSearch(int key){
        Node temp = head;
        int i=0;
        while(temp !=null){
            if(temp.data==key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public void reverse(){
        Node prev = null;
        Node curr =  tail=head;
        Node next;

        while(curr !=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;

    }
    public void deleteNthfromEnd(int n){
        int size =0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;


        }
        if(n == size){
            head = head.next;
            return;
        }
        int i = 1;
        int iToFind = size-1;
        Node prev = head;
        while(i <iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrom(){
        if(head == null || head.next == null){
            return true;

        }
        // step 1 = find mid
        Node midNode = findMid(head);
        // step 3 = reverse 2nd  half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        Node right = prev;
        Node left = head;

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;

        }
        return true;

    }



     
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
       
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2,3);
        ll.print();
        System.out.println(ll.checkPalindrom());

        // ll.add(2,9);
        // ll.print();
        // System.out.println(ll.itrSearch(3));
        // System.out.println(ll.itrSearch(10));
        


        

    }
    
}
