n1,q1= map(int,input().split())
N=[int(i) for i in input().split()]
for _ in range(q1):
    u,v=map(int,input().split())
    print(sum(N[u-1:v]))
    
    
