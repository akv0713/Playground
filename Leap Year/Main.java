#include<stdio.h>
int main()
{
int n;
  scanf("%d",&n);
  if (n%4==0&&n%400==0)
    printf("LEAP YEAR");
  else printf("NOT LEAP YEAR");
 
  return 0;
}