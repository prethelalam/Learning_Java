public class dog {
    // in int classes. we have methods and attributes. attributes are kinda like variables that hold information. were gonna put 2 attributes in the dog class

    private String name; //this is one attribute that we created 
    private int age; // this is another attribute created
        //private ensures that name and age are only accessible with this specfic class. can make them public too

    //this is a constructor method: it runs automatically when we call the dog class.
    public dog(String name, int age){ //when we create a dog object we have to give it a name and an age

        //next we are going to set thte values name and age to be equal to the information we're passing in (line 4 and 5 variable = line 9 arguments)
        this.name = name;
        this.age = age; //this keyword references the attributes of the class (line 4 and 5)
    }

    public void speak(){
        System.out.println("I am " + this.name + " and I am " + this.age + " years old");
    }

    public int getAge(){
        return this.age;
    }
}
