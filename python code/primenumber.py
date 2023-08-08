number=int(input("Enter the number : "))
if number> 1:
    for i in range(2,int(number/2)+1):
        if(number%i==0):
            print("Not Prime Number")
            break
    else:
        print("Prime Number") 
else:
    print("Not prime Number")               