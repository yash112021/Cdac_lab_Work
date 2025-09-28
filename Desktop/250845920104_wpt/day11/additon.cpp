// addition of matrix
#include<iostream>
using namespace std;

int main(){
    int r,c;
    cout<<"Enter the NO of row and columns-->";
    cin>>r>>c;

    // declaring the array
     int  arr[r][c], arr2[r][c];
     int res[r][c]={0};

     cout<<"Enter the Elements-->"<<endl;
     
     for(int i=0;i<r;i++){
          for(int j=0;j<c;j++){
                cin >> arr[i][j];
     }
     }
     for(int i=0;i<r;i++){
          for(int j=0;j<c;j++){
                cin >> arr2[i][j];
     }
     }

     cout<<"add the Elements-->"<<endl;
     
     for(int i=0;i<r;i++){
          for(int j=0;j<c;j++){
                res[i][j] = arr[i][j] + arr2[i][j];
     }
     
     }
        cout<<"addition is"<<res;
  
     return 0;
}