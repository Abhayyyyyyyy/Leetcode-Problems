class Solution {
    public int longestSubarray(int[] nums) {
        
        int count = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] != 0){
                count++;
            }else{
                list.add(count);
                count = 0;
            }
        }
        list.add(count);
        count = 0;
        for(int i = 0, j = i+1; j < list.size(); i++, j++){
            if( ( list.get(i) + list.get(j) ) > count ){
                count = list.get(i) + list.get(j);
            }
        }
        return list.size() == 1 ? nums.length - 1 : count;
    }
}    