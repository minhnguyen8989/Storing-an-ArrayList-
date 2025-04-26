public class Student {
    int rollno;
    String name;
    String address;

    /**
     * Constructs a new {@code Student} object with the specified roll number, name, and address.
     *
     * @param rollno  the student's roll number
     * @param name    the student's name
     * @param address the student's address
     */
    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    /**
     * Returns a string representation of the student, including roll number, name, and address.
     *
     * @return a string representation of the student
     */
    @Override
    public String toString() {
        return "Roll No: " + rollno + ", Name: " + name + ", Address: " + address;
    }
}
