package com.sergio.ramos;

import org.jetbrains.annotations.NotNull;

public class CustomerJava {
    private int id;
    private String name;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void prettyPrint(){
        System.out.println("ID: %d, Name: %s, Email: %s".formatted(id, name, email));
    }

    public @NotNull String neverNull() {
        return "A string";
    }

    public String sometimesNull() {
        return "A string";
    }

    @Override
    public String toString(){
        return "CustomerJava{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        CustomerJava customerJava = (CustomerJava) obj;
        return id == customerJava.id && name.equals(customerJava.name) && email.equals(customerJava.email);
    }
}
