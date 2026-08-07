import java.util.*;

public class GroupAnagramASII {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            int [] count = new int[26];
            char[] charArray = str.toCharArray();
            for (char ch: charArray) {
                count[ch - 'a']++;
            }
            //Build the key from count array
            String key = Arrays.toString(count);
            map.computeIfAbsent(key, k-> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }

}
