#include <stdio.h>
int main() {
    int i,n,sum=0;
  scanf("%d",&n);
  int k=n;  
  while(n>0)
  { int fact=1;
   int c;
   c=n%10;
    for(i=1;i<=c;i++)
    {
    fact=fact*i;
    }
   sum=sum+fact;
   n=n/10;
  }
  if (sum==k)
    printf("Yes");
  else printf("No");
    
	
	return 0;
}