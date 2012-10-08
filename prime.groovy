println "Enter a number: ";
String str = System.console().readLine();
int num =Integer.parseInt(str);
int divr=1;
while(divr<num){
    divr++;
    if(num%divr ==0){
        println "The number is not prime";
        break;
    }
    else
    {
        println "The number is prime";
        break;
      }
    }
  println "Thank you";
