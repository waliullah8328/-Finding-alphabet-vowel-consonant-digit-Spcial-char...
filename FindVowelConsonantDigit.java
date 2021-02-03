package com.company;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class FindVowelConsonantDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Test Case = ");
        n = input.nextInt();
        char ch[]= new char[n];
        for(int i=0;i<n;i++)
        {
            ch[i] = input.next().charAt(0);

            if(ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= 'A' && ch[i] <= 'Z')
            {
                System.out.printf("%c is a Alphabet : ",ch[i]);
                if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                    System.out.println("It is a Vowel");
                }
                else
                {
                    System.out.println("It is a Consonant");
                }
            }
            else if(ch[i]=='0'|| ch[i]=='1' || ch[i]=='2' || ch[i]=='3'|| ch[i]=='4'|| ch[i]=='5'|| ch[i]=='6'|| ch[i]=='7'|| ch[i]=='8'|| ch[i]=='9')
            {
                System.out.printf("%c is a digit\n",ch[i]);
            }
            else
            {
                System.out.printf("%c is a special character\n",ch[i]);
            }
        }
    }
}
