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
 int k=0,b[9999];
while(sum!=0)
   {
    k++;
    b[k]=sum%8;
    sum=sum/8;
  }
 for(i=k;i>0;i--)
  {
    printf("%d",b[i]);
  }
  return 0;  
 }