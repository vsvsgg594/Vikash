import mysql.connector

conn=mysql.connector.connect(host='localhost',username='root',password='root',database='books')
my_cursor=conn.cursor()
sql="INSERT INTO book(`book_id`,`book_name`) values(%s,%s)"
val=(1,'AB')
try:
    my_cursor.execute(sql,val)
    # conn.commit()
except:
    conn.rollback()
print(my_cursor.rowcount)    
conn.close()    

