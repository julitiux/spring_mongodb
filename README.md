# spring_mongodb

# run an image MongoDB  
docker run -it -v /Users/rrodriguez/git/github/mondongo/data/:/data --name mongodb -d mongo
docker run -it -v /Users/rrodriguez/git/github/mondongo/data/:/data -p 27017:27017 --name mongodb -d mongo

# execute a terminal mongosh
docker exec -it mongodb mongosh

# starting and ending the service Mongo Docker 
docker start mongodb
docker stop mongodb

# creating catalogs into MongoDB 
db.createCollection("catalog")
db.createCollection("catalog_capped",{capped: true, autoIndexId: true, size: 64 * 1024, max: 1000} )
db.runCommand( { create: "catalog_capped_2", capped: true, size: 64 * 1024, max: 1000 } )