import java.util.*;;
public class SumOfDig{
       public static void main(String [] args){

int n = 132;
int sum=0;
while(n>0)
{
int dig=n%10;
sum+=dig;
n=n/10;
}
System.out.println(sum);
}
}
