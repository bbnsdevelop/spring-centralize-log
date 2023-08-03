# spring-centralize-log
Centralize spring boot log to ELK Elasticsearch, Logstash, Kibana


To run this project you will need this technologies:
Java 11
maven 3.6.3 or currently version

Docker and docker-compose.

# Step 1:
  - open a termial, navigate to folder elk/
  - run a command docker-compose up

# Step 2:
  - open a new termial, navigate to folder spring-boot-elastic-search
  - run: mvn spring-boot:run

# Step 3:
  - Open a browser and acess this URL
  - http://localhost:9200/
  - http://localhost:5601/

# Step 4:
  - run in one new terminal this command: curl http://localhost:8080/states
  - now check your logs in http://localhost:5601/ 
