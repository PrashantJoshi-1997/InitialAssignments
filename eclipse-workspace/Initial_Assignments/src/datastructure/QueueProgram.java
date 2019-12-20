package datastructure;

import java.util.Scanner;

public class QueueProgram 
{

	static int size;
	int rear=-1;int front=-1;
	static int queue[];
	public void enQueue()
	{
		if(rear==size-1)
		{
			System.out.println("Queue is full!!!");
		}
		else
		{
			
			@SuppressWarnings("resource")
			Scanner scanner=new Scanner(System.in);
			if(front==-1)
				front = 0;
			rear++;
			System.out.println("Enter value:");
			queue[rear]=scanner.nextInt();
			System.out.println("Value inserted\n");
		}
	}
	
	public void deQueue()
	{
		if(front==rear)
		{
			System.out.println("Queue is Empty!!");
		}
		else
		{
			System.out.println("Value removed "+queue[front]);
			front++;
			if(front==rear)
				front=rear=-1;
		}
	}
	
	public void display()
	{
		if(rear==-1)
		{
			System.out.println("Queue is empty!!!");
		}
		else
		{
			for(int i=front;i<=rear;i++)
			{
				System.out.print(" "+queue[i]);
			}
			System.out.println("\n\n");
		}
	}
	public static void main(String args[])
	{
		
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Queue size");
		int queueSize=scanner.nextInt();
		size=queueSize;
		queue=new int[queueSize];
		int i=1;
		QueueProgram queueProgram=new QueueProgram();
		while(i!=4)
		{
			if(i==4)
			{
				System.exit(0);
			}
			else
			{
				System.out.println("\n --- Menu --- \n");
				System.out.println("\n 1- Add In queue \n 2- Remove from Queue \n 3- Show Queue \n 4- Exit \n");
				int choice=scanner.nextInt();
				switch (choice) {
				case 1:
					queueProgram.enQueue();
					break;
					
				case 2:
					queueProgram.deQueue();
					break;

				case 3:
					queueProgram.display();
					break;
					
				case 4:
					i=4;
					break;
				default:
					System.out.println("Invalid Choice");
					break;
				}
			}
		}
		
	}
}
