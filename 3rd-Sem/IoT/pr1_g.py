#Display the time 10 times in the interval of 10 seconds

import time
import datetime as dt

for i in range(10):
	print(str(dt.datetime.time(dt.datetime.now()))[:8])
	time.sleep(10)
	
#OR

for i in range(10):
	seconds = time.time()
	local_time = time.ctime(seconds)
	print("Local Time:",local_time)
	time.sleep(10)
	
#OR

import time
for i in range(10):
	t=time.localtime()
	print("Current Time", t.tm_hour ,":", t.tm_min ,":",t.tm_sec)
	time.sleep(10)
