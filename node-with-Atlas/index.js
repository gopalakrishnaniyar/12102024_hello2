const { MongoClient, ServerApiVersion } = require('mongodb');
//interesting it uses TLS/SSL
const uri = "mongodb+srv://gopalakrishnaniyar:Password123@sundalmaama.rypqq.mongodb.net/?retryWrites=true&w=majority&appName=sundalMaama";

// Create a single MongoClient instance
const client = new MongoClient(uri, {
  serverApi: {
    version: ServerApiVersion.v1,
    strict: true,
    deprecationErrors: true,
  },
});

async function run() {
  try {
    // Send a ping to confirm a successful connection
    await client.db("testDB").command({ ping: 1 });
    console.log("Pinged your deployment. You successfully connected to MongoDB!");
  } catch (err) {
    console.error("Error in run():", err);
  }
}

async function listDatabase() {
  try {
    console.log('Listing databases...');
    const adminDb = client.db().admin();
    const databases = await adminDb.listDatabases();
    databases.databases.forEach(item => {console.log(`name and size: ${item.name} - ${item.sizeOnDisk} `);})
  } catch (err) {
    console.error("Error in listDatabase():", err);
  }
}

async function main() {
  try 
  {
    await client.connect(); // Establish connection once
    console.log("Connected to MongoDB");

    // Run operations sequentially
    await run();
    await listDatabase();
  } catch (err) 
  {
    console.error("Error in main():", err);
  } finally 
  {
    await client.close(); // Close the connection
    console.log("Connection to MongoDB closed.");
  }
}

main().catch(console.dir);




let inputString = '';
let currentLine = 0;

process.stdin.on('data', function(inputStdin) {
    inputString += inputStdin;
});

process.stdin.on('end', function() {
    inputString = inputString.split('\n');

    main();
});

function readLine() {
    return inputString[currentLine++];
}

/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

function plusMinus(arr) 
{
    

}

function main() {
    const n = parseInt(readLine().trim(), 10);

    const arr = readLine().replace(/\s+$/g, '').split(' ').map(arrTemp => parseInt(arrTemp, 10));

    plusMinus(arr);
}
