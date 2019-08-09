#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  int ben=(b*a)/100;
  int BB=(c*(a-ben))/100;
  int o=(a-ben-BB)/3;
  printf("%d\n%d\n%d",ben,BB,o);
}