import java.util.Scanner;
public class Questionaire
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Let's make some questions!");
        System.out.println("How many questions do you want to make?");
        
        int i = 0;
        int in = input.nextInt();
        while (in < 1)
        {
            System.out.println("Please input a valid number.");
        }
        int correct = 0;
        String[] questions = new String[in];
        answers[] choices = new answers[in]; 
        while (i < in)
        {
            questions[i] = question(); 
            String a = answer1(); 
            String b = answer2(); 
            String c = answer3(); 
            String d = answer4(); 
            
            choices[i] = new answers(a ,b ,c ,d);
            i++; 
            System.out.print('\u000C');
        }
        
        System.out.println("Would you like to play now? y/n");
        String x = input.next();
        if (x.equalsIgnoreCase("y") || x.equalsIgnoreCase("yes"))
        {
            
        }
        else
        {
            System.exit(0);
        }
        
        for (int j = 0; j < in; j++)
        {
            print(choices, j, questions[j]);
            System.out.println("Please enter the answer you think is correct below.");
            String answer = input.next();
            
            if(check(choices, answer, j) == 1)
            {
                correct++;
            }
            System.out.print('\u000C');
        }
        double percent = correct * 100/in ;
        System.out.println("You got " + correct + "/" + in + " correct.");
        System.out.println("That is " + percent + "% accuracy.");
    }
    
    public static int check(answers[] choices, String input, int qNum)
    {
        String x = "*";
        if ((input.equals("a") && choices[qNum].getA1().indexOf(x) != -1) || (input.equals("b") && choices[qNum].getA2().indexOf(x) != -1 || input.equals("c") && choices[qNum].getA3().indexOf(x) != -1 || input.equals("d") && choices[qNum].getA4().indexOf(x) != -1))
        {
            return 1;
        } 
        else
        {
            return 0;
        }
    }
    
    public static void print(answers[] choices, int j, String qs)
    {
        int qNum = j + 1;
        System.out.println("#" + qNum + ". " + qs);
        System.out.println(choices[j]);
        System.out.println("What do you think the right answer is?");
    }
    
    public static String question()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your question. Instead of ' ' use '_' for spaces please. Thank you");
        String q = input.next();
        return q;
    }
    
    public static String answer1()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("if this is what you want to be the correct answer, end it with a '*'. Instead of ' ' use '_' for spaces please. Thank you");//, else end it with a different character. :)");
        System.out.println("Please enter your answer (option 1)");
        String in = input.next();
        if (in.substring(in.length() - 1, in.length()).equals("*"))
        {
        }    
        else
        {
            in = in + "_";
        }
        return in; 
    }
    public static String answer2()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("if this is what you want to be the correct answer, end it with a '*'. Instead of ' ' use '_' for spaces please. Thank you");//, else end it with a different character. :) ");
        System.out.println("Please enter your answer (option 2)");
        String in = input.next();
        if (in.substring(in.length() - 1, in.length()).equals("*"))
        {
        }    
        else
        {
            in = in + "_";
        }
        return in; 
    }
    public static String answer3()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("if this is what you want to be the correct answer, end it with a '*'. Instead of ' ' use '_' for spaces please. Thank you");//, else end it with a different character. :) ");
        System.out.println("Please enter your answer (option 3)");
        String in = input.next();
        if (in.substring(in.length() - 1, in.length()).equals("*"))
        {
        }    
        else
        {
            in = in + "_";
        }
        return in; 
    }
    public static String answer4()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("if this is what you want to be the correct answer, end it with a '*'. Instead of ' ' use '_' for spaces please. Thank you");//, else end it with a different character. :) ");
        System.out.println("Please enter your answer (option 4)");
        String in = input.next();
        if (in.substring(in.length() - 1, in.length()).equals("*"))
        {
        }    
        else
        {
            in = in + "_";
        }
        return in; 
    }
}