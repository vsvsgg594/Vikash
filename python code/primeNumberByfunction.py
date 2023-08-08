n=int(input("ENter the Number : "))
def prime():
    list=[]
    for i in range(2,n):
        if i==0 or i==1:
            continue
        else:
            for j in range(2,int(i/2)+1):
                if i %j ==0:
                    break
            else:
                list.append(i)    
    return list
lst=prime()
if len(lst)==0:
    pass
else:
    print(lst)                