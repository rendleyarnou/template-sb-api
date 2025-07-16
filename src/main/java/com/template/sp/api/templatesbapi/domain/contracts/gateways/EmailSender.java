package com.template.sp.api.templatesbapi.domain.contracts.gateways;

public interface EmailSender {
    void sendEmail(String to, String subject, String body);
}
