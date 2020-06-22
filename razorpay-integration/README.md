## Razorapay Integration App 

Steps to run the app:

- Edit the key inside index.ftl
- Add you api_key and api_secret in server.yml file:
---------------------------------
apiKey: your_key_id
secretKey: your_secret
---------------------------------
- Build 
mvn clean install -DskipTests
- Run 
java -jar target/razorpay-java-testapp-1.0-SNAPSHOT.jar server server.yml

Open http://localhost:8080/payment on browser and pay
