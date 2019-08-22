package com.hospitalmanagment.helper;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

public class RequestMapperHandler {

	@SuppressWarnings("deprecation")
	public static Object wrap(HttpServletRequest req, Class<?> classType) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Object obj = null;
		Map<String, String[]> paramMap = null;
		Set<String> keySet = null;
		paramMap = req.getParameterMap();
		keySet = paramMap.keySet();

		Class<?> genericClass = Class.forName(classType.getCanonicalName());
		obj = genericClass.newInstance();

		for (Method method : genericClass.getDeclaredMethods()) {
			for (String key : keySet) {

				if (method.getName().contains("set" + key.substring(0, 1).toUpperCase() + key.substring(1))) {
					Class<?>[] type = method.getParameterTypes();
					if(type[0] == byte.class) {
						method.invoke(obj, Byte.parseByte((req.getParameter(key))));
					}else if(type[0] == int.class) {
						method.invoke(obj, Integer.parseInt((req.getParameter(key))));
					}else if(type[0] == short.class) {
						method.invoke(obj, Short.parseShort((req.getParameter(key))));
					}else if(type[0] == long.class) {
						method.invoke(obj, Long.parseLong((req.getParameter(key))));
					}else if(type[0] == float.class) {
						method.invoke(obj, Float.parseFloat((req.getParameter(key))));
					}else if(type[0] == double.class) {
						method.invoke(obj, Double.parseDouble((req.getParameter(key))));
					}else if(type[0] == boolean.class) {
						method.invoke(obj, Boolean.parseBoolean((req.getParameter(key))));
					}else if(type[0] == char.class) {
						method.invoke(obj, ((req.getParameter(key)).toString()));
					}else if(type[0] == String.class) {
						method.invoke(obj,((req.getParameter(key))));
					}else if(type[0] == Date.class) {
						method.invoke(obj, Date.parse(((req.getParameter(key)))));
					}
					
					
				}
			}

		}
		return obj;

	}

}
