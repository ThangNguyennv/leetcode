package tree.bai703;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargest {

    private int k;
    private PriorityQueue<Integer> pq; // Tự động sắp xếp tăng dần

    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>(k);
        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }
    }

    public int add(int val) {
        pq.add(val);
        if (pq.size() > k) {
            pq.poll();
        }
        return pq.peek();
    }

    public static void main(String[] args) {

    }
}
