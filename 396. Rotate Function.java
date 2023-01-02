class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int sum =0;
        int F = 0;

        for(int i=0;i<n;i++){
            //sum of arrays 
            sum += nums[i];

            //Rotate function sum
            F += i*nums[i];
        }

        int maxValue = F;

        for(int i=  n-1;i>=0;i--){
            F = F + sum - n*nums[i];  //rotated array sum
            maxValue = Math.max(maxValue,F);            
        }
        return maxValue;


    }
}

   //# N2 Soln => TLE showing
    // {
    //     int maxValue = Integer.MIN_VALUE;
    //     int n = nums.length;
    //     int sum = 0;

        

    //     for(int i=0;i<n;i++){
    //         if(i==0){
    //          maxValue = Math.max(maxValue,sum);
    //         }
    //         else{
    //             rotateOneTimeClockwise(nums);
    //             sum = rotateFunction(nums);
    //             maxValue = Math.max(maxValue,sum);
    //         }
    //     }
    //     return maxValue;
    // }

    // public int rotateFunction(int[]arr){
    //     int ans=0;
    //     for(int i=0;i<arr.length;i++){
    //         ans += (i*arr[i]);
    //     }
    //     return ans;
    // }

    // void rotateOneTimeClockwise(int[]arr){
    //     int i,last;
    //     int n = arr.length;
    //     last = arr[n-1];
    //     for(i =n-1;i>=1;i--){
    //         arr[i] = arr[i-1];
    //     }
    //     arr[0]=last;
    // / }

// ques : https://leetcode.com/problems/rotate-function/description/
