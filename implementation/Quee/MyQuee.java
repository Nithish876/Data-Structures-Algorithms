class Quee{
    int size;
    int[] arr;
    int front,rear,capacity;
    
    public Quee(int capacity){
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size= 0;
    }
    boolean isfull(){
        return size==capacity;
    }
    boolean isempty(){
        return size==0;
    }
    void enquee(int data){
        if(isfull()){
            System.out.println("Quee is Full");
            return;
        }
        rear = (rear+1)%capacity;
        arr[rear] = data;
        size++;
    }
    int dequee(){
        if(isempty()){
            throw new RuntimeException("Quee is Empty")
        }
        int removed = arr[front];
        front = (front+1)%capacity;
        size--;
        return removed;
    }
    int peek(){
        if(isempty()){
            throw new RuntimeException("Quee is Empty ");
        }
        return arr[front];
    }

}

class MyQuee{
     public static void main(String[] args){
        Quee myquee = new Quee(10);
        myquee.enquee(0);
        myquee.enquee(1);
        System.out.println(myquee.peek());
     }
}