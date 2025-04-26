import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(5, "Alice", "New York"));
        students.add(new Student(2, "Charlie", "Los Angeles"));
        students.add(new Student(10, "Bob", "Chicago"));
        students.add(new Student(3, "David", "Houston"));
        students.add(new Student(8, "Eve", "Phoenix"));
        students.add(new Student(1, "Frank", "Philadelphia"));
        students.add(new Student(9, "Grace", "San Diego"));
        students.add(new Student(6, "Hannah", "Dallas"));
        students.add(new Student(4, "Ivy", "San Jose"));
        students.add(new Student(7, "Jack", "Austin"));

        System.out.println("Original List:");
        printList(students);

        SelectionSort.sort(students, new SortByName());
        System.out.println("\nSorted by Name:");
        printList(students);

        SelectionSort.sort(students, new SortByRollNo());
        System.out.println("\nSorted by Roll No:");
        printList(students);
    }

    /**
     * Prints the details of each student in the given list to the standard output.
     * <p>
     * Each student's information is displayed using the {@code toString()} method
     * of the {@link Student} class.
     *
     * @param students an {@code ArrayList} of {@code Student} objects to be printed
     */
    public static void printList(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
