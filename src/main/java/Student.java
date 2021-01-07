import java.util.ArrayList;

public class Student {

    public static long id;
    public static String name;
    public static ArrayList<Integer> grades;

    public Student(long id, String name){
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public static long getId(){
        return id;
    }

    public static String getName(){
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public static ArrayList<Integer> getGrades(){
        return grades;
    }

    public double getGradeAverage(){
        double numOfGrades = grades.size();
        double total = 0;
        for(int grade:grades){
            total += grade;
        }
        return total / numOfGrades;
    }


}
