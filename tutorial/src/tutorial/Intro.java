//package Intro;
import java.util.Scanner;

public class Intro {

    static void Introduction() {
        System.out.println("Hello World!");
		System.out.println("Hellow world 2"); 
		System.out.println("end introduction section ");
		System.out.println(); //this is how to print a blank line or a space
    }

    static void VariablesDataTypes() {
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
		System.out.println("end variable and input data types");
		System.out.println();
    }

    static void BasicOperations(){
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
		
		int k = 56 % 5; //this reminder operation (%) gives the remainder of division
		
		System.out.println(k);
		System.out.println("end basic operations");
		System.out.println();
    }

    static void InputScanners() {
            // in order to get inputs you have to go to the top of the program and type import java.util.Scanner;
		Scanner sc = new Scanner(System.in); //all this is saying is that scanner is a data type named sc. the new scanner(system.in) is typing stuff on your keyboard
		String scanned = sc.nextLine(); //here we are creating a new variable with a data type of a string which is called scanned. and it is going to get the next stream of input from the line above
		int w = Integer.parseInt(scanned); //this converts string scanned into an int. or you can do make the input an int								
																						//so sc.next() returns as a string so we can't make it int scanned. if we want the user to input a int then we do sc.nextInt().
																						//so if we try to type a string here it wont work cause it can't convert the string to an int
																						//so if you want to type a double then you do sc.nextDouble() - then you have to put double 
																						// when the program is expecting a double (avoiding the crash). 
																						//so for a String you only do String scanned = sc.next();
																						//trying to convert the string to an int
																						// so sc.next() reads until the space while sc.nextLine() reads until the end of the line

		System.out.println();
		
		//boolean scanned_in = sc.nextBoolean(); //this is how to insert a boolean 
		System.out.println(w);
						// after doing this what happened was we typed hello, and then it printed hello. so basically with sc.next() we were able to input info to the keyboard.
						// then we stored our input into variable called scanned and printing scanned
		//System.out.println(scanned_in);
		System.out.println("end booleans + input and scanners");
		System.out.println();
						// so in this case there will be 2 inputs and 2 outputs
    }

    static void ConditionsBooleans(){
        int A = 6, B = 7, C = 10; // 1 = is assigning, while == is comparing
		//operators: >, <, ==, >=, <=, != (not equal too)
        boolean compare = A != B; // this is gonna return a value of true or false
        boolean Compares = B != C;
		
		System.out.println(compare); //this is print a value of true since X is < Y. which it did. so if == then its false. so != is true 
        System.out.println();
        System.out.println(Compares);
			
			//Now we're going to compare strings
		String a = "hello", b = "hellO";
        
        Scanner Scanned = new Scanner(System.in);
        String scanned = Scanned.nextLine();
		boolean comparing = a == b; //so for string the only thing we can compare is through !=. we can't do < > <= >=
									// to see if something is equal to something else you do whats below
		scanned.equals("hello");
		
		System.out.println(comparing);
		System.out.println();
		
			//Now we are going to compare multiple things at once
		int X = 6, Y = 23, Z = 10;
		
		boolean comparison = X > Y && Z < Y; // this will compare the left operation and then compare the right operation. we do this by using && which stands for and
		boolean Comparison = X > Y || Z < Y; // || this is or. 
		boolean Compare = !(X > Y || Z < Y); // ! is the not operator, which basically reverses the condition. 
		boolean compares = !(false);
		boolean Comp = (X < Y && Y > Z) || (Z + 2 < 5 || X + 7 > Y); // typically you wont see these cause they are difficult to read when seeing them. but you can combine multiple things
		
		System.out.println(comparison); // so since once of them is false, we get a false value. so in order for true to be printed then both have to be true. because whats is saying is if both are true then its true, or if 1 is false then both are false
		System.out.println(); 
		System.out.println(Comparison); // so if one of them is true then we get a value of true for the whole things. if both are false then we get a value of false
		System.out.println();
		System.out.println(Compare); //so if the condition is false then we get true. if the condition is true then we get false. this is checking to see it is not true
		System.out.println();
		System.out.println(compares); // this will result in true. 
		System.out.println();
		System.out.println(Comp); //this evaluates to true since we used or and one of the expressions is true 
		System.out.println("end conditions and booleans");
		System.out.println();
    }

    static void ifElseStatements(){
        Scanner rx = new Scanner(System.in); //so if you want to use another scanner you change the sc to something else, then must change it when it reads the line too below
		String V = rx.nextLine();
		
		if (V.equals("tim")) { // this is to evaluate if the input is true. so if you type hello with only this if statement then you wont have anything appear on your system
			System.out.println("You Typed tim");
		} 
		else if (V.equals("Hello")) { //this must come after an if statement and its like another if statement. so if you type Hello then hi will appear. you can have as many if statements, else must be the last thing if you if, else statements, but you aren't required to have an else statment
			System.out.println("hi");
		}
		else //this has to come after an if statement or an else if statement 
		{
		System.out.println("Print"); //this will still be printed because it didn't go through the if statement. so if you type anything but tim or Hello then this will be printed
		}
		System.out.println("end if, else, else if statements");
		System.out.println();
    }

