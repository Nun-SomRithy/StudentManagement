import java.util.Scanner;

public class Student {
    int id;
    String name;
    String gender;
    int age;
    String className;
    float score;
    public Student() {

    }
    public Student(int id, String name, String gender, int age, String className, float score) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.className = className;
        this.score = score;
    }

    public void outPutInfo(){
        System.out.println();
        System.out.print("ID : [" +id +"]\t\t");
        System.out.print("Name :[" +name +"]\t\t");
        System.out.print("Gender :[" +gender +"]\t\t");
        System.out.print("Age :[" +age +"]\t\t");
        System.out.print("ClassName:[" +className +"]\t\t");
        System.out.print("Score :[" +score +"]\t\t");
        System.out.println();
    }


    void inputInformation(Scanner input) {
        boolean isIDValid = false;
        do {
            String strId;
            System.out.print("Enter ID : ");
            try {
                strId = input.next();
                id = Integer.parseInt(strId);
                isIDValid = true;
            } catch (Exception ex) {
                System.out.println("------------------------------------------");
                System.out.println(" Invalid ID format!! (Number only! )");
                System.out.println("------------------------------------------");

            }
        } while (!isIDValid);

        System.out.print("Enter Name : ");
        input.nextLine();
        name = input.nextLine();
        System.out.print("Enter Gender : ");
        gender = input.nextLine();

        boolean isAgeValid = false;
        do {
            String strAge;
            System.out.print("Enter Age : ");
            try {
                strAge = input.next();
                age = Integer.parseInt(strAge);
                isAgeValid = true;
            } catch (Exception ex) {
                System.out.println("------------------------------------------");
                System.out.println(" Invalid Age format!! (Number only! )");
                System.out.println("------------------------------------------");

            }
        } while (!isAgeValid);
        input.nextLine();
        System.out.print("Enter ClassName : ");
        className = input.nextLine();
        boolean isScoreValid = false;
        do {
            String strScore;
            System.out.print("Enter Score : ");
            try {
                strScore = input.next();
                score = Integer.parseInt(strScore);
                isScoreValid = true;
            } catch (Exception ex) {
                System.out.println("------------------------------------------");
                System.out.println(" Invalid Score format!! (Number only! )");                                    System.out.println("------------------------------------------");
                System.out.println("------------------------------------------");


            }
        } while (!isScoreValid);

    }


    void updateInformation(Scanner input) {

        System.out.print("Edit Name : ");
        name = input.nextLine();

        System.out.print("Edit Gender : ");
        gender = input.nextLine();

        boolean isAgeValid = false;
        do {
            String strAge;
            System.out.print("Edit Age : ");
            try {
                strAge = input.next();
                age = Integer.parseInt(strAge);
                isAgeValid = true;
            } catch (Exception ex) {
                System.out.println("------------------------------------------");
                System.out.println(" Invalid Age format!! (Number only! )");
                System.out.println("------------------------------------------");
            }
        } while (!isAgeValid);
        input.nextLine();

        System.out.print("Edit ClassName : ");
        className = input.nextLine();

        boolean isScoreValid = false;
        do {
            String strScore;
            System.out.print("Edit Score : ");
            try {
                strScore = input.next();
                score = Integer.parseInt(strScore);
                isScoreValid = true;
            } catch (Exception ex) {
                System.out.println("------------------------------------------");
                System.out.println(" Invalid Score format!! (Number only! )");
                System.out.println("------------------------------------------");
            }
        } while (!isScoreValid);
    }

}

