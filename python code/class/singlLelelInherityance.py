class Animal:
    def speak(self):
        print("speak")
class Dog(Animal):
    def bark(self):
        print("barking") 
d=Dog()
d.bark()
d.speak()   
            