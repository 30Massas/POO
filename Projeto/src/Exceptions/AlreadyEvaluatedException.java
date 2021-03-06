package Exceptions;

import java.io.Serializable;

public class AlreadyEvaluatedException extends Exception implements Serializable {

    /**
     * Método que identifica uma exceção.
     */
    public AlreadyEvaluatedException(){
        super();
    }

    /**
     * Método que identifica uma exceção e apresenta uma mensagem de erro.
     * @param m Mensagem de erro.
     */
    public AlreadyEvaluatedException(String m){
        super(m);
    }

}
