class ExtractEDigit
{
Public static void main (Sttring[] args)
{
Int num=12345;


while(num>0)
{
int last=num%10;
if(last%2==0){
System.out.println(last);
}
num/=10;
}
}
}
