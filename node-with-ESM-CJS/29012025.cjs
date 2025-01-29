//Array reduction method
var myList = [12121,1,34,-1,2,34,787,999];
var maxNum = myList.reduce((max,num) => (num >max ? num : max), myList[0]);
console.log(maxNum)