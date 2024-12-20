const fs = require('fs').promises;

console.log('Before Reading File');
async function readFileAsync() 
{
        const data = await fs.readFile('./file1.txt','utf8');
        console.log('After Reading File: ' + data);
}

readFileAsync();
console.log('im called second even though im paced last line of code.');