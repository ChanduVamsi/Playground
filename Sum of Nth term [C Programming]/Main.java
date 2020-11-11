#include<stdio.h>
#include<math.h>
int main()
{
	int i,N;
	float sum;
	int count;
	scanf("%d",&N);
	sum=0.0f;
	count=1;
	for(i=1;i<=N;i++)
	{
		sum +=  ((pow(count,2)) / (pow(count,3)));
		count+=2;
	}
	printf("%.2f\n",sum);
	return 0;
  
}
