math=float(input("Enter the Maths Mark : "))
science=float(input("Enter the Science Number :"))
english=float(input("Enter the English number : "))
hindi=float(input("Enter the Hindi Number : "))
social=float(input("Enter the Social Science number : "))
total=math+science+english+hindi+social
print("TOtal Number : ",total)

if( total>=300):
    print("First Division")
elif(total>224 and total<300):
    print("second Division")
elif(total>=125 and total<224):
    print("third division")
else:
    print("failed")        
