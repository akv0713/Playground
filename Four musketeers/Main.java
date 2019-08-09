#include<stdio.h>
int main()
{
  int a,b,c,d,e,f;
  scanf("%d%d%d%d%d%d",&a,&b,&c,&d,&e,&f);
  float g=((float)a+(float)c+(float)e)/3;
  float h=(b+d+f)/3;
  printf("%0.1f\n%0.1f",g,h);
  
}