//  here in these fuction we are going  create the math function and export them in the script library


const mathe={
    add:(a,b)=> {return a+b},
    sub:(a,b)=> {return a-b},
    mul:(a,b)=> {return a*b},
    div:(a,b)=> {return a/b}
};

module.exports.mathe = mathe;   // with this line we are passing the value from one script to another one