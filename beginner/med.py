data = [('Ram',500), ('Sam',400), ('Test',100), ('Ram',800), ('Sam',700), 
        ('Test',300), ('Ram',900), ('Sam',800), ('Test',400)]

from collections import defaultdict

def median(mylist):
    sorts = sorted(mylist)
    length = len(sorts)
    if not length % 2:
        return (sorts[length / 2] + sorts[length / 2 - 1]) / 2.0
    return sorts[length / 2]

data_dict = defaultdict(list)
for el in data:
    data_dict[el[0]].append(el[1])

print [(key,median(val)) for key, val in data_dict.items()] 
print median([5,2,4,3,1])   
print median([5,2,4,3,1,6])
