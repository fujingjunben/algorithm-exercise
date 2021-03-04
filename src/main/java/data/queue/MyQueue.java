package data.queue;

import java.util.ArrayList;
import java.util.List;

class MyQueue {
    private List<String> data;
    private int pHead;

    public MyQueue() {
        this.data = new ArrayList<>();
        this.pHead = 0;
    }

    public boolean enqueue(String e) {
        this.data.add(e);
        return true;
    }

    public boolean isEmpty(){
        if (pHead >= data.size()) {
            return true;
        } else {
            return false;
        }
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

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enqueue("a");
        q.enqueue("b");
        q.enqueue("c");

        if (q.isEmpty() == false) {
            println(q.front());
        }

        q.dequeue();
        if (q.isEmpty() == false) {
            System.out.println(q.front());
        }

        q.dequeue();
        if (q.isEmpty() == false) {
            System.out.println(q.front());
        }


    }

    private static void println(String front) {
        System.out.println(front);
    }
}