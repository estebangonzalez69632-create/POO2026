public class TestStudent {
    public static void main(String[] args) {
        
    
   Student student1=  new Student("00001234");
   //PROOF 1
   System.out.println("ID"+student1.readStudentId());
   boolean accepted_name=student1.addName("ANDREA");
   System.out.println(accepted_name);
   System.out.println(student1.readName());
   boolean accepted_grade1=student1.addGrade1(4.8);
   System.out.println(accepted_grade1);
   System.out.println(student1.readGrade1());
   boolean accepted_grade2=student1.addGrade2(1.5);
   System.out.println(accepted_grade2);
   System.out.println(student1.readGrade2());
   boolean accepted_grade3=student1.addGrade3(5);
   System.out.println(accepted_grade3);
   System.out.println(student1.readGrade3());
   System.out.println("AVERAGE ="+student1.Average());
   //PROOF 2
   System.out.println("ID"+student1.readStudentId());
   accepted_name=student1.addName("");
   System.out.println(accepted_name);
   System.out.println(student1.readName());
   accepted_grade1=student1.addGrade1(4.8);
   System.out.println(accepted_grade1);
   System.out.println(student1.readGrade1());
   accepted_grade2=student1.addGrade2(1.5);
   System.out.println(accepted_grade2);
   System.out.println(student1.readGrade2());
   accepted_grade3=student1.addGrade3(5);
   System.out.println(accepted_grade3);
   System.out.println(student1.readGrade3());
   System.out.println("AVERAGE ="+student1.Average());
   //PROOF 3
   System.out.println("ID"+student1.readStudentId());
   accepted_name=student1.addName("MARIA");
   System.out.println(accepted_name);
   System.out.println(student1.readName());
   accepted_grade1=student1.addGrade1(-2);
   System.out.println(accepted_grade1);
   System.out.println(student1.readGrade1());
   accepted_grade2=student1.addGrade2(-5);
   System.out.println(accepted_grade2);
   System.out.println(student1.readGrade2());
   accepted_grade3=student1.addGrade3(-2);
   System.out.println(accepted_grade3);
   System.out.println(student1.readGrade3());
   System.out.println("AVERAGE ="+student1.Average());
   //PROOF 4
   System.out.println("ID"+student1.readStudentId());
   accepted_name=student1.addName("ANDREA");
   System.out.println(accepted_name);
   System.out.println(student1.readName());
   accepted_grade1=student1.addGrade1(-4.8);
   System.out.println(accepted_grade1);
   System.out.println(student1.readGrade1());
   accepted_grade2=student1.addGrade2(1.5);
   System.out.println(accepted_grade2);
   System.out.println(student1.readGrade2());
   accepted_grade3=student1.addGrade3(5);
   System.out.println(accepted_grade3);
   System.out.println(student1.readGrade3());
   System.out.println("AVERAGE ="+student1.Average());
   //PROOF 5
   System.out.println("ID"+student1.readStudentId());
   accepted_name=student1.addName("ANDREA");
   System.out.println(accepted_name);
   System.out.println(student1.readName());
   accepted_grade1=student1.addGrade1(2);
   System.out.println(accepted_grade1);
   System.out.println(student1.readGrade1());
   accepted_grade2=student1.addGrade2(-1.5);
   System.out.println(accepted_grade2);
   System.out.println(student1.readGrade2());
   accepted_grade3=student1.addGrade3(6);
   System.out.println(accepted_grade3);
   System.out.println(student1.readGrade3());
   System.out.println("AVERAGE ="+student1.Average());
   //PROOF 6
   System.out.println("ID"+student1.readStudentId());
    accepted_name=student1.addName("ANDREA");
   System.out.println(accepted_name);
   System.out.println(student1.readName());
   accepted_grade1=student1.addGrade1(4);
   System.out.println(accepted_grade1);
   System.out.println(student1.readGrade1());
   accepted_grade2=student1.addGrade2(3.8);
   System.out.println(accepted_grade2);
   System.out.println(student1.readGrade2());
   accepted_grade3=student1.addGrade3(-5);
   System.out.println(accepted_grade3);
   System.out.println(student1.readGrade3());
   System.out.println("AVERAGE ="+student1.Average());
}
}
