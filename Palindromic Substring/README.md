# 3. Palindromic Substrings

# Part 1 - Recursive Solution
 size = string.length <br>
 dp[][] = dp[size][size] <br>
 count = 0 <br>
 testdp [i][j] = dp[i][j] <br>
 testdp[i][j] = if(string.charAt(i) = string.charAt(j) && (i > j-2 || dp[i+1][j-1)){ count++ , dp[i][j]= true };  <br>
 count
 
# Part 2 - Explanation 
For this problem my approach to solve in dp, was making the dp variable a boolean in order to make sure that the string was
check from start to end and the words match. By having a double array it would make sure both sides were check and by also
having a count it would specify the amount of substrings this string has. 
