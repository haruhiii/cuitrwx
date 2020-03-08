package cn.cuitrwx.display.model;


public class ResponseVO<T> {
    private int status;
    private ErrorCode errCode;
    private String errMsg;
    private T data;

    public ResponseVO(T data) {
        this.data = data;
        if(data==null){
            this.errCode=ErrorCode.EMPTY;
            this.errMsg = "空数据";
        }else{
            this.errCode=ErrorCode.SUCCESS;
        }
    }

    public ResponseVO(ErrorCode errCode, String ErrMsg) {
        this.errCode = errCode;
        this.errMsg = ErrMsg;
    }

    public ResponseVO(T data, ErrorCode errCode, String ErrMsg) {
        this.data = data;
        this.errCode = errCode;
        this.errMsg = ErrMsg;
    }


    public int getStatus() {
        return status;
    }

    public ErrorCode getErrCode() {
        return errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setErrCode(ErrorCode errCode) {
        this.errCode = errCode;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public void setStatus(int status) {
        this.status = status;
    }


}
