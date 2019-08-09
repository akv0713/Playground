#include <stdio.h>
#include <ctype.h>
int main() {
  char c;
  scanf("%c",&c);
  if (isupper(c))
  {
    c = c + 32;
    printf("%c",c);
  }
  else if (islower(c))
  { c = c - 32;
    printf("%c",c);
  }
	return 0;
}