const myArray = [1,8,9];
const sumRight = myArray.reduceRight((acc, cur) => acc + cur, 42 )
console.log(sumRight)