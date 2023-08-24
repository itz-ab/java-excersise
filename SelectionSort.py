def selection_sort(values):
    for i in range(len(values)-1):
        temp = i
        for j in range(i+1,len(values)):
            if values[temp]>values[j]:
                temp = j
        values[temp],values[i]=values[i],values[temp]

values = [1,3,5,7,9,2,4,6,8,10]
print(values)
selection_sort(values)
print(values)