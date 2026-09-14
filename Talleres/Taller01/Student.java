public class Student {
    private String name;
    private String studentId;
    private double grade1;
    private double grade2;
    private double grade3;
    public String readName(){
    return name;
    }
    public String readStudentId(){
        return studentId;
    }
    public double readGrade1(){
    return grade1;
    }
    public double readGrade2(){
    return grade2;
    }
    public double readGrade3(){
    return grade3;
    }
   
    public Student(String newStudentId){
    studentId = newStudentId;
    }
    public boolean addName(String newName){
        if(!newName.equals("")){
           name=newName;
           return true;
        }
        return false;
    }
    public boolean addGrade1(double newGrade1){
        if(newGrade1>=0 && newGrade1<=5){
            grade1=newGrade1;
            return true;
        }
        return false;
    }
    public boolean addGrade2(double newGrade2){
        if(newGrade2>=0 && newGrade2<=5){
            grade2=newGrade2;
            return true;
        }
        return false;
    }
    public boolean addGrade3(double newGrade3){
        if(newGrade3>=0 && newGrade3<=5){
            grade3=newGrade3;
            return true;
        }
        return false;
    }
    public double Average(){
       double average=(grade1+grade2+grade3)/3;
       return average; 
    }

    
}

