
package graph;

import Main.Main;
import connection.LuggageManager;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import javax.swing.JPanel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 * @author IS104_2
 */
public class ManagerGraph extends ApplicationFrame {

    private static int chartYear;
    
    /**
     * Creates a new demo instance.
     *
     */
    public ManagerGraph(JPanel panel, int year) {

        super("Luggage Data");
        
        chartYear = year;
        
        CategoryDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart, false);
        chartPanel.setPreferredSize(new Dimension(800, 600));
        setContentPane(chartPanel);
        panel.add(chartPanel);
        panel.validate();
    }

    /**
     * Returns a sample dataset.
     * 
     * @return The dataset.
     */
    private static CategoryDataset createDataset() {
        
        LuggageManager luggageManager = new LuggageManager();
        
        // row keys...
        String missingLuggage = "Missing";
        String foundLuggage = "Found";
        String handledLuggage = "Handled";
        String insurancedLuggage = "Insuranced";
        
        
        // column keys...
        String monthJanuary = "Jan";
        String monthFebruary = "Feb";
        String monthMarch = "Mar";
        String monthApril = "Apr";
        String monthMay = "May";
        String monthJune = "Jun";
        String monthJuly = "Jul";
        String monthAugust = "Aug";
        String monthSeptember = "Sep";
        String monthOctober = "Oct";
        String monthNovember = "Nov";
        String monthDecember = "Dec";

        // create the dataset...
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        HashMap<Integer, ResultSet> chartData;
        
        chartData = luggageManager.getMissingLuggageData(chartYear);
        
        try {
            // Loop over the result set so we can get the count from them
            for (Integer key : chartData.keySet()) {
                // Retrieve the count from the result
                int count = chartData.get(key).getInt("count");
                
                // Show the corresponding count based on month
                switch (key) {
                    case 0:
                        dataset.addValue(count, missingLuggage, monthJanuary);
                        break;
                        
                    case 1:
                        dataset.addValue(count, missingLuggage, monthFebruary);
                        break;
                        
                    case 2:
                        dataset.addValue(count, missingLuggage, monthMarch);
                        break;
                        
                    case 3:
                        dataset.addValue(count, missingLuggage, monthApril);
                        break;
                            
                    case 4:
                        dataset.addValue(count, missingLuggage, monthMay);
                        break;
                                
                    case 5:
                        dataset.addValue(count, missingLuggage, monthJune);
                        break;
                                    
                    case 6:
                        dataset.addValue(count, missingLuggage, monthJuly);
                        break;
                        
                    case 7:
                        dataset.addValue(count, missingLuggage, monthAugust);
                        break;
                        
                    case 8:
                        dataset.addValue(count, missingLuggage, monthSeptember);
                        break;
                    
                    case 9:
                        dataset.addValue(count, missingLuggage, monthOctober);
                        break;
                        
                    case 10:
                        dataset.addValue(count, missingLuggage, monthNovember);
                        break;
                        
                    case 11:
                        dataset.addValue(count, missingLuggage, monthDecember);
                        break;
                }
            }
        } catch (SQLException e) {
            Main.exceptionPrint(e);
        }
        
        chartData = luggageManager.getFoundLuggageData(chartYear);
        
        try {
            // Loop over the result set so we can get the count from them
            for (Integer key : chartData.keySet()) {
                // Retrieve the count from the result
                int count = chartData.get(key).getInt("count");
                
                // Show the corresponding count based on month
                switch (key) {
                    case 0:
                        dataset.addValue(count, foundLuggage, monthJanuary);
                        break;
                        
                    case 1:
                        dataset.addValue(count, foundLuggage, monthFebruary);
                        break;
                        
                    case 2:
                        dataset.addValue(count, foundLuggage, monthMarch);
                        break;
                        
                    case 3:
                        dataset.addValue(count, foundLuggage, monthApril);
                        break;
                            
                    case 4:
                        dataset.addValue(count, foundLuggage, monthMay);
                        break;
                                
                    case 5:
                        dataset.addValue(count, foundLuggage, monthJune);
                        break;
                                    
                    case 6:
                        dataset.addValue(count, foundLuggage, monthJuly);
                        break;
                        
                    case 7:
                        dataset.addValue(count, foundLuggage, monthAugust);
                        break;
                        
                    case 8:
                        dataset.addValue(count, foundLuggage, monthSeptember);
                        break;
                    
                    case 9:
                        dataset.addValue(count, foundLuggage, monthOctober);
                        break;
                        
                    case 10:
                        dataset.addValue(count, foundLuggage, monthNovember);
                        break;
                        
                    case 11:
                        dataset.addValue(count, foundLuggage, monthDecember);
                        break;
                }
            }
        } catch (SQLException e) {
            Main.exceptionPrint(e);
        }
        
        chartData = luggageManager.getHandledLuggageData(chartYear);
        
        try {
            // Loop over the result set so we can get the count from them
            for (Integer key : chartData.keySet()) {
                // Retrieve the count from the result
                int count = chartData.get(key).getInt("count");
                
                // Show the corresponding count based on month
                switch (key) {
                    case 0:
                        dataset.addValue(count, handledLuggage, monthJanuary);
                        break;
                        
                    case 1:
                        dataset.addValue(count, handledLuggage, monthFebruary);
                        break;
                        
                    case 2:
                        dataset.addValue(count, handledLuggage, monthMarch);
                        break;
                        
                    case 3:
                        dataset.addValue(count, handledLuggage, monthApril);
                        break;
                            
                    case 4:
                        dataset.addValue(count, handledLuggage, monthMay);
                        break;
                                
                    case 5:
                        dataset.addValue(count, handledLuggage, monthJune);
                        break;
                                    
                    case 6:
                        dataset.addValue(count, handledLuggage, monthJuly);
                        break;
                        
                    case 7:
                        dataset.addValue(count, handledLuggage, monthAugust);
                        break;
                        
                    case 8:
                        dataset.addValue(count, handledLuggage, monthSeptember);
                        break;
                    
                    case 9:
                        dataset.addValue(count, handledLuggage, monthOctober);
                        break;
                        
                    case 10:
                        dataset.addValue(count, handledLuggage, monthNovember);
                        break;
                        
                    case 11:
                        dataset.addValue(count, handledLuggage, monthDecember);
                        break;
                }
            }
        } catch (SQLException e) {
            Main.exceptionPrint(e);
        }
        
        chartData = luggageManager.getInsurancedLuggageData(chartYear);
        
        try {
            // Loop over the result set so we can get the count from them
            for (Integer key : chartData.keySet()) {
                // Retrieve the count from the result
                int count = chartData.get(key).getInt("count");
                
                // Show the corresponding count based on month
                switch (key) {
                    case 0:
                        dataset.addValue(count, insurancedLuggage, monthJanuary);
                        break;
                        
                    case 1:
                        dataset.addValue(count, insurancedLuggage, monthFebruary);
                        break;
                        
                    case 2:
                        dataset.addValue(count, insurancedLuggage, monthMarch);
                        break;
                        
                    case 3:
                        dataset.addValue(count, insurancedLuggage, monthApril);
                        break;
                            
                    case 4:
                        dataset.addValue(count, insurancedLuggage, monthMay);
                        break;
                                
                    case 5:
                        dataset.addValue(count, insurancedLuggage, monthJune);
                        break;
                                    
                    case 6:
                        dataset.addValue(count, insurancedLuggage, monthJuly);
                        break;
                        
                    case 7:
                        dataset.addValue(count, insurancedLuggage, monthAugust);
                        break;
                        
                    case 8:
                        dataset.addValue(count, insurancedLuggage, monthSeptember);
                        break;
                    
                    case 9:
                        dataset.addValue(count, insurancedLuggage, monthOctober);
                        break;
                        
                    case 10:
                        dataset.addValue(count, insurancedLuggage, monthNovember);
                        break;
                        
                    case 11:
                        dataset.addValue(count, insurancedLuggage, monthDecember);
                        break;
                }
            }
        } catch (SQLException e) {
            Main.exceptionPrint(e);
        }
        
        //while ()
        
        /*dataset.addValue(1.0, series1, category1);
        dataset.addValue(4.0, series1, category2);
        dataset.addValue(3.0, series1, category3);
        dataset.addValue(5.0, series1, category4);
        dataset.addValue(5.0, series1, category5);

        dataset.addValue(5.0, series2, category1);
        dataset.addValue(7.0, series2, category2);
        dataset.addValue(6.0, series2, category3);
        dataset.addValue(8.0, series2, category4);
        

        dataset.addValue(4.0, series3, category1);
        dataset.addValue(3.0, series3, category2);
        dataset.addValue(2.0, series3, category3);
        dataset.addValue(3.0, series3, category4);
        
        
        dataset.addValue(4.0, series4, category1);
        dataset.addValue(3.0, series4, category2);
        dataset.addValue(2.0, series4, category3);
        dataset.addValue(3.0, series4, category4);*/
        
        return dataset;
        
    }
    
    /**
     * Creates a sample chart.
     * 
     * @param dataset  the dataset.
     * 
     * @return The chart.
     */
    private static JFreeChart createChart(CategoryDataset dataset) {
        
        // create the chart...
        JFreeChart chart = ChartFactory.createBarChart(
            "Luggage Chart",         // chart title
            "Luggage",               // domain axis label
            "Amount",                  // range axis label
            dataset,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips?
            false                     // URLs?
        );

        // NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...

        // set the background color for the chart...
        chart.setBackgroundPaint(Color.white);

        // get a reference to the plot for further customisation...
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.white); // lightGray is also nice!
        plot.setDomainGridlinePaint(Color.lightGray); //here white.
        plot.setDomainGridlinesVisible(true); //False if you don't want lines.
        plot.setRangeGridlinePaint(Color.lightGray); //Here also white.

        // set the range axis to display integers only...
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        // disable bar outlines...
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(false);
        
        // set up gradient paints for series...
        GradientPaint gp0 = new GradientPaint(
            0.0f, 0.0f, new Color(157, 10, 14), 
            0.0f, 0.0f, new Color(157, 10, 14)
        );
        GradientPaint gp1 = new GradientPaint(
            0.0f, 0.0f, new Color(187, 29, 20), 
            0.0f, 0.0f, new Color(187, 29, 20)
        );
        GradientPaint gp2 = new GradientPaint(
            0.0f, 0.0f, new Color(252, 175, 23), 
            0.0f, 0.0f, new Color(252, 175, 23)
        );
        GradientPaint gp3 = new GradientPaint(
            0.0f, 0.0f, new Color(254, 223, 162), 
            0.0f, 0.0f, new Color(254, 223, 162)
        );
        renderer.setSeriesPaint(0, gp0);
        renderer.setSeriesPaint(1, gp1);
        renderer.setSeriesPaint(2, gp2);
        renderer.setSeriesPaint(3, gp3);
        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(
            CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 6.0)
        );
        // OPTIONAL CUSTOMISATION COMPLETED.
        
        return chart;
        
    }

}


           