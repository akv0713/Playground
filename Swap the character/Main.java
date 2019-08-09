#include<stdio.h>
#include<ctype.h>
int main()
{
  char a[20],b[20],c[20];
  scanf("%s%s%s",&a,&b,&c);
  int i,l1,l2,l3;
  for(l1=0;a[l1]!='\0';l1++);
  for(l2=0;b[l2]!='\0';l2++);
  for(l3=0;c[l3]!='\0';l3++);
  for(i=0;i<l1;i++)
  {
    if(a[i]==('a')||a[i]== ('e') ||a[i]== ('i')|| a[i]== ('o')||a[i]== ('u')||
       a[i]== ('A')||a[i]== ('E')||a[i]== ('I')||a[i]== ('O')||a[i]== ('U'))
      a[i]='$';
  }
  printf("%s",a);
 for(i=0;i<l2;i++)
  {
    if(b[i]==('a') || b[i]==('e') ||b[i]==('i')||b[i]==('o')||b[i]==('u')||b[i]==('A')||b[i]==('E')||
       b[i]==('I')||b[i]==('O')||b[i]==('U'))
      continue;
   else
     b[i]='#';
  }
  printf("%s",b);
  for (i=0;i<l3;i++)
  {
    if(islower(c[i]))
    {
      c[i]= c[i]-32;
    }
  }
  printf("%s",c);
      
}