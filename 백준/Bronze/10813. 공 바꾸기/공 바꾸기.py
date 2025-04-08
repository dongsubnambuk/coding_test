N,M=input().split()
N=int(N) #바구니 번호
M=int(M) #몇줄 입력
L=[i for i in range(1,N+1)]
tmp=0
for b in range(M):
    i,j,=map(int,input().split())
    tmp=L[i-1]
    L[i-1]=L[j-1]
    L[j-1]=tmp
 
for a in range(N):
    print(L[a],end=" ")
