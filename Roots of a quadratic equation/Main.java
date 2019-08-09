#include<stdio.h>
#include<math.h>
int main()
{
 float a,b,c,x1,x2,d,img,real;
 scanf("%f%f%f",&a,&b,&c);
 d=(b*b)-(4*a*c);
 if (d>0)
 {
    x1=((-b)+sqrt(d))/(2*a);
  x2=((-b)-sqrt(d))/(2*a);
   printf("root1 = %0.2f  root2 = %0.2f",x1,x2);
 }
 else if (d==0)
 {
   x1=x2= -b/(2*a);
   printf("root1 = %0.2f  root2 = %0.2f",x1,x2);
 }
 else 
 {
   real= -b/(2*a);
   img = sqrt(-d)/(2*a);
   printf("root1 = %0.2f + %0.2fi  root2 = %0.2f - %0.2fi" ,real,img,real,img);
 }
   

 return 0;
}