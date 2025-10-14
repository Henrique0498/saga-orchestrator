package com.br.microservices.orchestrated.orchestrator_service.core.dto;


import com.br.microservices.orchestrated.orchestrator_service.core.enums.EEventSource;
import com.br.microservices.orchestrated.orchestrator_service.core.enums.ESagaStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class History {
    private EEventSource source;
    private ESagaStatus status;
    private String message;
    private LocalDateTime createdAt;
}
