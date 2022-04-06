package student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student st1 = new Student(1, "Phong", new Language("French", 1));
        Student st2 = new Student(2, "Loc", new Language("Vietnamese", 2));
        Student st3 = new Student(3, "Minh", new Language("English", 3));
        Student st4 = new Student(4, "Hai", new Language("Russian", 4));

        Map<Integer, Student> studentMap = new HashMap<>();

        studentMap.put(st1.getId(), st1);
        studentMap.put(st2.getId(), st2);
        studentMap.put(st3.getId(), st3);
        studentMap.put(st4.getId(), st4);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int ID = scanner.nextInt();
        System.out.println(studentMap.get(ID));

    }
}
