import java.util.HashMap;
import java.util.Map;

class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        //check for length
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> count = new HashMap<Character, Integer>();
        //Loop through S and
        for(char ch: s.toCharArray()){
            count.put(ch, count.getOrDefault(ch,0) +1);
        }
        //Loop through t
        for(char ch: t.toCharArray()){
            if(!count.containsKey(ch)){
                //Exit if char not in S
                return false;
            }
            //If found decrement it like striking off
            count.put(ch, count.get(ch) -1);
            if(count.get(ch) < 0){
                return false;
            }
        }
        return true;
    }
}