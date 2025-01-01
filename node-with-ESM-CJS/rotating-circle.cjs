function circularArrayRotation(a, k, queries) {

    const range = Array.from({ length: k }, (_, item) => item + 1)
    range.forEach(element => {
        a.unshift(a[a.length - 1])
        a.pop()
    });
    return queries.filter(item => a[item] != null).map(item => a[item])
}

const results = circularArrayRotation([3, 4, 5], 2, [1, 2])
console.log(results)