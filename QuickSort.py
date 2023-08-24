def partition(arr,low,high):
    pivot = arr[high]
    i = low-1
    for j in range(low,high):
        if arr[j] < pivot:
            i+=1
            arr[i],arr[j]=arr[j],arr[i]
    i+=1
    arr[i],arr[high]=arr[high],arr[i]
    return i
def quick_sort(arr,low,high):
    if low < high:
        pivotIndex = partition(arr,low,high)
        quick_sort(arr,low,pivotIndex-1)
        quick_sort(arr,pivotIndex+1,high)
    return arr
arr = [1,13,5]
print(arr)
print(quick_sort(arr,0,len(arr)-1))