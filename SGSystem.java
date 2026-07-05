import java.util.Scanner;
public class SGSystem {

    // for get letter grade
    static char letterGrade(int grade) {
        if (grade <= 100 && grade >= 80) return 'A';
        else if (grade <= 79 && grade >= 70) return 'B';
        else if (grade <= 69 && grade >= 60) return 'C';
        else if (grade <= 59 && grade >= 50) return 'D';
        else return 'F';

    }

    // print pass fail
    static String passOrFail(int status){
        if (status>=50 && status<=100) return "PASS";

        else return "FAIL";

    }

    // for calculate average
    static double calculateAverage(int[] studentGrades ){
        int sum =0;
        for (int i = 0;i<studentGrades.length;i++){
            sum = sum+studentGrades[i];
        }
        return (double) sum /studentGrades.length;
    }



    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int passCount =0;
        int failCount =0;

        System.out.print("How many student want to enter : ");
        int studentAmount = input.nextInt();
        // dummy
        input.nextLine();

        String[] studentNames = new String[studentAmount];
        int[] studentGrades = new int[studentAmount];

        for(int i =0 ;i<studentNames.length;i++){
            System.out.print("Enter name of the student "+(i+1)+" : ");



            studentNames[i] = input.nextLine();
            System.out.print("Enter mark of the student "+(i+1)+" : ");
            studentGrades[i] = input.nextInt();
            input.nextLine();
            System.out.println(" ");

        }


        // display report section
        System.out.println("----STUDENT GRADE REPORT----");

        for (int i =0 ; i<studentAmount;i++) {

            System.out.println(" Student Name: " + studentNames[i] + "\tStudent Grade: " + studentGrades[i] + "\tLetter: " + letterGrade(studentGrades[i]) +"\tStatus: " + passOrFail(studentGrades[i]));
        }

        System.out.println("------------------------------");


        System.out.println("Class Average: "+calculateAverage(studentGrades));


        int highestMark =0;
        String highestStudent=studentNames[1];

        for (int i=0;i<studentAmount;i++){
            if(studentGrades[i]>highestMark){
                highestMark=studentGrades[i];
                highestStudent=studentNames[i];
            }
        }


        System.out.println("Highest: "+highestStudent+" with "+highestMark);

        int lowestMark =100;
        String lowestStudent=studentNames[1];

        for(int i=0;i<studentAmount;i++){
            if(studentGrades[i]<lowestMark){
                lowestMark=studentGrades[i];
                lowestStudent=studentNames[i];
            }
        }

        System.out.println("Lowest: "+lowestStudent+" with "+lowestMark);

        for (int i=0;i<studentAmount;i++){
            if(studentGrades[i]>=50){
                passCount++;
            }else if(studentGrades[i]<50){
                failCount++;
            }
        }

        System.out.println("Pass Count: "+passCount);
        System.out.println("Fail Count: "+failCount);


    }
}
