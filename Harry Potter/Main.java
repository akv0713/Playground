#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int q=a%10;
  int w=a/1000;
  printf("%d",q+w);
  
}