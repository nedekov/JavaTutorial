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
         boolean attendance;
            private String printTakingExamMessage;

            Student(){
            this.name = "John Doe";
            this.fNumber = 1912;
            this.attendance = false;
        }

 /*1. Overload takeExam() method in order to perform the following tasks:
 -checking if attendance of the student is true (consider for which student the overloading is applicable)
 - depending on the check above, print the message that the exam is passed. If the check fails,
 print a message that the exam is not passed. */

            void takeExam(String printTakingExamMessage){

             System.out.println("Taking exam");
        }

         void takeExam(String checkAttendance,String test){
            if (attendance){
                System.out.println("The exam is passed");
            }
            else{
                System.out.println("The exam is not passed");
            }

        }


         public static void main(String[] args){
            Student student = new Student();
            System.out.println(student.fNumber);
            System.out.println(student.name);
            student.takeExam("test Taking exam message");
            student.takeExam("test","overloading");

        }
    }

    //2. Mathematician and Athlete classes should implement Practice interface.
    class Mathematician extends Student implements Practice
       {

           @Override
           public void training () {
               System.out.println("I'm training");
           }

           private boolean certification = false;

        //getter
        boolean getCertification(){
            return certification;}

        //setter
         void setCertification(boolean newCertification){
            this.certification = newCertification;}

        public static void main (String[] args){
            Mathematician mathematician = new Mathematician();}

        }


    //2. Mathematician and Athlete classes should implement Practice interface.
    // Athlete is made abstract, since it doesn't implement the method from the Practice interface
    abstract class Athlete extends Student implements Practice {}


    class NewMathematician extends Mathematician{

        @Override
        void setCertification (boolean newCertification) {
            super.setCertification(newCertification);
        }

        //2. Override takeExam() method in order to:
        //- set value to certification property to true and print a message that the exam is passed.
        @Override
        void takeExam (String setCertificationToTrue) {
            setCertification(true);
            System.out.println("The exam is passed");
        }

         public static void main (String[] args) {
            NewMathematician newMathematician = new NewMathematician();
            newMathematician.takeExam("test method overriding");
            System.out.println(newMathematician.getCertification());

        }


    }
        //1. Create interface Practice with method "training".
         interface Practice
         {
           void training();
         }


