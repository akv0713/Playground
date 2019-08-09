#include<stdio.h>
int main()
{
  int a,b;
  scanf("%d%d",&b,&a);
  if ((a*a)>(3.14*b*b))
      printf("circle can be inside a square");
      else
      printf("circle cannot be inside a Square");
}