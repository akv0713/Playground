#include <stdio.h>
int main() {
	int i,n,count=0,num=0;
  scanf("%d",&n);
  int m =n;
  int l=m;
  while(n>0)
  {
      count=count+1;
      n=n/10;
  }
  while(m>0)
  {int k=m%10;
     num=num+pow(k,count);
      m=m/10;
  }
  if(num==l)
  {
  printf("Armstrong Number");
  }
   else printf("Not an Armstrong Number");
  
	return 0;
}
