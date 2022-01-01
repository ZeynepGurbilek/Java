public class Student {
    String name,stuNo;
    int classes;
    Course math;
    Course physics;
    Course chemistry;
    double average;
    boolean isPass;



    Student(String name, int classes, String stuNo, Course math,Course physics,Course chemistry) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int math, int physics, int chemistry, int oralNote1, int oralNote2, int oralNote3) {

        if (math >= 0 && math <= 100) {
            this.math.note = math;
        }

        if (physics >= 0 && physics <= 100) {
            this.physics.note = physics;
        }

        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.note = chemistry;
        }


        if(oralNote1 >= 0 && oralNote1 <=100){
            this.math.oralNote = oralNote1;
        }


        if(oralNote2 >= 0 && oralNote2 <=100){
            this.physics.oralNote = oralNote2;

        }

        if(oralNote3 >= 0 && oralNote3 <=100){
            this.chemistry.oralNote = oralNote3;

        }

    }



    public void isPass() {
        if (this.math.note == 0 || this.physics.note == 0 || this.chemistry.note == 0) {
            System.out.println("Grades are not completely entered");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average : " + this.average);
            if (this.isPass) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        }
    }

    public void calcAvarage() {
        this.average=((this.math.note*0.80 + this.math.oralNote*0.20) + (this.chemistry.note*0.80 + this.chemistry.oralNote*0.20)
                +(this.physics.note*0.80 + this.physics.oralNote*0.20)) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("___________________________________");
        System.out.println("Student : " + this.name);
        System.out.println("Math Grade : " + this.math.note);
        System.out.println("Physics Grade : " + this.physics.note);
        System.out.println("Chemistry Grade : " + this.chemistry.note);
    }

}