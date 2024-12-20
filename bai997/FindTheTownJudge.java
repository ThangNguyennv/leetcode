package bai997;
import java.util.*;

class FindTheTownJudge {
    public static int findJudge(int n, int[][] trust) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list1.add(i);
        }
        int m = list1.size();
        for (int i = 0; i < trust.length; i++) {
            for (int j = 0; j < list1.size(); j++) {
                if (trust[i][0] == list1.get(j)) {
                    list1.remove(j);
                }
            }
        }
        if (list1.isEmpty()) {
            return -1;
        } else {
            int check = 0;
            for (int i = 0; i < trust.length; i++) {
                if (trust[i][1] == list1.get(0)) {
                    check++;
                }
            }
            if (check == m - 1) {
                return list1.get(0);
            } else {
                return -1;
            }

        }
    }

    public static void main(String[] args) {
        int n = 2;
        int[][] trust = {
                {1, 2}
        };
        System.out.println(findJudge(n, trust));
    }
}