import java.util.*;
public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input of how many subjects are there

        System.out.println("Student Grade Calculator");
        System.out.print("Enter no of subjects:");
        int nS = sc.nextInt();
        int total = 0;

        //taking and adding all the marks

        for(int i=0; i<nS; i++) {
            System.out.print("Enter marks obtained in subj"+(i+1)+": ");
            int marks = sc.nextInt();
            total+=marks;
        }
        //calculating percentage
        double averPer = (double)total/nS;
        
        //calculating Grades

        char Grade;
        if(averPer >= 90) {
            Grade = 'O';
        }
        else if(averPer >= 80) {
            Grade = 'A';
        }
        else if(averPer >= 70) {
            Grade = 'B';
        }
        else if(averPer >= 60) {
            Grade = 'C';
        }
        else if(averPer >= 50) {
            Grade = 'D';
        }
        else if(averPer >= 40) {
            Grade = 'E';
        }
        else {
            Grade = 'F';
        }
        //Displaying all the data
        System.out.println("Total Marks Scored is" +total);
        System.out.println("Average Percentage Gained is "+averPer+"%");
        System.out.println("Grade :"+Grade);
    }
}
