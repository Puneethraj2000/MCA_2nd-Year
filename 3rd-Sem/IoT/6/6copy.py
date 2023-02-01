import RPi.GPIO as GPIO
import time
import datetime

led = 13
buzzer = 36
relay = 38
GPIO.setmode(GPIO.BOARD)
GPIO.setwarnings(False)
GPIO.setup(led, GPIO.OUT, initial = 1)
GPIO.setup(buzzer, GPIO.OUT)
GPIO.setup(relay, False)
GPIO.setup(led, GPIO.OUT)

from flask import Flask, render_template

app = Flask(__name__)

@app.route('/')
def hello_world():
	return render_template('web.html')
	
@app.route('/redledon')
def redledon():
	GPIO.output(13,GPIO.LOW)
	now = datetime.datetime.now()
	timeString = now.strftime("%Y-%m-%d %H:%M")
	templateData = {
		'status':'ON',
		'time':timeString
		}
	return render_template('web.html', **templateData)
	
@app.route('/redledoff')
def redledoff():
	GPIO.output(13,GPIO.HIGH)
	now = datetime.datetime.now()
	timeString = now.strftime("%Y-%m-%d %H:%M")
	templateData = {
		'status' : 'OFF',
		'time' : timeString
		}
	return render_template('web.html', **templateData)
	
@app.route('/buzzeron')
def buzzeron():
	GPIO.output(36,GPIO.HIGH)
	now = datetime.datetime.now()
	timeString = now.strftime("%Y-%m-%d %H:%M")
	templateData = {
		'status1':'ON',
		'time1':timeString
		}
	return render_template('web.html', **templateData)
	
@app.route('/buzzeroff')
def buzzeroff():
	GPIO.output(36,GPIO.LOW)
	now = datetime.datetime.now()
	timeString = now.strftime("%Y-%m-%d %H:%M")
	templateData = {
		'status1' : 'OFF',
		'time1' : timeString
		}
	return render_template('web.html', **templateData)
	
@app.route('/relayon')
def relayon():
	GPIO.output(38,GPIO.HIGH)
	now = datetime.datetime.now()
	timeString = now.strftime("%Y-%m-%d %H:%M")
	templateData = {
		'status2':'ON',
		'time2':timeString
		}
	return render_template('web.html', **templateData)
	
@app.route('/relayoff')
def relayoff():
	GPIO.output(38,GPIO.LOW)
	now = datetime.datetime.now()
	timeString = now.strftime("%Y-%m-%d %H:%M")
	templateData = {
		'status2' : 'OFF',
		'time2' : timeString
		}
	return render_template('web.html', **templateData)


if __name__ == "__main__":
	app.run(debug = True, port = 4000, host = '172.16.201.210')
