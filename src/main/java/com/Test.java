package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
    /**
     * @Title:
     * @author lxh
     * @date 2018/1/21
     */
    public static void main(String[] args) {

        ConcurrentHashMap <String , Object> map = new ConcurrentHashMap<String, Object>();
        map.put("aa" , 100);
        map.get("aa");
    }
}
