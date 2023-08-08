#creating class 
class Person:
    def __init__(self,name,age):
        self.name=name
        self.age=age
    def greet(self):
        print(self.name)
p=Person("vikash",23)    
p.greet()        

     