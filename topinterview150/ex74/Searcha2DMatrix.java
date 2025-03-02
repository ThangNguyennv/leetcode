package topinterview150.ex74;

import java.util.ArrayList;
import java.util.List;

public class Searcha2DMatrix {
   public boolean searchTarget(List<Integer> list, int target) {
        int left = 0, right = list.size() - 1;
        int res = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (list.get(mid) == target) {
                res = mid;
                return true;
            } else if (list.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                list.add(matrix[i][j]);
            }
        }
        return searchTarget(list, target);
    }
}

