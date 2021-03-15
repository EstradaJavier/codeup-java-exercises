import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


    //  TODO: Assign a new instance of the Person class to each
    //   element. Iterate through the array and print out the
    //   name of each person in the array.

        Person[] people = new Person[3];

        people[0] = new Person("Arthemis");
        people[1] = new Person("Aphrodite");
        people[2] = new Person("Hephaistro");

        for (Person people : peoples) {
            System.out.println(people.getName());
        }

//        peoples = addPerson(peoples, new Person("Zeus"));

        for (Person people : peoples) {
            System.out.println(people.getName());
        }



//        for (Person people : peoples) {
//            System.out.println(people.getName());
//        }

//        TODO: Create a static method named addPerson. It should
//        accept an array of Person objects, as well as a single
//        person object to add to the passed array. It should return
//        an array whose length is 1 greater than the passed array,
//        with the passed person object at the end of the array.

    }

}
