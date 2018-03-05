package com.simulogin.innovasoftdl.login_android;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by didie on 05/03/2018.
 */

public class RegisterRequest extends StringRequest {

    private static final String REGISTER_REQUEST_URL="http://192.168.1.3/register.php";
    private Map<String,String> params;
    public RegisterRequest(String name, String username, int age, String pasword, Response.Listener<String> listener){
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params=new HashMap<>();
        params.put("name", name);
        params.put("username", username);
        params.put("age", age + "");
        params.put("password", pasword);

    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
