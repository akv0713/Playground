#include<stdio.h>
int main()
{int n,a1=0,a2=1;
  scanf("%d",&n);
 printf("%d ",a1);
 printf("%d ",a2);
 int i=2;
 while(i<n)
 {int c=a1+a2;
  printf("%d ",c);
  a1=a2;
  a2=c;
  i++;
 }
  
  
  return 0;
}