/* mongodb://MongoDB:MongoDB@localhost:27017/sundalMaama */

mongoose.connect('mongodb+srv://gopalakrishnaniyar:YxGxV123!@#@sundalmaama.rypqq.mongodb.net/?retryWrites=true&w=majority&appName=sundalMaama', { useNewUrlParser: true, useUnifiedTopology: true })
    .then(() => {
        console.log('Connected to MongoDB');
    
        // Access the 'users' collection inside 'sundalMaama'
        mongoose.connection.db.collection('users')
            .find({})
            .toArray()
            .then(items => console.log(items))
            .catch(err => console.error('Error retrieving collection:', err));
    })
    .catch(err => console.error('Could not connect to MongoDB', err));