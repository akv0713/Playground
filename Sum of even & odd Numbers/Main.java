#include<stdio.h>
int main()
{
  int a,s1=0,s2=0,c1=0,c2=0;
  float c,d;
  do
  {
    if(a==-1)
      break;
    else
    {
    scanf("%d",&a);
      if(a%2==0)
      {
        c2=c2+1;
        s2=s2+a;
      }
    else if(a%2==1)
    {
      c1=c1+1;
      s1=s1+a;
    }
    }
  }while(a!=-1);
  printf("%d\n",s2);
  printf("%d\n",s1);
  c=s2/c2;
  d=(float)s1/c1;
  printf("%0.2f\n",c);
  printf("%0.2f\n",d);
  
}