package com.jizhi.wallpaper.biz.service;

import com.jizhi.wallpaper.biz.ServiceBaseTest;
import org.junit.Test;
import org.mockito.InjectMocks;

public class TestServiceTest extends ServiceBaseTest {

    @InjectMocks
    private TestService testService;

    @Test
    public void test() {
        testService.test();
    }
}
