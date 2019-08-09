#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int y=n/365;
  int w=(n-365*y)/7;
  int d=n-(365*y)-(7*w);
  printf("%d\n%d\n%d",y,w,d);
  
}