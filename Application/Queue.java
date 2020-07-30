class Main {
  public static void main(String[] args) {
    Queue num = new Queue();

    num.enqueue(20);
    num.enqueue(204);
    num.enqueue(5);
    num.enqueue(55);
    num.enqueue(20);
    num.enqueue(204);
    num.enqueue(5);
    num.enqueue(55);
        num.enqueue(20);
    num.enqueue(204);
    num.enqueue(5);
    num.enqueue(55);
    
    num.deQueue();
    num.deQueue();

    num.enqueue(9);
    num.enqueue(11);  

  num.show();  
  
  }
}

class Queue{
 int enqueue[] = new int[10];
 int rear;
 int size;
 int front;

 public void enqueue(int data){
   enqueue[rear] = data;
   rear++;
   size++;
 }

 public int deQueue(){
   int data;
    data = enqueue[front];
    front++;
    size--;
    
    return data;
   
 }

 public void show(){
   System.out.print("Element of the Queue is: ");
   for(int i = 0; i< size; i++){
   System.out.print(enqueue[front+i]+" ");
 }
 }
  // public void size(){
  //   int qSize = queue[first];
  //   qSize.length;
  // }

  // public boolean isEmpty(){
  //   boolean emp ;
  //   if(queue[emp] == 0){
  //   return emp;
  //   }
  // }
  
}