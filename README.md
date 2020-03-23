# Build
mvn clean package && docker build -t com/daytrade .

# RUN

docker rm -f daytrade || true && docker run -d -p 8080:8080 -p 4848:4848 --name daytrade com/daytrade 