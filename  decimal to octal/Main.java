#include<stdio.h>
int main()
{ 
  int n,a[9999],k=0;
  scanf("%d",&n);
 while(n!=0)
 {
   a[k]=n%8;
   n=n/8;
   k++;
 }
  for (int i=k;i>=0;i--)
  {printf("%d",a[i]);
  }
  
  

  return 0;  
}