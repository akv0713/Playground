#include<stdio.h>
int main()
{
  int i,n,max;
  scanf("%d",&n);
  int a[n];
  for (i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  max=a[0];
  for (i=1;i<n;i++)
  {
    if(a[i]>max)
    {
      int temp=a[i];
      a[i]=max;
      max=temp;
    }
  }
  printf("%d",max);
     
  
    
}