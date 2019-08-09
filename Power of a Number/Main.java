#include<math.h>
int main()
{
  	int PON, base ,power;
  scanf("%d%d",&base,&power);
  if (power<0)
  {
    printf("Wrong input");
  }
  else
  {
  PON=pow(base,power);
     printf("%d",PON);
  }
}