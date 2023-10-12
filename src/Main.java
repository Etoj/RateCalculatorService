import model.InputData;
import service.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        InputData inputData = new InputData()
            .withAmount(new BigDecimal(99000))
            .withMonthsDuration(BigDecimal.valueOf(160));


        PrintingService printingService = new PrintingServiceImp();
        RateCalculationService rateCalculationService = new RateCalculationServiceImpl(
                new timePointServiceImpl(),
                new AmountsCalculationServiceImpl(),
                new ResidualCalculationServiceImpl());

        MortgageCalculationService mortgageCalculationService = new MortgageCalculationServiceImpl(
                printingService,
                rateCalculationService
        );

        mortgageCalculationService.calculate(inputData);
    }
}
