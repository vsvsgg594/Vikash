class C:
    def __init__(self,name,id,age):
        self.name=name
        self.id=id
        self.age=age
c1=C("vikash",1,23)
print(getattr(c1,'name'))        
print(setattr(c1,'age',24))
        