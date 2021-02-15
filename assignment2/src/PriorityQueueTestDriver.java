// Use this driver for the testing the correctness of your priority queue implementation
// You can change the add, remove sequence to test for various scenarios.
public class PriorityQueueTestDriver {
    public static void main(String[] args) {
	PriorityQueue<String> pq = new PriorityQueue<String>(5);
	Node<String> n1=new Node<String>(4,"A");
	pq.enqueue(n1);
	Node<String> n2=new Node<String>(10,"B");
	pq.enqueue(n2);
	Node<String> n3=new Node<String>(3,"C");
	pq.enqueue(n3);
	Node<String> n4=new Node<String>(5,"E");
	pq.enqueue(n4);
	Node<String> n5=new Node<String>(2,"F");
	pq.enqueue(n5);
	
	
	//pq.display();
	int size = pq.size();
	for (int i=0; i<size; i++) {
            Node<String> n = (Node<String>) pq.dequeue();
            n.show();
	}
    }
}
