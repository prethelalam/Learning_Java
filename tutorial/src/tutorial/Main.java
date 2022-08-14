package tutorial;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //INTRODUCTION SECTION
		System.out.println("Hello World!");
		System.out.println("Hellow world 2"); 
		System.out.println(); //this is how to print a blank line or a space
	
		
		//VARIABLE AND DATA TYPES
		int hello_world = 9;
		double num2 = 5.0;
		boolean v = true;
		char c = 'h'; //chars can be any character, whether it be a letter or number. it can only be 1 character. this is not the same as int hello_world = 9;
		String str = "9"; //String data type must be capitalized. String is blue is because they are different types of data types
		
		int tim = hello_world; //here we assigned the value of hello_world (int) to tim (int) to have a value of 9. so you can't make this int to a String because you can't change the data types
		
		System.out.println(hello_world); //so when printing a variable. you include the variable name within the parenthesis. you can't have the variable under the printing function since the program reads from top to bottom
		System.out.println(num2);
		System.out.println(v);
		System.out.println(c);
		System.out.println(str);
		System.out.print(tim);
		System.out.println();
		
		
		//BASIC OPERATIONS
		int e; 
		e = 6; // can do this rather than int X = 6;
		
		int x = 5;
		int y = 7;
		int z = 58;
		double sum = x + y + z; //this gets the sum of the variable x, y, z. can subtract, multiply and divide. follows order of operations. same precedence then it goes left to right. can also use brackets like in c++ so like (x-y)/z
		double u = x / (double)y; //can't get a floating point number cause its an int data type. so changing this to a double will = it to 8.0 because the 2 data types were diving are both integers. so it will produce a int value and just add a .0 because this line makes it a double
								// keep in mind that only 1 of the data types has to be a double for it to convert the other to a double\
								// so can can change a data type during an operation using typecast. what you do is put in () the data type you want to change before the variable
		double d = Math.pow(x, y); //exponents kind of follow c++ except you do Math.pow(base #, exponent value). but they have to have a double data type
		
		System.out.println(); 
		System.out.println(sum);
		System.out.println(u);
		System.out.println(d);
		System.out.println(z);
		System.out.println();
		
		int i = 56 % 5; //this reminder operation (%) gives the remainder of division
		
		System.out.println(i);
		System.out.println();
		
		
		//INPUT & SCANNERS
			// in order to get inputs you have to go to the top of the program and type import java.util.Scanner;
		Scanner sc = new Scanner(System.in); //all this is saying is that scanner is a data type named sc. the new scanner(system.in) is typing stuff on your keyboard
		String scanned = sc.next(); //here we are creating a new variable with a data type of a string which is called scanned. and it is going to get the next stream of input from the line above
		int w = Integer.parseInt(scanned); //this converts string scanned into an int. or you can do make the input an int								
																						//so sc.next() returns as a string so we can't make it int scanned. if we want the user to input a int then we do sc.nextInt().
																						//so if we try to type a string here it wont work cause it can't convert the string to an int
																						//so if you want to type a double then you do sc.nextDouble() - then you have to put double 
																						// when the program is expecting a double (avoiding the crash). 
																						//so for a String you only do String scanned = sc.next();
																						//trying to convert the string to an int
		//boolean scanned_in = sc.nextBoolean(); //this is how to insert a boolean 
		
		System.out.println(w);
						// after doing this what happened was we typed hello, and then it printed hello. so basically with sc.next() we were able to input info to the keyboard.
						// then we stored our input into variable called scanned and printing scanned
		//System.out.println(scanned_in);
		System.out.println();
						// so in this case there will be 2 inputs and 2 outputs
		
		
		//CONDITIONS & BOOLEANS
		int A = 6, B = 7, C = 10; // 1 = is assigning, while == is comparing
		//operators: >, <, ==, >=, <=, != (not equal too)
		boolean compare = A != B; // this is gonna return a value of true or false
		
		System.out.println(compare); //this is print a value of true since X is < Y. which it did. so if == then its false. so != is true 
		System.out.println();
			
			//Now we're going to compare strings
		String a = "hello", b = "hellO";
		
		boolean comparing = a == b; //so for string the only thing we can compare is through == or !=. we can't do < > <= >=
		System.out.println(comparing);
		System.out.println();
		
			//Now we are going to compare multiple things at once
		int X = 6, Y = 23, Z = 10;
		
		boolean comparison = X > Y && Z < Y; // this will compare the left operation and then compare the right operation. we do this by using && which stands for and
		boolean Comparison = X > Y || Z < Y; // || this is or. 
		boolean Compare = !(X > Y || Z < Y); // ! is the not operator, which basically reverses the condition. 
		boolean compares = !(false);
		boolean Comp = (X < Y && Y > Z) || (Z + 2 < 5 || X + 7 > y); // typically you wont see these cause they are difficult to read when seeing them. but you can combine multiple things
		
		System.out.println(comparison); // so since once of them is false, we get a false value. so in order for true to be printed then both have to be true. because whats is saying is if both are true then its true, or if 1 is false then both are false
		System.out.println(); 
		System.out.println(Comparison); // so if one of them is true then we get a value of true for the whole things. if both are false then we get a value of false
		System.out.println();
		System.out.println(Compare); //so if the condition is false then we get true. if the condition is true then we get false. this is checking to see it is not true
		System.out.println();
		System.out.println(compares); // this will result in true. 
		System.out.println();
		System.out.println(Comp); //this evaluates to true since we used or and one of the expressions is true 
		
	}
}

//NOTES:

//INTRODUCTION:

//java is oop programming language. everything is done inside classes and everything is known as objects
//classes are everything written on lines 3 to 10
//lines 5-8 is a specific method. this method is important and where we are writing our java code in 
//to print a line we do line 7 or System.out.println("String that will be printed")
//when done writing a line, we have to terminate it with a ; at the end of the line
//to run: must save first so either control s or click the save button. then click the green button at the top left that is a green circle with a white triangle in it
//the output will be at the bottom of the screen under console

//VARIABLE AND DATA TYPES:

//variable: something that holds a value (can be a string, boolean, int, etc..)
//data types are also known as objects 
//booleans can only have 2 values: true or false. based on the value of our boolean expression will elicit a certain program to run
//int, double, boolean, char are primitive data types which are not changable. string is not primitive

//INPUTS % SCANNERS
//lets say you have int x=5 and int y=4 right. then you do the int sum = x +y. this will return as an int. but if you do int x=5 and int y=6 then do double sum = x +y. you will still get 30 but it'll be 30.0 (the value will have a decimal added to it
//now lets say you have double x=5 and int y =6. then double sum = x +y. you will get the result as a double but like a true double since one of the values is a double

//CONDITIONS & BOOLEANS
