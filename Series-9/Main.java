#include<stdio.h>
int main()
{
  int n;
  printf("Enter n value");
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
    if (i%2==1)
      printf("%d ",i*i*i);
    else if(i%2==0)
      printf("%d ",i*i);
  }
      
}