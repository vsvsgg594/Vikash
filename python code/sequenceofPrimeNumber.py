num=int(input("Enter number"))
if num>1:
    for i in range(2,num):
        if(num%i==0):
            print("This is not prime number")
            break
    else:
        print(i)
else:
    print("not prime number")                