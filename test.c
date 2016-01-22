#include<stdio.h>

void main()
{
int a[10];
int b,c;
b=sizeof(a);
c=sizeof(a[0]);

printf("b=%d   c=%d   \n\r",b,c);
}
