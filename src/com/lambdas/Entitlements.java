package com.lambdas;

public enum Entitlements {

    ADMISSION_ENTITLEMENT_ID, TRAVEL_PLAN_ID, TRAVEL_PLAN_SEGMENT_ID, ACCOMMODATION_ID, PACKAGE_ADMISSION_ID, DINING_RESERVATION_NUMBER, MAGICAL_CELEBRATION_ID, DCL_RESERVATION_ID, DINING_RESERVATION_ID, DME_RESERVATION_ID {
        public String value() {
            return "DMEReservationID";// 25
        }

        public String toString() {
            return "DMEReservationID";// 29
        }
    },
    TRANSFER_ID, PORT_ADVENTURE_RESERVATION_ID, NURSERY_RESERVATION_ID, SPA_RESERVATION_ID, ONBOARD_ACTIVITY_RESERVATION_ID, CELEBRATION_ID, RESERVATION_ID, EXTERNAL_RESERVATION_ID, DESTINATION_SCHEDULE_ITEM_ID, PERSONAL_SCHEDULE_ITEM_ID, SCHEDULE_ITEM_ID, MAGNETIC_CODE_NUMBER {
        public String value() {
            return "magneticCodeNumber";// 46
        }

        public String toString() {
            return "magneticCodeNumber";// 50
        }
    },
    BAR_CODE_NUMBER {
        public String value() {
            return "barCodeNumber";// 55
        }

        public String toString() {
            return "barCodeNumber";// 59
        }
    },
    TDSSN {
        public String value() {
            return "TDSSN";// 64
        }

        public String toString() {
            return "TDSSN";// 68
        }
    },
    TRANSACTION_DSSN {
        public String value() {
            return "TransactionDSSN";// 73
        }

        public String toString() {
            return "TransactionDSSN";// 77
        }
    },
    ATS_RESEVERVATION_NUMBER {
        public String value() {
            return "reservation-number";// 82
        }

        public String toString() {
            return "reservation-number";// 86
        }
    },
    ADMISSION_COMPONENT_ID;

    private static final String DME_RESERVATION_ID_STRING = "DMEReservationID";
    private static final String TICKETS_MAGNETIC_CODE_NUMBER = "magneticCodeNumber";
    private static final String TICKETS_BAR_CODE_NUMBER = "barCodeNumber";
    private static final String TICKETS_TDSSN = "TDSSN";
    private static final String TICKETS_TRANSACTION_DSSN = "TransactionDSSN";
    private static final String TICKETS_ATS_RESEVERVATION_NUMBER = "reservation-number";
    private final String value;

    private Entitlements() {
        this.value =  this.name();// 106
    }// 107

    public String value() {
        return this.value;// 116
    }

    public static Entitlements fromValue(String value) {
        return "DMEReservationID".equals(value) ? DME_RESERVATION_ID
            : ("magneticCodeNumber".equals(value) ? MAGNETIC_CODE_NUMBER
                : ("barCodeNumber".equals(value) ? BAR_CODE_NUMBER
                    : ("TDSSN".equals(value) ? TDSSN
                        : ("TransactionDSSN".equals(value) ? TRANSACTION_DSSN
                            : ("TransactionDSSN".equals(value) ? TRANSACTION_DSSN
                                : ("reservation-number".equalsIgnoreCase(value) ? ATS_RESEVERVATION_NUMBER
                                    : (Entitlements) valueOf(value)))))));// 128 129 130 131 132 133 134 135 136 137 138 139 140 141 143
    }

    public String toString() {
        return this.value;// 151
    }

    public static boolean isValid(String value) {
        try {
            fromValue(value);// 159
            return true;// 160
        } catch (Exception arg1) {// 161
            return false;// 162
        }
    }
}
