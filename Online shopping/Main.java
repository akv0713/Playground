#include<stdio.h>
int main()
{
  int a,b,c,d,e,f,g,h,i;
  scanf("%d%d%d%d%d%d%d%d%d",&a,&b,&c,&d,&e,&f,&g,&h,&i);
  a=a-(b*a/100)+c;
  d=d-(e*d/100)+f;
  g=g-(h*g/100)+i;
  printf("In Flipkart: Rs.%d\n",a);
  printf("In Snapdeal: Rs.%d\n",d);
  printf("In Amazon: Rs.%d\n",g);
  if(a<d&&a<g)
    printf("He will prefer Flipkart");
  else if(d<g&&d<a)
  printf("He will prefer Snapdeal");
  else 
    printf("He will prefer Amazon");
}
