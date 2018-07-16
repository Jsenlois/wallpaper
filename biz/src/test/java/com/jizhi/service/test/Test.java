package com.jizhi.service.test;

import com.jizhi.service.ServiceBaseTest;
import com.jizhi.service.TestService;

public class Test extends ServiceBaseTest {

    @org.junit.Test
    public void test() {
        TestService t = new TestService();
        t.test();
    }
}
