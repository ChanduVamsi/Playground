#include <stdio.h>
float fahrenheit(float celsius);
float kelvin(float celsius);
int main()
{
    float celsius;
    scanf("%f",&celsius);
    printf("temperature in Fahrenheit %f\n", fahrenheit(celsius));
    printf("temperature in Kelvin %f", kelvin(celsius));
    return 0;
}
float fahrenheit(float celsius)
{
	//type your code here
  celsius *= 9;
  celsius /= 5;
  return celsius+32;
}
float kelvin(float celsius)
{
	//type your code here
  return celsius+273.149994;
}
