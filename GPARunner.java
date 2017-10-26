/**
 * Created by Crista on 2/1/17.
 */
public class GPARunner {
    public static void main(String args[]) {
        GPA gpa1 = new GPA(5.16,5.0);

        System.out.println(gpa1.calculateNeededGPA(5.21,7,8));
        System.out.println(gpa1);
    }
}
