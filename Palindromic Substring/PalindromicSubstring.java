public class PalindromicSubstring{
  public int substringsCount (String string){
    int size = string.length;
    boolean [][] check = new boolean [size][size];
    int count = 0;
    for(int j= 0; j < size; j++){
      for(int i= 0; i <= j; i++){
        if(string.charAt(i)== string.charAt(j) && (i > j-2 || dp[i+1][j-1]){
          dp[i][j] = true;
          count ++;
        }
      }
    }
    return count;
  }
}
