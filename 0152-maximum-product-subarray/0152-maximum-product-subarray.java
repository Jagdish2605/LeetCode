class Solution {
    public int maxProduct(int[] nums) {
        int currentmin= nums[0];
        int currentmax = nums[0];
        int result = nums[0];

        for(int i=1;i<nums.length;i++){
            int num=nums[i];

            int tempmax = Math.max(num,Math.max(currentmax*num,currentmin*num));
            int tempmin = Math.min(num,Math.min(currentmax*num,currentmin*num));

            currentmax= tempmax;
            currentmin=tempmin;

            result= Math.max(result,currentmax);
        }
        return result;
        
    }
}