N,X=input().split()
N=int(N)
X=int(X)
l=[]

A=input().split()
for i in range(N):
    l.append(int(A[i]))
    if l[i]<X:
        print(A[i])    

