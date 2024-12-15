
const { MongoClient, ServerApiVersion } = require('mongodb');
const uri = "mongodb+srv://gopalakrishnaniyar:Password123@sundalmaama.rypqq.mongodb.net/?retryWrites=true&w=majority&appName=sundalMaama";

// Create a MongoClient with a MongoClientOptions object to set the Stable API version
const client = new MongoClient(uri, {
  serverApi: {
    version: ServerApiVersion.v1,
    strict: true,
    deprecationErrors: true,
  }
});

async function run() {
  try {
    // Connect the client to the server	(optional starting in v4.7)
    await client.connect();
    // Send a ping to confirm a successful connection
    await client.db("testDB").command({ ping: 1 });
    console.log("Pinged your deployment. You successfully connected to MongoDB!");
  } finally {
    // Ensures that the client will close when you finish/error
   // await client.close();
  }
}
run().catch(console.dir);

async function listDatabase() 
{
    try{
        await client.connect();
        console.log('connected to MongoDB');

        const adminDb = client.db().admin();
        const databases = await adminDb.listDatabases();
        console.log(databases);
    }
    finally{
        await client.close();
    }
}

listDatabase();