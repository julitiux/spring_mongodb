# spring_mongodb

# run an image MongoDB  
docker run -it -v /Users/rrodriguez/git/github/mondongo/data/:/data --name mongodb -d mongo

# execute a terminal mongosh
docker exec -it mongodb mongosh

# starting and ending the service Mongo Docker 
docker start mongodb
docker stop mongodb