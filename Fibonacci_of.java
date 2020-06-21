public class Fibonacci_of
{
public static void main(String args[])
{
int i=1,j=1;
for(int n=1;n<=6;n++)
{
System.out.print(" "+i+" "+j);
i = (int)(i+j);
j = (int)(i+j);
}
System.out.println();
}
}
