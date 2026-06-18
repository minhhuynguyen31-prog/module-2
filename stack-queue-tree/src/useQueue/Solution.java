package useQueue;

public class Solution {
    public void enQueue(Queue queue,int value) {
        Node temp = new Node(value);

        if(queue.front == null){
            queue.front = temp;
            queue.rear = temp;
            queue.rear.next = queue.front;
        }else {
            queue.rear.next = temp;
            queue.rear = temp;
            queue.rear.next = queue.front;
        }
    }
    public Integer deQueue(Queue queue){
        if (queue.front == null){
            return null;
        }
        int vaulue = queue.front.key;
        if(queue.front == queue.rear){
            queue.front = null;
            queue.rear = null;
        }else {
            queue.front = queue.front.next;
            queue.rear.next = queue.front;
        }
        return vaulue;
    }
    public void displayQueue(Queue queue) {
        if (queue.front == null) {
            System.out.println("Hàng đợi trống!");
            return;
        }

        Node temp = queue.front;
        System.out.print("Các phần tử trong hàng đợi vòng: ");

        // Sử dụng vòng lặp do-while để duyệt qua cấu trúc vòng
        do {
            System.out.print(temp.key + " ");
            temp = temp.next;
        } while (temp != queue.front);

        System.out.println();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Queue q = new Queue();

        System.out.println("--- THÊM PHẦN TỬ (ENQUEUE) ---");
        sol.enQueue(q, 10);
        sol.enQueue(q, 20);
        sol.enQueue(q, 30);
        sol.enQueue(q, 40);
        sol.displayQueue(q); // Output dự kiến: 10 20 30 40

        System.out.println("\n--- XÓA PHẦN TỬ (DEQUEUE) ---");
        System.out.println("Lấy ra: " + sol.deQueue(q)); // Lấy ra 10
        System.out.println("Lấy ra: " + sol.deQueue(q)); // Lấy ra 20
        sol.displayQueue(q); // Output dự kiến: 30 40

        System.out.println("\n--- THÊM TIẾP PHẦN TỬ ---");
        sol.enQueue(q, 50);
        sol.displayQueue(q); // Output dự kiến: 30 40 50
    }

}
