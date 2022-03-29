package com.idatabank.sms.util;

public class NaverSENSProperties {
    private final String API_PREFIX = "https://sens.apigw.ntruss.com";
    private final String TYPE = "SMS";
    private final String CON_TYPE = "COMM";
    private String apiKey;
    private String secretKey;
    private String serviceId;
    private String conTitle;
    private final String countryCode = "82";
    private String fromN;
    private String toN;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getTYPE() {
        return TYPE;
    }

    public String getCON_TYPE() {
        return CON_TYPE;
    }

    public String getConTitle() {
        return conTitle;
    }

    public void setConTitle(String conTitle) {
        this.conTitle = conTitle;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getFromN() {
        return fromN;
    }

    public void setFromN(String fromN) {
        this.fromN = fromN;
    }

    public String getToN() {
        return toN;
    }

    public void setToN(String toN) {
        this.toN = toN;
    }

    public String getUrl() {
        return String.format("%s%s", API_PREFIX, getUrlAPI());
    }

    public String getUrlAPI() {
        return String.format("/sms/v2/services/%s/messages", getServiceId());
    }
}