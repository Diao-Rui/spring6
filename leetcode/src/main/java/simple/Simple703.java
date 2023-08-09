package simple;

import java.util.PriorityQueue;

/**
 * @Author: Diao Rui
 * @className: Simple703
 * @Description: 703. 数据流中的第 K 大元素
 * @DateTime: 2023/8/3 17:31
 * @version: 1.0
 **/
public class Simple703 {
    private int k;
    private PriorityQueue<Integer> queue;

    public Simple703(int k, int[] nums) {
        queue = new PriorityQueue<>();
        this.k = k;
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        queue.offer(val);
        if (queue.size() > k) {
            queue.poll();
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        Simple703 simple703 = new Simple703(3, new int[]{4, 5, 8, 2});
        System.out.println(simple703.add(3));
        System.out.println(simple703.add(5));
        System.out.println(simple703.add(10));
        System.out.println(simple703.add(9));
        System.out.println(simple703.add(4));
    }
}
