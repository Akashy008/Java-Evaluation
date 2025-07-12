public class Main {
    public static void main(String[] args) {
        Department dept =new Department();
        try{
            Student s1 = new Student("Alice", "101", new int[] {85,98,88,92,87});
            Student s2 = new Student("bob", "101", new int[] {95,98,98,52,87});
            Student s3 = new Student("clara", "101", new int[] {95,97,77,92,87});

            dept.addStudent(s1);
            dept.addStudent(s2);
            dept.addStudent(s3);

            dept.displayAll();
            dept.printSummary();

            try{
                Student s4 = new Student("Alice", "101", new int[] {85,198,88,92,87});
            
            }catch(InvalidMarksException e){
                System.out.println("Error:" + e.getMessage());
            }
        }catch(InvalidMarksException e){
                System.out.println("Error:" + e.getMessage());
            }
        }
}
