# HF Strategy Pattern - Ducks

## Task

Begin with a simple “hello world” Java program with Maven project structure.
Implement the “Duck” example code from the course book by proceeding step by step. Follow the steps in the course book.

The required steps are:

1.0-Initial project startup. No functionality

2.0-AdHoc, straight forward solution

2.2 Added fly() behaviour and RubberDuck.

3.0 First implementation of Strategy Pattern

3.2 Strategy pattern with dynamic behaviour assignment



## Running the code

The "main" main() function is in App.java.

## CLI - Building and running the code

````
git clone ...URL...
cd ...THE-DIR...
mvn clean
mvn install # or package
echo "Run the main() in App.java (defined in the manifest file of the jar)
java -jar target/sdp-ducks-2023a-1.0-SNAPSHOT.jar
echo "Run the main() in some other file
java -cp target/sdp-ducks-2023a-1.0-SNAPSHOT.jar org.hfdp.tla.javastarter
.App
````

# References
## Task
*https://docs.google.com/document/d/e/2PACX-1vT6WvbSxFLbHBzWiwt2YAG7dyqd88c2tSX4lNK6pRBWEF8aqixOHjbtNNxkDfQSfMJyad7H5hf4U9Hn/pub

## Book
* https://learning.oreilly.com/library/view/head-first-design/9781492077992
* https://andor.tuni.fi/permalink/358FIN_TAMPO/1j3mh4m/alma9911189474705973

## Code
* http://wickedlysmart.com/head-first-design-patterns
* https://github.com/bethrobson/Head-First-Design-Patterns

