const myArray = [1,8,9];
const sumRight = myArray.reduceRight((acc, cur) => acc + cur, 42 ) // 42 is constant final value
console.log(sumRight) //