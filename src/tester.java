/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rishi
 */
import java.util.*;
public class tester {
    public static ai a=new ai();
    public static char b[][] = {{ '_', '_', '_' },
                      { '_', '_', '_' },
                      { '_', '_', '_' }};
public static void draw()
{
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
    System.out.print(b[i][j]+" ");
    System.out.println();
    }
}
public static void input()
{
    System.out.println("Enter move for X : ");
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    if(m==1)
    b[0][0]='x';
    else if(m==2)
        b[0][1]='x';
    else if(m==3)
        b[0][2]='x';
    else if(m==4)
        b[1][0]='x';
    else if(m==5)
        b[1][1]='x';
    else if(m==6)
        b[1][2]='x';
    else if(m==7)
        b[2][0]='x';
else if(m==8)
        b[2][1]='x';
    else if(m==9)
        b[2][2]='x';
    
a.make_next_move(m,'x','o');

}

public static void main(String args[])
{
    a.next_move();
    for(int i=0;i<9;i++)
    {draw();
    input();
    
    }
}
}
