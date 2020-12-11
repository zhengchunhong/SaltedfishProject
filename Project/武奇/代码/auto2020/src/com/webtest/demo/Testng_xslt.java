package com.webtest.demo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.javamail.JavaMailTestListener;
import com.webtest.javamail.SendZip;
import com.webtest.javamail.ZipUtil;

/**
 * author:武奇
 *
 */

public class Testng_xslt{
	@Test
    public void test1() {
        Assert.assertEquals(1, 1);
        
    }
	
	@Test
    public void test2() {
        Assert.assertEquals(1, 2);
    }
	
	@Test
    public void test3() {
        Assert.assertEquals(2, 2);
    }
	
	@Test
    public void test4() {
        Assert.assertEquals(2, 1);
    }
	
	@Test
    public void test5() {
        Assert.assertEquals(3, 1);
    }

}
