#include<stdio.h>

void main()
{
	long int n,A[1000];
	int i;
	long long sum[10000],count;
	long int m,Ti1,index1,Ta1[1000],ar1[10000];
	long int stp,Ti2,index2,Ta2[1000],ar2[10000];

	long int a,big;

	printf("Enter 0<n<1000 for Array A[]: ");
	scanf("%ld",&n);

	if (n==0) return;
	
	printf("Enter the Array A[]: ");
	for(i=0;i<n;i++) scanf("%ld",&A[i]);

	count=n*(n+1)/2;

	//build ar1 and ar2
	for (i = 0; i < n; i++)
	{
		ar1[i]=i;
		ar2[i]=i;
	}	

	//build Ta1
	m=n; Ti1=0; index1=0;
	while(m!=0)
	{
		for (i = 0; i < m; i++)
		{
			Ta1[Ti1++]=ar1[index1];
		}
		m--;index1++;
	}

	//build Ta2
	m=n; Ti2=0; stp=0; index2=stp;
	for (i = 0; i < count; i++)
	{
		Ta2[i]=ar2[index2++];
		if (index2==m)
		{
			index2=++stp;
		}
	}
	
	//make the sum
	for (i = 0; i < count; i++)
	{
		sum[i]= A[Ta1[i]]+A[Ta2[i]];
	}

	//find out which is big
	big=sum[0];//assumption
	for (i = 1; i < count; i++)
	{
		a=sum[i];
		if (a>big)
		{
			big=a;
		}
	}

	printf("The biggest Array sum is %ld\n", big);
}