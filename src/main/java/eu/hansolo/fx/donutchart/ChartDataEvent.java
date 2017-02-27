package eu.hansolo.fx.donutchart;

/**
 * Created by hansolo on 18.02.17.
 */
public class ChartDataEvent {
    private ChartData chartData;


    // ******************** Constructors **************************************
    public ChartDataEvent(final ChartData CHART_DATA) {
        chartData = CHART_DATA;
    }


    // ******************** Methods *******************************************
    public ChartData getChartData() { return chartData; }
}
