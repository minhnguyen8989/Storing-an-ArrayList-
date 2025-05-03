public class Student {
    private int rollno;
    private String name;
    private String address;

    /**
     * Constructs a new {@code Student} object with the specified roll number, name, and address.
     * Ensures that name and address are not null, and rollno is not negative.
     *
     * @param rollno  the student's roll number
     * @param name    the student's name
     * @param address the student's address
     * @throws IllegalArgumentException if any input is invalid (null name/address or negative rollno)
     */
    public Student(int rollno, String name, String address) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (address == null || address.trim().isEmpty()) {
            throw new IllegalArgumentException("Address cannot be null or empty");
        }
        if (rollno < 0) {
            throw new IllegalArgumentException("Roll number cannot be negative");
        }

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

    // Getters for encapsulation
    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
