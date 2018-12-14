public class ArithmeticSlides{

    public int numberOfArithmeticSlices(int[] A) {
        int size = A.length;
        int[] dp = new int[size];
        int sum = 0;
        for(int i=2; i<n; i++){
            if(2*A[i-1] == A[i-2] + A[i]){
             sum += 1 + dp[i-1];
            }
        }
        return sum;
    }
}
