#include<stdio.h>
int main()
{int n,i,t,flag=0,pos;
 scanf("%d",&n);
 int a[n];
 for(i=0;i<n;i++)
 {
    scanf("%d",&a[i]);
 }
  scanf("%d",&t);
 for (i=0;i<n;i++)
 {
   if (a[i]==t)
   {
     flag=1;
     pos=i+1;
   }
 }
   if(flag==1)
     printf("%d",pos);
   else printf("%d isn't present in the array.",t);
       
   
   
   
 
  return 0;
}