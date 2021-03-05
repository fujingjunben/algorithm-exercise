package data.queue;

import java.util.ArrayList;
import java.util.List;

class MyCircularQueue {
    private int[] data;
    private int head;
    private int tail;
    private int size;

    public MyCircularQueue(int size) {
        this.size = size;
        this.data = new int[size];
        this.head = -1;
        this.tail = -1;
    }

    public boolean enQueue(int e) {
        if (isFull()) {
            return false;
        }
        if (this.head == -1) {
            this.head = 0;
        }
        this.tail++;
        if (this.tail >= this.size) {
            this.tail = 0;
        }
        this.data[this.tail] = e;
        return true;

    }

    public boolean isFull() {
        if ((this.head == 0) && (this.tail == this.size - 1)) {
            return true;
        } else if ((this.head - this.tail) == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        return this.tail == -1 && this.head == -1;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        } else {
            if (this.head == this.tail) {
                this.head = -1;
                this.tail = -1;
            } else {
                this.head++;
                if (this.head >= this.size) {
                    this.head = 0;
                }
            }

            return true;
        }
    }

    public int Front() {
        if (this.head >= 0) {
            return this.data[this.head];
        } else {
            return -1;
        }
    }

    public int Rear() {
        if (this.tail >= 0) {
            return this.data[this.tail];
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
<<<<<<< HEAD:data-type/queue/MyCircularQueue.java
        MyCircularQueue circularQueue = new MyCircularQueue(3); // 设置长度为 3
        boolean result = circularQueue.enQueue(1); // 返回 true
        assert result;
        result = circularQueue.enQueue(2); // 返回 true
        assert result;
        result = circularQueue.enQueue(3); // 返回 true
        assert result;
        result = !circularQueue.enQueue(4); // 返回 false，队列已满
        assert result;
        result = 3 == circularQueue.Rear(); // 返回 3
        assert result;
        assert(circularQueue.isFull()); // 返回 true
        result = circularQueue.deQueue(); // 返回 true
        assert result;
        assert (2 == circularQueue.Front());
        result = circularQueue.enQueue(4); // 返回 true
        assert result;
        assert(4 == circularQueue.Rear()); // 返回 4
        result = circularQueue.deQueue(); // 返回 true
        assert result;
        assert (3 == circularQueue.Front());
        result = circularQueue.deQueue(); // 返回 true
        assert result;
        assert (4 == circularQueue.Front());
        result = circularQueue.deQueue(); // 返回 true
        assert result;
        assert (circularQueue.isEmpty());

=======
        MyCircularQueue circularQueue = new MyCircularQueue(3);
        circularQueue.enQueue(1);
        circularQueue.enQueue(2); // 返回 true
        circularQueue.enQueue(3); // 返回 true
        circularQueue.enQueue(4);
        circularQueue.Rear(); // 返回 3
        circularQueue.isFull(); // 返回 true
        circularQueue.deQueue(); // 返回 true
        circularQueue.enQueue(4); // 返回 true
        circularQueue.Rear(); // 返回 4
>>>>>>> 12e17cac64270ab7a9a4734996ed9908fe58d0d5:src/main/java/data/queue/MyCircularQueue.java
    }

}