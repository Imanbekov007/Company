public class Instructor extends Person{
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "salary=" + salary +
                '}';
    }

    public Instructor(Long id, String fullname, int age, char gender, double salary) {
        super(id, fullname, age, gender);
        this.salary=salary;
    }


}
