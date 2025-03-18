# Getting Started

### Install app

Once you have pulled the code, you can run the following command:

`$ mvn clean package`

### Run CLI version

`$ java -jar target/exercise1-0.0.1-SNAPSHOT.jar --spring.profiles.active=cli`

### Run Web version

`$ java -jar target/exercise1-0.0.1-SNAPSHOT.jar`

You can use the following curl command to test it:

`curl --request POST \
--url http://localhost:8080/api/v1/utilities/subsequences \
--header 'content-type: application/json' \
--data '{
"source":"rabbbit",
"target":"rabbit"
}'`