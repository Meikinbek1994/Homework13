import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        MyClass myClass=new MyClass("Meikinbek", "Alimbekov", 28, "Manty", new String[]{"Java","English"});
        MyClass myClass1=new MyClass("Erzat", "Alimbekov", 4, new String[]{"Moday","Tuesday","Thursday","Friday"});
        System.out.println("Name: "+myClass.getName()+"\n"+"Surname: "+myClass.getSurname()+"\n"+"Age: "+myClass.getAge()+"\n"+"Favourite food: "+myClass.getFood()+"\n"+"Courses taken: "+ Arrays.toString(myClass.getCourses()));
        System.out.println("Name: "+myClass1.getStudentName()+"\n"+"Surname: "+myClass1.getStudentSurname()+"\n"+"Degree: "+myClass1.getStudentGrade()+"\n"+"Courses Timetable: "+Arrays.toString(myClass1.getStudentTimeTable()));



    }
}