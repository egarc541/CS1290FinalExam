# 3. Palindromic Substrings

# Part 1 - Recursive Solution
 size = string.length <br>
 dp[][] = dp[size][size] <br>
 count = 0 <br>
 dp[i][j] = if(string.charAt(i) = string.charAt(j) && (i > j-2 || dp[i+1][j-1)) return true, count++ <br>
 return count
 
 

# Part 2 - Explanation 
