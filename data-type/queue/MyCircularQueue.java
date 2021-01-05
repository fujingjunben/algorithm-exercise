import java.util.ArrayList;
import java.util.List;

class MyCircularQueue {
    private List<Integer> data;
    private int head;
    private int tail;
    private int size;

    public MyCircularQueue(int size) {
        this.size = size;
        this.data = new ArrayList<>(size);
        this.head = 0;
        this.tail = 0;
    }

    public boolean enQueue(int e) {
        if (isFull()) {
            return false;
        }
        return true;

    }

    public boolean isFull() {
        return false;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public int Front() {
        return -1;
    }

    public int Rear() {
        return -1;
    }

    public static void main(String[] args) {
        MyCircularQueue circularQueue = new MyCircularQueue(3); // 设置长度为 3
        circularQueue.enQueue(1); // 返回 true
        circularQueue.enQueue(2); // 返回 true
        circularQueue.enQueue(3); // 返回 true
        circularQueue.enQueue(4); // 返回 false，队列已满
        circularQueue.Rear(); // 返回 3
        circularQueue.isFull(); // 返回 true
        circularQueue.deQueue(); // 返回 true
        circularQueue.enQueue(4); // 返回 true
        circularQueue.Rear(); // 返回 4
    }

}