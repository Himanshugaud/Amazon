// This class implements the Queue
public class Queue<V> implements QueueInterface<V>{

    //TODO Complete the Queue implementation
    private NodeBase<V>[] queue;
    private int capacity, currentSize, front, rear;
	
    public Queue(int capacity) {    
          this.capacity=capacity;
          this.currentSize=0;
          this.queue=new NodeBase[capacity];
    }

    public int size() {
         return this.currentSize;
    }

    public boolean isEmpty() {
         return this.currentSize==0;
    }
	
    public boolean isFull() {
      return this.currentSize==this.capacity;
    }

    public void enqueue(Node<V> node) {
    	if(!isFull()){
           queue[currentSize]=node;
           currentSize++;
    	}
    }

    public NodeBase<V> dequeue() {
    	if(!isEmpty()){
           NodeBase<V> remove=queue[0];
           for(int i=0;i<currentSize-1;i++){
        	   queue[i]=queue[i+1];
        	   
           }
           
           queue[currentSize-1]=null;
           currentSize--;
           return remove;
    	}
    	else{
    		return null;
    	}
    }
    

}

