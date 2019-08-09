#include<stdio.h>
int main()
{
  int a,b,c,d,e;
  scanf("%d%d%d%d%d",&a,&b,&c,&d,&e);
  a=a-b-c-d-e;
  if(a>=0)
    printf("He can save the money");
  else printf("He has to work hard");
}