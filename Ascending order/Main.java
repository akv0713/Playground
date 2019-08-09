#include<stdio.h>
void sort(int ,int *);
int main()
{
  int a[100],n;
  scanf("%d",&n);
  for (int i=0;i<n;i++)
    scanf("%d",&a[i]);
  sort(n,a);
}
void sort(int n,int *a)
{
  for (int i=0;i<n;i++)
  {
    for( int j=i+1;j<n;j++)
    {
      if ((a[i])>(a[j]))
      {
        int temp=(a[i]);
        (a[i])=(a[j]);
        (a[j])=temp;
      }
    }
  }
  printf("Sorted array is:\n");
  for (int i=0;i<n;i++)
    printf("%d\n",a[i]);
}