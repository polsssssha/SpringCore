package com.example.module;

import java.io.File;
import java.util.List;

public interface Module {

    String getModuleName();

    List<String> getMethods();

    boolean isSuitableExtension(String extension);
    void getAllowableMethods();
    void doNeededMethod(int d, File file);
    int getD();
}