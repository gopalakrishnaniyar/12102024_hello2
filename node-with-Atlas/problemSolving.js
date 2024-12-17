//https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true
const arr = [1,1,0,-1,-1]
console.log(arr.filter(item => item < 0).length / arr.length)
console.log(arr.filter(item => item > 0).length / arr.length)
console.log(arr.filter(item => item == 0).length / arr.length)