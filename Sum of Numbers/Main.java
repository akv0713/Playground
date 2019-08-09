#include<stdio.h>
int main()
{
  int a,sum=0;
  do
  {
    scanf("%d",&a);
    if (a==-1)
      printf("%d",sum);
    else 
      sum=sum+a;
  }while(a!=-1);
}