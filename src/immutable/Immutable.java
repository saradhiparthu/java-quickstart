package immutable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Immutable {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 5, 4};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+1);
                System.out.println("duplicate");
            } else {
                map.put(nums[i], 1);
            }
        }
        System.out.println(map);
        String s = "anagram";
        String t = "nagaram";
        int[] count = new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i) -'a']++;
            count[t.charAt(i) -'a']--;
        }
        for(int i=0; i<26; i++){
            if(count[i] != 0){
                System.out.println("it's not Anagram");
            }
        }
        System.out.println("its Anagram");
    }
}
