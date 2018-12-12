# 1. Stone Game

# Part 1 - DP (Recursive Solution)


dp[i][j] = piles[i]
dp[i][i+j] = max(piles[i] - dp[i+1][i+j], piles[i+j] - dp[i][i+j-1]
dp[0][n-1] > 0

# Part 2 - Explanation
For this problem, my dp approach was using a double array in order to store the maximum amount of stones use by a player. 

