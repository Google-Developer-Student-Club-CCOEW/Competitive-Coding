class Solution {
public:
  int numberOfPaths(vector<vector<int>>& grid, int k) {
    const int kMod = 1e9 + 7;
    const int m = grid.size();
    const int n = grid[0].size();
    vector<vector<vector<int>>> dp(m, vector<vector<int>>(n, vector<int>(k)));
    dp[0][0][grid[0][0] % k] = 1;
    for (int i = 0; i < m; ++i)
      for (int j = 0; j < n; ++j) {
        if (i == 0 && j == 0) continue;
        for (int r = 0; r < k; ++r)
          dp[i][j][(r + grid[i][j]) % k] = 
            ((j ? dp[i][j - 1][r] : 0) + (i ? dp[i - 1][j][r] : 0)) % kMod;          
      }
    return dp[m - 1][n - 1][0];
  }
};
