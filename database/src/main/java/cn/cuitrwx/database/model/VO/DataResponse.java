package cn.cuitrwx.database.model.VO;


public class DataResponse<T> {
    private ErrorCode errCode;
    private String errMsg;
    private T data;

    public DataResponse(T data){
        this.data=data;
        this.errCode=ErrorCode.SUCCESS;
        this.errMsg = "操作成功";
    }

    public DataResponse(ErrorCode errCode){
        switch (errCode) {
            case FAILED:
                this.errMsg = "数据库服务发生未知错误";
                break;
            case EMPTY:
                this.errMsg = "没有符合条件的数据";
                break;
            case USELESS:
                this.errMsg = "数据库未发生变化(无效语句)";
            break;
            default:
                break;
        }
        this.errCode = errCode;
    }
    public DataResponse(ErrorCode errCode, String ErrMsg) {
        this.errCode = errCode;
        this.errMsg = ErrMsg;
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


}
