package ie.atu;

import java.util.ArrayList;
import java.util.Scanner;

Scanner input = new Scanner(System.in);
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public class Student{
        private String id;
        private String name;

        public Student (String name,String id ) {
            t
            this.name = name;
            this.id = id;
        }

        public String getId() { return id; }
        public String getName() { return name;}

        @Override
        public String toString() { return id + " - " + name; }
    }



}
    }
    public class Main {
        public static void main(String[] args) {
            ArrayList<Student> students = new ArrayList<>();
            students.add(new Student("S101", "Amy"));
            students.add(new Student("S102", "Ben"));
            students.add(new Student("S103", "Cara"));

            String searchId = "S102";
            boolean found = false;
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

        if (!found) {
            System.out.println("Student not found.");
        }

}