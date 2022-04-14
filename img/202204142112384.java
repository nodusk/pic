package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 今何许
 * @date 2020/7/14 15:36
 */
public class AlipayConfig {// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016102700769146";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDmAGOc05PYoJwtF+T5EBIk65nMx44Vg99uVUYqqW0YBaryeGhJMpUbsuXST/xtKGfNd3QhxcCPZSfb5APgPa1ZUtIpwVbPCs4HYLqQmr+C8UL7SH1P4msVk8qt3Wsx0vG9ybTC80lotGG5R444gAOAcREK54AjlDKF68kFj354BK68VWXeIowIZGelt5ZZbG3yDGTMhY2IjyNkbh0gz5b2rca9kWoy9UeyUcky2QgYFvZvqLjjKL9c4coFHIdmHEeofDNVCEBv5dKLnUGLfcFg2aRs+7fYJgiNj+/J0V1k9S9tvC5x5+VNSwlGxyA3GEzod4irdW4CGH1vkGJ59ENpAgMBAAECggEBAOJrF6TXFAB5e8VYdGxLSdFWrb1N5a2AeH+hKsXsrByt16+CoQcN6IOwBVaYryK2WBmIsqZcikefiTGKsdYaYYBBa+r3DYIcXN4edwrLjCRXZV0B63qspkZDi47FHjWaN6hh3LTd0zJkAJ/otTUhsFDM/b4CT762sVXs26PBsvppo3fnDT670x9SFEq3F0HLQc/DibtBp1qlnp8VmH7uacChhz8C8Z8JzwGWKDogmeYrkLDMI8pmKTb1aq04RfPQoURq6HEZCR7eM0mk1gpbhXd+R8P8sjuVIix6IO0hMa+3RbT6ojrXD9VuKrWW/nNRwLoWkv7h7OHC0lrxkXqnckECgYEA/Vtz3wyZdEJKYbJOHrWArKT+PW+b9/l88HMxbKY3YfT9uNdjBpGQf7Jr5C7HBcTcGvEoUcryh5RPjMZFdWpGIAHuh3b8OhjPmgD0a0P4pBK5vfjZBwgpSVyDzx7RDA0WRIMWTFK4MzrAfaOnFofPyVgMImblM04IunjMHssAxZ0CgYEA6GaRq33equEUT5P51N5+ntzRnKVrFvJMllB36NqwK836v6HLueMXHH0jvZ7Rwk1eCMqe29rj8FbKQtJsJMafjQFXOhSsMk5cIOy3aKeKIXexyHJO8u8pmB/HA+UZr5qHjWXIJ3X8PmUlrZq0ylSKw3s/v0GryLpAufENk1ww0T0CgYAGf58EPJ1/BuhDg0BPt1Yal4zR5Jf6j1KuFDZTVBwdjhwn7pZip78uF1R/INgIBNmkc0UWe/8mjR5RPRCxB03PKl2E6f9kOhixGY8rZS3uf3B2N/jRHlt4vz++Q0sXZQqKLVaYFJMW9U3UqyrxAADLaE+/XiZI35qHtet+arSVXQKBgQDkQVlxhf7c9pRsVHpciOr0PQ3jPNUhhHmUaRRcr+24GGbfMJpXyKM6Z+5in0qF/FcPa3L7nNGjjJq7ZtCwjiTG6Toy4Xr/LdduvxCkyWjx1g3XQe4ozJ2dvBhLywifYLciOYWMvGUzI0UObZSD5OUlejfyMR332HcaKZeb1EBeQQKBgQDin4tyQK6nFP5ncZOmfg+JrCQruRjWfF+GeTOuTiOB4CsQW05ievFGxzI0nNUHH7uSbo2sSgazVVfVunzem07Y11hp2gtCOriqPQNkzJfELMCIeTBzNU0bdtcyf+lcRt3i8S3UUunJt4Es+5wsLTNx0dzmFww32aQpdrdWZCERVQ==";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkwBUzIwdAh3ty0fp64xzNe3Tr+x9H5CsCwmaVVvhuz3UJuWuC9zKPuW7KgsZa5WeAh/q+i6T0k5F/JZZ6JyS31qSe4DDHGDSGr5MBVpsBh44rcqGItO2bYbJW/z5ybi7uTEdNN8BI1oV1iw00/m9gGeCoj1YHSi+nEcfXshj9ZuilyieZ5FBlfn3OGFbNr4VkJlJGUzvJCtOmE0yZPi5gYSwTlzVir+pZcUs3vlVNDNB7ElVDIWJhHnuExY59xgZ5PEsLTOTvXqU6gdsOuPOjcuf1DM5E/B79paoTMoHBPFD087Zs77APxMyfDh+f5qKQ/NgmjGD2/2mzgr5ErweGwIDAQAB";
    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/pay/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/pay/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "d:\\test";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     *
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

