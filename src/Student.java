package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {

        //    // returns the student's name
        //      public String getName();
        //    // adds the given grade to the grades property
        //      public void addGrade(int grade);
        //    // returns the average of the students grades
        //      public double getGradeAverage();

    private final String name;

    public ArrayList<Integer> grades;

    //  Student Constructor
        Student(String name, ArrayList<Integer> grades) {
            this.name = name;
            this.grades = grades;
    }

    // Return Student Name;
    public String getName() {
        return name;
    }

    // Adding Grades to grade Property;
    public void addGrade(int grades) {
//        grades.add(grades);
    }

    // We Need to Return the Average of the Student's Grades
    public double getGradeAverage () {
        double sum = 0;
        for (int grade: grades) {
            sum = (sum + grade);

        }

        return sum/grades.size();
    }
    //  TODO: Test your Student class by adding a main method and creating
    //   Student objects. Verify that you can add grades to each object,
    //   and that your getGradeAverage method correctly returns the average
    //   of the student's grades.

    public static void main(String[] args) {

//        Student student1 = new Student("John" grades);

//        System.out.println(student1.name);


    }
}
