public class Student extends Person{
    private double contract;


   public Student(){
       super();

   }

    @Override
    public String toString() {
        return  super.toString()+
                " contract=" + contract +
                '}';
    }

    public double getContract() {
        return contract;
    }

    public void setContract(double contract) {
        this.contract = contract;
    }

    public Student(Long id, String fullname, int age, char gender, double contract) {
        super(id, fullname, age, gender);
        this.contract=contract;
    }


}

