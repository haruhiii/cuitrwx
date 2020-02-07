package cn.cuitrwx.appointmentService.model;

public enum  ErrorCode {

    FAILED("-1","failed"),
    SUCCESS("0","success");


    private String code;
    private String desc;


    ErrorCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

}
