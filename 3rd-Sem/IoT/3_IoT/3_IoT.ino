void setup() {
  // put your setup code here, to run once:
   pinMode(A0, INPUT);
   pinMode(12, OUTPUT);
   Serial.begin(9600);
}

void loop() {
  // put your main code here, to run repeatedly:
  int a = analogRead(A0);
  analogWrite(12, a);
  Serial.println(a);
}
