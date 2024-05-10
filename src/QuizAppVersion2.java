//package quiz_package;
import java.util.Scanner;
public class QuizAppVersion2 {
    String username;
    String password;
    String userName;
    String passWord;

    Scanner input;

    String s1 = "1";
    String s2 = "2";
    String s3 = "3";
    String s4 = "4";

    String subjectNo;

    boolean contain1;
    boolean contain2;
    boolean contain3;
    boolean contain4;

    public void scanner(){
        input = new Scanner(System.in);
    }

    public void signup(){
        System.out.println("Welcome To Brain Train Quiz App");
        System.out.println(" ");
        System.out.println("Sign Up");
        System.out.println("Enter your username: ");
        username = input.nextLine();
        System.out.println(" ");
        System.out.println("Enter new password: ");
        password = input.nextLine();
        System.out.println(" ");

        System.out.println("----------------------------------------");
        System.out.println("Sign in");
        do{
            System.out.println("Enter your username: ");
            userName = input.nextLine();
            if(userName.equals(username)){
                System.out.println("Hi "+username);
                System.out.println(" ");
            }else {
                System.out.println("Please Enter correct username");
            }
        }while (!userName.equals(username));
        do{
            System.out.println("Enter your password: ");
            passWord = input.nextLine();
            if(passWord.equals(password)){
                System.out.println("Login");
                System.out.println(" ");
            }else {
                System.out.println("Please enter correct password");
            }
        }while (!passWord.equals(password));
    }

