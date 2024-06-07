package com.sergio.ramos;

import java.util.List;

public interface CustomerJavaRepository {
    CustomerJava getById(int id);

    List<CustomerJava> getAll();
}
