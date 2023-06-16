package com.gof.design.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{

    private List<String> empList;

    public Employees(){
        empList = new ArrayList<>();
    }

    public Employees(List<String> list){
        this.empList=list;
    }
    public void loadData(){
        empList.add("Pankaj");
        empList.add("Raj");
        empList.add("Siraj");
        empList.add("Rajath");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> temp = new ArrayList<String>();
        for(String s : this.getEmpList()){
            temp.add(s);
        }
        return new Employees(temp);
    }

}