package OOPAssignments;

/* Create class named Student with following public properties:
        - name
        - fNumber
        and methods:
        - takeExam()
        This method should implement logic for printing out the following message: "Taking exam".

        Note: name and fNumber are assigned in class constructor.
*/


    public  class Student {

        public String name;
        public int fNumber;

        Student(){
            this.name = "John Doe";
            this.fNumber = 1912;
        }

        public void takeExam(){
            System.out.println("Taking exam");
        }

        public static void main(String[] args){
            Student student = new Student();
            System.out.println(student.fNumber);
            System.out.println(student.name);
            student.takeExam();

        }
    }

