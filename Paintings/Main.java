#include<stdio.h>
int main()
{
  int a,b,c,d,e,f;
  scanf("%d%d%d%d%d%d%d%d",&a,&b,&c,&d,&e,&f);
  a=a-c-e;
  b=b-d-f;
  if(a>=0 && b>0)
  printf("Raj can fix both painting");
  else 
    printf("Raj cannot fix both painting");
    
 
}