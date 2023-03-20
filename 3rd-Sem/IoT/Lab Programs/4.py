#4. Switch on a relay at a given time using cron, where the relay's contact terminals are connected to a load.

import RPi.GPIO as gpio
import time

gpio.setmode(gpio.BOARD)

relay=38

gpio.setup(relay, gpio.OUT, initial = 0)


#cron file

try:
	#while(True):
		print("Start of the program")
		gpio.output(relay, True)  #ON
		print("Relay on")
		time.sleep(10)
		gpio.output(relay, False)   #OFF
		print("Relay off")

except KeyboardInterrupt:
	#cleaning GPIO settings before exiting
	gpio.cleanup()
	print("End of the program")


	
	
#sudo crontab -e
#<min> <hour> * * * sudo python <program path in quotes>
#press ctrl + o, enter, ctrl + x
