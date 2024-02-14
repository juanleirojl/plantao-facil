docker-compose down

# build backend image
docker build -t plantao-facil:latest .

# start environment
docker-compose up --build --force-recreate --remove-orphans