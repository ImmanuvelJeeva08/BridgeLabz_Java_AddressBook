package com.company.Addressbook;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Uc7 {
    public static void main(String[] args) {
        JSONArray hi = new JSONArray();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("hello",5);
        jsonObject.put("hi",10);

        System.out.println(jsonObject.writeJSONString());
    }
}
