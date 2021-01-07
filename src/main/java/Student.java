import java.util.ArrayList;

public class Student {

    long id;
    String name;
    ArrayList<Integer> grades;

    public Student(long id, String name){
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades(){
        return grades;
    }

    public double getGradeAverage(){
        int numOfGrades = grades.size();
        double total = 0;
        for(int grade:grades){
            total += grade;
        }
        return total / numOfGrades;
    }

}
