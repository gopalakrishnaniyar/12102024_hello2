
const fs = require('fs/promises');

async function readMyJSONFile() {
  try {
    // Await the file read operation to get the content
    const payload = await fs.readFile('C:/Users/sivakgop/OneDrive - Tietoevry/Desktop/message.txt', 'utf8');
    return JSON.parse(payload); // Parse the content as JSON
  } catch (err) {
    console.error('Something fishy happened: ', err);
  }
}

(async function main() 
{
  const fileContent = await readMyJSONFile(); // Wait for the file to be read
  if (fileContent) {
    console.log(fileContent); // Access fileContent.data at the top level
  }
})();
