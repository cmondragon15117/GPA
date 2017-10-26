import java.text.DecimalFormat;

/**
 * Created by Crista on 2/1/17.
 */
public class GPA {
    private double gpa;
    private double scale;
    private DecimalFormat d = new DecimalFormat("0.00");


    public GPA() {
        setGpa(4.0);
        setScale(4.0);
    }

    public GPA(double gpa, double scale) {
        this.setGpa(gpa);
        this.setScale(scale);
    }

    public GPA(GPA gpa) {
        this.setGpa(gpa.getGpa());
        this.setScale(gpa.getScale());
    }

    public void setGpa(double gpa) {
        gpa = (gpa > 0 && gpa < 7) ? gpa:4.0;
        System.out.println(gpa);
        this.gpa = gpa;
    }

    public void setScale(double scale) {
        scale = (scale > 0 && scale < 7) ? scale:4.0;
        System.out.println(scale);
        this.scale = scale;
    }

    public double getGpa() {
        return gpa;
    }

    public double getScale() {
        return scale;
    }

    public double calculateNeededGPA(double desiredGpa, double currentSem, double totalSemToBeTaken) {
        //For current semester: 1 = FreshSem1, 2 = FreshSem2, 3 = SophSem1 etc.
        double percentAllSemTaken = currentSem/totalSemToBeTaken;
        double percentForRemaining = 1.0 - percentAllSemTaken;
        double weightedGpaThatCounts = percentAllSemTaken * getGpa();
        double finalGpa = (desiredGpa - weightedGpaThatCounts) / percentForRemaining;

        return finalGpa;


    }

    public String toString() {
        return d.format(getGpa()) + " out of " + d.format(getScale());
    }

}
