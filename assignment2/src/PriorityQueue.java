
public class PriorityQueue<V> implements QueueInterface<V>{

    private NodeBase<V>[] queue;
    private int capacity, currentSize;
	
    //TODO Complete the Priority Queue implementation
    // You may create other member variables/ methods if required.
    public PriorityQueue(int capacity) {    
          this.capacity=capacity;
          this.currentSize=0;
          this.queue=new NodeBase[capacity];
    }

    public int size() {
          return this.currentSize;
    }

    public boolean isEmpty() {
         return currentSize==0;
    }
	
    public boolean isFull() {
        return this.currentSize==capacity;
    }

    public void enqueue(Node<V> node) {
    	   if(!isFull()){
           queue[currentSize++]=node;
    	   }
          
    }

    // In case of priority queue, the dequeue() should 
    // always remove the element with minimum priority value
    public NodeBase<V> dequeue() {
    	if(!isEmpty()){
    	NodeBase<V> min=queue[0];
    	int j=0;
          for(int i=0;i<currentSize;i++){
        	  if(min.getPriority()>queue[i].getPriority()){
        		  min=queue[i];
        		  j=i;
        	  }
          }
          for(int x=j;x<currentSize-1;x++){
        	  queue[x]=queue[x+1];
          }
          
          currentSize--;
      
       return min;
    	}
    	else{
    		return null;
    	}
    }

    public void display () {
	if (this.isEmpty()) {
            System.out.println("Queue is empty");
	}
	for(int i=0; i<currentSize; i++) {
            queue[i+1].show();
	}
    }
}

