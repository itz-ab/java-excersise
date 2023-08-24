def bubble_sort(values):
    for i in range(len(values)-1):
        for j in range(i+1,len(values)):
            if values[j] < values[i]:
                values[i],values[j]=values[j],values[i]

values = [1,3,5,7,9,2,4,6,8,10]
print(values)
bubble_sort(values)
print(values)