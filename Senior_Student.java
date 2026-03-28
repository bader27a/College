public class Senior_Student extends Undergraduate_Student {
    public String project_Title;
    public double gpa;

    public Senior_Student(String name, String id,int age , String project_Title) {
        super(name, id, age);
        this.project_Title = project_Title;
    }

    protected double calculateGPA(double totalGradePoints, double totalCreditHours) {
        double gpa = 0.0;
        if (totalCreditHours > 0) {
            gpa = totalGradePoints / totalCreditHours;
        }
        this.gpa = gpa;
        return gpa;
    }

    public String toString() {
        return "Senior Student: " + super.toString() + ", Project Title: " + project_Title + ", GPA: " + gpa;
    }

}
