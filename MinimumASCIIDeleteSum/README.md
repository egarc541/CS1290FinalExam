  # 5. Minimum ASCII DeleteSum for Two Strings
  
  # Part 1 - Recursive Solution
  m = s1.1ength <br>
  n = s2.length <br>
  dp = dp[m][n] <br>
  dp[i][0] = dp[i-1][0] + s1.charAt(i-1) <br>
  dp[0][j] = dp[0][j-1] + s2.charAt(j-1) <br>
  sameDP = if(s1.charAt(i-1) == s2.charAt(j-1) ? dp[i-1][j-1] : 
                dp[i][j] = Math.min(dp[i-1][j] + s1.charAt(i-1), dp[i][j-1] + s2.charAt(j-1)) <br>
  dp[m][n]
  
  # Part 2 - Explanation
