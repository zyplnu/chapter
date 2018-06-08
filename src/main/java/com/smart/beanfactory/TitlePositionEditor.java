package com.smart.beanfactory;

import java.beans.PropertyEditorSupport;

public class TitlePositionEditor extends PropertyEditorSupport {

    private String[] options = {"Left" , "Center" , "Right"};

    public String[] getTags(){
        return options;
    }

    public String getJavaInitializationString(){
        return "" + getValue();
    }

    public String getAsText(){
        int value = (Integer) getValue();
        return options[value];
    }

    public void setAsText(String s){
        for(int i = 0;i < options.length; i++){
            if(options[i].equals(s)){
                setValue(i);
                return;
            }
        }
    }

}
