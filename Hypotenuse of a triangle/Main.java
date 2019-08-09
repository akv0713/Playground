#include<stdio.h>
int main()
{
  float opo,adj;
 scanf("%f",&opo);
 scanf("%f",&adj);
  float hypo;
 hypo=sqrt((opo*opo)+(adj*adj));
printf("%0.2f",hypo);
  return 0;
}