// Find the maximum longest substring that has characters that do not repeat.

//LOGIC:Starting from the beginning of string, Kep a track of the charaters that are repeated so far. If a reapeat happens stop the itration and now the string is the answer. Conttinue for all substring. 

import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String temp = "", ans = "";
        System.out.println(s);
        for (int i = 0; i < s.length()-ans.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                char x = s.charAt(j);
                if (!temp.contains(x + "") || j==s.length()-1 ) {
                    temp += x;
                } else {
                    if (temp.length() > ans.length()) {
                        ans = temp;
                        System.out.println(ans+" "+temp);
                    }
                    temp = "";
                    break;
                }
            }
        }
        System.out.println(ans + " length:" + ans.length());
    }
}
