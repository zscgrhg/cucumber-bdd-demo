package com.example.cucumberbdddemo.bean;

import java.util.List;

public interface Postbox {
    void putIn(Email email);

    boolean hasEmail(String recipient);

    int size();

    List<Email> find(String recipient);
}
