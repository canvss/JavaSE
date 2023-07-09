package com.canvs.selfdefine.exer2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/9 21:23
 */
public class DAO<T> {
    private HashMap<String,T> map;
    {
        map = new HashMap<String,T>();
    }
    public void save(String id,T entity){
        if (!map.containsKey(id)){
            map.put(id,entity);
        }
    }
    public T get(String id){
        return map.get(id);
    }
    public void update(String id,T entity){
        if(map.containsKey(id)){
            map.put(id,entity);
        }
    }
    public List<T> list(){
        return new ArrayList<T>(map.values());
    }
    public void delete(String id){
        map.remove(id);
    }
}

