import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.offerLast(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                deque.offerLast(arr[i]);
            }
        }

        int[] answer = new int[deque.size()];

        int index = 0;
        for (int num : deque) {
            answer[index++] = num;
        }

        return answer;
    }
}