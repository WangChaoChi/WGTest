package wg.com.shopping.dto;

/**
 * @author wangcc
 * @decription:
 * @date 2018/2/24 21:16
 */
public class Result {
    private int success;
    private String result;

    public Result() {
    }

    public Result(int success, String result) {
        this.success = success;
        this.result = result;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
