package OOPAssignments;

/* Create class named Student with following public properties:
        - name
        - fNumber
        and methods:
        - takeExam()
        This method should implement logic for printing out the following message: "Taking exam".

        Note: name and fNumber are assigned in class constructor.
*/


        class Student {

         String name;
         int fNumber;
         int attendance;

        Student(){
            this.name = "John Doe";
            this.fNumber = 1912;
            this.attendance = 10;
        }

         void takeExam(){
            System.out.println("Taking exam");
        }

         static void main(String[] args){
            Student student = new Student();
            System.out.println(student.fNumber);
            System.out.println(student.name);
            student.takeExam();

        }


    }

    class Mathematician extends Student{
    private String certification = "bachelor's degree in math";

        //getter
        String getCertification(){
            return certification;
        }

        //setter
         void setCertification(String newCertification){
            this.certification = newCertification;
        }

        }



    class Athlete extends Student{

    }

    class NewMathematician extends Mathematician{
        @Override
        void setCertification (String newCertification) {
            super.setCertification(newCertification);
        }
    }



