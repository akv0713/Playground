// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{int a,b,gcd,i;
 scanf("%d%d",&a,&b);
 if(a>b)
 {
     for (i=1;i<=b;i++)
     {
       if (a%i==0 && b%i==0)
       gcd=i;
     }
 }
 if(a<b)
 {
     for (i=1;i<=a;i++)
     {
       if (a%i==0 && b%i==0)
       gcd=i;
     }
 }
 printf("%d",gcd);
      
   return 0;
}