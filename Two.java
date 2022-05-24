// Given a string that contains only 1s,0s. Find the number of flips that are required to transform the string into an alternating binary string.

// LOGIC: Given the string, there are only two wys in ehich a binary string can be generated. 
// ex. 101010101... or 0101010.... 
// Comparing and finding the minimum number of flips will return the answers.
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.next();
        String s1 = "";
        String s2 = "";
        int c1 = 0, c2 = 0;
        for (int i = 0; i < s.length(); i++) {
            s1 += ((i + 1) % 2) + "";
            s2 += (i % 2) + "";
        }
        System.out.println("One possible string: "+s1);
        System.out.println("Second possible string: " + s2);
        for (int i = 0; i < s.length(); i++) {
            if (s1.charAt(i) != s.charAt(i)) {
                c1++;
            }
            if (s2.charAt(i) != s.charAt(i)) {
                c2++;
            }
        }
        System.out.println(Math.min(c1, c2) + " flips");
    }
}
