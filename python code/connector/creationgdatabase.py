import mysql.connector
conn=mysql.connector.connect(host='localhost',username='root',password='root')
my_cursor=conn.cursor()
try:
    dbs=my_cursor.excute("show database")
except:
    conn.rollback() 
for x in my_cursor:
    print(x)
conn.close()          