#include<stdio.h>
int main()
{
  float a,b,c,d;
  scanf("%f%f%f",&a,&b,&c);
  d=a+b;
  float e;
  e= d-(d*c/100);
  float f;
  f=d-e;
  printf("%0.2f\n%0.2f\n%0.2f",d,e,f);
  
}