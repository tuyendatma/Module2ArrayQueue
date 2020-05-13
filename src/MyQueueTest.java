import java.util.Arrays;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);
        queue.enqueue(4);
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(23);
        queue.enqueue(435);
        queue.dequeue();
        queue.dequeue();

        int[] arr = queue.queueArr;
        System.out.println(Arrays.toString(arr));
    }
}
