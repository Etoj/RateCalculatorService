package service;

import model.InputData;
import model.Rate;

import java.util.List;

public class PrintingServiceImp implements PrintingService {
    @Override
    public void printInputDataInfo(InputData inputData) {
        StringBuilder msg = new StringBuilder(NEW_LINE);
        msg.append(MORTGAGE_AMOUNT).append(inputData.getAmount()).append(CURRENCY);
        msg.append(NEW_LINE);
        msg.append(MORTGAGE_PERIOD).append(inputData.getMonthsDuration()).append(MONTH);
        msg.append(NEW_LINE);
        msg.append(INTEREST).append(inputData.getInterestDisplay()).append(PERCENT);
        msg.append(NEW_LINE);

        printMessage(msg.toString());

    }

    @Override
    public void printRates(List<Rate> rates) {
        System.out.println("print rates method");
        String format = "%4s %4s " +
                "%4s %4s " +
                "%4s %4s " +
                "%4s %4s " +
                "%4s %4s " +
                "%4s %4s " +
                "%4s %4s " +
                "%4s %4s " +
                "%4s %4s ";

        for (Rate rate : rates) {
            String message = String.format(format,
                    RATE_NUMBER, rate.getRateNumber(),
                    DATE, rate.getTimePoint().getDate(),
                    YEAR, rate.getTimePoint().getYear(),
                    MONTH, rate.getTimePoint().getMonth(),
                    RATE, rate.getRateAmounts().getRateAmount(),
                    INTEREST, rate.getRateAmounts().getInterestAmount(),
                    CAPITAL, rate.getRateAmounts().getCapitalAmount(),
                    LEFT_AMOUNT, rate.getMortgageResidual().getAmount(),
                    LEFT_MONTHS, rate.getMortgageResidual().getDuration()
            );
            printMessage(message);

            if (rate.getRateNumber().intValue()%12==0){
                System.out.println();
            }
        }

    }

    private void printMessage(String sb) {
        System.out.println(sb);
    }

}
