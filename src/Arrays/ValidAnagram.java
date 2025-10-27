package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public static void main(String args[]) {
        //System.out.println(isAnagram("jam", "mag"));
        System.out.println(isAnagram_2("jam", "maj"));

    }

    static boolean isAnagram(String s, String t) {
        int[] ch = new int[26];
        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            ch[s.charAt(i) - 'a']++;
            ch[t.charAt(i) - 'a']--;
        }
        for (int x : ch) {
            if (x != 0) return false;
        }
        return true;
    }

    static boolean isAnagram_1(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        Arrays.sort(sc);
        Arrays.sort(tc);

        return Arrays.equals(sc, tc);

    }

    static boolean isAnagram_2(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character,Integer>hs= new HashMap<>();
        HashMap<Character,Integer>ht= new HashMap<>();
        for(int i=0;i<s.length();i++){
            hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i),0)+1);
            ht.put(t.charAt(i), ht.getOrDefault(t.charAt(i),0)+1);
        }
        return hs.equals(ht);

    }
}


