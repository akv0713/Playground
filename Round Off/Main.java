#include<stdio.h>
int main()
{
   float a;
  scanf("%f",&a);
  int c;
  c=(int)a;
  printf("%d\n%0.1f\n%0.1f",c,ceil(a),floor(a));
                  
}