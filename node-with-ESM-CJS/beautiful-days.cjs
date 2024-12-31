async function beautifulDays(i,j,k) {
  
    for (let index = i; index <= j; index++) {
        const valu = index;
        console.log(parseInt(valu.toString().split('').reverse().join('')))
        
    }
    
}
beautifulDays(20,23,6)