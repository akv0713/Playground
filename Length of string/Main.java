#include<stdio.h>
int main()
{
 int i;
  char str[200];
  scanf("%[^\n]s",&str);
    for (i=0;str[i]!='\0';i++);
  printf("%d",i);
  return 0;
}