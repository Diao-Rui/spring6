package simple;

/**
 * @Author: Diao Rui
 * @className: Simple541
 * @Description: 541. 反转字符串 II
 * @DateTime: 2023/8/7 16:13
 * @version: 1.0
 **/
public class Simple541 {
    public static void main(String[] args) {
        System.out.println(new Simple541().reverseStr("abcdefg", 8));
    }

    public String reverseStr(String s, int k) {
        int n = s.length();
        char[] arr = s.toCharArray();
        for (int i = 0; i < n; i += 2 * k) {
            reverse(arr, i, Math.min(i + k, n) - 1);
        }
        return new String(arr);
    }

    public void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}
