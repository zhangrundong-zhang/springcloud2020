package com.springcloud.utils;

import org.apache.commons.lang3.StringUtils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * java8日期工具类
 *
 * @author zhongyong
 * @date 20190321
 * @since v1.0
 */
public class DateUtils {

    /**
     * 工具类构造方法私有，禁止实例化
     * 直接调用该类的static方法
     */
    private DateUtils() {
    }

    public static final String DATE_TIME_0 = "000000";
    public static final String DATE_TIME_05 = "yyyyMM";
    public static final String DATE_TIME_06 = "MMdd";
    public static final String DATE_TIME_07 = "MM-dd";

    /**
     * LocalDateTime默认日期时间格式 LocalDateTime
     */
    public static final String DEFAULT_DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    /**
     * DATE_TIME_FORMAT2 描述此常量
     */
    public static final String DEFAULT_DATE_TIME_FORMAT2 = "yyyyMMddHHmmss";
    public static final String DATE_TIME_FORMAT3 = "yyyyMMddHH";

    /**
     * LocalDate默认日期格式
     */
    public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";

    public static final String DEFAULT_DATE_FORMAT2 = "yyyyMMdd";

    /**
     * LocalTime默认时间格式
     */
    public static final String DEFAULT_TIME_FORMAT = "HH:mm:ss";

    public static final String RELEASETIME_FORMAT = "yyyy年MM月dd日HH时";


    /**
     * 默认LocalDateTime时间格式: yyyy-MM-dd HH:mm:ss
     */
    private static final DateTimeFormatter DEFAULT_DATETIME_FORMATTER = DateTimeFormatter.ofPattern(DEFAULT_DATE_TIME_FORMAT);

    /**
     * 默认LocalDate时间格式: yyyy-MM-dd
     */
    private static final DateTimeFormatter DEFAULT_DATE_FORMATTER = DateTimeFormatter.ofPattern(DEFAULT_DATE_FORMAT);

    /**
     * 默认LocalTime时间格式: HH:mm:ss
     */
    private static final DateTimeFormatter DEFAULT_TIME_FORMATTER = DateTimeFormatter.ofPattern(DEFAULT_TIME_FORMAT);


    /**
     * str转LocalDateTime
     *
     * @param localDateTimeStr 日期字符串，日期格式为yyyy-MM-dd HH:mm:ss
     * @since v1.0
     */
    public static LocalDateTime parseLocalDateTime(String localDateTimeStr) {
        return LocalDateTime.parse(localDateTimeStr, DEFAULT_DATETIME_FORMATTER);
    }

    /**
     * str转LocalDateTime,指定日期格式
     *
     * @param timeStr   日期字符串
     * @param formatter 指定日期格式
     * @since v1.0
     */
    public static LocalDateTime parseLocalDateTime(String timeStr, String formatter) {
        return LocalDateTime.parse(timeStr, DateTimeFormatter.ofPattern(formatter));
    }

    public static LocalDateTime parseLocalDateTime(Timestamp timestamp) {
        return LocalDateTime.ofInstant(timestamp.toInstant(), ZoneId.systemDefault());
    }


    /**
     * LocalDateTime转Str
     *
     * @param localDateTime 日期时间
     * @return 返回格式为yyyy-MM-dd HH:mm:ss字符串
     * @author zhongyong
     * @since v1.0
     */
    public static String formatLocalDateTime(LocalDateTime localDateTime) {
        return DEFAULT_DATETIME_FORMATTER.format(localDateTime);
    }

    /**
     * LocalDateTime转Str
     *
     * @param localDateTime 日期时间
     * @param formatter     指定的格式
     * @return 返回指定格式的字符串
     * @author zhongyong
     * @since v1.0
     */
    public static String formatLocalDateTime(LocalDateTime localDateTime, String formatter) {
        return DateTimeFormatter.ofPattern(formatter).format(localDateTime);
    }


    /**
     * str转LocalDate
     *
     * @param localDateStr 日期字符串，日期格式为yyyy-MM-dd
     * @author zhongyong
     * @since v1.0
     */
    public static LocalDate parseLocalDate(String localDateStr) {
        return LocalDate.parse(localDateStr, DEFAULT_DATE_FORMATTER);
    }

