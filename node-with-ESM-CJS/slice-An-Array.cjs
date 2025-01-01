const mainArray = [2, 3, 12, 7, 8, 9]
const queries = [1, 4, 5, 34]
const results = queries.filter(item => mainArray[item] != null).map(item => mainArray[item])
console.log(results)