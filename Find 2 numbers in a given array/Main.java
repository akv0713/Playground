#include<stdio.h>
int main()
{int i,n,pos1=-1,pos2=-1;
 scanf("%d",&n);
 int a[n];
 for (i=0;i<n;i++)
 { 
   scanf("%d",&a[i]);
 }
 int a1,a2;
 scanf("%d%d",&a1,&a2);
 
  for (i=0;i<n;i++)
 { 
    if(a[i]==a1)
    {
      a1=1;
     pos1=i;
    }
    else if(a[i]==a2)
    {
      a2=1;
     pos2=i;
    }
  }
 if(a1=1)
   printf ("Element 1 index = %d\n",pos1);
 if(a2=1)
   printf ("Element 2 index = %d",pos2);

 
 
 
}