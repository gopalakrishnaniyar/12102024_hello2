console.log('learning about file sytem')
const fs = require('fs')


//Writing contents into a file

/*fs.writeFile('C:/Users/sivakgop/OneDrive - Tietoevry/Desktop/message.txt', 'hello', (err) => {
  if (err) throw err;
  console.log('The file has been saved!');
});*/

const jpayload = fs.readFile('C:/Users/sivakgop/OneDrive - Tietoevry/Desktop/message.txt', 'utf8', (err,data) => {
    if (err) throw err;
  });

  console.log(jpayload)

  // this will not work as it processes asynchronously.  jpayload cannot be referenced before it fully executes
  // to process it asynchronously such as a traditional OOP C++ etc

  

