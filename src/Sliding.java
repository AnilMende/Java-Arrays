public class Sliding {
    public static void main(String[] args) {
        //Problem 1 Chocolate Distribution
        int nums[] = {1,3,4,7,9,9,12,56};
        int k = 5;
        int res = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=0;i< n -k+1;i++){
            int min = nums[i];
            int max = nums[i+k-1];
            res = Math.min(res,max - min);
        }
        System.out.println("The min difference is "+ res);

        //Problem2 Maximum sum subarray of size k

        int nums1[] = {100,200,50,0,300,20,100};
        int k1 = 3;
        int m = nums1.length;
        int ind = 0;
        int sum = 0;
        int maxSum = 0;
        while(ind < m && ind < k1){
            //by using this we can find the first window sum
            sum += nums1[ind];
            ind++;
        }
        maxSum = sum;
        for(int i=1;i<=m - k1;i++){
            // to calculate window sums from 1st to n-kth window we use prev and next
            int prev = nums1[i-1];
            int next = nums1[i+k1-1];
            sum = sum - prev + next;
            maxSum = Math.max(sum,maxSum);
        }
        System.out.println("The Maximum sub array sum of k is " +  maxSum);

        //Problem 3 
    }
}
