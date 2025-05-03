import java.util.Comparator;

/**
 * A comparator for {@link Student} objects that compares them based on their names.
 * <p>
 * This comparator defines the natural alphabetical order of students by their {@code name} field.
 */
public class SortByName implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.getName().compareTo(b.getName());
    }
}
