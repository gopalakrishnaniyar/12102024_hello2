function beautifulDays(i, j, k) {
    // Create an array from the range i to j
    const range = Array.from({ length: j - i + 1 }, (_, index) => index + i);

    // Filter to count beautiful days
    const BDays = range.filter(value => 
        Math.abs(parseInt(value.toString().split('').reverse().join('')) - value) % k === 0
    ).length;

    return BDays; // Return the count
}

const result = beautifulDays(20, 23, 6);
console.log(result); // Output the result
