#include<stdio.h>
int main()
{
  int n,c,k=1;
  scanf("%d",&n);
  int a1=4;
 printf("%d %d ",2,a1); 
  for(int i=0;i<n-2;i++)
  {
    c=(a1*2)-k;
    printf("%d ",c);
    k++;
    a1=c;
  }
  
    
    
  
  
}