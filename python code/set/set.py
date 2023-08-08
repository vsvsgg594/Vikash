#A Python set is the collection of the unordered items.
# Each element in the set must be unique, immutable,
# and the sets remove the duplicate elements. 
#Sets are mutable which means we can modify it after its creation.
set={"vikash",1,4,1}
print(set)
# using union | operator

Days1 = {"Monday","Tuesday","Wednesday","Thursday", "Sunday"}    
Days2 = {"Friday","Saturday","Sunday"}    
print(Days1|Days2) #printing the union of the sets     
l1={"jan"}
l2={"feb"}
print(l1|l2)
Days1 = {"Monday","Tuesday", "Wednesday", "Thursday"}    
Days2 = {"Monday","Tuesday","Sunday", "Friday"}    
print(Days1&Days2) #prints the intersection of the two sets    