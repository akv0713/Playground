#include <stdio.h>
int main() {
  int n,sum,first,last;
  scanf("%d",&n);
    last=n%10;
  while(n>0)
  {
    first=n%10;
    n=n/10;
  }
  sum = last+first;
  printf("%d",sum);
    
	
	return 0;
}