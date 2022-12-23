package com.pooltpv.api.utilities;

import net.minidev.json.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class JsonConvertor {

    private JSONObject jsonObject;

    public Object remove(String key) {
        return jsonObject.remove(key);
    }
}
