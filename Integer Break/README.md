# 7. Integer Break

# Part 1 - Recursive Solution

dp[n] = dp[n+1]<br>
dp[1] = 1<br>
dp[i] = Math.max(Math.max(dp[j],j) * Math.max(i-j, dp[i-j]),dp[i)

# Part 2 - Explanation
