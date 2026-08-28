package entities;

public class Student2 {
    public String name;

    public double grade_1;
    public double grade_2;
    public double grade_3;
//    double allGrades = grade_1 + grade_2 + grade_3;
    public double finalGrade(){
        return grade_1 + grade_2 + grade_3;
    }
    public String status(){
        if (finalGrade() >= 60){
            return "Pass";
        }
        else{
            double missing = 60 - finalGrade();
            return "Failed\n" + "Missing points: " + missing;
        }
    }
}
