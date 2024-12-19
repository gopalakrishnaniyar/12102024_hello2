// callback asynchronous example

// file system module from Node.js
const fs = require('fs');

// relative path to file
const filePath = './file.txt';

// callback
const next = (a, b) => {
  if (a) {
    console.log('An error occurred...: ', a);
  } else {
    console.log(b); // Hi, developers!
    console.log('Done!');
  }
};


fs.readFile(filePath, 'utf-8', next);

console.log("I'm the last line of the file!");