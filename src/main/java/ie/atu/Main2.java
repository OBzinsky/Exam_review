package ie.atu;

import java.util.ArrayList;
import java.util.Scanner;

Scanner input = new Scanner(System.in);
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public class Member{
        private String memberid;
        private String name;
        private int age;

        public Member (int age, String name,String memberid ) {
            this.age = age;
            this.name = name;
            this.memberid = memberid;
        }

        public String getMemberid() {return memberid;}
        public String getName() {return name;}

        @java.lang.Override
        public java.lang.String toString() {
            return "Member{" +
                    "memberid='" + memberid + '\'' +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", members=" + members +
                    ", member=" + member +
                    ", strings=" + strings +
                    '}';
        }

        ArrayList<Member> members = new ArrayList<>();
        members.add(new Member("1", "Dave"));
        members.add(new Member("2", "Sarah"));
        members.add(new Member("3", "Tom"));

        for (Member member : members) {
            System.out.println(member);
        }

        String searchId = "S102";
        boolean found = false;
        for (Studnet student : students) {
            if (student.getId().equals(searchId)) {
                System.out.println("Found: " + student);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }



    public int getAge() {
        return age;
    }
     displayDetails() {
        return age;
        return name;
        return memberid;
         System.out.println(name);
    }
    }


}