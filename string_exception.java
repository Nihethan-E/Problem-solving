

import java.util.*;
import java.lang.String;
class string_exception{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Original string:");
        String str=scan.nextLine();
        int c=0;
        try{
        int i;
        for(i=0;i<str.length();i++){
            char s=str.charAt(i);
            if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'||s=='A'||s=='E'||s=='I'||s=='O'||s=='U')
            c+=1;
        }
        int a=c/0;
        }
        catch(ArithmeticException e)
        {
            if(c>0)
        System.out.print("String contains vowels");
        else
            System.out.print("String does not contains vowels");
        }
    }
}