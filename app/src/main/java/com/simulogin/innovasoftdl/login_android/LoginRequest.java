package com.simulogin.innovasoftdl.login_android;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by didie on 05/03/2018.
 */

public class LoginRequest extends StringRequest {

    private static final String LOGIN_REQUEST_URL="http://192.168.1.3/login.php";
    private Map<String,String> params;
    public LoginRequest(String username,String pasword, Response.Listener<String> listener){
        super(Request.Method.POST, LOGIN_REQUEST_URL, listener, null);
        params=new HashMap<>();
        params.put("username", username);
        params.put("password", pasword);

    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }

}
