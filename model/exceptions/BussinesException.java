package model.exceptions;

import java.io.Serial;

public class BussinesException extends Exception {

    @Serial
    private static final long serialVersionUID = 1L;

    public BussinesException(String message)
    {
        super(message);
    }
}
