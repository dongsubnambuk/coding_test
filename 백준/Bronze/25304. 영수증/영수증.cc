#include <stdio.h>



int main() {
   
	int X;
	int sum=0;
	int N;
	int a,b,i;

	scanf("%d", &X);
	scanf("%d", &N);

	for(i=0;i<N;i++){

		scanf("%d %d",&a, &b);
		sum+= a*b;
	}


	if(X ==sum)
		printf("Yes");
	else
		printf("No");


    return 0;
}