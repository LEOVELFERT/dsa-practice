package threadexamples.synchronization;

import java.util.LinkedList;

public class SharedResource {
    private final LinkedList<Integer> buffer = new LinkedList<>();
    private final int capacity;

    public SharedResource(int capacity) {
        this.capacity = capacity;
    }

    public void produce() throws InterruptedException {
        synchronized (this) {
            while (buffer.size() == capacity) {
                wait();
            }
            int newItem = (int) (Math.random() * 100);
            buffer.add(newItem);
            System.out.println("produced :" + newItem);
            notify();
        }
    }

    public void consume() throws InterruptedException {
        synchronized (this) {
            while (buffer.isEmpty()) {
                wait();
            }
            int removedItem = buffer.removeFirst();
            System.out.println("removed item : " + removedItem);
            notify();
        }
    }
}
