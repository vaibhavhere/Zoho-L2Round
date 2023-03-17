// Given a string of times h:mm:ss. Find the minimum time duration between all the strings.

// LOGIC: It is straight forward problem, compare any two times i,j and check the difference between them. Tricky part was to parse the string of times and convert into hours as integers, minutes as integers, seconds as integers.
 
import java.util.ArrayList;
import java.util.Scanner;

public class _5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j;
        System.out.print("Enter n value: ");
        n = sc.nextInt();
        ArrayList<Integer[]> times = new ArrayList<Integer[]>();
        for (i = 0; i < n; i++) {
            String[] s = sc.next().split(":");
            int h = Integer.parseInt(s[0]);
            if (h == 0)
                h = 24;
            int m = Integer.parseInt(s[1]);
            int ss = Integer.parseInt(s[2]);
            times.add(new Integer[] { h, m, ss });
        }

        int[] ans = { 23, 59, 59 };
        for (i = 0; i < times.size() - 1; i++) {
            for (j = i + 1; j < times.size(); j++) {
                int[] temp = new int[3];
                temp[0] = Math.abs(times.get(i)[0] - times.get(j)[0]);
                temp[1] = Math.abs(times.get(i)[1] - times.get(j)[1]);
                temp[2] = Math.abs(times.get(i)[2] - times.get(j)[2]);
                if (isLesser(temp, ans)) {
                    ans[0] = temp[0];
                    ans[1] = temp[1];
                    ans[2] = temp[2];
                }
            }
        }
        System.out.printf("Minimum interval=%02d:%02d:%02d\n", ans[0], ans[1], ans[2]);
    }

    static boolean isLesser(int[] s1, int[] s2) {
        if (s1[0] < s2[0])
            return true;
        else if (s1[0] > s2[0])
            return false;
        else if (s1[1] < s2[1])
            return true;
        else if (s1[1] > s2[1])
            return false;
        else if (s1[2] < s2[2])
            return true;
        else
            return false;
    }
}
