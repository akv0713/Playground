#include<stdio.h>
int main()
{ 
  int n,a[9999],k=0;
  scanf("%d",&n);
 while(n!=0)
 {
   a[k]=n%2;
   n=n/2;
   k++;
 }
  for (int i=k-1;i>=0;i--)
  {printf("%d",a[i]);
  }
  
  

  return 0;  
}
  
  