def printAllKLength(set, k): 
  
    n = len(set)  
    printAllKLengthRec(set, "", n, k) 
    def printAllKLengthRec(set, prefix, n, k): 
    if (k == 0) : 
        print(prefix) 
        return
     for i in range(n): 
        newPrefix = prefix + set[i] 
        printAllKLengthRec(set, newPrefix, n, k - 1) 
if __name__ == "__main__": 
      
    print("First Test") 
    set1 = ['a', 'b'] 
    k = 3
    printAllKLength(set1, k) 
      
    print("\nSecond Test") 
    set2 = ['a', 'b', 'c', 'd'] 
    k = 1
    printAllKLength(set2, k)
