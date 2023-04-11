import java.util.Scanner;

class Main 
{

public static boolean primo (int num) 


{
int divisor=2;
if (num<=1){
return false;

}
while(divisor<num) {
if (num%divisor==0){
return false;
}
divisor++;
}
return true;

}
}


