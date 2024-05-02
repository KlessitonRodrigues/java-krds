package restAPI.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import restAPI.model.Travel;

@Service
public class TravelService {
    private TravelFactory factory;
    private List<Travel> travels;

    public void createTravelFactory() {
        if (factory == null) {
            factory = new TravelFactoryImpl();
        }
    }

    public void createTravelList() {
        if (travels == null) {
            travels = new ArrayList<>();
        }
    }

    public boolean isJSONValid(String jsonInString) {
        try {
            return new ObjectMapper().readTree(jsonInString) != null;
        } catch (IOException e) {
            return false;
        }
    }

    private long parseId(JSONObject travel) {
        return Long.valueOf((int) travel.get("id"));
    }

    private BigDecimal parseAmount(JSONObject travel) {
        return new BigDecimal((String) travel.get("amount"));
    }

    private LocalDateTime parseStartDate(JSONObject travel) {
        var startDate = (String) travel.get("startDate");
        return ZonedDateTime.parse(startDate).toLocalDateTime();
    }

}
