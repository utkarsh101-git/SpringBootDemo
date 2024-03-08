package com.gitexample.springBootWithGit.models;

public class ApiResponse<T> {
    private String status;
    private int code;
    private String message;
    private T content;
    //private PageDetails pageDetails;



    public ApiResponse() {
    }

    public ApiResponse(String status, int code, String message, T content) {
        this.status = status;
        this.code = code;
        this.message = message;
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    /*public PageDetails getPageDetails() {
        return pageDetails;
    }

    //public void setPageDetails(PageDetails pageDetails) {
        this.pageDetails = pageDetails;
    }*/

    @Override
    public String toString() {
        return "ApiResponse{" +
                "status='" + status + '\'' +
                ", code=" + code +
                ", message='" + message + '\'' +
                ", content=" + content +
                //", pageDetails=" + pageDetails +
                '}';
    }
}

