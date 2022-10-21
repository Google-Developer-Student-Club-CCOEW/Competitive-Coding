	#include <bits/stdc++.h>
	using namespace std;
	int solve(int n,vector<vector<int>> logs)
	{
		int d = logs[0][1];
		int ind = logs[0][0];

		for (int i = 1; i <= logs.size() - 1; i++)
		{
			int res = logs[i][1] - logs[i - 1][1];
			if (res == d)
			{
				ind = min(ind, logs[i][0]);
			}

			if (res > d)
			{
				d = res;
				ind = logs[i][0];
			}
		}
		return ind;
	}

	int main()
	{
		int n;
		cin >> n;
		vector<vector<int>> logs;
		int tasks;
		cin >> tasks;
		for (int i = 0; i < tasks; i++)
		{
			vector<int> temp;
			for (int j = 0; j < 2; j++)
			{
				int val;
				cin >> val;
				temp.push_back(val);
			}
			logs.push_back(temp);
		}
		cout << solve(n, logs);
		return 0;
	}