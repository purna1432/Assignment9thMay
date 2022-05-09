package problem1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
public class FourthProblem {
	int queue[] =new int[5];
	int size;
	int front;
	int rear;
	public void enQueue(int data) {
		queue [rear]=data;
		rear = rear +1;
		size=size+1;
		
	}
	public int deQueue() {
		int data =queue[front];
		front=front+1;
		size=size-1;
		return data;
	}
	public void show() {
		for (int i=0;i<size;i++) {
			System.out.print(queue[front+i]+"  ");
		}
	}
	public static void main(String[] args) {
		 FourthProblem obj = new FourthProblem();
		 
		 obj.enQueue(5);
		 obj.enQueue(6);
		 obj.enQueue(3);
		 obj.enQueue(2);
		 
		 
		 System.out.print("added elements are : ");
		 obj.show();
		 System.out.print("");
		 obj.deQueue();
		 
		 
		 

	}
	

}