    static void NestedStatements(){
        System.out.println("Input your age");
		Scanner ab = new Scanner(System.in);
		String J = ab.nextLine();
		int age = Integer.parseInt(J); //converting string to an integer
		
		if (age >= 18) { 
			System.out.println("Input your fav food");
			String food = ab.nextLine(); //so this is going to read the line and store it in food
			
			if (food.equals("pizza")) { //nested if statement 
				System.out.println("mine too");
			}
			else {
				System.out.println("not mine");
			}
		}
		else if (age >= 13){
			System.out.println("You are a teenager");
		}
		else {
			System.out.println("You are not a teenager or an adult");
		}
		System.out.println("end nested statements and summarization");
		System.out.println();
    }

    static void Arrays(){
            //a collection of elements that is a set size. instead of a variable = 1, you have an array that have a bunch of different values in there that can index at certain points
		String[] newArr = new String[5];
		//data type name = new data type[how many elements or how long array is]; (you can't change this length, it is a set length). it will set all the elements to null so they don't have a value but they are going to hold something. its like intializing 5 containers that don't hold anything yet but will
				//{"hello", "hi", "tim", "bill", "joe"} //5 values in string array. every element in the array has an index and each index will be a number that represents its position
				//pos. 0, pos 1, pos 2, pos 3, pos 4 //position = 
		newArr[0] = "hello";  							//this is adding stuff to an array, specifically setting a value of hello to position 0
		newArr[1] = "hi";
		newArr[2] = "tim";
		newArr[3] = "bill";
		newArr[4] = "joe";
		
		int[] nums = {2,3,54,6,6}; // this is another way to set an array. must faster and easier than individually doing it 
		
		double[] nums2 = {2.0, 3.0};
		
		String I = newArr[4]; // so the newArr takes the 2nd value in the array. if you commented newArr[4] then ran the program. null will be the output because there is not a value in the position yet
		System.out.println(I);
		System.out.println();
		
		int G = nums[4];
		System.out.println(G);
		System.out.println();
		
		double H = nums2[1];
		System.out.println(H);
		System.out.println("end arrays");
		System.out.println();
    }

    static void ForLoopsWithArrays(){
            //this allows you to automate a task and do something a set amount of times. usually use it because you know how long you want to do something
		int F = 0;
			//F += 1; can do this but its tedious
			//F += 2; can do this but its tedious
		//for (int i = 0; i <= 10; i++) { //put usually use i in this case
		//declaring i = 0, we do this while i is <= 10 (condition) , and then add 1 to i after an execution (increment). we keep doing this until i is 11 then we break out of the loop
			//System.out.println(i);  //this will print 0 - 10 then stop. so it will print 0, then check the condition, then if it still is valid then it will print 1, etc..
			System.out.println();
			
			
		//can also do int x = 5;. then do q += x;. or even do it for the condition as well
		//for (int q = 0; q <= 10; q+=5) { //q +=5 means that it will start at 0 then inc by 5 until reaching 10 or meeting the condition
			//System.out.println(q);
		//}
			int [] arr = {1,5,7,3,4,5};
		//for (int p = 0; p < arr.length; p++) { //in order to get the length of the array and you don't know how many elements they types you make the condition p < arr.length
			//if (arr[p] == 5) {
				//System.out.println("Found a 5 at index " + p); //this prints twice because there are 2 5's
														//the = p means that it will automatically convert it as a string and print where the number (5) was found
			//this is a simple way to look through a list and find a certain value
			//}
			
			
			//this is known as a for each
			int count = 0; //this is an outside counter variable
			for (int element:arr) {//so every time we loop through this loop, we will declare a new variable called element and it will be = to the next element in our array. so our 1st loop its = to 1, then 5, then 7, etc
				System.out.println(element + " index " + count); //this will print the list of the array
				count++; //so count will keep a track of the elements of the indexes
			}
			//populating an array with a for loop
			String [] names = new String[5]; // array is on line 213
			Scanner ew = new Scanner(System.in);
			
			for (int p = 0; p < names.length; p++) {
				System.out.print("input: "); //taking in input. so print will just print the line but not move the cursor to a new line
				String input = ew.nextLine(); //so every time we run the loop we get an input from the user 
				names[p] = input; //this is adding the users input into the array. the value of the array is = to whatever we typed in
			}
			for (String n:names) { //for each loop
				System.out.println(n);
				System.out.println();
			}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //INTRODUCTION SECTION
		Introduction();
	
		//VARIABLE AND DATA TYPES
		VariablesDataTypes();
	
		//BASIC OPERATIONS
		BasicOperations();
		
		//INPUT & SCANNERS
		InputScanners();
		
		//CONDITIONS & BOOLEANS
		ConditionsBooleans();
		
		//If, Else, Else If
		ifElseStatements();
		
		//Nested Statements and summarize what we learned
		NestedStatements();
		
        //Arrays
        Arrays();
        
        //For loops and for each loops
        ForLoopsWithArrays();
		
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