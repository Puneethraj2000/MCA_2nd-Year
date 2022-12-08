void setup() {
  // put your setup code here, to run once:
  pinMode(13, OUTPUT);
  pinMode(10, INPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
  if(digitalRead(10)==HIGH)
    digitalWrite(13, HIGH);
   delay(1000);
   digitalWrite(13, LOW);
   delay(1000);
}
