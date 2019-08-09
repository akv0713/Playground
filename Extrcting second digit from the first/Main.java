#include <stdio.h>
int main() {
  int n,digit;
  scanf("%d",&n);
  while (n>10)
  {
    digit=n%10;
    n=n/10;
  }
  printf("%d",digit);
	return 0;
}
