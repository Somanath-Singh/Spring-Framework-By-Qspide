package com.nt.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseStructureDto<T> {

	private int statusCode;
	private String description;
	private T data;
	private LocalDateTime date;
}
