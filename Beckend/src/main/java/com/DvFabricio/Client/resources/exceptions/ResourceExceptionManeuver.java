package com.DvFabricio.Client.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.DvFabricio.Client.services.exceptions.EntityNotFoundException;

@ControllerAdvice
public class ResourceExceptionManeuver {
	
	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity<StandardError>EntityNotFoundOut(EntityNotFoundException e,HttpServletRequest request){
       StandardError err = new StandardError();
	   err.setTimestamp(Instant.now());
	   err.setStatus(HttpStatus.NOT_FOUND.value());
	   err.setError("Resourser not found");
	   err.setMessage("Entity not found out");
	   err.setPath(request.getRequestURI());
	   return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	
 }
}
