// 2) Understand the Node JS Architecture and understand 
// event loop execution by adding timer and promise concept 

// use below code 

setImmediate(function A() {
	console.log("1st immediate");
});
// this will execitre at last


process.nextTick(function C() {
	console.log("1st process");

}); // second this will be executed



// First event queue ends here
console.log("program started");  // first this will be executed