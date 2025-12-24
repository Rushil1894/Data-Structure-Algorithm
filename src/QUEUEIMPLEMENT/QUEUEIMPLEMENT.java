package QUEUEIMPLEMENT;

import java.util.Arrays;

public class QUEUEIMPLEMENT
{
    public static void main(String[] args)
    {

        // Simple queue Implementation..
        SIMPLEQUEUE queue = new SIMPLEQUEUE();
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        queue.dequeue();
//        queue.dequeue();
//        queue.top();
//        queue.size();
//        queue.dequeue();
//        queue.dequeue();
//        queue.top();
//        queue.size();

        // Circular queue Implementation..
        CIRCULARQUEUE circularqueue = new CIRCULARQUEUE();
//        circularqueue.enqueue(10);
//        circularqueue.enqueue(20);
//        circularqueue.enqueue(30);
//        circularqueue.enqueue(40);
//        circularqueue.enqueue(50);
//        circularqueue.dequeue();
//        circularqueue.dequeue();
//        circularqueue.enqueue(60);
//        circularqueue.enqueue(70);
//        circularqueue.enqueue(80);
//        circularqueue.dequeue();
//        circularqueue.dequeue();
//        circularqueue.dequeue();
//        circularqueue.top();
//        circularqueue.size();
//        circularqueue.dequeue();
//        circularqueue.dequeue();
//        circularqueue.top();
//        circularqueue.size();

        // Double-Ended queue Implementation.
        DOUBLEENDQUEUE doubleendqueue = new DOUBLEENDQUEUE();
//        doubleendqueue.addLast(20);
//        doubleendqueue.addLast(30);
//        doubleendqueue.addFirst(10);
//        doubleendqueue.addFirst(5);
//        doubleendqueue.addLast(40);
//        doubleendqueue.addLast(50);
//        doubleendqueue.deleteFirst();
//        doubleendqueue.addFirst(50);
//        doubleendqueue.deleteLast();
//        doubleendqueue.addLast(50);
//        doubleendqueue.print();
//        System.out.println( doubleendqueue.toString());

    }
}

class SIMPLEQUEUE
{
     int[] arr = new int[5];
     int front = -1 , rear = -1;

    public void enqueue(int value)
    {
        if(rear == (arr.length-1) )
        {
            System.out.println("queue is full ");
            return;
        }
        rear++;
        arr[rear] = value;
    }
    public void dequeue()
    {
        if(front == rear)
        {
            System.out.println("queue is empty ");
            return;
        }
        front++;
        System.out.println("deleted value : " + arr[front]);
        if(front == rear)
        {
            front = rear = -1;
        }
    }
    public void top()
    {
        if(front == -1)
        {
            System.out.println("queue is empty ");
            return;
        }
        System.out.println("front value : " + arr[++front]);
        front--;
    }
    public void isEmpty()
    {
            if(front == rear)
            {
                System.out.println("True");
            }
            else {
                System.out.println("False");
            }
    }
    public void size()
    {
        if(front == rear)
        {
            System.out.println("size is : 0");
            return;
        }
        int temp = rear-front;
        System.out.println("size is : " + temp ) ;
    }

}

class CIRCULARQUEUE
{
    int[] arr = new int[5];
    int front = -1, rear = -1;

    public void enqueue(int value)
    {
        if((rear-front) == arr.length)
        {
            System.out.println("Queue is full");
            return;
        }
        int index = ++rear;
        if(rear > (arr.length-1))
        {
            index = rear % arr.length;
        }
        arr[index] = value;
    }

    public void dequeue()
    {
        if(rear == front)
        {
            System.out.println("Queue is empty.");
            return;
        }
        int index = ++front;
        if(front > (arr.length-1))
        {
            index = front % arr.length;
        }
        System.out.println("deleted value : " + arr[index]);
        if(rear == front)
        {
            front = rear =-1;
        }
    }

    public void top()
    {
        if(front == rear)
        {
            System.out.println("Queue is empty..");
            return;
        }
        int index = ++front;
        if(front > (arr.length-1))
        {
            index = front % arr.length;
        }
        System.out.println("top value : " + arr[index]);
        front--;
    }

    public void size()
    {
        if(front == rear)
        {
            System.out.println("size is 0");
            return;
        }
        System.out.println("size : " + (rear-front));
    }

    @Override
    public String toString() {
        return "arr=" + Arrays.toString(arr) ;
    }
}

class DOUBLEENDQUEUE
{
    int[] arr = new int[5];
    int front = -1, rear = -1;

    public void addFirst(int value) {
        if ((rear - front) == arr.length) {
            System.out.println("Queue Is full");
            return;
        }
        if (front != -1) {
            arr[front] = value;
            front--;
        } else {
            for (int i = rear; i >= 0; i--) {
                arr[i + 1] = arr[i];
            }
            arr[0] = value;
            rear++;
        }
    }

    public void addLast(int value) {
        if ((rear - front) == arr.length) {
            System.out.println("Queue Is Full");
            return;
        }
        if (rear == arr.length - 1) {
            for (int i = front; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            arr[rear] = value;
            front--;
        } else {
            rear++;
            arr[rear] = value;
        }
    }

    public void deleteFirst() {
        if (rear == -1) {
            System.out.println("Queue is Empty.");
            return;
        }
        System.out.println("Deleted Value : " + arr[0]);
        front++;
    }

    public void deleteLast() {
        if (rear == -1) {
            System.out.println("Queue is Empty.");
            return;
        }
        System.out.println("Deleted value : " + arr[rear]);
        rear--;
    }
    public void peekFirst()
    {

    }
    public void peekLAST()
    {

    }
    public void size()
    {

    }

    public void print()
    {
        System.out.print("[");
        for (int i = front+1; i <= rear; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
    @Override
    public String toString() {
        return "arr=" + Arrays.toString(arr);
    }
}