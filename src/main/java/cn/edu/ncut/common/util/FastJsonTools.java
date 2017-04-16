package cn.edu.ncut.common.util;

import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

public  class FastJsonTools {
	//此函数实现将对象以json的方式写到前台
			public static void writeJson(Object object,HttpServletResponse response) {			
				
				 try{
			            String json= JSON.toJSONStringWithDateFormat(object, "yyyy-MM-dd HH:mm:ss");
			            response.setContentType("text/html;charset=utf-8");
			            response.getWriter().write(json);
			            response.getWriter().flush();
			            response.getWriter().close();
			        }catch (Exception e) {
			            // TODO: handle exception
			            e.printStackTrace();
			        }
				
				
			}
}
