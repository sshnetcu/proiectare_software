package ro.ulbs.paradigme.lab10.dataprocessing;

import ro.ulbs.paradigme.lab10.storage.SensorData;

import java.util.ArrayList;
import java.util.List;

public class FilteredStepCountStrategy implements StepCountStrategy {

    private final List<SensorData> dataRecords = new ArrayList<>();

    @Override
    public void consumeMessage(SensorData sample) {
        dataRecords.add(sample);
    }

    @Override
    public int getTotalSteps() {
        int total = 0;

        for (int i = 0; i < dataRecords.size(); i++) {
            SensorData current = dataRecords.get(i);

            if (current.getStepsCount() <= 0) continue;

            long currentTime = current.getTimestamp();
            boolean overLimit = false;

            for (SensorData other : dataRecords) {
                long timeDiff = currentTime - other.getTimestamp();
                if (timeDiff > 0 && timeDiff <= 60000 && other.getStepsCount() > 1000) {
                    overLimit = true;
                    break;
                }
            }

            if (!overLimit) {
                total += current.getStepsCount();
            }
        }

        return total;
    }

    @Override
    public String getStrategyDescription() {
        return "Filtered strategy: counts only positive step values if no >1000 steps in the last minute.";
    }
}
