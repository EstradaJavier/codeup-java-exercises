public class Person {

    private String name;

    // // You can create a new Constructor by using CTRL + Return.
    public Person(String name) {
        this.name = name;
    }

    // // this is the getName() Method / function.
    public String getName() {
        //TODO: return the person's name
        // This is the getter

        return this.name;
    }

    // // this is the setName() Method / function.
    public void setName(String name) {
        //TODO: change the name property to the passed value
        // This is the setter.

        this.name = name;
    }

    // // this is the sayHello() Method / function.
    public void sayHello() {
        //TODO: print a message to the console using the
        // person's name

        System.out.println(name.trim() + ", " + "Please come see me after class");
    }

    // adding a main method to creat a prson object and to test
    // out our various methods. ie, Say Hello Method

    public static void main(String[] args) {
        // // here, we create a "new Person" with the create a
        // new person object.
        // we are running our main method here.
        Person person = new Person("    Alisha Estrada  ");
        person.sayHello();

        // // usging a setter to pass a string to
        person.setName("Carlos Bustamante, You too");
        person.sayHello();  // sayHello method

        // testing out our getter.
        System.out.println(person.getName());


        // // this produces a result of true, then false.
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
        // here we compare the names of person 1 and 2,
        // so get true, then we are comparing
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

        // // This produce a result of true;
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }

}


