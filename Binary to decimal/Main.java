#include<stdio.h>
#include<math.h>
int main()
{
  int n,a,sum=0,i=0;
  scanf("%d",&n);
 while(n>0)
 { 
   a=n%10;
  sum = sum +(a*pow(2,i));
    n=n/10;
   i++;
 }
printf("%d",sum);
  
  
  

  return 0;  
}
 