class MyStack<E>{
    private E[] array;
    private int size;
    private int capacity;
    public MyStack(int capacity){
        this.capacity=capacity;
        array=(E[]) new Object[capacity];
        this.size=0;
    }
    public E push(E e){
        if(size==capacity)
            return null;

        array[size++]=e;
        return e;
    }

    public E pop(){
        if(size==0)
            return null;

        size--;
        return array[size];
    }

    public E peek(){
        if(size==0)
            return null;

        return array[size-1];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return 0==size;
    }
}
public class Test {
    public static void main(String[] args) {
        MyStack<Integer> ms=new MyStack<>(100);
        System.out.println(ms.size());
        System.out.println(ms.isEmpty());
        ms.push(1);
        ms.push(2);
        ms.push(3);
        ms.push(4);
        System.out.println(ms.peek());
        System.out.println(ms.size());
        System.out.println(ms.isEmpty());

        ms.pop();
        ms.pop();
        System.out.println(ms.peek());
        System.out.println(ms.size());
        System.out.println(ms.isEmpty());
    }
}






class Node<E>{
    public E data;
    public Node<E> next;
    public Node(E e){
        this.data=e;
        next=null;
    }
    public Node(){
        next=null;
    }
}
class MyQueue<E>{
    private Node<E> front;
    private Node<E> rear;
    private int size;
    public MyQueue(){
        front=new Node<E>();
        rear=front;
        this.size=0;
    }
    public boolean offer(E e){
        rear.next=new Node<>(e);
        rear=rear.next;
        size++;
        return true;
    }

    public E poll(){
        if(size==0)
            return null;

        E e=front.next.data;
        front.next=front.next.next;
        size--;
        return e;
    }

    public E peek(){
        if(size==0)
            return null;

        return front.next.data;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return 0==size;
    }
}
public class TestD {
    public static void main(String[] args) {
        MyQueue<Integer> mq=new MyQueue<>();
        System.out.println(mq.isEmpty());
        System.out.println(mq.size());
        mq.offer(1);
        mq.offer(2);
        mq.offer(3);
        mq.offer(4);
        System.out.println(mq.isEmpty());
        System.out.println(mq.size());

        System.out.println(mq.peek());
        mq.poll();
        mq.poll();
        System.out.println(mq.peek());
        System.out.println(mq.isEmpty());
        System.out.println(mq.size());
    }
}
