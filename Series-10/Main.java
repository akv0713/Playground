#include<stdio.h>
int main()
{
  int n,a=0,k=0;
  printf("Enter n value\n");
  scanf("%d",&n);
  for(int i=0;i<n;i++)
  {
    a=a+k;
    printf("%d ",a);
    k=k+2;
  }
}