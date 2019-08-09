#include<stdio.h>
int main()
{
  int n1,n2,c=0;
  scanf("%d%d",&n1,&n2);
  int a[n1],b[n2];
  if (n1==n2)
  {
    for (int i=0;i<n1;i++)
    
    scanf("%d",&a[i]);
    for (int i=0;i<n1;i++)
      scanf("%d",&b[i]);
      for (int i=0;i<n1;i++)
      {
      if (a[i] == b[i])
        c=c+1;
        
    }
    if (c==n2)
      printf("Same");
    else
      printf("Not Same");
    
  }
}