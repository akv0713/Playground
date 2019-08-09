#include<stdio.h>
int main()
{
  int n,c,a1=1,a2=2;
  c=a1+a2;
  scanf("%d",&n);
  for(int i=0;c!=n;i++)
  {
    if(c>n)
      break;
    else
    {
    c=a1+a2;
    a1=a2;
    a2=c;
    }
  }
  if(c==n)
    printf("Fibonacci Number");
  else 
    printf("Not Fibonacci Number");
 
      
   
}