    /**
     * str转LocalDate,指定日期格式
     *
     * @param localDateStr 日期字符串
     * @param formatter    指定日期格式
     * @author zhongyong
     * @since v1.0
     */
    public static LocalDate parseLocalDate(String localDateStr, String formatter) {
        return LocalDate.parse(localDateStr, DateTimeFormatter.ofPattern(formatter));
    }


    /**
     * LocalDate转默认格式Str
     *
     * @param localDate 日期
     * @return 返回格式为yyyy-MM-dd字符串
     * @author zhongyong
     * @since v1.0
     */
    public static String formatLocalDate(LocalDate localDate) {
        return DEFAULT_DATE_FORMATTER.format(localDate);
    }

    /**
     * LocalDate转指定格式Str
     *
     * @param localDate 日期
     * @param formatter 指定的格式
     * @return 返回指定格式的字符串
     * @author zhongyong
     * @since v1.0
     */
    public static String formatLocalDate(LocalDate localDate, String formatter) {
        return DateTimeFormatter.ofPattern(formatter).format(localDate);
    }


    /**
     * str转LocalTime
     *
     * @param localTimeStr 日期字符串，日期格式为HH:mm:ss
     * @author zhongyong
     * @since v1.0
     */
    public static LocalTime parseLocalTime(String localTimeStr) {
        return LocalTime.parse(localTimeStr, DEFAULT_TIME_FORMATTER);
    }

    /**
     * str转LocalTime,指定日期格式
     *
     * @param localTimeStr 日期字符串
     * @param formatter    指定日期格式
     * @author zhongyong
     * @since v1.0
     */
    public static LocalTime parseLocalTime(String localTimeStr, String formatter) {
        return LocalTime.parse(localTimeStr, DateTimeFormatter.ofPattern(formatter));
    }


    /**
     * LocalTime转默认格式Str
     *
     * @param localTime 日期
     * @return 返回格式为HH:mm:ss字符串
     * @author zhongyong
     * @since v1.0
     */
    public static String formatLocalTime(LocalTime localTime) {
        return DEFAULT_TIME_FORMATTER.format(localTime);
    }

    /**
     * LocalDate转指定格式Str
     *
     * @param localTime 时间
     * @param formatter 指定的格式
     * @return 返回指定格式的字符串
     * @author zhongyong
     * @since v1.0
     */
    public static String formatLocalTime(LocalTime localTime, String formatter) {
        return DateTimeFormatter.ofPattern(formatter).format(localTime);
    }


    /**
     * 传入的日期，返回MMdd字符串
     *
     * @param localDateTime 时间
     * @return {@link String} 返回MMdd字符串
     */
    public static String getMonthDayStr(LocalDateTime localDateTime) {
        return formatLocalDateTime(localDateTime, DATE_TIME_06);
    }

    /**
     * 传入的日期，返回MMdd字符串
     *
     * @param localDate 日期
     * @return {@link String} 返回MMdd字符串
     */
    public static String getMonthDayStr(LocalDate localDate) {
        return formatLocalDate(localDate, DATE_TIME_06);
    }

    public static LocalDateTime parseDateTime(String strTime, String pattern) {
        return LocalDateTime.parse(strTime, DateTimeFormatter.ofPattern(pattern));
    }

    public static LocalDate parseDate(String strDate, String pattern) {
        return LocalDate.parse(strDate, DateTimeFormatter.ofPattern(pattern));
    }


    /**
     * 格式化localDate
     *
     * @param date
     * @param pattern
     * @return
     */
    public static String getFormatDate(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }

    /**
     * 格式化localDateTime
     *
     * @param date
     * @param pattern
     * @return
     */
    public static String getFormatDate(LocalDateTime date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }

    /**
     * 转换字符串为Date.
     *
     * @param dateStr 要转换的时间字符串
     * @param format  时间格式
     * @return Date 时间类型结果
     */
    public static Date parseString(String dateStr, String format) {
        if (StringUtils.isEmpty(dateStr)) {
            return null;
        }

        if (StringUtils.isEmpty(format)) {
            return null;
        }
        DateFormat df = new SimpleDateFormat(format);
        Date date = null;
        try {
            date = df.parse(dateStr);
            if (!dateStr.equals(df.format(date))) {
                date = null;
            }
        } catch (ParseException e) {
        }
        return date;
    }

}
