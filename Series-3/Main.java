#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a=6;
  printf("Enter n value\n");
  printf("%d ",a);
  int k=3;
  for(int i=0;i<n-1;i++)
  {
    a=a+k;
    printf("%d ",a);
    k=k+2;
  }
}