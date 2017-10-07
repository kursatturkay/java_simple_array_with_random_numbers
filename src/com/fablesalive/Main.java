//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.fablesalive;

import java.text.MessageFormat;
import java.util.function.Consumer;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        RandomBag bag = new RandomBag(15);
        bag.getNumberPack().forEach((x) -> {
            String msg = MessageFormat.format("{0}", new Object[]{x});
            System.out.println(msg);
        });
    }
}
