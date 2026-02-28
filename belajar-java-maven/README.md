comand untuk generate project
mvn archetype:generate
maven-archetype-quickstart
3: remote -> org.apache.maven.archetypes:maven-archetype-quickstart 
8: 1.4
'groupId': belajar-java-maven
'artifactId': belajar-apache-maven
1.0-SNAPSHOT: 
belajar-java-maven: maven



mvn clean
mvn compile
mvn test-compile
mvn test
mvn clean compile test package

java -jar target/belajar-apache-maven-1.0-SNAPSHOT.jar
java -jar target/belajar-apache-maven-1.0-SNAPSHOT-jar-with-dependencies.jar


https://search.maven.org/
https://mvnrepository.com/


mvn clean package assembly:single