To solve the problem

1. The sample file vaccinecentredata.txt can be used

To run the application

1. Make sure the application is built successfully with all relevant dependecies with the following command locally 

mvn clean compile package

2. Once the application is built, run the following command for setting up docker image and building it 

docker build -t myspringbootapp .

3. To test and run the application, use the following command

docker run -p 8080:8080 myspringbootapp

4. To run the test the cases

mvn test
