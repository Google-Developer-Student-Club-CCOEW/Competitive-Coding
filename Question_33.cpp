class Solution {
public:
    int matchPlayersAndTrainers(vector<int>& players, vector<int>& trainers) {
         
    sort(begin(players), end(players));
    sort(begin(trainers), end(trainers));
    const int n = players.size();
    const int m = trainers.size();
    int ans = 0;
    for (int i = 0, j = 0; i < n && j < m; ++i) {
      while (j < m && players[i] > trainers[j]) ++j;
      if (j++ == m) break;
      ++ans;
    }
    return ans;
    }
};
