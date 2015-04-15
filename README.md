# Mongo
install Mongo then start then launch mongo

```
use book
db.addUser({user:"book", pwd:"book", roles:[{role:"readWrite",db:"book"}]});
```

# run the app
```
mvn spring-boot:run -Dserver.port=9095
```

# on browser
```
localhost:9095
```

your repository is actually exposed as an API using Hypermedia 