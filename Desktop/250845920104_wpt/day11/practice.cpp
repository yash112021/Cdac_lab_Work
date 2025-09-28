#include<iostream>
#include<vector>
using namespace std;

class LibraryItem{
    public:
    virtual void showDetails() =0;
    virtual string getCategory() =0;
    virtual int computeCost(int) =0;
};

class Book: public LibraryItem{
    private:
    string title;
    string author;
    int pricePerDay;

    public:

    Book(){};   //default constructor

    Book(string title, string author, int pricePerDay){
   this-> title=title;
   this-> author=author;
   this-> pricePerDay=pricePerDay;
    }
     void showDetails()override{
        cout<<"Title of the book is : "<<title<<endl;
        cout<<"Author of the book is : "<<author<<endl;
        cout<<"pricePerDay of the book is : "<<pricePerDay<<endl;
     }

     string getCategory()override{
        string s = "Book";
        return s;
     }

     int computeCost(int days)override{
        return pricePerDay*days;
     }
};

     class Magazine:public LibraryItem{
        private:
        string title;
        int issueNumber;
        int subscriptionFee;
        public:

        Magazine(){};   //default constructor

     Magazine(string title, int issueNumber, int subscriptionFee){
   this-> title=title;
   this-> issueNumber=issueNumber;
   this->  subscriptionFee= subscriptionFee;
    }
     void showDetails()override{
        cout<<"Title of the book is : "<<title<<endl;
        cout<<"Author of the book is : "<<issueNumber<<endl;
        cout<<"pricePerDay of the book is : "<< subscriptionFee<<endl;
     }

     string getCategory()override{
        string s = "Magazine";
        return s;
     }

     int computeCost(int days)override{
        return subscriptionFee*days;
     }

     };

     int main(){
       vector<LibraryItem *> lib;
        lib.push_back(new Book("java","jyoti", 40));
        lib.push_back(new Book("java","jyoti", 40));
        lib.push_back(new Book("java","jyoti", 40));

        lib.push_back(new Magazine("geographical", 201, 1200));
        lib.push_back(new Magazine("geographical", 201, 1200));
        lib.push_back(new Magazine("geographical", 201, 1200));

        for(auto e : lib){
            e->showDetails();
            cout<<"category"<< e->getCategory();
            cout<<"compute cost"<< e->computeCost(2);
            cout<<endl;
            cout<<"***************************************************";
            cout<<endl;
        }
     }
   

