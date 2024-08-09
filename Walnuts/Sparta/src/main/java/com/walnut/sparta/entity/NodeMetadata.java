package com.walnut.sparta.entity;

public class NodeMetadata {
    //id
    private String id;
    //元信息uuid
    private String UUID;
    //场景
    private String scenario;
    //主语言
    private String primaryImplLang;
    //额外信息
    private String extraInformation;
    //等级
    private String level;
    //描述
    private String description;


    public NodeMetadata() {
    }

    public NodeMetadata(String id, String UUID, String scenario, String primaryImplLang, String extraInformation, String level, String description) {
        this.id = id;
        this.UUID = UUID;
        this.scenario = scenario;
        this.primaryImplLang = primaryImplLang;
        this.extraInformation = extraInformation;
        this.level = level;
        this.description = description;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return UUID
     */
    public String getUUID() {
        return UUID;
    }

    /**
     * 设置
     * @param UUID
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    /**
     * 获取
     * @return scenario
     */
    public String getScenario() {
        return scenario;
    }

    /**
     * 设置
     * @param scenario
     */
    public void setScenario(String scenario) {
        this.scenario = scenario;
    }

    /**
     * 获取
     * @return primaryImplLang
     */
    public String getPrimaryImplLang() {
        return primaryImplLang;
    }

    /**
     * 设置
     * @param primaryImplLang
     */
    public void setPrimaryImplLang(String primaryImplLang) {
        this.primaryImplLang = primaryImplLang;
    }

    /**
     * 获取
     * @return extraInformation
     */
    public String getExtraInformation() {
        return extraInformation;
    }

    /**
     * 设置
     * @param extraInformation
     */
    public void setExtraInformation(String extraInformation) {
        this.extraInformation = extraInformation;
    }

    /**
     * 获取
     * @return level
     */
    public String getLevel() {
        return level;
    }

    /**
     * 设置
     * @param level
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * 获取
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "nodeMetadata{id = " + id + ", UUID = " + UUID + ", scenario = " + scenario + ", primaryImplLang = " + primaryImplLang + ", extraInformation = " + extraInformation + ", level = " + level + ", description = " + description + "}";
    }
}