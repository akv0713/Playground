#include<stdio.h>
int main()
{
  float a,b,c,d;
  scanf("%f%f%f%f",&a,&b,&c,&d);
    float v=3.14*a*a*b;
  float v1=c*d;
  if(v1>=v)
  printf("The tank can be filled within %.1f hours",d);
  else
    printf("The tank cannot be filled within %0.1f hours",d);
}