public class Main {
   public static void main(String[] args) {

      Course math = new Course("Math", "MATH101", "MATH");
      Course physics = new Course("Physics", "PHYS101", "PHYS");
      Course chemistry = new Course("Chemistry", "CHEM101", "CHEM");

      Teacher t1 = new Teacher("Deniz", "90550000", "MATH");
      Teacher t2 = new Teacher("Erdem", "90550001", "PHYS");
      Teacher t3 = new Teacher("İpek", "90550002", "CHEM");

      math.addTeacher(t1);
      physics.addTeacher(t2);
      chemistry.addTeacher(t3);

      Student s1 = new Student("Zeynep", 4, "140144015", math, physics, chemistry);
      s1.addBulkExamNote(50,20,40,12,32,54);
      s1.isPass();

      Student s2 = new Student("Cemil", 2, "2211133", math, physics, chemistry);
      s2.addBulkExamNote(100,50,40,65,65,87);
      s2.isPass();

      Student s3 = new Student("Yılmaz", 4, "221121312", math, physics, chemistry);
      s3.addBulkExamNote(50,20,40,0,5,78);
      s3.isPass();

   }
}