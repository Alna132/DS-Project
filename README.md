# DS-Project: An Asynchronous RMI String Comparison Service

##Project Objective:
Use the Java RMI framework to develop a remote, asynchronous string comparison service. A client should be able to remotely connect and pass two strings to the service for comparison. The service should use one of a number of optional string comparison algorithms to compute the edit distance or optimal alignment between the two strings.

##There are 3 interface classes.
- StringService:  This interface declares a compare method, to be used to compare 2 strings against eachother using a designated comparison algorithm
- Resultator:  This interface declares the getResult, setResult, isProsessed and setProssesed methods, these will be used to get and set the comparison result and whether or not the comparison has been processed.
- AlgorithmInterface:  This interface declares a distance method that takes in 2 String arguments, this will be used in the if/else if statement in StringServiceImpl. It allows me to call the algorithms in a more universal way and all take in 2 strings for their arguments and use a distance method.
    
##There are 3 algorithms:
- Levenshtein: Levenshtein distance (LD) is a measure of the similarity between two strings, which we will refer to as the source string (s) and the target string (t). The distance is the number of deletions, insertions, or substitutions required to transform s into t.
- HammingDistance: In information theory, the Hamming distance between two strings of equal length is the number of positions at which the corresponding symbols are different.
- DamerauLevenshtein: Damerau–Levenshtein distance (named after Frederick J. Damerau and Vladimir I. Levenshtein) is a distance (string metric) between two strings, i.e., finite sequence of symbols, given by counting the minimum number of operations needed to transform one string into the other, where an operation is defined as an insertion, deletion, or substitution of a single character, or a transposition of two adjacent characters.
    
##There are 6 java classes:
- ServerS: This class contains the main method, instanciates the StringService and creates a registry at port 8080 for the service to run.
- ResultatorImpl: This class implements the methods declared in the Resultator interface.
- StringServiceImpl: This class implements the method from the StringService interface. An if/else if statement was used to navigate between the different algorithms in the compare method here.
- InQueue: This class creates the LinkedList that is the in queue for the service.
- OutQueue: This class created a ConcurrentHashMap out queue for the service.
- ServiceHandler: This class creates local variables of the in and out queues, and handles the running of the service and invokes methods from the other classes. It is here that the compare method is called to compare the 2 inputed strings. When the comparison is done the result is output for the user here too.
    
##Adding Tomcat to eclipse:
I downloaded and installed tomcat 9 to my machine, then on Eclipse > Preferences > Server > Runtime Environment, click on Add, select Tomcat 9.

From there Go to Window > Show View > Other... > Server > Servers and click ok.
    
##Needed for this project:
- Tomcat 9.
- Java 8.
- Eclipse Java EE IDE.
- Add Servlet.api JAR file in to the build library.

##References:
- http://stackoverflow.com/questions/33910448/add-tomcat-9-to-eclipse
- https://docs.oracle.com/javase/tutorial/rmi/implementing.html
- https://docs.oracle.com/javase/8/docs/api/java/rmi/server/UnicastRemoteObject.html
- http://stackoverflow.com/questions/17015449/how-do-i-run-sh-or-bat-files-from-terminal
- http://stackoverflow.com/questions/8122843/how-to-have-eclipse-use-jdk8-to-compile-a-project
- Code from past labs.
- Code from past projects.

