public abstract class Student extends Department implements reward {

    private String name;
    private String id ;

public Student (String name , String id ){
    super();
    this.name=name;
    this.id=id;
}
protected abstract double calculate_GPA();

    @Override
    public boolean isReward() {
        if (calculate_GPA()>4.75)
        return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}

