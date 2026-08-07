import java.util.*;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        // sort the strings
        // eat becomes aet , tea -> aet etc.
        // use the sorted string as Key in a Map and add the anagrams like { "aet" : ["eat","tea"] }

        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for(String str: strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
