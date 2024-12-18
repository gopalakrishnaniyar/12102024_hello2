/*This node.js program uses the await function at the TOP level without being
wrapped into the async function to make this happen, the package.json will have
to contain type as module and also the require statement cannot be used to import
the FS module, rather import statement will have to be used*/
//const fs = require('fs').promises;
import {promises as fs} from 'fs';
const filePath = './file.txt';
try {
    const data = await fs.readFile(filePath,'utf8');
console.log(data);
} catch (error) {

console.log('error');
}
