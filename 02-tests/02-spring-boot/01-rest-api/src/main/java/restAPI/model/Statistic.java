package restAPI.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Statistic {
    private BigDecimal sum;
    private BigDecimal min;
    private BigDecimal max;
    private BigDecimal avg;
    private Long count;
}
