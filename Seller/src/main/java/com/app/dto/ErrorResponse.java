package com.app.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ErrorResponse {
	public ErrorResponse(String string, LocalDateTime now) {
		// TODO Auto-generated constructor stub
	}
	private String message;
	private LocalDateTime timestamp;
}
