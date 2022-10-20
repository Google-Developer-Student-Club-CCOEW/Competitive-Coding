string str[4][10] = {
	{ "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" },
	{ "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" },
	{ "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" },
	{ "", "M", "MM", "MMM" }
};

class Solution
{
	public:
	string intToRoman(int num)
	{
		if(num <= 0 || num > 3999)  return string();

		string res;

		res.reserve(200);

		stack<int> st;
		int digits = 0;
		while(num)
		{
			st.push(num % 10);
			num /= 10;
			++digits;
		}
		while(!st.empty())
		{
			int temp = st.top();
			res += str[--digits][temp];
			st.pop();
		}
		return res;
	}
};
