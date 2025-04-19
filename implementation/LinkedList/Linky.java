class Node<T>{ 
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        this.next = null;
    }
}
class SinglyLinkedList<T> {
     private Node<T> head;

     
     public void insert(T data){
        Node<T> newNode = new Node<>(data);

        if(head == null){
            head = newNode;
            return;
        }
        Node<T> curr = head;
        while(curr.next !=null){
            curr = curr.next;
        }
        curr.next =newNode;
     }

     
    public boolean delete(T key){
        if(head == null)return false;

        
        if(head.data.equals(key)){
           head =head.next;
            return true;
        }
        Node<T> curr =head;
        while(curr.next !=null && !curr.next.data.equals(key)){
            curr = curr.next;
        }
        if(curr.next ==null){
            return false; // key not found;
        }
        curr.next = curr.next.next;
        return true;
    }
   
    public boolean search(T key){
        Node<T> curr= head;
        while(curr.next != null){
            if(curr.data.equals(key)){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

 
    public void printlist(){
        Node<T> curr = head;
        while(curr !=null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.println("null"); 

    }

   
    public void insertAtHead(T data){ // insert at head in O(1)
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

}


public class Linky{
    public static void main(String[] args){
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.insert("Nithish");
        list.insert("Alice");
        list.insertAtHead("Zara");
        list.printlist();            
        System.out.println(list.search("Bob"));
        list.delete("Alice");
        list.printlist();    

    }
}