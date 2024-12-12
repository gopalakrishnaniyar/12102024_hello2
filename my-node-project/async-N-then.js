const { json } = require("express");

async function fetchData() {
    try {
        const resp = await fetch('https://api.publicapis.org/entries');
        console.log(resp.status);
    }
    catch (e) { console.error(e) }
}

const test = fetchData();
console.log('test date: ' + test)

fetch('https://api.publicapis.org/entries').then(response => console.log('then function: ' + response.status)); 