package ro.ulbs.paradigme.lab10.java.dataprocessing;

import dataprocessing.StepCountStrategy;
import storage.SensorData;

import java.util.ArrayList;
import java.util.List;

public class BasicStepCountStrategy implements StepCountStrategy {

    private final List<SensorData> dataRecords = new ArrayList<>();

    @Override
    public void consumeMessage(SensorData sample) {
        dataRecords.add(sample);
    }

    @Override
    public int getTotalSteps() {
        int total = 0;
        for (SensorData record : dataRecords) {
            total += record.getStepsCount();
        }
        return total;
    }

    @Override
    public String getStrategyDescription() {
        return "Basic strategy: sums all step values without filtering.";
    }
}
