import java.util.ArrayList;

public class Department implements Printable {
    private ArrayList<Student> students;
      
    public Department (){
        students = new ArrayList<>();
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void displayAll(){
        for(Student student : students){
            System.out.println(student);
        }
    }
    @Override
    public void printSummary(){
        System.out.println ("--- Department Summary ---");
        System.out.println ("Total Students: "
         + students.size());
    }

}
