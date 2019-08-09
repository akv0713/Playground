#include<stdio.h>
int main()
{
  int n,m,k;
  scanf("%d%d%d",&n,&m,&k);
    if((k>=n && k<=n*2)||(k<=(n*m-n) && k>=(n*m-n*2)))
       {
         printf("It is a mango tree");
       }
       else printf("It is not a mango tree");
       
       return 0;
}