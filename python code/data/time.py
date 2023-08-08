import time
print(time.time())
#current time by localtime()
print(time.localtime(time.time()))
#Getting formatted time
#The time can be formatted by using the asctime() function of the 
#time module. It returns the formatted time for the time tuple being passed
print(time.asctime(time.localtime(time.time())))
#sleep time
for i in range(0,5):
    print(i)
    time.sleep(1)
for i in range(1,11):
    print(i)
    time.sleep(1)    
#creating datetime object 
import datetime
print(datetime.datetime.now())   
#import calendar modul
import calendar
cal=calendar.month(2023,9)
print(cal)
#The prcal() method of calendar module is used to print the calendar 
# of the entire year. The year of which the calendar is
#  to be printed must be passed into this method.
s=calendar.prcal(2023)
print(s)
