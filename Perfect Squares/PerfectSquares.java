public class PerfectSquares{
  public int numSquares(int n){
    int[] dp = new int[n+1];
    Arrays.fill(dp, Integer.MAX_VALUE);
    dp[0] = 0;
    int[] mindp = new int[];
    for(int i= 0; i <= n; i++){
      for(int j= 1; i+j *j <= n;j++){
        mindp[i]= dp[i +j*j];
        mindp[i] = Math.min(dp[i+j*j],dp[i]+1);
      }
    }
    return dp[n];
  }
}
