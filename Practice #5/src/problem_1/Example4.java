package problem_1;
import java.util.*;

public class Example4
{
    public static void main(String[] args)
    {
       double                 leftOperand, result, rightOperand;
       String                 leftString, operator, rightString;
       StringTokenizer        tokenizer;
       Scanner in = new Scanner(System.in);

       tokenizer = new StringTokenizer(in.nextLine(), "+-*/", true);

//       try
//       {
//          leftString   = tokenizer.nextToken();
//          operator     = tokenizer.nextToken();
//          rightString  = tokenizer.nextToken();
//
//          leftOperand  = Double.parseDouble(leftString);
//          rightOperand = Double.parseDouble(rightString);
//
//          if (operator.equals("+"))
//             result = leftOperand + rightOperand;
//          else
//             result = 0.0;
//
//          System.out.println("Result: " + result);
//       }
//       catch (NoSuchElementException nsee)
//       {
//          System.out.println("Invalid syntax");
//       }
//       catch (NumberFormatException nfe)
//       {
//          System.out.println("One or more operands is not a number");
//       }

       
       try {
           leftOperand = Double.parseDouble(tokenizer.nextToken());
           operator = tokenizer.nextToken();
           rightOperand = Double.parseDouble(tokenizer.nextToken());

           result = 0.0;
           
           if (operator.equals("+")) {
        	   result = leftOperand + rightOperand;
           }
           else if (operator.equals("-")) {
        	   result = leftOperand - rightOperand;
           }
           else if (operator.equals("*")) {
        	   result = leftOperand * rightOperand;
           }
           else if (operator.equals("/")) {
        	   result = leftOperand / rightOperand;
        	   if (rightOperand == 0) {
        		   System.out.println("Error: Division by zero");
        		   return ;
               }
           }
           else {
        	   System.out.println("Invalid operator: " + operator);
           }

           System.out.println("Result: " + result);
       } catch (NoSuchElementException nsee) {
           System.out.println("Invalid syntax");
       } catch (NumberFormatException nfe) {
           System.out.println("One or more operands is not a number");
       }
       
    }
}