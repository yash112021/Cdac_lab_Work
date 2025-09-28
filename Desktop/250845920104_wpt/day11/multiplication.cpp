#include<iostream>
using namespace std;
int main(){

    int r1,r2,c1,c2;
   

    cout<<"Enter the row and col of 1st matrix";
    cin>>r1>>c1;
    cout<<"Enter the row and col of 2nd matrix";
    cin>>r2>>c2;

    if(c1!= r2){
        cout<<"matrix multiplicatio is not possible";
    }
    int  mat1[r1][c1], mat2[r2][c2], result[r1][c2];

    //input 1st matrix
    for(int i=0; i<r1; i++){
        for(int j=0; j<c1; j++){
            cin>>mat1[i][j];
        }
    }
    //input 1st matrix
    for(int i=0; i<r2; i++){
        for(int j=0; j<c2; j++){
            cin>>mat2[i][j];
        }
    }

    for(int i=0; i<r1; i++){
        for(int j=0; j<c2; j++){
            result[i][j]=0;
        }
    }

    for(int i=0; i<r1; i++){
        for(int j=0; j<c2; j++){
           for(int k=0; k<c1; k++){
         result[i][j]+= mat1[i][k]*mat2[k][j];
           }
        }
    }

   for(int i=0; i<r1; i++){
        for(int j=0; j<c2; j++){
           cout<< result[i][j] << " ";

        }
        cout<<endl;
    }
}
