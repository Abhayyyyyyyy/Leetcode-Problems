class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLength = 201;
        for(int i = 0; i < strs.length; i++){
            minLength =  minLength > strs[i].length() ? strs[i].length() : minLength; 
        } 
        StringBuilder strB = new StringBuilder("");
        String str = strs[0];
        for(int i = 0; i < minLength ; i++){
            for(int j = 1; j < strs.length  ; j++){
                if(strs[j].charAt(i) != str.charAt(i)){
                    return strB.toString();
                }
            }
            strB.append(str.charAt(i));
        }
        return strB.toString();
    }
}