    public void quiz(){
        if(passWord.equals(password)&&userName.equals(username)) {
            System.out.println(" ");
            System.out.println("Hi " + username + ". Start Quiz app");
            System.out.println(" ");
            System.out.println(" Please choose your subject:");

            String[] subjects = {
                    "1. Java",
                    "2. Database",
                    "3. System Analysis",
                    "4. Computer Organization"
            };
            for (String subject : subjects) {
                System.out.println(subject);
            }



            do{

                System.out.println("Please Enter Subject Number 1-4 : ");
                subjectNo = input.nextLine();

                contain1 = subjectNo.contains("1");
                contain2 = subjectNo.contains("2");
                contain3 = subjectNo.contains("3");
                contain4 = subjectNo.contains("4");

                if (subjectNo.equals(s1)) {
                    System.out.println("Start Quiz");

                    String[] questions = {
                            "What does JVM stand for?",
                            "What is the file extension typically used for Java source code files?",
                            "What is the size of an int in Java?",
                            "Which of the following is a primitive data type in Java?",
                            "What happens during widening casting?",
                            "Which keyword is used for narrowing casting in Java?",
                            "In Java, what is the syntax for an if statement?",
                            "What is the syntax for a while loop in Java?",
                            "What does the break statement do in Java?",
                            "What is the syntax for a basic for loop in Java?"

                    };

                    String[][] options = {
                            {"1. Java Virtual Machine", "2. Java Volatile Memory", "3. Just Virtual Machine", "4. Java Visual Media"},
                            {"1. .class ", "2. .java", "3. .jar", "4. .exe"},
                            {"1. 8 bytes", "2. 16 bytes", "3. 4 bytes", "4. 2 bytes"},
                            {"1. String", "2. Integer", "3. Array", "4. Boolean"},
                            {"1. Conversion from a smaller type to a larger type.", "2. Conversion from a larger type to a smaller type.", "3. Conversion between different types of objects.", "4. Conversion of a string to a numeric type."},
                            {"1. cast", "2. narrow", "3. (int)", "4. toInt()"},
                            {"1. if(condition){/*code block*/}", "2. if { /* code block */ } (condition)", "3. { /* code block */ } if (condition)", "4. condition { /* code block */ } if"},
                            {"1. while { /* code block */ } (condition)", "2. { /* code block */ } while (condition)", "3. while (condition) { /* code block */ }", "4. condition { /* code block */ } while"},
                            {"1. Terminates the loop or switch statement", "2. Continues to the next iteration of the loop", "3. Exits the program completely", "4. Skips the current iteration of the loop"},
                            {"1. for (initialization; condition; update) { /* code block */ }", "2. for (condition; initialization; update) { /* code block */ }", "3. for { /* code block */ } (initialization; condition; update)", "4. (initialization; condition; update) for { /* code block */ }"}

                    };

                    int[] answers = {1, 2, 3, 4, 1, 3, 1, 3, 1, 1};

                    int score = 0;

                    for (int i = 0; i < questions.length; i++) {
                        System.out.println(questions[i]);
                        for (String option : options[i]) {
                            System.out.println(option);
                        }
                        System.out.println("Enter your choice (1-4): ");
                        int userAnswer = input.nextInt();

                        if (userAnswer == answers[i]) {
                            score++;
                        }
                        if (userAnswer == answers[i]) {
                            System.out.println("Your answer is correct. The correct answer is " + answers[i]);
                        } else {
                            System.out.println("Your answer is wrong. The correct answer is " + answers[i]);
                        }
                        System.out.println(" ");
                    }
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println(" ");
                    System.out.println("You get " + score + " out of " + questions.length);

                    float marks = ((float) score / questions.length) * 100;

                    System.out.println("Your Marks are " + marks + "%");

                    if (marks >= 50) {
                        System.out.println("Congratulation " + username + ". You Have Pass The Test.");
                    } else {
                        System.out.println("Sorry. You didn't pass the test. Try again later.");
                    }
                    break;
                } else if (subjectNo.equals(s2)) {
                    System.out.println("Start Quiz");

                    String[] questions = {
                            "What does DBMS stand for?",
                            "What is Database Management System (DBMS) responsible for?",
                            "What does ACID stand for in the context of databases?",
                            "What is the definition of “Data Redundancy”?",
                            "Which type of database model organizes data into one or more tables where data types may be related to each other; these relationships help structure the data?",
                            "What is a primary key in a database?",
                            "What does “ER” in ER diagram stand for?",
                            "In an ER diagram, what does an oval shape represent?",
                            "Which of the following is a popular open-source DBMS?",
                            "Which of the following is not a type of SQL join?"
                    };

                    String[][] options = {
                            {"1. Data Batch Management System", "2. Database Management Solution", "3. Database Management System", "4. Data Backup Management System"},
                            {"1. Generating raw data", "2. Creating complex databases", "3. Managing database structures and data access", "4. Generating reports only"},
                            {"1. Alignment, Consistency, Isolation, Durability", "2. Atomicity, Consistency, Isolation, Durability", "3. Atomicity, Concurrency, Isolation, Data-integrity", "4. Alignment, Concurrency, Isolation, Durability"},
                            {"1. Data Redundancy refers to the duplication of data in a database.", "2. Data Redundancy refers to the efficient storage of data in a database.", "3. Data Redundancy refers to the speed of data retrieval in a database.", "4. Data Redundancy refers to the security features of a database."},
                            {"1. Hierarchical model", "2. Network model", "3. Relational model", "4. Object-oriented model"},
                            {"1. A key that unlocks the database for data entry.", "2. The main key used for database encryption.", "3. The highest security level in a database system.", "4. A unique identifier for each record in a table."},
                            {"1. Entity Relationship", "2. Entity Runtime", "3. Execute Read", "4. Extra Record"},
                            {"1. Entity", "2. Attribute", "3. Relationship", "4. Connector"},
                            {"1. Oracle Database", "2. Microsoft SQL Server", "3. MySQL", "4. IBM Db2"},
                            {"1. INNER JOIN", "2. OUTER JOIN", "3. FULL JOIN", "4. SIDE JOIN"}
                    };

                    int[] answers = {3, 3, 2, 1, 3, 4, 1, 2, 3, 4};

                    int score1 = 0;

                    for (int j = 0; j < questions.length; j++) {
                        System.out.println(questions[j]);
                        for (String option : options[j]) {
                            System.out.println(option);
                        }
                        System.out.println("Enter your choice (1-4): ");
                        int userAnswer = input.nextInt();

                        if (userAnswer == answers[j]) {
                            score1++;
                        }
                        if (userAnswer == answers[j]) {
                            System.out.println("Your answer is correct. The correct answer is " + answers[j]);
                        } else {
                            System.out.println("Your answer is wrong. The correct answer is " + answers[j]);
                        }
                        System.out.println(" ");
                    }
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println(" ");
                    System.out.println("You get " + score1 + " out of " + questions.length);

                    float marks1 = ((float) score1 / questions.length) * 100;

                    System.out.println("Your Marks are " + marks1 + "%");

                    if (marks1 >= 50) {
                        System.out.println("Congratulation " + username + ". You Have Pass The Test.");
                    } else {
                        System.out.println("Sorry. You didn't pass the test. Try again later.");
                    }
                    break;

                } else if (subjectNo.equals(s3)) {
                    System.out.println("Start Quiz");

                    String[] questions = {
                            "What is the primary goal of the analysis phase In the technological advancement  Integration process ?",
                            "In which model is development seen as following steadily downward through phases like a waterfall ?",
                            "Which model organises software development In iterative sprints",
                            "Which of the following is NOT a characteristic of the waterfall model in SDLC",
                            "what system is designed with advanced algorithms verification techniques and rigorous testing methods to get predictable outcomes",
                            "In which SDLC phase is the software built",
                            "In system analysis what does the term input refer to",
                            "Which of the following is a step In the systems analysis process",
                            "What characterises human-machine system",
                            "Which type of information system depends directly on computers for managing  business applications"

                    };

                    String[][] options = {
                            {"1. Collecting and interpreting data", "2. Avoiding problem identification", "3. Keeping the system vague", "4. Minimizing efficiency"},
                            {"1. V -Model", "2. Waterfall Model", "3. Agile Model", "4. Spiral Model"},
                            {"1. Agile Model", "2. Waterfall Model", "3. Spiral Model", "4. Scrum Model"},
                            {"1. Sequential phase", "2. Flexibility to go back to previous phase", "3. Well - defined steps", "4. No overlapping of phase"},
                            {"1. Probabilistic system", "2. Machine system", "3. Safety critical system", "4. Deterministic system"},
                            {"1. Analysis", "2. Design", "3. Implementation", "4. Maintenance"},
                            {"1. The process of transforming data into Information", "2. The representation of Information for the processor to accept", "3. The information that is fed into the system", "4. The result obtained from the processing of information"},
                            {"1. Designing the user interface", "2. Testing the system", "3. Evaluating the feasibility of the project", "4. Maintaining the system"},
                            {"1. Fostering meaningful human connections", "2. Acknowledging the transformative impact of machine intelligent technologies", "3. Seamless collaboration and symbiosis between human and intelligent technologies", "4. Orchestrating the structured flow of information"},
                            {"1. Formal information system", "2. Informal information system", "3. Social system", "4. Computer-based system"}

                    };

                    int[] answers = {1, 2, 4, 2, 4, 3, 3, 3, 3, 4};

                    int score2 = 0;

                    for (int k = 0; k < questions.length; k++) {
                        System.out.println(questions[k]);
                        for (String option : options[k]) {
                            System.out.println(option);
                        }
                        System.out.println("Enter your choice (1-4): ");
                        int userAnswer = input.nextInt();

                        if (userAnswer == answers[k]) {
                            score2++;
                        }
                        if (userAnswer == answers[k]) {
                            System.out.println("Your answer is correct. The correct answer is " + answers[k]);
                        } else {
                            System.out.println("Your answer is wrong. The correct answer is " + answers[k]);
                        }
                        System.out.println(" ");
                    }
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println(" ");
                    System.out.println("You get " + score2 + " out of " + questions.length);

                    float marks2 = ((float) score2 / questions.length) * 100;

                    System.out.println("Your Marks are " + marks2 + "%");

                    if (marks2 >= 50) {
                        System.out.println("Congratulation " + username + ". You Have Pass The Test.");
                    } else {
                        System.out.println("Sorry. You didn't pass the test. Try again later.");
                    }
                    break;

                } else if(subjectNo.equals(s4)){
                    System.out.println("Start Quiz");

                    String[] questions = {
                            "What was the first device used for arithmetic calculation?",
                            "What was a significant drawback of mechanical calculation machines?",
                            "Which category of computers is known for its efficiency and simultaneous access to data for many users?",
                            "What distinguishes supercomputers from mainframes primarily?",
                            "Which class of computer software enables users to perform non-computer tasks?",
                            "What is the primary function of Random Access Memory (RAM)?",
                            "Which component of a computer serves as its logical center and directs operations of all computer components?",
                            "What is the primary function of the Arithmetic and Logic Unit in a CPU?",
                            "What is the primary difference between RAM and ROM?",
                            "What are examples of output devices?"
                    };

                    String[][] options = {
                            {"1. Napier's Bones", "2. Pascaline", "3. Abacus", "4. Stepped Reckoner"},
                            {"1. Reliability issues", "2. Continuous burning out of vacuum tubes", "3. Moving pieces as a major drawback", "4. Unreliability in executing calculations"},
                            {"1. Microcomputers", "2. Minicomputers", "3. Mainframes", "4. Supercomputers"},
                            {"1. Greater storage capacity", "2. Increased speed and processing capability", "3. Advanced input/output devices", "4. Lower cost and affordability"},
                            {"1. System Software", "2. Programming Software", "3. Application Software", "4. Utility Software"},
                            {"1. Permanent data storage", "2. Pre-loaded with static data", "3. Read from and written to whenever instructed by CPU", "4. Stores frequently used data items to reduce main memory access"},
                            {"1. Arithmetic and Logic Unit", "2. Processor Register", "3. Control Unit", "4. Memory Unit"},
                            {"1. Storing frequently used data items", "2. Performing arithmetic and logic operations on instruction words", "3. Offering rapid access for reading and writing data", "4. Directing operations of all computer components"},
                            {"1. RAM can only read data, while ROM can write data.", "2. RAM is volatile, while ROM is non-volatile.", "3. RAM is slower than ROM in accessing data.", "4. ROM is used for temporary storage, while RAM is for permanent storage."},
                            {"1. Wireless mouse, Bluetooth mouse, Optical mouse", "2. Headset, LCD Monitors, Laser Printer", "3. Hard Drives, Optical Drives, Floppy Drives", "4. Random Access Memory (RAM), Read Only Memory (ROM), Cache Memory"}
                    };

                    int[] answers = {3, 3, 2, 2, 3, 3, 3, 2, 2, 2};

                    int score3 = 0;

                    for (int m = 0; m < questions.length; m++) {
                        System.out.println(questions[m]);
                        for (String option : options[m]) {
                            System.out.println(option);
                        }
                        System.out.println("Enter your choice (1-4): ");
                        int userAnswer = input.nextInt();

                        if (userAnswer == answers[m]) {
                            score3++;
                        }
                        if (userAnswer == answers[m]) {
                            System.out.println("Your answer is correct. The correct answer is " + answers[m]);
                        } else {
                            System.out.println("Your answer is wrong. The correct answer is " + answers[m]);
                        }
                        System.out.println(" ");
                    }
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println(" ");
                    System.out.println("You get " + score3 + " out of " + questions.length);

                    float marks3 = ((float) score3 / questions.length) * 100;

                    System.out.println("Your Marks are " + marks3 + "%");

                    if (marks3 >= 50) {
                        System.out.println("Congratulation " + username + ". You Have Pass The Test.");
                    } else {
                        System.out.println("Sorry. You didn't pass the test. Try again later.");
                    }

                }else {
                    System.out.println("Please enter the correct subject number.");
                }

            }while (contain1==false||contain2==false||contain3==false||contain4==false);

        }else {
            System.out.println("Please Enter correct inputs and try again.");
        }
    }

    public void scannerClose(){
        input.close();
    }
    public static void main(String[] args){
        QuizAppVersion2 myapp = new QuizAppVersion2();
        myapp.scanner();
        myapp.signup();
        myapp.quiz();
        myapp.scannerClose();
    }

}

