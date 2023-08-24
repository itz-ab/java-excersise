def binary_search(values,value):
    min = 0
    max = len(values)
    while(min<max):
        mid = (min+max)//2
        if value == values[mid]:
            return mid
        elif value > values[mid]:
            min=mid+1
        else:
            max=mid-1
    return -1

values = [1,2,3,4,5,6,7,8,9,10]
value = 4
index = binary_search(values,value)
if index == -1:
    print("Value not found..")
else:
    print("Value found at",index,"index..")