public class StoneGame{
  public boolean stoneGame( int [] piles) {
      int [] dp = Arrays.copyOf(piles, piles.length);
      for(int v= 1; v < piles.length; v++){
       for(int i= 0; i < piles.length - v; i++){
           dp[i] = Math.max(piles[i] - dp[i+1], piles[i+d] -dp[i]);
    }  
  }
  return dp[0] > 0; // return true;
  
 }
}
