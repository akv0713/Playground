#include<stdio.h>
int main()
{
  char str[100];
  int k,j;
  scanf("%[^\n]s", str);
  for (k=0;str[k]!='\0';k++)
  {
    if (str[k]=='a'||str[k]=='e'||str[k]=='i'||str[k]=='o'||str[k]=='u'||
        str[k]=='A'||str[k]=='E'||str[k]=='I'||str[k]=='O'||str[k]=='U')
    {
      for (j=k;str[j]!='\0';j++)
      {
        str[j]=str[j+1];
      }
      k--;
    }
    
  }

  printf("%s",str);
  
  
  return 0;
}