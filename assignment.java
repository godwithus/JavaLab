import java.util.*;
public class assignment{
    public static void main(String[] args){
        // Assigning the subject and final score
        int maths, physics, chemistry, computer, english;
        double finalscore;
        boolean result = true;
        
        // create an object for creating input
        Scanner marks = new Scanner(System.in);

        // the do while loop

        while(result){   
            System.out.print("Hello! How can i refer to you:  ");
            String name = marks.nextLine();

            System.out.print("Hello! Enter Student Name:  ");
            String studentName = marks.nextLine();


            System.out.print(name +" Enter Marks for Maths " + studentName + " : ");
            maths = marks.nextInt();
            while(maths > 100 || maths < 0){
                System.out.print(name +" Retype Score: Invalid Score for Maths Enter Score between 0 and 100 for " + studentName + " : ");
                // take an input from the user 
                maths = marks.nextInt();
            }
            
                     
            System.out.print(name +" Enter Marks for Chemistry " + studentName + " : ");
            chemistry = marks.nextInt();
            while(chemistry > 100 || chemistry < 0){
                System.out.print(name +" Retype Score: Invalid Score for Chemistry Enter Score between 0 and 100 for " + studentName + " : ");
                // take an input from the user 
                chemistry = marks.nextInt();
            }
                     
            System.out.print(name +" Enter Marks for Physics " + studentName + " : ");
            physics = marks.nextInt();
            while(physics > 100 || physics < 0){
                System.out.print(name +" Retype Score: Invalid Score for Physics Enter Score between 0 and 100 for " + studentName + " : ");
                // take an input from the user 
                physics = marks.nextInt();
            }
                     
            System.out.print(name +" Enter Marks for English " + studentName + " : ");
            english = marks.nextInt();
            while(english > 100 || english < 0){
                System.out.print(name +" Retype Score: Invalid Score for English Enter Score between 0 and 100 " + studentName + " : ");
                // take an input from the user 
                english = marks.nextInt();
            } 

            System.out.print(name +" Enter Marks for Computer Science " + studentName + " : ");
            computer = marks.nextInt();
            while(computer > 100 || computer < 0){
                System.out.print(name +" Retype Score: Invalid Score for Computer Science Enter Score between 0 and 100 for " + studentName + " : ");
                // take an input from the user 
                computer = marks.nextInt();
            }

            // compute the final score
            finalscore = (maths + english + chemistry + physics + computer);

            // assign the grade
            if(finalscore > 90 ){
                System.out.println("||===   ** **  ====  ||===    ||     "); 
                System.out.println("||===     **   =     ||===    ||     ");
                System.out.println("||===   ** **  ====  ||===    ||===  ");
                
            }
            else if(finalscore > 80){
                System.out.println("Very Good");
            }
            else if(finalscore > 60){
                System.out.println("Good");
            }
            else if(finalscore > 40){
                System.out.println("Average");
            }
            else{
                System.out.println("Poor");
            }
            System.out.println("Any more Student? (True or False)");

            result = marks.nextBoolean();
        }

    }
}