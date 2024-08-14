import java.util.Scanner;

public class IT24102488Lab4Q2{
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter exam marks(out of 100):");
        double marks = input.nextDouble();
        if (marks >= 0 && marks <= 100) {
            System.out.println("Please enter lab submission marks(out of 100):");
            Double labmarks = input.nextDouble();

            if (labmarks >= 0 && labmarks <= 100) {
                System.out.println("Please enter the precentage given for the exam :");
                double prs_exam = input.nextDouble();
                System.out.println("Please enter the precentage given for the lab submission :");
                double prs_lab = input.nextDouble();
                if (prs_exam + prs_lab == 100) {
                    double final_mark = ((marks * (prs_exam / 100) + (labmarks * (prs_lab / 100))));
                    System.out.println("Final exam mark is :" + final_mark);
                } else {
                    System.out.println("The precentation must add up to 100.Terminating the programme");
                }
            } else {
                System.out.println("Invalid input for labmarks.Terminating the programme");

            }

        } else {
            System.out.println("Invalid input for marks.Terminating the programme");

        }
    }
}
