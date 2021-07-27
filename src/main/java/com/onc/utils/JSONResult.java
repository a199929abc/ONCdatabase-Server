package com.onc.utils;

/**
 * @Description:Custom response data structure This class is provided to portals, ios, Android, and WeChat malls. After the portal accepts this type of data,
 * it needs to use the methods of this class to convert it into the
 * corresponding data type format (class, or list). Other self-processing
 * 200：success
 * 500： Indicates an error, the error information is in the msg field
 * 501：Bean validation errors, no matter how many errors are returned as a map
 * 502：Interceptor intercepted user token error 555: exception throwing information
 */
public class JSONResult {

    // Response Status
    private Integer status;

    // Response Message
    private String msg;

    // Response Data
    private Object data;
    
    private String ok;	// current not in use

    public static JSONResult build(Integer status, String msg, Object data) {
        return new JSONResult(status, msg, data);
    }

    public static JSONResult ok(Object data) {
        return new JSONResult(data);
    }

    public static JSONResult ok() {
        return new JSONResult(null);
    }
    
    public static JSONResult errorMsg(String msg) {
        return new JSONResult(500, msg, null);
    }
    
    public static JSONResult errorMap(Object data) {
        return new JSONResult(501, "error", data);
    }
    public static JSONResult errorMapRev(Object data) {
        return new JSONResult(505, "Part is not unique. Please specify Revision", data);
    }
    
    public static JSONResult errorTokenMsg(String msg) {
        return new JSONResult(502, msg, null);
    }
    
    public static JSONResult errorException(String msg) {
        return new JSONResult(555, msg, null);
    }

    public JSONResult() {

    }

//    public static LeeJSONResult build(Integer status, String msg) {
//        return new LeeJSONResult(status, msg, null);
//    }

    public JSONResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public JSONResult(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    public Boolean isOK() {
        return this.status == 200;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

	public String getOk() {
		return ok;
	}

	public void setOk(String ok) {
		this.ok = ok;
	}

}
