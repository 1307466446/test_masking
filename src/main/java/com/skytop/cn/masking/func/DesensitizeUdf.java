package com.skytop.cn.masking.func;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author wzh18
 */
public class DesensitizeUdf {

    /**
     * 用户名脱敏
     * 脱敏规则：1个字则不脱敏，2个字则脱敏第二个字，如"张三"-->"张*"，3个字则脱敏第二个字，如"张三丰"-->"张*丰"
     * 4个字则脱敏中间两个字，如"易烊千玺"-->"易**玺"，以此类推
     *
     * @param customerName
     * @return
     */
    public static String nameUdf(String customerName) {
        if (StringUtils.isBlank(customerName)) {
            return "";
        }
        String name = StringUtils.left(customerName, 1);
        return StringUtils.rightPad(name, StringUtils.length(customerName), "*");
    }

    /**
     * 企业名称脱敏
     * 脱敏规则：从第2位开始隐藏。
     *
     * @param companyName
     * @return
     */
    public static String companyNameUdf(String companyName) {
        if (StringUtils.isBlank(companyName)) {
            return "";
        }
        int length = StringUtils.length(companyName);
        return StringUtils.rightPad(StringUtils.left(companyName, 2), length, "*");
    }

    /**
     * address脱敏
     * 规则说明：显示前2位
     *
     * @param address
     * @return
     */
    public static String addressUdf(String address) {
        if (StringUtils.isBlank(address)) {
            return "";
        }
        int length = StringUtils.length(address);
        return StringUtils.rightPad(StringUtils.left(address, 2), length, "*");
    }


    /**
     * 身份证号脱敏
     * 脱敏规则：保留前六后三
     *
     * @param idCard
     * @return
     */
    public static String uniqueCodeUdf(String idCard) {
        if (StringUtils.isNotEmpty(idCard)) {
            if (idCard.length() == 15) {
                idCard = idCard.replaceAll("(\\w{6})\\w*(\\w{3})", "$1******$2");
            } else if (idCard.length() == 18) {
                idCard = idCard.replaceAll("(\\w{6})\\w*(\\w{3})", "$1*********$2");
            }
        }
        return idCard;
    }


    /**
     * phone脱敏
     * 脱敏规则：手机号码保留前三后四
     *
     * @param mobilePhone
     * @return
     */
    public static String phoneUdf(String mobilePhone) {
        if (StringUtils.isNotEmpty(mobilePhone)) {
            mobilePhone = mobilePhone.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
        }
        return mobilePhone;
    }

    /**
     * 固定电话脱敏
     * 脱敏规则：取后4位，其他隐藏
     *
     * @param num
     * @return
     */
    public static String fixedPhone(String num) {
        if (StringUtils.isBlank(num)) {
            return "";
        }
        return StringUtils.leftPad(StringUtils.right(num, 4), StringUtils.length(num), "*");
    }

    /**
     * email脱敏
     * 脱敏规则：电子邮箱隐藏@前面的3个字符
     *
     * @param email
     * @return
     */
    public static String emailUdf(String email) {
        if (StringUtils.isBlank(email)) {
            return "";
        }
        int index = StringUtils.indexOf(email, "@");
        if (index <= 1) {
            return email;
        } else {
            return StringUtils.rightPad(StringUtils.left(email, 1), index, "*").concat(StringUtils.mid(email, index, StringUtils.length(email)));
        }
    }


    /**
     * 银行卡号脱敏
     * 银行账号保留前六后四
     *
     * @param acctNo
     * @return
     */
    public static String bankCardNumberUdf(String acctNo) {
        if (StringUtils.isNotEmpty(acctNo)) {
            String regex = "(\\w{6})(.*)(\\w{4})";
            Matcher m = Pattern.compile(regex).matcher(acctNo);
            if (m.find()) {
                String rep = m.group(2);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < rep.length(); i++) {
                    sb.append("*");
                }
                acctNo = acctNo.replaceAll(rep, sb.toString());
            }
        }
        return acctNo;
    }


}
