#there are two types of variables in python
#1.local variable
#2.global variable
#examples of local veriable
b=300
def local():
    a=10 #a is local veriable it's scope have whithin the function
    b=10
    print(a+b)
    print(b)
    print(a)
local() 
a=200# that is global variable
print(a) 
print(b)  
def fun():
    print(a)
    print(b)
    print(a+b)
print(type(a))    