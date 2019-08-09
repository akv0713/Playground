#include<stdio.h>
int main()
{
  int a,b,c,d,e,f;
  scanf("%d%d%d",&a,&b,&c);
  if((a>b &&a<c)||(a>c&&a<b))
    d=a;
  else if((b>a&&b<c)||(b>c&&b<a))
    d=b;
  else
    d=c;
  printf("The treasure is in the box which has number %d.\n",d);
  if(a<d) f=a;
  else f=c;
  for(int i=f;i>=1;i--)
  {
    if(a%i==0 &&b%i==0 &&c%i==0)
    { 
      e=i;
      break;
    }
  }
  printf("The code to open the box is %d.",e);
  
}