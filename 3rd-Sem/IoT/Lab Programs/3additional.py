import RPi.GPIO as gpio
import time

gpio.setmode(gpio.BOARD)

led = 15
led1 = 13

gpio.setup(led, gpio.OUT, initial = 1)
gpio.setup(led1, gpio.OUT, initial = 0)

fh = open("ledTime.txt")
lst = fh.readlines()
f = lst[0].split("=")
a = int(f[1])
f1 = lst[1].split("=")
b = int(f1[1])

try:
	while(True):
		gpio.output(led, False)  #ON
		time.sleep(a)
		gpio.output(led, True)   #OFF
		time.sleep(b)
		gpio.output(led1, False)  #ON
		time.sleep(a)
		gpio.output(led1, True)   #OFF
		time.sleep(b)

except KeyboardInterrupt:
	#cleaning GPIO settings before exiting
	gpio.cleanup()
