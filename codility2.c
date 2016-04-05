#include "tgmath.h"
#include "stdio.h"
int solution(int X, int Y, int D); 

void main()
{
	long int a;
	int X,Y,D;

	scanf("%d %d %d",&X,&Y,&D);
	a=solution(X,Y,D);
	printf("Ans: %li\n \r",a);
}
int solution(int X, int Y, int D) {
    
    double b;
    b = (Y-X)/ D;
    return( ceil(b) );
}

