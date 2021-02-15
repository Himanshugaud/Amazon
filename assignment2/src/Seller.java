import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Seller<V> extends SellerBase<V> {
	
    public Seller (int sleepTime, int catalogSize, Lock lock, Condition full, Condition empty, PriorityQueue<V> catalog, Queue<V> inventory) {
        //TODO Complete the constructor method by initializing the attibutes
        // ...
    	//
    	//
        this.setSleepTime(sleepTime);
    	
    	this.lock=lock;
    	this.full=full;
    	this.empty=empty;
    	this.catalog=catalog;
    	this.inventory=inventory;
    }
    
    public void sell() throws InterruptedException {
    	lock.lock();
	try {
            //TODO Complete the try block for produce method
            // ...
		while(catalog.isFull()){
			full.await();
		}
		if(!catalog.isFull()){
			if(!inventory.isEmpty()){
			catalog.enqueue((Node<V>)inventory.dequeue());
			
			empty.signalAll();
			}
		}
	} catch(Exception e) {
            e.printStackTrace();
	} finally {
            //TODO Complete this block
		lock.unlock();
	}		
    }
}
