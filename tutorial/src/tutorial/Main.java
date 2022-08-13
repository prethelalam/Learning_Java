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
		boolean b = true;
		char c = 'h'; //chars can be any character, whether it be a letter or number. it can only be 1 character. this is not the same as int hello_world = 9;
		String str = "9"; //String data type must be capitalized. String is blue is because they are different types of data types
		
		int tim = hello_world; //here we assigned the value of hello_world (int) to tim (int) to have a value of 9. so you can't make this int to a String because you can't change the data types
		
		System.out.println(hello_world); //so when printing a variable. you include the variable name within the parenthesis. you can't have the variable under the printing function since the program reads from top to bottom
		System.out.println(num2);
		System.out.println(b);
		System.out.println(c);
		System.out.println(str);
		System.out.print(tim);
		System.out.println();
		
		//BASIC OPERATIONS
		int X; 
		X = 6; // can do this rather than int X = 6;
		
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
		
		int a = 56 % 5; //this reminder operation (%) gives the remainder of division
		
		System.out.println(a);
		System.out.println();
		
		//INPUT & SCANNERS
			// in order to get inputs you have to go to the top of the program and type import java.util.Scanner;
		Scanner sc = new Scanner(System.in); //all this is saying is that scanner is a data type named sc. the new scanner(system.in) is typing stuff on your keyboard
		int scanned = sc.nextInt(); //here we are creating a new variable with a data type of a string which is called scanned. and it is going to get the next stream of input from the line above
								//so sc.next() returns as a string so we can't make it int scanned. if we want the user to input a int then we do sc.nextInt().
								//so if we try to type a string here it wont work cause it can't convert the string to an int
		boolean scanned_in = sc.nextBoolean(); 
		
		System.out.println(scanned);
		// after doing this what happened was we typed hello, and then it printed hello. so basically with sc.next() we were able to input info to the keyboard.
		// then we stored our input into variable called scanned and printing scanned
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


