package com.br.microservices.orchestrated.orchestrator_service.core.dto;

import com.br.microservices.orchestrated.orchestrator_service.core.enums.EEventSource;
import com.br.microservices.orchestrated.orchestrator_service.core.enums.ESagaStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    private String id;
    private String TransactionId;
    private String orderId;
    private Order payload;
    private EEventSource source;
    private ESagaStatus status;
    private List<History> eventHistory;
    private LocalDateTime createdAt;
}
