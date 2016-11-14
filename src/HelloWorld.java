
public class HelloWorld 
{
	public static void main(String[] args) 
	{
		//Comments start with two slashes like this.  anything in a comment won't be run when you launch the program, so it won't make errors.
		
		//All commands (95% of all lines in a program) must end with a semi colon.  If they don't, the program will crash.
		//Some exceptions to this rule are if statements and loops.  Anything that ends with curly braces, basically.
		
		//Here I will create a variable called x.  The type will be int, short for integer.  They can only hold whole numbers.
		
		int x=10;
		
		//You only have to specify the type when you first create the variable.  If I wanted to change it now, I can just do the following:
		
		x=5;
		
		//It started off holding 10, now it holds 5.
		//If you ever want to print any information to the screen, you can use the following command.
		
		System.out.println("");
		
		//You type whatever you want to appear inside of the quotes.  One thing to remember though, is if you want to see the actual VALUE
		//of a variable, you can't put the name of the variable in quotes.  Let me demonstrate.
		
		System.out.println("x");  //prints x
		System.out.println(x);    //prints 5
		int age = 22;
		System.out.println("Cyle is " + age + " years old.");  //Prints "Cyle is 22 years old."
		
		//Notice how you can break apart the String inside the println() function so you can combine things together.  This is useful to know
		//and you will use it alot before you start to make programs with real windows and stuff.
		
		
		//Speaking of Strings, that is another variable type.  It holds text only.
		String myName = "Cyle";  //The text must be wrapped in double quotes or it won't work.
		
		//You can add things into variables, and they can even be self referential.  For example:
		myName = myName+age;
		//This basically says, set myName equal to "Cyle"+22, so it will hold "Cyle22" now.
		
		System.out.println(myName); //Should print "Cyle22".
		
		
		
		
		//Now for an if statement.
		if(age>18)  //An expression goes inside the parenthesis.  The expression MUST equate to either true or false.
		{
			//If it's true, the code in here will run.  If false, it will just skip to the end of the braces.
			//Notice how each time you enter a new set of braces, the code indents a little further.
			
			System.out.println("I'm legal baby!");
		}
		
		
		//You can put an else clause at the end of an if statement, which will run in case the expression equates to false.  This is optional.
		if(myName.equals("Kaili"))
		{
			System.out.println("Hello Kaili!");
		}
		else
		{
			System.out.println("You're not Kaili!");
		}
		
		
		/*
		 * Here are a list of the valid logical operators for if statements:
		 * ==	Checks to see if two variables are equal.  Does not work on Strings, you must use 
		 * 		the .equals() function like I did above and either type something with quotes or give 
		 * 		it another string variable to check against.  It will return true or false automatically.
		 * !=	Not equal.  Returns true if the variables are different, and false if they are the same.  It's useful sometimes :p
		 * >	Greater than
		 * <	Less than
		 * >=	Greater than or equal to
		 * <=	Less than or equal to
		 * 
		 * 
		 * =	The single equals sign actually means "assign a value".  That's why we use it when we say x=5, or myName="Cyle".
		 * 		Because of this, you can't use it in an if statement or other type of loop.  Use the double == instead.
		 * 		To reiterate, x=5 stores 5 in the variable x.  x==5 returns true if x is already 5, or false otherwise.
		 * 
		 * 
		 * Some other data types are double, which stands for double precision.  Basically, these are decimals.
		 * If you ever even think your variable might become a decimal, you need to create it as a double to start off
		 * because an int can never hold a decimal and you can't change the type of a variable after you "declare" it initially.
		 * 
		 * boolean, which holds either true or false, and can be used to trigger if statements.
		 * char, which holds a single character.  They are enclosed in single quotes.  Example:  char c = 'c';
		 * That is a variable of type character, named c, that holds the letter c.
		 * 
		 */
		
		
		
		
		
	}
}
