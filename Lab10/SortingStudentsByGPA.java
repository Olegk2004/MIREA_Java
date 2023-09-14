import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class SortingStudentsByGPA {
    private ArrayList<Student2> iDNumber;

    public void addStudents(int n) {
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            System.out.println("Enter First name");
            String fN = in.nextLine();
            System.out.println("Enter Second name");
            String sN = in.nextLine();
            System.out.println("Enter Group");
            String group = in.nextLine();
            System.out.println("Enter Spec");
            String spec = in.nextLine();
            System.out.println("Enter Course");
            int course = in.nextInt();
            System.out.println("Enter Score");
            double score = in.nextInt();
            Student2 s = new Student2(fN, sN, spec, course, group, score);
            iDNumber.add(s);
        }
    }
    public void outArray() {
        for (Student2 student : iDNumber) {
            System.out.println(student.getFirstName() + " " + student.getSecondName() + " Group: " + student.getGroup() + " Spec:" + student.getSpec() + " Course: "+ student.getCourse());
        }
    }
    public void quickSort() {
        iDNumber.sort(Comparator.comparing(Student2::getScore).reversed());
    }
    public void sortByFirstName() {
        iDNumber.sort(Comparator.comparing(Student2::getFirstName));
    }
}
