#include <stdio.h>

int main()
{
   int num1, num2, maxValue;
   scanf("%d %d", &num1, &num2);
   //largest integer among num1 and num2 is stored in maxValue
   maxValue = (num1 > num2) ? num1 : num2;

   while(1)  //always true
   {
      if ((maxValue % num1 == 0) && (maxValue % num2 == 0))
      {
         printf("%d", maxValue);
         break;
      }
      ++maxValue;
   }
   return 0;
}