package com.perimeterx.models.risk;

/**
 * S2SCallReason Enum
 * <p>
 * Created by shikloshi on 05/07/2016.
 */
public enum S2SCallReason {

    NONE("none"), NO_COOKIE("no_cookie"), EXPIRED_COOKIE("expired_cookie"), INVALID_COOKIE("invalid_cookie");

    private String value;

    S2SCallReason(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}