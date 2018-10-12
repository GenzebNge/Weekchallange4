package studentCourseApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static  ArrayList<Student> students = new ArrayList<>();
    static  ArrayList<Teacher> teachers = new ArrayList<>();
    static  ArrayList<Course> courses = new ArrayList<>();
    static   Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

        System.out.println("WELCOME TO STUDENT COURSE APPLICATION!");

        String doOtherchoice ="";

        do{
        System.out.println("Choose what do you want to add! \n 1. for Student \n 2. for Teachers, \n 3. for Courses, \n 4. options ");
        int choice = scan.nextInt();
        scan.nextLine();

            if (choice == 1){
                addstudents();
            } else if  (choice == 2){
                addTeachers();
            }else if(choice == 3){
                addCourses();
            }else if (choice == 4){
                chooseOption();
            }

            System.out.println("Do you want to perform another task :");
            doOtherchoice = scan.nextLine();

       }while (doOtherchoice.equalsIgnoreCase("yes"));
        listCourses();


    }


    private static void addCourses() {
                String userAnser ="";

               do {

                    Course myCourse = new Course();
                    System.out.println("Enter the coure Id ");
                    int coursId = scan.nextInt();
                    scan.nextLine();
                    myCourse.setCousrId(coursId);
                    System.out.println("Enter Course name");
                    String courseName = scan.nextLine();
                    myCourse.setName(courseName);
                    System.out.println("Do you want to add more courses ?");
                    userAnser = scan.nextLine();
                    courses.add(myCourse);

                }while (userAnser.equalsIgnoreCase("yes"));
        if (userAnser.equalsIgnoreCase("No")){
            chooseOption();
        }
    }

    private static void listCourses() {

        System.out.println("List of added Courses ");
        for (Course course : courses){
            System.out.println("Cours ID : " + course.getCousrId());
            System.out.println("Course Name :  : " + course.getName());
        }
    }

    private static void addTeachers() {
        String teachadding ="";

        do{

        Teacher teacher = new Teacher();
        System.out.println("Enter teacher Id ");
        int tId = scan.nextInt();  scan.nextLine();
        teacher.setTeacherId(tId);
        System.out.println("Enter teacher name ");
        String tFirstName = scan.nextLine();
        teacher.setFirstName(tFirstName);

        System.out.println("Enter Techer Laste Name");
        String tLastName = scan.nextLine();
        teacher.setLastName(tLastName);
        System.out.println("Enter teacher email ");
        String temail = scan.nextLine();
        teacher.setEmail(temail);
        System.out.println("Do you want ot add more teachers");
        teachadding = scan.nextLine();
            teachers.add(teacher);
        }while (teachadding.equalsIgnoreCase("yes"));

        if (teachadding.equalsIgnoreCase("No")){
            chooseOption();
        }
       // listTeachers();
    }

    private static void listTeachers() {

        System.out.println("List of Teachers ");
        for (Teacher teach : teachers){
            System.out.println("Teacher ID : " + teach.getTeacherId());
            System.out.println("First Name : "+ teach.getFirstName());
            System.out.println("Last Name : "  + teach.getLastName() );
            System.out.println("Email : " + teach.getEmail());
        }
    }

    private static void addstudents() {

        String addNewStudent ="";
        do {

            Student myStudent  = new Student();
            System.out.println("Enter Student Id");
            int studentID = scan.nextInt();
            scan.nextLine();
            myStudent.setStudentId(studentID);
            System.out.println("Enter student first name");
            String fName = scan.nextLine();
            myStudent.setFirsName(fName);
            System.out.println("Enter Student last name");
            String lname = scan.nextLine();
            myStudent.setLastName(lname);
            System.out.println("Enter email address");
            String email = scan.nextLine();
            myStudent.setEmail(email);
            System.out.println("Do you want to add other student?");
            addNewStudent = scan.nextLine();
            students.add(myStudent);
        }while(addNewStudent.equalsIgnoreCase("yes"));
        if (addNewStudent.equalsIgnoreCase("No")){
            chooseOption();
        }

       //listStudents();

    }


    private static void listStudents() {
        System.out.println("List of students : ");
            Course cr = new Course();
        for (Student student : students ){
            System.out.println("ID Number: " + student.getStudentId());
            System.out.println("First Name : " + student.getFirsName());
            System.out.println("Last Name : " + student.getLastName());
            System.out.println("Email : " + student.getEmail());

        }
    }

    private static void chooseOption() {

        System.out.println("What do you want to do? doTask or seelist ");{

            String userChoise = scan.nextLine();
            if (userChoise.equalsIgnoreCase("doTask")){

            }else if (userChoise.equalsIgnoreCase("seeList")){
                choosewhatToDo();
            }

        }
    }

    private static void choosewhatToDo() {

        System.out.println("Choose which list you want to see ? student, courses , teachers ");
        String toDo = scan.nextLine();
        if (toDo.equalsIgnoreCase("student")){
            listStudents();
        }else if (toDo.equalsIgnoreCase("teachers")){
            listTeachers();
        }else if (toDo.equalsIgnoreCase("courses")){
            listCourses();
        }
    }
}
