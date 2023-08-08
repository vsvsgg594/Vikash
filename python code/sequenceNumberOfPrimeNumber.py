n=int(input("Enter The Number : "))
list=[]
for i in range(2,n):
    if i==0 or i==1:
        continue
    else:
        for j in range(2,int(i/2)+1):
            if(i % j==0):
                break
        else:
            list.append(i)
print(list)  
# sum of prime number
sum=0
for i in list:
    sum=sum+i
print(sum)    
#multiplication of prime number
mul=1
for i in list:
    mul=mul*i
print(mul)    
