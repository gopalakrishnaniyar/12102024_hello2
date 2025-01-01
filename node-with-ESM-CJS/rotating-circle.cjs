var myArray = [5,3,2];
const round = 2
const range = Array.from({length:round}, (_ ,item) => item + 1)

range.forEach(element => {
    myArray.unshift(myArray[myArray.length - 1])
    myArray.pop()
});

console.log(myArray)