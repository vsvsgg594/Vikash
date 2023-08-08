class A:
    def a(self):
        print("a")
class B(A):
    def b(self):
        print("b")
class C(A):
    def c(self):
        print("c")    
c1=C()
c1.a()
c1.c()
c2=B()
c2.a()
c2.b()