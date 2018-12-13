public class IntegerBreak {
  public int integerBreak(int n){
  
  int [] dp = new int [n + 1];
  dp[1] = 1;
  int maxdp = 0;
  for(int i = 2; i < n ; i++){
    for(int j = 1; j <= i / 2; j++){
    maxdp = dp[i]; 
    maxdp = Math.max(Math.max(dp[j],j) * Math.max(i-j, dp[i-j]),dp[i);
    }
  }
  return dp[n];                                                                   
 }
}
