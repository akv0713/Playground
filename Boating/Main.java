#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  int t=(75*b)+(30*c);
  if(t<a)
    printf("Boat is stable");
  else
    printf("Boat will drow");
  
}