import java.util.Arrays;

public class Company{
    String name;
    String address;
    String[]courses;
    String languageofInstruction;

    public Company(String name, String address, String[] courses, String languageofInstruction) {
        this.name = name;
        this.address = address;
        this.courses = courses;
        this.languageofInstruction = languageofInstruction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String getLanguageofInstruction() {
        return languageofInstruction;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", courses=" + Arrays.toString(courses) +
                ", languageofInstruction='" + languageofInstruction + '\'' +
                '}';
    }

    public void setLanguageofInstruction(String languageofInstruction) {
        this.languageofInstruction = languageofInstruction;


    }

    public static double income(Student[]students){
        return 12.00;
    }

}
