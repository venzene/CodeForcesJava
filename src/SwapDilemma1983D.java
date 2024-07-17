import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SwapDilemma1983D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = readArray(br, n);
            int[] b = readArray(br, n);

            if (!canBeMadeSame(a, b)) {
                sb.append("NO\n");
            } else {
                sb.append("YES\n");
            }
        }

        System.out.print(sb);
    }

    private static int[] readArray(BufferedReader br, int n) throws IOException {
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        return arr;
    }

    private static boolean canBeMadeSame(int[] a, int[] b) {
        if (!Arrays.equals(Arrays.stream(a).sorted().toArray(), Arrays.stream(b).sorted().toArray())) {
            return false;
        }

        int swapsA = countInversions(a.clone());
        int swapsB = countInversions(b.clone());

        return (swapsA - swapsB) % 2 == 0;
    }

    private static int countInversions(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        return mergeSortAndCount(arr, temp, 0, n - 1);
    }

    private static int mergeSortAndCount(int[] arr, int[] temp, int left, int right) {
        int mid, invCount = 0;
        if (right > left) {
            mid = (right + left) / 2;

            invCount += mergeSortAndCount(arr, temp, left, mid);
            invCount += mergeSortAndCount(arr, temp, mid + 1, right);

            invCount += mergeAndCount(arr, temp, left, mid + 1, right);
        }
        return invCount;
    }

    private static int mergeAndCount(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left, j = mid, k = left;
        int invCount = 0;

        while (i <= mid - 1 && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid - i);
            }
        }

        while (i <= mid - 1) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return invCount;
    }
}
