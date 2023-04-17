package com.example.javaskelton.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericResponseDto<T>{
    String resposneCode;
    String description;
    private T body;

    public static <T> GenericResponseDto<T> newSuccessInstance(T body) {
        GenericResponseDto<T> genericDTO = new GenericResponseDto();
        genericDTO.setResposneCode("00");
        genericDTO.setDescription("Operation Success");
        genericDTO.setBody(body);
        return genericDTO;
    }
    public static <T> GenericResponseDto<T> newFailedInstance(T body) {
        GenericResponseDto<T> genericDTO = new GenericResponseDto();
        genericDTO.setResposneCode("02");
        genericDTO.setDescription("Operation Failed");
        genericDTO.setBody(body);
        return genericDTO;
    }
}
