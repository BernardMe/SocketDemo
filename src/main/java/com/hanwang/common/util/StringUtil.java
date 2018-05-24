package com.hanwang.common.util;

import java.util.ArrayList;

/**
 * 字符串工具类
 * @author z
 *
 */
public class StringUtil {
	
	/**
	 * 判断字符串中是否包含表情
	 * @param source
	 * @return
	 */
	public static boolean containsEmoji(String source) {
        int len = source.length();
        boolean isEmoji = false;
        for (int i = 0; i < len; i++) {
            char hs = source.charAt(i);
            if (0xd800 <= hs && hs <= 0xdbff) {
                if (source.length() > 1) {
                    char ls = source.charAt(i+1);
                    int uc = ((hs - 0xd800) * 0x400) + (ls - 0xdc00) + 0x10000;
                    if (0x1d000 <= uc && uc <= 0x1f77f) {
                        return true;
                    }
                }
            } else {
                // non surrogate
                if (0x2100 <= hs && hs <= 0x27ff && hs != 0x263b) {
                    return true;
                } else if (0x2B05 <= hs && hs <= 0x2b07) {
                    return true;
                } else if (0x2934 <= hs && hs <= 0x2935) {
                    return true;
                } else if (0x3297 <= hs && hs <= 0x3299) {
                    return true;
                } else if (hs == 0xa9 || hs == 0xae || hs == 0x303d || hs == 0x3030 || hs == 0x2b55 || hs == 0x2b1c || hs == 0x2b1b || hs == 0x2b50|| hs == 0x231a ) {
                    return true;
                }
                if (!isEmoji && source.length() > 1 && i < source.length() -1) {
                    char ls = source.charAt(i+1);
                    if (ls == 0x20e3) {
                        return true;
                    }
                }
            }
        }
        return  isEmoji;
    }
	
	/**
	 * 方法的作用.
	 * @param str
	 * @return boolean
	 * @throws
	 */
	public static boolean isEmptyString(final String str) {
		return str == null || str.length() < 1;
	}

    /**
     * @Description:比较字符串集合是否符合顺序
     * @param dateList
     * @return: boolean
     */
    public static boolean compareListOrder(ArrayList<String> dateList) {
        boolean flag = true;

        for(int i=0;i<dateList.size()-1;i++) {
            if(dateList.get(i).compareTo(dateList.get(i+1)) >= 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
