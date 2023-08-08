import mysql.connector
conn=mysql.connector.connect(host='localhost',username='root',password='root',database='books')
my_cursor=conn.cursor()
try:
    my_cursor.execute("select * from book where book_id in(1,2,4)")
    result=my_cursor.fetchall()
    # print("Name    id ")  
    for x in result:
        print("%d    %s"%(row[0],row[1]))
        #  print(x)
except:
    conn.rollback()
# conn.commit()
conn.close()            