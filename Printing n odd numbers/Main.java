#include <stdio.h>
int main() {
  int n,i;
  scanf("%d",&n);
  int count=0;
  for (i=1;i<2*n;i++)
  {
    if (count ==n){
    break;
  }
    else if (i%2==1)
    {printf("%d\n",i);
    }
  }

	return 0;
}