package datastructure;

import java.util.Scanner;

public class StackProgram {
	static int size;
	int top=-1;
	static int stack[];

	public void push()
	{
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		if(top==size-1)
		{
			System.out.println("Stack is full");
		}
		else
		{
			try {
				System.out.println("Enter a value");
				int a=scanner.nextInt();
				top++;
				stack[top]=a;	
			}
			catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException)
			{
				System.out.println("Array Index out of bound");
			}
		}
	}
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is Empty!!");
		}
		else
		{
			System.out.println("Value is deleted" + stack[top]);
			top--;
		}
		
	}
	public void display()
	{
		if(top==-1)
		{
			System.out.println("Stack is Empty!!");
		}
		else
		{
			for(int i=top;i>=0;i--)
			{
				System.out.println(" "+stack[i]);
			}
		}
	}
	public static void main(String args[])
	{
		try {
			@SuppressWarnings("resource")
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("Enter Stack size:\n");
			int stackSize=scanner.nextInt();
			size=stackSize;
			stack=new int[stackSize];
			StackProgram stackProgram=new StackProgram();
			int i=1;
			while(i!=4)
			{
				System.out.println("--- Menu ---");
				System.out.println(" 1- Push(Insert) \n 2- POP(Remove) \n 3- Display \n 4- Exit");
				System.out.println("Enter your choice");
				i=scanner.nextInt();
				
				switch (i) {
				case 1:
					stackProgram.push();
					break;
				case 2:
					stackProgram.pop();
					break;
				case 3:
					stackProgram.display();
					break;
				case 4:
					i=4;
					break;
				default:
					System.out.println("Invlaid Input");
					break;
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException)
		{
			System.out.println("Array is out of range"+arrayIndexOutOfBoundsException);
		}
		catch(Exception exception)
		{
			System.out.println("Error");
		}

	}
}
