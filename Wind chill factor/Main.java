#include<stdio.h>
#include<math.h>
int main()
{
  int t,v;
  scanf("%d%d",&t,&v);
  float w=35.74+0.6215*(float)t+(0.4275*(float)t-35.75)*(pow(v,0.16));
                                                         printf("%.2f",w);
  
}