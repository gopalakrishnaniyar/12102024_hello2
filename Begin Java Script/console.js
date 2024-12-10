let name1 = "this is string 1";
let name2 = "this is string 2";
const foo = 43;
const result = foo + "1";
console.log(result);
//console.log(`hello ${name1}`) // Well this is workday extend pmd scripting for heaven sake

const { createServer } = require('node:http');

const hostname = '127.0.0.1';
const port = 3000;

const server = createServer((req, res) => {
  res.statusCode = 200;
  res.setHeader('Content-Type', 'application/json');

  const responseObject = {
    message: 'Hello World',
    status: 'success',
    data: {
      name: 'John Doe',
      age: 30
    }
  };

  res.end(JSON.stringify(responseObject));
});

/*
server.listen(port, hostname, () => {
  console.log(`Server running at http://${hostname}:${port}/`);
}); */
