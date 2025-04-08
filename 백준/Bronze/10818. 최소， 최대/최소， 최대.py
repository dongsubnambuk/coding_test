n=int(input())
array=[]

a=input().split()
for i in range(n):
    array.append(int(a[i]))
max1=max(array)
min1=min(array)

print(min1,max1)