#include <stdio.h>



int main() {
   
	int n,i;
	int sum=0;

	scanf("%d", &n);

	for(i=0;i<=n;i++){
		sum +=i;
	}

	printf("%d",sum);


    return 0;
}