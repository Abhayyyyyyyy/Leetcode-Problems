class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for(int i = 0; i < nums.length ; i++){
            set.add(nums[i]);
        }
        ArrayList<Integer> a = new ArrayList<>(set);
        Collections.sort(a);
        int i = 0;
        for(int ele: a)
            nums[i++] = ele;
        return a.size();
    }
}