#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  printf("Enter n value\n");
  int c=0;
  int j=3;
   printf("%d ",c);
  for(int i=0;i<a-1;i++)
  {
    c=c+j;
    printf("%d ",c);
    j=j+2;
  }
}