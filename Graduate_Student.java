public class Graduate_Student extends Student {
    public String academic_Degree;
    public double gpa;

    public Graduate_Student(String name, String id, String academic_Degree) {
        super(name, id);
        this.academic_Degree = academic_Degree;
    }

    protected double calculateGPA(double totalGradePoints, double totalCreditHours) {
        double gpa = 0.0;
        if (totalCreditHours > 0) {
            gpa = totalGradePoints / totalCreditHours;
        }
        this.gpa = gpa;
        return gpa;
    }



    public boolean isReward(){
        if (this.gpa >= 4.5) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Graduate Student: " + super.toString() + ", Academic Degree: " + academic_Degree + ", GPA: " + gpa;
    }

    public double calculateGPA() {
        return this.gpa;
    }

}
