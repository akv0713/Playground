#include<stdio.h>
int main()
{
  int n,t;
  scanf("%d",&n);
  if(n%2==0)
  {t=0+(n-1)/2*1;
   printf("%d",t);
  }
   if(n%2!=0)
  {t=0+(n-1)/2*2;
   printf("%d",t);
  }
	
}