#include <iostream>
#include <vector>
using namespace std;

vector <int> a = {3,14,23,25,50,60,2};  // This is the given array

void tickets(int k){
    int suml=0,sumr=0;
    int n=a.size();
    if(k>a.size()){
            cout << " Can't pick so many tickets" << endl;
            return;
    }
    for(int i=0;i<k;i++){
        suml+= a[i];
        sumr += a[n-i-1];
    }
//     cout << suml << " " << sumr << endl;
    if(suml>sumr){
        cout << suml << endl;
    }
    else if(suml<sumr){
        cout << sumr << endl;
    }
    return;
}

int main(){
    int k;
    cin >> k;
    tickets(k);
    return 0;
}
