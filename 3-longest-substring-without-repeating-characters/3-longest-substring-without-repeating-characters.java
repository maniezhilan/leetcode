class Solution {
    public int lengthOfLongestSubstring(String s) {
        char [] arr = s.toCharArray();
        Set charSet = new HashSet<Character>();
        int l = 0;
        int res = 0;
        for(int i=0; i < arr.length; i++){
            while(charSet.contains(arr[i])){
                charSet.remove(arr[l]);
                l += 1;
                
            }
            charSet.add(arr[i]);
            res = Math.max(res,i - l + 1);
        }
        return res;
        
    }
}