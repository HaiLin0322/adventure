package com.hailin.adventure.model.pojo;

public class Status {
    private Integer id;

    private Integer roleId;

    private Integer level;

    private Integer hp;

    private Integer atk;

    private Integer def;

    private String equip;

    private Long exp;

    private Long expToLevelUp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getAtk() {
        return atk;
    }

    public void setAtk(Integer atk) {
        this.atk = atk;
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }

    public String getEquip() {
        return equip;
    }

    public void setEquip(String equip) {
        this.equip = equip == null ? null : equip.trim();
    }

    public Long getExp() {
        return exp;
    }

    public void setExp(Long exp) {
        this.exp = exp;
    }

    public Long getExpToLevelUp() {
        return expToLevelUp;
    }

    public void setExpToLevelUp(Long expToLevelUp) {
        this.expToLevelUp = expToLevelUp;
    }
}