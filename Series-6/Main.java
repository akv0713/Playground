#include<stdio.h>
#include<math.h>
int main()
{ int n;
 printf("Enter n value\n");
 scanf("%d",&n);
  for(int i=1;i<=n;i++)
  { int j=0;
   j=pow(i,i);
    printf("%d ",j);
  }
 
}