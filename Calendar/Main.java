#include<stdio.h>
int main()
{
  int a,b;
  scanf("%d%d",&a,&b);
  if((b%100==0 && b%400==0)|| b%4==0)
  {
    switch(a)
    {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12: printf("Number of days is 31");
                break;
      case 2: printf("Number of days is 29");
        break;
      default:printf("Number of days is 30");
    }
  }
    else 
    {
      switch(a)
    {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12: printf("Number of days is 31");
                break;
      case 2: printf("Number of days is 28");
        break;
      default:printf("Number of days is 30");
    }
    }
      
  
}