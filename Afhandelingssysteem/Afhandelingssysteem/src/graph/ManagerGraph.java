
package graph;

<<<<<<< HEAD
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
=======
import Main.Main;
import connection.LuggageManager;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import javax.swing.JPanel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
>>>>>>> 453ec5a2e2e6fecf2f1ae237a3c80af816e53470

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

<<<<<<< HEAD
    /**
     * Creates a new demo instance.
     *
     * @param title  the frame title.
     */
    public ManagerGraph(String title) {

        super(title);
=======
    private static int chartYear;
    
    /**
     * Creates a new demo instance.
     *
     */
    public ManagerGraph(JPanel panel, int year) {

        super("Luggage Data");
        
        chartYear = year;
        
>>>>>>> 453ec5a2e2e6fecf2f1ae237a3c80af816e53470
        CategoryDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart, false);
        chartPanel.setPreferredSize(new Dimension(800, 600));
        setContentPane(chartPanel);
<<<<<<< HEAD

=======
        panel.add(chartPanel);
        panel.validate();
>>>>>>> 453ec5a2e2e6fecf2f1ae237a3c80af816e53470
    }

    /**
     * Returns a sample dataset.
     * 
     * @return The dataset.
     */
    private static CategoryDataset createDataset() {
        
<<<<<<< HEAD
        // row keys...
        String series1 = "Handled";
        String series2 = "Found";
        String series3 = "Lost";
        String series4 = "Insuranced";
        
        
        // column keys...
        String category1 = "Q1";
        String category2 = "Q2";
        String category3 = "Q3";
        String category4 = "Q4";
        String category5 = "Q5";
        

        // create the dataset...
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(1.0, series1, category1);
=======
        LuggageManager luggageManager = new LuggageManager();
        
        // row keys...
        String missingLuggage = "Missing";
        String foundLuggage = "Found";
        String handledLuggage = "Handled";
        String insurancedLuggage = "Insuranced";
        
        
        // column keys...
        String[] months = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
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
                
                dataset.addValue(count, missingLuggage, months[key]);
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
                
                dataset.addValue(count, foundLuggage, months[key]);
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
                
                dataset.addValue(count, handledLuggage, months[key]);
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
                
                dataset.addValue(count, insurancedLuggage, months[key]);
            }
        } catch (SQLException e) {
            Main.exceptionPrint(e);
        }
        
        //while ()
        
        /*dataset.addValue(1.0, series1, category1);
>>>>>>> 453ec5a2e2e6fecf2f1ae237a3c80af816e53470
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
<<<<<<< HEAD
        dataset.addValue(3.0, series4, category4);
=======
        dataset.addValue(3.0, series4, category4);*/
>>>>>>> 453ec5a2e2e6fecf2f1ae237a3c80af816e53470
        
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
<<<<<<< HEAD
    
    /**
     * Starting point for the demonstration application.
     *
     * @param args  ignored.
     */
    public static void main(String[] args) {

        ManagerGraph demo = new ManagerGraph("Luggage Chart");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);

    }
=======
>>>>>>> 453ec5a2e2e6fecf2f1ae237a3c80af816e53470

}


           