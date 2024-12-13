
async function fetchData() {
    try {
        const resp = await fetch('https://api.publicapis.org/entries');
        Promise.resolve(resp);
        console.log(Promise.allSettled());
    }
    catch (e) { console.log('error in fetching') }
}

fetchData();


