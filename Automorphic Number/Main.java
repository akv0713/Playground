#include<stdio.h>
int main()
{
  int a;

  scanf("%d",&a);
  int k=a*a;
 int b=k%10;
  if(b==a)
       printf("Automorphic Number");
  else 
     printf("Not Automorphic Number");
}