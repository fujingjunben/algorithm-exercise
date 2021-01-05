import java.util.ArrayList;
import java.util.List;

class RecycleQueue {
    private final static int SIZE = 5;
    private List<String> data;
    private int pHead;
    private int pTail;

    public RecycleQueue() {
        this.data = new ArrayList<>();
        this.pHead = 0;
        this.pTail = 0;
    }

    public boolean enqueue(String e) {
        if (isFull()) {
            return false;
        }
        this.data.add(e);
        this.pTail++;
        if (this.pTail > 5) {
            this.pTail = 1;
        }
        return true;

    }

    public boolean isFull(){
        return pHead + pTail == SIZE;
    }

    public boolean isEmpty(){
        return pHead == pTail;
    }

    public boolean dequeue(){
        if (isEmpty()) {
            return false;
        } else {
            this.pHead++;
            return true;
        }
    }

    public String front(){
        return this.data.get(pHead);
    }

    public String tail(){
        return this.data.get(pTail - 1);
    }

    public static void main(String[] args) {
        RecycleQueue q = new RecycleQueue();
        q.enqueue("a");
        q.enqueue("b");
        q.enqueue("c");
        q.enqueue("d");
        q.enqueue("e");
        q.enqueue("f");

        if (q.isEmpty() == false) {
            println("front: " + q.front());
            println("tail: " + q.tail());
        }

        q.dequeue();
        if (q.isEmpty() == false) {
            println("front: " + q.front());
            println("tail: " + q.tail());
        }

        q.enqueue("f");
        if (q.isEmpty() == false) {
            println("front: " + q.front());
            println("tail: " + q.tail());
        }


    }

    private static void println(String front) {
        System.out.println(front);
    }
}