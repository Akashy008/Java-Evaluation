
public class Student {
    private String name;
    private String rollNumber;
    private int [] marks;
    

    public Student(String name, String rollNumber, int[] marks) throws InvalidMarksException{
            this.name = name;
            this.rollNumber = rollNumber;
            setMarks(marks);
    }
    public  void setMarks(int[] marks)throws InvalidMarksException {
        if (marks.length != 5) {
            throw new InvalidMarksException("It should be 5 subject's marks");
        }
        this.marks = new int [5];
        System.arraycopy(marks,0,this.marks,0,5);
    }
        public double calculateAverage(){
            int sum = 0;
            for(int mark : marks){
                sum += mark;
            }
            return sum / 5;
        }
        public String getGrade (){
            double average = calculateAverage();
            if (average >= 90)return "A";
            else if (average >= 80) return "B";
            else if (average >= 70)return "C";
            else if (average >= 60)return "D";
            else return "F";
        }
        @Override
        public String toString (){
            double avg = calculateAverage();
            String grade = getGrade();
            return "Student :" + name + " | Roll No :" + rollNumber + " | Average : "+ avg + "| Grade: " + grade;
        }
        public String getName(){
            return name;
        }
}
