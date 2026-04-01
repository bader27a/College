public class Professor implements reward{
    private String name;
    public String id;          // changed from private so Department can access it
    private double salary;
    private int paper_published = 0;
 
    public Professor(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
 
    public String getId() {
        return id;
    }
 
    public void setPapersPublished(int count) {
        this.paper_published += count;
        this.salary += paper_published * 1500;
    }
 
    public double calcuataSalary() {
        return this.salary;
    }
 
    public boolean isReward() {
        return paper_published >= 1;
    }
    public int getPaper_published(){
        return paper_published;
    }

    public String getName(){
        return this.name;
    }
 
    @Override
    public String toString() {
        return "Professors{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                ", paper_published=" + paper_published +
                '}';
    }
}
