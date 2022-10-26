#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

int main(){
    
    cin.tie(0)->sync_with_stdio(0); 
    cin.exceptions(cin.failbit);

    int test_case = 1;
    cin >> test_case;

    for(int t = 1; t <= test_case; t++){
        
        cout <<"Case #" << t << ": "; 
        
        ll n;
        cin >> n;

        vector<string> upper_half(n), lower_half(n);
        
        for(ll i = 0; i<n; i++){
            cin >> upper_half[i]; 
        }
        for(ll i = 0; i<n; i++){
            cin >> lower_half[i]; 
        }
        
        ll ans = 0;

        ll upperleftI = 0, lowerleftI = 0;
        for(ll i = 0; i<n; i++){
            for(ll j = 0; j<n; j++){
                
                if(upper_half[i][j] == 'I')
                    upperleftI++;
                
                if(lower_half[i][j] == 'I')
                    lowerleftI++;

            }

        }
        ans += (abs(upperleftI - lowerleftI));
        
        ll upperrightI = 0, lowerrightI = 0;
        for(ll i = 0; i<n; i++){
            for(ll j = n; j<(2*n); j++){
                
                if(upper_half[i][j] == 'I')
                    upperrightI++;
                
                if(lower_half[i][j] == 'I')
                    lowerrightI++;

            }

        }
        ans += (abs(upperrightI - lowerrightI));


       cout <<  ans << "\n";

    }

    return 0;
}