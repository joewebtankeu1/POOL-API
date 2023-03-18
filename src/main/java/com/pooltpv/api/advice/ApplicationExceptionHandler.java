package com.pooltpv.api.advice;

import com.pooltpv.api.exception.DateDiffException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.DateTimeException;
import java.time.format.DateTimeParseException;
import java.util.NoSuchElementException;

@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {

    /*  @ResponseStatus(HttpStatus.BAD_REQUEST)
     @ExceptionHandler(RisqueNsiaDtoException.class)
      public Map<String,String> handlerBusinerException(RisqueNsiaDtoException ex){
          Map<String,String> errorMap = new HashMap<>();
          errorMap.put("errorMessage", ex.getMessage());
          return errorMa
      }
   /*
      @ResponseStatus(HttpStatus.BAD_REQUEST)
      @ExceptionHandler(MissingServletRequestParameterException.class)
      public Map<String,String> handlerEmptyParamException(MissingServletRequestParameterException ex){
          Map<String,String> errorMap = new HashMap<>();
          errorMap.put("errorMessage", ex.getMessage());
          return errorMap;
      }
  */
    @ExceptionHandler(DateTimeException.class)
    public ResponseEntity<Object> handlerDateTimeParseException(HttpServletRequest req,
                                                                DateTimeParseException ex){
        String error = EnumError.FORMAT_DATE_INATTENDU+" " + ex.getMessage();
        return buildResponse(new ErrorResponse(HttpStatus.BAD_REQUEST,error));
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<Object> handlerNoSuchElementException(HttpServletRequest req,
                                                                NoSuchElementException ex){
        ErrorResponse response = new ErrorResponse(HttpStatus.NOT_FOUND);
       // response.setMessage("Aucune donnees pour cette intervalle de date " + req.getRequestURI());
        return buildResponse(response);
    }

    @ExceptionHandler(DateDiffException.class)
    public ResponseEntity<Object> handlerDiffDateHandler(HttpServletRequest req,
                                                         DateDiffException ex){
        ErrorResponse response = new ErrorResponse(HttpStatus.BAD_REQUEST);
        //response.setMessage("Erreur de date: La date de fin ne peut etre inferieure a la date de debut <br/> " + req.getRequestURI());
        return buildResponse(response);
    }

    private ResponseEntity<Object> buildResponse(ErrorResponse errorResponse){
        return new ResponseEntity(errorResponse,errorResponse.getStatus());
    }

}
