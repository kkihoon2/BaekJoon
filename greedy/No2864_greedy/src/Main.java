import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        char[] num1C = num1.toCharArray();
        char[] num2C = num2.toCharArray();
        int min = 0 ;
        int max = 0 ;
        for(int i = 0 ; i < num1C.length;i++)
        {
            if(num1C[i]==6)
            {
                num1C[i]=5;
            }
        }
        for(int i = 0 ; i < num2C.length;i++)
        {
            if(num2C[i]==6)
            {
                num2C[i]=5;
            }
        }
        String num1S = String.valueOf(num1C);
        String num2S = String.valueOf(num2C);
        min = Integer.valueOf(num1S)+Integer.valueOf(num2S);
        for(int i = 0 ; i < num1C.length;i++)
        {
            if(num1C[i]==5)
            {
                num1C[i]=6;
            }
        }
        for(int i = 0 ; i < num2C.length;i++)
        {
            if(num2C[i]==5)
            {
                num2C[i]=6;
            }
        }
        String num1SS = new String(num1C);
        String num2SS = new String(num2C);
        max = Integer.valueOf(num1SS)+Integer.valueOf(num2SS);

        System.out.print(min+" "+ max);





    }
}