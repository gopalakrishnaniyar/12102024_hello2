const fs = require('fs').promises;
const filePath = './file.txt'

//const data = fs.readFile(filePath);
//console.log(data)
/* This readFile is asynchrous and non blocking which is why 
   the next line is unable to print the status of const data
*/

async function readFileAsync() {
    try {
        const data = await fs.readFile(filePath,'utf8');
        console.log(data);
        console.log('Done!');
        return true;
    }
    catch (error) {
        console.error('An error occured...:', error);
        return false;
    }
}

// readFileAsync();
readFileAsync()
  .then((status) => 
    { if(status)
        {console.log('successfully file retrieved')} 
       else {console.log('failed to read file')}
    })
   .catch(() => {console.log('Erro from catch of then')});