#include<stdio.h>
int main()
{
  char str[100];
  int i,count=1,l;
  scanf("%s",str);
  for(l=0;str[l]!='\0';l++);
  if(l>20)
    printf("Invalid Input");
  else
  {
    for(i=0;i<l;i++)
    {
      if(str[i]==str[i+1])
      {
        count=count+1;
      }
      else
      {
        printf("%c%d",str[i],count);
        count=1;
      }
    }
  }
}