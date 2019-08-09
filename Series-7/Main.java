#include<stdio.h>
int main()
{
  int n;
  printf("Enter n value\n");
  scanf("%d",&n);
  int a1=10,a2=5;
  printf("%d %d ",a1,a2);
  for(int i=0;i<n-2;i++)
  {
    if(i%2==0)
    {
      a1=a1+50;
      printf("%d ",a1);
    }
    else if(i%2==1)
    {
      a2=a2+10;
      printf("%d ",a2);
    }
  }
}