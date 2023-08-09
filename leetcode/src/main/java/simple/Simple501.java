package simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Diao Rui
 * @className: Simple501
 * @Description: 501. 二叉搜索树中的众数
 * @DateTime: 2023/8/4 10:03
 * @version: 1.0
 **/
public class Simple501 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 2, 4, 4, 4, 7);
        int max = 0;
        int i = 0, j = 1;
        while (i < list.size()) {
            j = i + 1;
            while (j < list.size() && list.get(i) == list.get(j))
                j++;
            max = Math.max(max, (j - i));
            i = j;
        }
        List<Integer> res = new ArrayList<>();
        i = 0;
        while (i < list.size()) {
            j = i + 1;
            while (j < list.size() && list.get(i) == list.get(j))
                j++;
            if (max == (j - i))
                res.add(list.get(i));
            i = j;
        }
        //方法引用
        int[] ints = res.stream().mapToInt(Integer::valueOf).toArray();
        System.out.println(Arrays.toString(ints));
    }
}
