const myArray = ['a','b','c']
myArray.push('z')
myArray.unshift('z1')
myArray.pop()
myArray.shift()

console.log(myArray)
const arrayNumbers = [1,2,3,4,5]
console.log(arrayNumbers)

myArray.forEach(item => {console.log(item)}) //
const squared = arrayNumbers.map(item => item * item)
const filter = arrayNumbers.filter(item => item > 3)
console.log(squared)
console.log(filter)


