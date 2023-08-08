#check out the given year is leap year or not
# leap year the year divide by 100 and 400 or year that divided by 4 and not divided by 100
year=int(input("Enter the Year : "))
if(year%100==0 and year%400==0 or year%100!=0 and year%4==0):
    print(year," is leap year")
else:
    print(year,"is not leap year")    
