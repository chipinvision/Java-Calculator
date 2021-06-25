import java.util.Scanner;

class calculator {
   public static void main(String args[]){
       char operator;
       double n1, n2, result;

       System.out.println("------Java Calculator------");
       Scanner cl = new Scanner(System.in);

       System.out.println("Enter first number:");
       n1 = cl.nextDouble();

       System.out.println("Enter second number:");
       n2 = cl.nextDouble();

       System.out.println("What operation do you want to perform?");
       System.out.println("+, -, *, /");
       operator = cl.next().charAt(0);

       switch (operator){
           case '+':
           result = n1+n2;
           System.out.println(result);
           break;

           case '-':
           result = n1-n2;
           System.out.println(result);
           break;

           case '*':
           result = n1*n2;
           System.out.println(result);
           break;

           case '/':
           result = n1/n2;
           System.out.println(result);
           break;

           default:
           System.out.println("Err: Invalid Operator");
           break;
       }
       cl.close();
   } 
}
