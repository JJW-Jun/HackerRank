package demo.customerdata.personaldata;

import java.util.Arrays;
import java.util.List;


enum PaymentMethodGroup {
    CASH("현금", Arrays.asList(PaymentMethod.CASH)),

    CARD("카드", Arrays.asList(PaymentMethod.CREDIT_CARD, PaymentMethod.KAKAO, PaymentMethod.TOSS)),

    OTHERS("기타", Arrays.asList(PaymentMethod.OTHERS));

    private final String kind;
    private final List<PaymentMethod> paymentMethodGroup;

    PaymentMethodGroup(String kind, List<PaymentMethod> paymentMethodGroup) {
        this.kind = kind;
        this.paymentMethodGroup = paymentMethodGroup;
    }
}


enum PaymentMethod {
    CASH("현금"),

    CREDIT_CARD("신용카드"), KAKAO("카카오페이"), TOSS("토스"),

    OTHERS("기타");

    private final String paymentMethod;

    PaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }
}