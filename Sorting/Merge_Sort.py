 def merge_sort(arr):
    if(len(arr)<=1):
        return arr
    
    mid = len(arr)//2
    arr1 = merge_sort(arr[:mid])
    arr2 = merge_sort(arr[mid+1:])

    left1, left2, i = 0,0,0
    while(left1<len(arr1) & left2<len(arr2)):
        if arr1[left1]>arr2[left2]:
            arr[i]=arr2[left2]
            left2+=1
        else:
            arr[i]=arr1[left1]
            left1+=1
        i+=1
    

N = int(input())
myList = []
for _ in range(N):
    myList.append(int(input()))
result = merge_sort(myList)

for i in result:
    print(i)
