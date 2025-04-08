n=int(input())
a = input().split()
l =[int(a[i]) for i in range(n)]
print(l.count(int(input())))