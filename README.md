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



# SWAGGER

- acess this URL: http://localhost:8080/swagger-ui.html

# DOCKER

- If you want to run this API in docker, you should follow this steps

# step 1:
  - this step will creates a docker image for you
  - cd spring-boot-elastic-search/
  - run this command: docker build -t bbnsdevelop/spring-boot-elk .

# step 2:
  - this step it's to run local the API
  - docker run -d -p 8080:8080 --name spring-elk -t bbnsdevelop/spring-boot-elk