class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        int i = 0;
        int count = 1;
        while(j < nums.length){
            if(nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i = i + 1;
                count++;
            }
            else{
                j++;
            }
        }
    return count;
    }
    
}

/*  HashSet<Integer> set = new HashSet();
        for(int i = 0; i < nums.length ; i++){
            set.add(nums[i]);
        }
        ArrayList<Integer> a = new ArrayList<>(set);
        Collections.sort(a);
        int i = 0;
        for(int ele: a)
            nums[i++] = ele;
        return a.size();
*/