import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int z=s.nextInt();
        int []l=new int[2*z];
        for(int i=0;i<z;i++){
            l[2*i]=a[i];
            l[2*i+1]=a[i+z];
        }
        for(int i=0;i<2*z;i++){
        System.out.print(l[i]+" ");
    }}
}
