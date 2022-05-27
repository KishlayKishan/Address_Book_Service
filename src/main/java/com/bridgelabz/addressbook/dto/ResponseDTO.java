package com.bridgelabz.addressbook.dto;

import lombok.Data;

/**
 Use Of Lombak In Addressbook Annotations
 */
@Data
public class ResponseDTO {
    private String message;
    private Object data;

    public ResponseDTO(String message, Object data) {
        this.message = message;
        this.data = data;
    }
}
