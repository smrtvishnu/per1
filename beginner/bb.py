with open('data.txt') as f:
    print sum(1 for _ in f)
