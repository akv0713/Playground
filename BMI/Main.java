#include<stdio.h>
int main()
{
  float a,b;
  scanf("%f%f",&a,&b);
  a=a/(b*b/10000);
  if(a>18.50 && a<24.90)
    printf("You are normal. Go walking daily and maintain it.");
  else if (a<18.50)
    printf("You are underweight. Have an apple daily.");
  else if(a>25)
    printf("You are obese. Go to doctor"); 
  
}