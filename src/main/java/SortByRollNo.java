import java.util.Comparator;

/**
 * A comparator for {@link Student} objects that compares them based on their roll numbers.
 * <p>
 * This comparator defines the natural ascending order of students by their {@code rollno} field.
 */
public class SortByRollNo implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return Integer.compare(a.getRollno(), b.getRollno());
    }
}
