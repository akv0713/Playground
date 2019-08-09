#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  for (int i=0;i<n;i++)
     scanf("%d",&a[i]);
  for (int i=0;i<n-1;i++)
  {
    if(a[i]>a[i+1])
    {
      int t;
      t=a[i];
      a[i]=a[i+1];
      a[i+1]=t;
    }
   
  }
   printf("%d",a[n-1]);
    
}