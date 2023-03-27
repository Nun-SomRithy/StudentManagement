import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void pressEnterKey() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n========================Press Enter to continues========================");
        scanner.nextLine();
    };

    public static void pressEnterKey2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n========================Press Enter to Continues========================");
        scanner.nextLine();
    };
    public static void main(String[] args) {


        ArrayList<Student> students = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("===============================Students Managements System ===============================");
            System.out.println("1.Insert Student to System ");
            System.out.println("2.Edit Student Information ");
            System.out.println("3.Search Student Information");
            System.out.println("4.Delete Student Information");
            System.out.println("5.Show Student Information");
            System.out.println("6.Exit");
            String strOption;
            System.out.print(">>> Choose your  option from 1 - 6 : ");
            strOption = input.nextLine();
            try {
                option = Integer.parseInt(strOption);
            } catch (Exception ex) {
                option = 0;
            }


            switch (option) {
                case 1:
                    System.out.println("++++++++++++++++++++++++++++++++ Insert Student ++++++++++++++++++++++++++++++++");
                    Student newStudent = new Student();
                    newStudent.inputInformation(input);
                    students.add(newStudent);
                    System.out.println("==========================================================");
                    System.out.println("SUCCESSFULLY ADDED STUDENT TO THE SYSTEM.....!");
                    System.out.println("==========================================================");
                    input.nextLine();
                    break;
                case 2:
                    System.out.println("++++++++++++++++++++++++++++++++ Edit Student Information ++++++++++++++++++++++++++++++++");

                    if (students.size() == 0) {
                        System.out.println("============================================");
                        System.out.println("There are no students in the system.");
                        System.out.println("============================================");
                    } else {
                        System.out.println();
                        int updateId = 0;
                        boolean isIDValid = false;
                        do {
                            try {
                                System.out.print("Enter Student ID to Edit: ");
                                updateId = input.nextInt();
                                isIDValid = true;
                                input.nextLine();
                            } catch (Exception ex) {
                                System.out.println("------------------------------------------");
                                System.out.println("Invalid ID format!! (Number only!)");
                                System.out.println("------------------------------------------");
                            }
                        } while (!isIDValid);

                        boolean isStudentExist = false;
                        for (int i = 0; i < students.size(); i++) {
                            if (updateId == students.get(i).id) {
                                isStudentExist = true;
                                System.out.println("--------------------------");
                                System.out.println("Lasted Information:");
                                System.out.println("--------------------------");
                                students.get(i).outPutInfo();
                                System.out.println("-------------------------------");
                                System.out.println("Edit the old information:");
                                System.out.println("-------------------------------");
                                students.get(i).updateInformation(input);
                                System.out.println("============================================");
                                System.out.println("Student information updated successfully!");
                                System.out.println("============================================");
                                break;
                            }
                        }
                        if (!isStudentExist) {
                            System.out.println("============================================");
                            System.out.println("Student with ID " + updateId + " doesn't exist!");
                            System.out.println("============================================");
                        }
                    }
                    break;

                case 3:
                    int searchOption;
                    System.out.println("************ Search Student Information ***********");
                    if (students.size()==0){
                        System.out.println("============================================");
                        System.out.println("There is no Students in the System");
                        System.out.println("============================================");
                    }
                    else{
                        System.out.println("1. Search By ID ");
                        System.out.println("2. Search By Name ");
                        System.out.println("3. Search By Gender ");
                        System.out.println("4. Search By ClassName ");
                        System.out.println("5. Exit....");

                        System.out.print("Choose option (1 - 5) : ");
                        searchOption = input.nextInt();
                        switch (searchOption) {
                            case 1:
                                int searchID = 0;
                                boolean isStudentExist = false;
                                System.out.println("*********** Search By ID ***********");
                                boolean isIDValid = false;
                                do {
                                    String strId;
                                    System.out.print("Enter ID to search : ");
                                    try {
                                        strId = input.next();
                                        searchID = Integer.parseInt(strId);
                                        isIDValid = true;
                                    } catch (Exception ex) {
                                        System.out.println("------------------------------------------");
                                        System.out.println(" Invalid ID format!! (Number only! )");
                                        System.out.println("------------------------------------------");
                                    }
                                } while (!isIDValid);

                                for (int i = 0; i < students.size(); i++) {
                                    if (searchID == students.get(i).id) {
                                        isStudentExist = true;
                                        students.get(i).outPutInfo();
                                    }
                                }
                                if (!isStudentExist) {
                                    System.out.print("Student with ID = " + searchID + " doesn't exist !!!");
                                }
                                input.nextLine();
                                break;

                            case 2:
                                input.nextLine();
                                String searchName;
                                boolean isStudentNameExist = false;
                                System.out.println("*********** Search By Name *********** ");
                                System.out.print("Enter name to search : ");
                                searchName = input.nextLine();

                                for (int i = 0; i < students.size(); i++) {
                                    if (searchName.equalsIgnoreCase(students.get(i).name)) {
                                        // student found
                                        isStudentNameExist = true;
                                        students.get(i).outPutInfo();
                                    }
                                }
                                if (!isStudentNameExist) {
                                    System.out.println("------------------------------------------");
                                    System.out.println("This student Not Found ! = " + searchName);
                                    System.out.println("------------------------------------------");

                                }
                                break;
                            case 3:
                                input.nextLine();
                                String searchGender;
                                boolean isStudentGenderExist = false;
                                System.out.println("*********** Search By Gender *********** ");
                                System.out.print("Enter Gender to search : ");
                                searchGender = input.nextLine();

                                for (int i = 0; i < students.size(); i++) {
                                    if (searchGender.equals(students.get(i).gender)) {
                                        isStudentGenderExist = true;
                                        students.get(i).outPutInfo();
                                    }
                                }
                                if (!isStudentGenderExist) {
                                    System.out.println("------------------------------------------");
                                    System.out.println("This Gender Not Found ! = " + searchGender);
                                    System.out.println("------------------------------------------");

                                }
                                break;
                            case 4:
                                input.nextLine();
                                String searchClassName;
                                boolean isStudentClassExist = false;
                                System.out.println("*********** Search By ClassName *********** ");
                                System.out.print("Enter ClassName to search : ");
                                searchGender = input.nextLine();

                                for (int i = 0; i < students.size(); i++) {
                                    if (searchGender.equals(students.get(i).className)) {
                                        isStudentClassExist = true;
                                        students.get(i).outPutInfo();
                                    }
                                }
                                if (!isStudentClassExist) {
                                    System.out.println("------------------------------------------");
                                    System.out.println("This ClassName Not Found ! = " + searchGender);
                                    System.out.println("------------------------------------------");

                                }
                                break;
                            case 5:
                                System.out.println("--------------------------");
                                System.out.println("Exit Search Option !!");
                                System.out.println("--------------------------");
                                break;
                            default:
                                System.out.println("--------------------------");
                                System.out.println("Wrong Option !!");
                                System.out.println("--------------------------");
                                break;
                        }
                        break;
                    }
                    pressEnterKey();
                    break;
                case 4:
                    System.out.println("++++++++++++++++++++++++++++++++ Delete Student Information ++++++++++++++++++++++++++++++++");
                    if (students.size()==0){
                        System.out.println("============================================");
                        System.out.println("There is no Students in the System");
                        System.out.println("============================================");
                    }
                    else{
                        int deleteID = 0;
                        boolean isStudentExist = false;
                        boolean isdeleteIDValid = false;
                        do {
                            String strIdd;
                            System.out.print("Enter ID to Delete : ");
                            try {
                                strIdd = input.next();
                                deleteID = Integer.parseInt(strIdd);
                                isdeleteIDValid = true;
                            } catch (Exception ex) {
                                System.out.println("------------------------------------------");
                                System.out.println(" Invalid ID format!! (Number only! )");
                                System.out.println("------------------------------------------");
                            }
                        } while (!isdeleteIDValid);

                        boolean isStudentDeleted = false;

                        for (int i = 0; i < students.size(); i++) {
                            if (deleteID == students.get(i).id) {
                                students.remove(i);
                                isStudentDeleted = true;
                                System.out.println("============================================");
                                System.out.println("Student with ID " + deleteID + " has been deleted.");
                                System.out.println("============================================");
                                break;
                            }
                        }

                        if (!isStudentDeleted) {
                            System.out.println("============================================");
                            System.out.println("Student with ID " + deleteID + " no in System");
                            System.out.println("============================================");
                        }
                    }
                    break;
                case 5:
                    System.out.println("++++++++++++++++++++++++++++++++ Show Student Information ++++++++++++++++++++++++++++++++");
                    if (students.size() == 0) {
                        System.out.println("============================================");
                        System.out.println("There are no students in the system.");
                        System.out.println("============================================");
                    }
                    else {
                        for (int i = 0; i < students.size(); i++) {
                            students.get(i).outPutInfo();
                        }
                    }
                    break;
                case 6:
                    System.out.println("--------------------------------");
                    System.out.println("Exit the program...!!");
                    System.out.println("--------------------------------");
                    System.exit(0);
                    break;
                default:
                    System.out.println("------------------------------------------");
                    System.out.println("Opp Wrong option !! ");
                    System.out.println("------------------------------------------");

            }
            pressEnterKey();
        } while (option != 6);

    }





}
