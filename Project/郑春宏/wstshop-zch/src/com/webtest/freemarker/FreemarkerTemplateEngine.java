package com.webtest.freemarker;

import java.io.File;
import java.io.StringWriter;
import java.util.Map;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

/*
 * author:Ö£´ººê
 * freemakerÄ£°å
 */
public class FreemarkerTemplateEngine {
    private static final String DEFAULT_TEMPLATE = "conf/reportTemplate.html";   
    public String getTemplatePath() {   
        return "";   
    }   
       
    public String run(Map context) throws Exception{   
    	return executeFreemarker(context); 
    }   
    
    private String executeFreemarker(Map context)throws Exception{   
    	String content="";
        Configuration cfg = new Configuration();  
        Thread.sleep(200);
        cfg.setDirectoryForTemplateLoading(   
                new File(getTemplatePath()));   
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        Thread.sleep(200);
        cfg.setObjectWrapper(new DefaultObjectWrapper());              
        cfg.setCacheStorage(new freemarker.cache.MruCacheStorage(20, 250));                      
        Template temp = cfg.getTemplate(getTemplate());    
        StringWriter out = new StringWriter();   
        temp.process(context, out);   
        //System.out.print(out.toString());
        return out.toString();
    }   
  
    public String getTemplate() {   
        // TODO Auto-generated method stub   
        return DEFAULT_TEMPLATE;   
    }    
}
