#include<stdio.h>
#include<math.h>
int main()
{
  int a,m=0;
  scanf("%d",&a);
  if(a<=200)
  { m=(a*0.5);
    printf("Rs.%d",(m));
  }
  else if(a<=400)
    {
     m=((a*0.65)+100+1);
    printf("Rs.%d",(m));
  }
  else if(a<=600)
    { m=((a*0.80)+200);
    printf("Rs.%d",(m));
  }
  else
  {
    
    m=((a*1.25)+425);
    printf("Rs.%d",(m));
  }
    
}