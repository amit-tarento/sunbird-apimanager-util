package in.ekstep.am.dto.token;

import java.util.Map;

public class TokenSignRequest {

    private Map<String, String> headers;

    private String refresh_token;

    public TokenSignRequest(){
    }

    public TokenSignRequest(String refresh_token){
        this.refresh_token = refresh_token;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public Map<String, String> getHeaders() {
      return headers;
    }

    public void setHeaders(Map<String, String> headers) {
      this.headers = headers;
    }
}