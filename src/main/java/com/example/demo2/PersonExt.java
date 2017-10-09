package com.example.demo2;


import lombok.Builder;

public class PersonExt extends Person {

    private String custom;


    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) {
        this.custom = custom;
    }

    /*
       README  per info https://reinhard.codes/2015/09/16/lomboks-builder-annotation-and-inheritance/
       Per builder di classi che estendono  una classe padre  la libreria funziona cosi:
       -occorre creare un costruttore privato usato dalla libreria specificando sia i campi della classe padre che quelli
       della classe estesa
     */

    @Builder(builderMethodName = "newBuilder")
    private PersonExt(
            //campi classe padre
            String name, Integer age,
            //campi classe figlia
            String custom){
        super(name,age);
        this.custom = custom;
    }

}
