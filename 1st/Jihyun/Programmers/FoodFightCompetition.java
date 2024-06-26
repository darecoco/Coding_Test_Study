import java.util.ArrayList;

class Solution {
    String solution(int[] arr) {
        String answer = "";
        ArrayList<Integer> food = new ArrayList<>();

        for (int i = 1; i < arr.length; i++)
            for (int j = 0; j < arr[i] / 2; j++)
                food.add(i);

        for (int i = 0; i < arr.length; i++)
            answer += food.get(i);
        answer += "0";
        for (int i = arr.length - 1; i >= 0; i--)
            answer += food.get(i);

        return answer;
    }
}

class FoodFightCompetition {
    public static void main(String args[]) {
        int[] a = { 1, 3, 4, 6 };
        String answer;
        Solution s = new Solution();
        answer = s.solution(a);
        System.out.println(answer);
    }
}