#include<stdio.h>
int main()
{
  int a;
  printf("Enter n value\n");
  scanf("%d",&a);
  int a1=1,a2=2;
  printf("%d %d ",a1,a2);
  for(int i=0;i<a-2;i++)
  {
    int c=a1+a2;
    printf("%d ",c);
    a1=a2;
    a2=c;
  }
}