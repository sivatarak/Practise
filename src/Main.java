import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] ar ={2,6,1,2,8,3,2,3};
        List<Integer> arr = Arrays.stream(ar).boxed().collect(Collectors.toList());
        System.out.println(arr);
        countingSort(arr);
        System.out.println(countingSort(arr));
    }

    public static List<Integer> countingSort(List<Integer> arr) {
        int n = 0;
        Collections.sort(arr);
        System.out.println(arr);
        for (int i = arr.size() - 1; i > arr.size() - 2; i--) {
            n = arr.get(i) + 1;
        }
        int[] result = new int[n];
        int m = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (i == arr.get(j)) {
                    count++;
                }
            }
            result[m] = count;
            m++;
        }
        for (int k = 0; k < m; k++) {
            System.out.print(result[k]);
        }
        List<Integer> list = Arrays.stream(result).boxed().collect(Collectors.toList());

        return list;
    }
}