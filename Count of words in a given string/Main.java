#include<stdio.h>

int main()
{
  int i=0,count=0;
  char str[300];
  scanf("%[^\n]",&str);
  for(i=0;str[i]!='\0';i++)
  {
    if(str[i]==' ')
      count++;
  }
  printf("%d",count+1);
  
   
    
    
}