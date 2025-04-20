class StackArray{
     int top = -1;
     int[] stack;
     int capacity;
     public StackArray(int size){
        this.stack = new int[size];
        this.capacity = size;
     }

    public  void push(int x){
        if(top == capacity-1){
            System.out.print("Stack Overflow!");
            return;
        }
        stack[++top] = x;
    }

    int pop(){
        if(top == -1){
            System.out.print("Stack Underflow");
            return-1;
        }
        return stack[--top];        
    }

    int peek(){
        return top == -1?-1:stack[top];
    }

    boolean isEmpty(){
        return top==-1;
    }

}


public class Stacky{
    public static void main(String[] args){
        StackArray myStack = new StackArray(10);
         for(int i =0;i<10;i+=4){
             myStack.push(i);
         }
     int peeked = myStack.peek();
     System.out.print(myStack);
    }
}