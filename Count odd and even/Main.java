#include<stdio.h>
int main()
{
  int n,m=0,f=0;
  scanf("%d",&n);
  int a[n];
  for (int i=0;i<n;i++)
  scanf("%d",&a[i]);
  for (int i=0;i<n;i++)
  {
    if (a[i]%2==0)
       m+=1;
    else if (a[i]%2==1)
      f+=1;
  }
  printf("Odd: %d\n",f);
  printf("Even: %d",m);
  
}