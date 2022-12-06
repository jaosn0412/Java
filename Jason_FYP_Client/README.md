# compiling the program

You can compile the program with `mvn clean install` command.

# running the program

Makesure you include all of the dependencies in one place. Use the `mvn dependency:copy-dependencies` to put all dependencies in ./target/dependency/*. take note the directory will be wiped out during every build.

run the program with the following command:

```
java -cp "./target/Jason_FYP_Client-1.0-SNAPSHOT.jar:./target/dependency/*" my.com.midf.digitalbusiness.devops.jasonfyp.jason_fyp_client.Jason_FYP_Client
```

## tips

you can compile and run the program with the following line:

```
mvn clean install dependency:copy-dependencies; java -cp "./target/Jason_FYP_Client-1.0-SNAPSHOT.jar:./target/dependency/*" my.com.midf.digitalbusiness.devops.jasonfyp.jason_fyp_client.Jason_FYP_Client
```