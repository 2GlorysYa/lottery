package com.isshin.lotterycommon.lottery.common;

/**
 * @author Yibo Lei
 * @since 2023/6/3
 */
public class Constants {
    /**
     * Response code
     */
    public enum ResponseCode {
        /**
         * success
         */
        SUCCESS("0000", "Success"),
        /**
         * unknown error
         */
        UN_ERROR("0001", "Unknown failure"),
        /**
         * illegal parameter
         */
        ILLEGAL_PARAMETER("0002", "Illegal parameter"),
        /**
         * index duplication
         */
        INDEX_DUP("0003", "Index duplication");

        /**
         * code
         */
        private String code;
        /**
         * info
         */
        private String info;

        ResponseCode(String code, String info) {
            this.code = code;
            this.info = info;
        }

        public String getCode() {
            return code;
        }

        public String getInfo() {
            return info;
        }
    }
}
