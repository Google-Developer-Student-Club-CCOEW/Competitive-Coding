public class CompetitiveCodingSubArray {
        public long subArrays(int[] nums, int minK, int maxK) {
            long ans = 0;
            int n = nums.length;
            int lastMin = -1;
            int lastMax = -1;
            int start = 0;
            for(int i=0;i<n;i++){
                if(nums[i]<minK || nums[i]>maxK){
                    lastMin = lastMax = -1;
                    start = i+1;
                }
                if(nums[i] == minK){
                    lastMin = i;
                }
                if(nums[i] == maxK){
                    lastMax = i;
                }
                ans = ans + Math.max(0L, Math.min(lastMin, lastMax)-start+1);
            }
            return ans;
        }

    public static void main(String[] args) {
            CompetitiveCodingSubArray obj = new CompetitiveCodingSubArray();
        int nums[] = {1,3,5,2,7,5};
        int minK = 1;
        int maxK = 5;
        long ans1 = obj.subArrays(nums,minK,maxK);
        System.out.println(ans1);
    }
}
