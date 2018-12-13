# 7. Integer Break

# Part 1 - Recursive Solution

dp[n] = dp[n+1]<br>
dp[1] = 1<br>
dp[i] = maxdp<br>
maxdp = Math.max(Math.max(dp[j],j) * Math.max(i-j, dp[i-j]),dp[i)

# Part 2 - Explanation
For this problem my approach for dynamic programming was using a single array to store the specific values for example when
dp[i] is establish the output will be i. For example dp[3] = 3. My next step is using a two for loop to make sure the
array get fill. Inside the for loop it will be checking with Math.max so make sure dp maintains the greatest value that we could
get when we split i. 
