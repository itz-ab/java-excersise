def linear_Search(values,value):
    for i in range(len(values)):
        if values[i] == value:
            return i
    return -1

values = [1,3,5,2,6,4,7,10,8,9]
value = 6
index = linear_Search(values,value)
if index == -1:
    print("Value not found..")
else:
    print("Value found at",index,"index")