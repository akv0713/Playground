#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
    scanf("%d",&a[i]);
  int c=-1;
  for (int i=1;i<n;i++)
  {
    if (a[0] !=a[i])
      c++;
  }
  printf("There are %d distinct elements in the array.",c);
}