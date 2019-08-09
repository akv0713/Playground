 #include<stdio.h>
int main()
{
  int n,b;
  scanf("%d",&n);
  int a[n];
  for (int i=0;i<n;i++)
    scanf("%d",&a[i]);
  scanf("%d",&b);
  int c=0;
  for (int i=0;i<n;i++)
  {
    if (b==a[i])
    c=1;
  }
  if (c==1)
    printf("%d is present in the array",b);
  else
     printf("%d is not present in the array",b);

    
      
      
}