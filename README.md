# Java4

Obliczać Fibonacciego numer n,
Obliczać średnie arytmetyczne i odchylenie standardowe sekwencji_liczb,
Zaimplementuj generator liczb pierwszych,
Obliczać e przybliżony,
Rok przestępny,

Wprowadzić w życie i przetestuj LeapYearCalculator:
`
class LeapYearCalculator
{
public static boolean isLeapYear (int leapYear) {
}
}`

Załóżmy, że y to rok 2008 dla przykład . Wtedy y jest rok przestępny (zawiera
jakiś dodatkowy dzień, 29 lutego ) jeśli
y > 1582 // = rok przestępny był wprowadzony y jest podzielny
o 4, ale y jest nie podzielny o 100, chyba że y jest
podzielny o 400
Dla przykład 1900 jest nie rok przestępny, ale 2000 to rok przestępny
