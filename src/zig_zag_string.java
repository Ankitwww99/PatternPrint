/*
Input
//first line no of rows
//sting

4
ANKITBANSALANKITBANSAL

output

A     A     N     N
N   B N   A K   A S
K T   S L   I B   A
I     A     T     L


5
ANKITBANSALANKITBANSAL

A       S       B
N     N A     T A
K   A   L   I   N
I B     A K     S L
T       N       A
 */

import java.util.Scanner;

public class zig_zag_string {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]="";
        }
        if(n==1){
            System.out.println(s);
        }
        else{
            int row=0;
            int count=0;
            boolean flag=true;
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(count==n){
                    flag=false;
                    row=row-2;
                    count=n-1;

                }
                if(count==1 && flag==false){
                    row=0;
                    count=0;
                    flag=true;
                }


                if(flag){
                    arr[row]=arr[row]+c+" ";
                    row++;
                    count++;
                }
                if(!flag){
                    for(int j=0;j<n;j++){
                        if(j==row)
                            arr[row]=arr[row]+c+" ";
                        else
                            arr[j]=arr[j]+" "+" ";
                    }
                    row--;
                    count--;

                }

            }
            String ans="";
            for(int i=0;i<n;i++){
                ans=ans+arr[i]+"\n";
            }
            System.out.println(ans);

        }
    }
}

