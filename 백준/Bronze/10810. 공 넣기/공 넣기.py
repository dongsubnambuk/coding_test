N,M=input().split()
N=int(N) #바구니 번호
M=int(M) #몇줄 입력
L=[0 for _ in range(N)]

for b in range(M):
    i,j,k=map(int,input().split())#i번 바구니부터 j번 바구니까지 k번 번호가 적혀져 있는 공을 넣는다.
    for a in range(i,j+1): #i부터 j까지 값이 들어가야함으로 j+1을 한다
        L[a-1]=k # 바구니는 1부터 지정이지만, 인덱스는 0부터 시작이기에 n-1을 한다.
for a in range(N):
    print(L[a],end=" ")
