

import java.util.*;
public class String_list {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int size=sc.nextInt();
        int i,j,dup=0,c=0;
        int arr[]=new int[size];
        System.out.println("Enter the array value");
        for(i=0;i<size;i++)
            arr[i]=sc.nextInt();
            try{for(i=0;i<size;i++){
                for(j=0;j<size;j++){
                    if(arr[i]==arr[j]&&j!=i){
                        dup=arr[i];
                        c++;
                    }}}int b=c/0;}
        catch(ArithmeticException e){
        if(c>0)
        System.out.printf("Duplicate number found :%d",dup);
        else
        System.out.println("No duplicate number");
    }}}