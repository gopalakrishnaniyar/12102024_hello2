//const fs = require('fs').promises;
import { promises as fs } from 'fs';

console.log('Before Reading File');
const data = await fs.readFile('./file1.txt','utf8');
console.log('After Reading File: ' + data);
