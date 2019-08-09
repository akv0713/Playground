#include<stdio.h>
#include<math.h>
int main()
{int n;
 scanf("%d",&n);
 if(n%2==0)
 { int l;
    int k=(n/2)-1;
      l=1*pow(3,k);
  printf("%d",l);
 }
 else
 {int l;
   int k=(n/2);
   l=1*pow(2,k);
   printf("%d",l);
 }
  return 0;
}