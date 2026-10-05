package com.flowtech.eventhub_spring_boot_backend.exception;

@RestControllerAdvice
public class EventHubExceptionHandler {
		
	@ExceptionHandler(value = RuntimeException.class)
	public ResponseEntity<?> runTimeExceptionHandler(RuntimeException exception)
	return ResponseEntity.ok(exception.getMessage());
}
