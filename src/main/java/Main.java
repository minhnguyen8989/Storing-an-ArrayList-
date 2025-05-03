public class Main {
    public static void main(String[] args) {

        try {
            Student student1 = new Student(-1, "Alice", "New York");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());  // Expected: Roll number cannot be negative
        }

        try {
            Student student2 = new Student(1, null, "Los Angeles");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());  // Expected: Name cannot be null or empty
        }

        try {
            Student student3 = new Student(2, "Charlie", "");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());  // Expected: Address cannot be null or empty
        }

        Student student4 = new Student(3, "David", "Houston");
        System.out.println(student4);  // Expected: Roll No: 3, Name: David, Address: Houston
    }
}
