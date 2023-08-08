class A:
    def a(self):
        print("it is a")
class B:
    def b(self):
        print("b ") 
class C(A,B):
    def c(self):
        print("this is c")
c1=C()
c1.c()
c1.a()
c1.b()                       