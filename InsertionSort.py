def insertion_sort(values):
    list1 = [values[0]]
    for i in range(1,len(values)):
        tmp = True
        for j in range(len(list1)):
            if values[i]<list1[j]:
                tmp = False
                list1.insert(j,values[i])
                break
        if tmp:
         list1.append(values[i])
    return list1

values = [1,3,5,7,9,2,4,6,8,10]
print(values)
values = insertion_sort(values)
print(values)