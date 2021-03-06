package io.swagger.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.threeten.bp.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDto {
    private Long id = null;
    private String accountFrom;
    private String accountTo;
    private Double amount;
    private String description;
    private OffsetDateTime timestamp;
    private Long userPerformingId;
}