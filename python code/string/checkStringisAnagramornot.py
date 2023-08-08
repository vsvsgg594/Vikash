from collections import Counter
str1="vikash"
str2="vkashi"
if(sorted(str1)==sorted(str2)):
    print("yes")
else:
    print("no")
s1="abc"
s2="bca"
if(Counter(s1)==Counter(s2)):
    print("yes")
else:
    print("no")            