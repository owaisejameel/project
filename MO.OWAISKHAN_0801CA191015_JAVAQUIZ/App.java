import java.util.*;
class Question{                                                  //Question is a class 

	String prompt;
	String answer;

	public Question(String prompt, String answer){            //Constructor to initialize String Variables
		this.prompt=prompt;
		this.answer=answer;
	}
}
public class App{
	 
	    public static void main(String[] args) {                                        //Main function 
	    
	     System.out.println("\t\t\t----------JAVA QUIZ----------\n"); 

	     String q1 =    "1. Which of these operators is used to allocate memory to array"               //String of quiz questions with options
	                        +"variable in Java?\n\n a) malloc\n b) alloc\n c) new\n d) new malloc";    
	     
	     String q2 =    "2. Which component is used to compile, debug and execute"
	                        +"java program?\n\n a) JVM\n b) JDK\n c) JIT\n d) JRE"; 

	     String q3 =    "3. Which of the following is not a Java features?\n\n"
                            +" a) Dynamic\n b) Architecture Neutral\n c) Use of pointers\n d) Object-oriented"; 

         String q4 =    "4. Which of these operators can be used to concatenate two or more String objects?\n\n"
                            +" a) +\n b) +=\n c) &\n d) ||\n";

         String q5 =    "5. Which of these is a mechanism for naming and visibility control of a class and its content?\n\n"
                            +" a) Object\n b) Packages\n c) Interfaces\n d) None of the Mentioned";

         String q6 =    "6. Which of these keywords is not a part of exception handling?\n\n"
                            +" a) try\n b) finally\n c) thrown\n d) catch";  

         String q7 =    "7. Which of the following is a valid declaration of an object of class Box?\n\n"
                            +" a) Box obj = new Box();\n b) Box obj = new Box;\n c) obj = new Box();\n d) new Box obj;";

         String q8 =    "8. Which of these statement is incorrect?\n\n a) Every class must contain a main() method\n" 
                            +" b) Applets do not require a main() method at all\n c) There can be only one main() method in a program\n" 
                            +" d) main() method must be made public";         

         String q9 =    "9. Which of these method of class String is used to compare two String objects for their equality?\n\n"
                            +" a) equals()\n b) Equals()\n c) isequal()\n d) Isequal()";

         String q10 =  "10. Which of these standard collection classes implements a dynamic array?\n\n"
                            +" a) AbstractList\n b) LinkedList\n c) ArrayList\n d) AbstractSet";        
	     

	     Question[] questions = {																	// Array of objects with Constructor 
	     					new Question(q1,"c"),new Question(q2,"b"),new Question(q3,"c"),         // Calling of type Question class
	     					new Question(q4,"a"),new Question(q5,"b"),new Question(q6,"c"),
	     				    new Question(q7,"a"),new Question(q8,"a"),new Question(q9,"a"),new Question(q10,"c")
	     				       };

         takeTest(questions);                              //fucntion Calling,  question array passing as parameter
        }

         public static void takeTest(Question[] questions)        //takeTest function
         {
              int score=0;
              Scanner in=new Scanner(System.in);
             
             for(int i=0; i<questions.length; i++)               //loop for printing question one by one
             {    
                System.out.println(questions[i].prompt);
              	String answer = in.nextLine();                  //input from user 

              	if(answer.equals(questions[i].answer)){          //if conditon to check entered option is Correct/Not
              		score++;
              	}
             }
          System.out.println("you got " + score +"/" + questions.length); //lastly total score will be printed
         }

}


