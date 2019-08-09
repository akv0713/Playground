#include<stdio.h>
int main()
{
  int a,c=7;
  scanf("%d",&a);
  printf("%d ",c);
    for(int i=0;i<a-1;i++)
    {
      if(i%2==0)
      {
        c=c-2;
        printf("%d ",c);
      }
      else if(i%2==1)
      {
        c=c+3;
        printf("%d ",c);
      }
    }
  return 0;
       
}