
import java.util.*;
import java.lang.String;
class panagram 
{  
public static void main(String args[])  
{  
	Scanner j=new Scanner(System.in);	
String str =j.nextLine();  
ip pi=new ip(str);
Thread t1 = new Thread(pi);
t1.start();
}  }
class ip implements Runnable {
    private String str;
    public ip(String str) {
        this.str = str;
    }
public void run()  
{  str = str.toLowerCase();  
boolean allLetterPresent = true;   
for (char ch = 'a'; ch <= 'z'; ch++)   
{  
    if (!str.contains(String.valueOf(ch)))   
{  
allLetterPresent = false;  
break;  }  }  
if (allLetterPresent)  
System.out.println("Pangram String");  
else  
System.out.println("Not a Pangram String");  
}  
}