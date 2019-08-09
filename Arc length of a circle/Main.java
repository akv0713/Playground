#include <stdio.h>
int main()
{
  float r,angle;
    float arc_length;
  scanf("%f",&r);
  scanf("%f",&angle);
  arc_length=2*3.14*r*angle/360;
  printf("%0.2f",arc_length);
  return 0;
}
