
public class Operaciones {
    /**
     * Operacion de suma de dos numeros
     *
     * @param num1 Primer numero a sumar
     * @param num2 Segundo numero a sumar
     * @return Devuelve el resultado
     */
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Operacion de suma de dos numeros
     *
     * @param num1 Primer numero a restar
     * @param num2 Segundo numero a restar
     * @return Devuelve el resultado
     */
    public static double restar(double num1, double num2) {
        return num1 - num2;
    }
    /**
     * Operacion de multiplicacion de dos numeros
     *
     * @param num1 Primer numero a multiplicar
     * @param num2 Segundo numero a multiplicar
     * @return Devuelve el resultado
     */
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
    /**
     * Operacion de division de dos numeros
     *
     * @param num1 Primer numero a dividir
     * @param num2 Seguno numero a dividir
     * @return Devuelve el resultado
     */
    public static double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("No es posible dividir por 0. El resultado sera 0");
            return 0;
        }
    }
}
