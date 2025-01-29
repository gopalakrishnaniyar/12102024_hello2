//Array reduction method
var myList = [12121,1,34,-1,2,34,787,999];
var maxNum = myList.reduce((max,num) => (num >max ? num : max), myList[0]);
console.log(maxNum)

// All about date functions
const currentDate = new Date();
console.log(currentDate);
const yr   = currentDate.getFullYear();
const day = currentDate.getDate();
const mnth = currentDate.getMonth() + 1;
console.log(yr + '' + mnth + '' + day);

// add 1 month to curretnDate
currentDate.setMonth(currentDate.getMonth()+1);
console.log(currentDate);

//since feb doesnt have feb 29. a date incrementing to +1 on jan 29, takes the next month to Feb 01.. lovely 
//Wed Jan 29 2025 16:37:17 GMT+0200 (Eastern European Standard Time)
//2025129
//Sat Mar 01 2025 16:37:17 GMT+0200 (Eastern European Standard Time)

