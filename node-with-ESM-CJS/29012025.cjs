//Array reduction method
var myList = [12121,1,34,-1,2,34,787,999];
var maxNum = myList.reduce((max,num) => (num >max ? num : max), myList[0]);
console.log(maxNum)

// All about date functions
const currentDate = new Date();
console.log(currentDate);
console.log(currentDate.getHours());
console.log(currentDate.getMonth() + 1);
console.log(currentDate.toISOString().split('T')[0]);

console.log(currentDate);


