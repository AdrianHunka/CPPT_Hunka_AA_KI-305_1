/**
 * lab 4 package
 */
/**
 * Class CalcException implements calculation exceptions
 *
 * @author Adrian hunka
 * @version 1.0
 */
class CalcException extends ArithmeticException{
    /**
     * Constructor
     */
    public CalcException() {
    }
    /**
     * Constructor
     *
     * @param cause
     */
    public CalcException(String cause) {
        super(cause);
    }
}