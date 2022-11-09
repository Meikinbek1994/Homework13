public class MyClass {


    private String name;
    private String surname;
    private int age;
    private String food;
    private String[] courses=new String[2];
    private String studentName;
    private String studentSurname;
    private int studentGrade;
    private String[] studentTimeTable=new String[4];





    //Constructors

    public MyClass(String name, String surname, int age, String food, String[] courses){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.food=food;
        this.courses=courses;
    }


    public MyClass(String studentName, String studentSurname, int studentGrade, String[] studentTimeTable) {
        this.studentName=studentName;
        this.studentSurname=studentSurname;
        this.studentGrade=studentGrade;
        this.studentTimeTable=studentTimeTable;
    }


    //Getter for the first Constructor
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getAge(){
        return age;
    }
    public String getFood(){
        return food;
    }
    public String[] getCourses(){
        return courses;
    }

    //Getter for the second Constructor

    public String getStudentName(){
        return studentName;
    }
    public String getStudentSurname(){
        return studentSurname;
    }
    public int getStudentGrade(){
        return studentGrade;
    }
    public String[] getStudentTimeTable(){
        return studentTimeTable;
    }


}
