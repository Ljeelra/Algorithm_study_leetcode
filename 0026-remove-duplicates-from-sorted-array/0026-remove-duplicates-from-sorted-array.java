class Solution {
    public int removeDuplicates(int[] nums) {
        // 중복 허용 안하니까 Set을 써도 될것 같다.
        int i = 0; //고유 원소 위치
        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }

        return i+1;
        
    }
}