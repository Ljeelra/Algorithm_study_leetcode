class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer mele = null;

        for(int num: nums){
            if(count == 0){
                mele = num;
                count =1;
            }
            else if(num == mele){ //nums[num] == mele와 같다면
                count += 1;
            } else{
                count += -1;
            }
        }

        return mele;

    }
}