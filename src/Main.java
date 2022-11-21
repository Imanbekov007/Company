import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    Student student=new Student((long) 12,"Adil Aytbaev",18,'M',12000);
    Student student2=new Student((long) 13,"Erbolot Zholborsov",17,'M',12000);
    Student student3=new Student((long) 14,"Nursultan Aybek uulu",16,'M',11000);
    Mentor mentor1=new Mentor((long)22,"Rahim Bazarbay uulu",20,'M',35000);
    Mentor mentor2=new Mentor((long)23,"Talant Razzakov",30,'M',95000);
    Mentor mentor3=new Mentor((long)24,"Ayjamal Asangazieva",25,'F',350000);
    Instructor instructor=new Instructor((long)32,"Mukhammed Toichubaev",27,'M',40000);
    Instructor instructor2=new Instructor((long)33,"Shumkar Elchibekov",21,'M',43000);
    Instructor instructor3=new Instructor((long)34,"Aybek Narmatov",34,'M', 39000);
    double[]contracts={student.getContract(), student2.getContract(), student3.getContract()};
   double b= student.getContract()+ student3.getContract()+ student2.getContract();
        System.out.println("students's sum of contracts "+(int)b);
        System.out.println(student.getFullname()+"'s full contract "+student.getContract()*9);
        System.out.println(student2.getFullname()+"'s full contract "+student2.getContract()*9);
        System.out.println(student3.getFullname()+"'s full contract "+student3.getContract()*9);
        System.out.println(mentor1.getFullname()+"s full salary "+mentor1.getSalary()*9);
        System.out.println(mentor2.getFullname()+"s full salary "+mentor2.getSalary()*9);
        System.out.println(mentor3.getFullname()+"s full salary "+mentor3.getSalary()*9);
        System.out.println(instructor.getFullname()+"s full salary "+instructor.getSalary()*9);
        System.out.println(instructor2.getFullname()+"s full salary "+instructor2.getSalary()*9);
        System.out.println(instructor3.getFullname()+"s full salary "+instructor3.getSalary()*9);
    String[]courses={"Java","Javascript"};
    String[]courses2={"Python","c++"};
    Company company=new PeaksoftHouse("Peaksoft","vostok-5",courses,"Kyrgyz");
    Company company2=new ItAcademy("It academy","Vostok-5",courses2,"Russian");

    Person[]students={student,student2,student3};
    Person[]intructors={instructor,instructor2,instructor3};
    Person[]mentors={mentor1,mentor2,mentor3};
    Person[]people={student2,student3,student,mentor1,mentor2,mentor3,instructor,instructor2,instructor3};


        for (Person a:
             people) {
            System.out.println(a);
        }
        int[]ages={student2.getAge(),student3.getAge(), student.getAge(), mentor1.getAge(), mentor2.getAge(), mentor3.getAge(), instructor.getAge(), instructor2.getAge(), instructor3.getAge()};
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));

    }
}
